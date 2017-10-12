package br.com.nano9.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.nano9.jpa.bean.VagaEntity;

public class VagaDAO
{
  private static VagaDAO instance;
  protected EntityManager entityManager;
  
  public static VagaDAO getInstance()
  {
    if (instance == null) {
      instance = new VagaDAO();
    }
    
    return instance;
  }
  
  private VagaDAO() {
    entityManager = getEntityManager();
  }
  
  private EntityManager getEntityManager() {
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("nano9-jpa");
    if (entityManager == null) {
      entityManager = factory.createEntityManager();
    }
    
    return entityManager;
  }
  
  public VagaEntity getById(int id) {
    return (VagaEntity)entityManager.find(VagaEntity.class, Integer.valueOf(id));
  }
  
  public java.util.List<VagaEntity> findAll()
  {
    return entityManager.createQuery("FROM " + VagaEntity.class.getName()).getResultList();
  }
  
  public void persist(VagaEntity vagaEntity) {
    try {
      entityManager.getTransaction().begin();
      entityManager.persist(vagaEntity);
      entityManager.getTransaction().commit();
    } catch (Exception ex) {
      ex.printStackTrace();
      entityManager.getTransaction().rollback();
    }
  }
  
  public void merge(VagaEntity vagaEntity) {
    try {
      entityManager.getTransaction().begin();
      entityManager.merge(vagaEntity);
      entityManager.getTransaction().commit();
    } catch (Exception ex) {
      ex.printStackTrace();
      entityManager.getTransaction().rollback();
    }
  }
  
  public void remove(VagaEntity vagaEntity) {
    try {
      entityManager.getTransaction().begin();
      vagaEntity = (VagaEntity)entityManager.find(VagaEntity.class, Integer.valueOf(vagaEntity.getCodigo()));
      entityManager.remove(vagaEntity);
      entityManager.getTransaction().commit();
    } catch (Exception ex) {
      ex.printStackTrace();
      entityManager.getTransaction().rollback();
    }
  }
  
  public void removeById(int id) {
    try {
      VagaEntity vagaEntity = getById(id);
      remove(vagaEntity);
    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }
}