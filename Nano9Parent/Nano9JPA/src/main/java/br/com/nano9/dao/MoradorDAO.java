package br.com.nano9.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.nano9.jpa.bean.MoradorEntity;

public class MoradorDAO
{
  private static MoradorDAO instance;
  protected EntityManager entityManager;
  
  public static MoradorDAO getInstance()
  {
    if (instance == null) {
      instance = new MoradorDAO();
    }
    
    return instance;
  }
  
  private MoradorDAO() {
    entityManager = getEntityManager();
  }
  
  private EntityManager getEntityManager() {
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("nano9-jpa");
    if (entityManager == null) {
      entityManager = factory.createEntityManager();
    }
    
    return entityManager;
  }
  
  public MoradorEntity getById(int id) {
    return (MoradorEntity)entityManager.find(MoradorEntity.class, Integer.valueOf(id));
  }
  
  public java.util.List<MoradorEntity> findAll()
  {
    return entityManager.createQuery("FROM " + MoradorEntity.class.getName()).getResultList();
  }
  
  public void persist(MoradorEntity moradorEntity) {
    try {
      entityManager.getTransaction().begin();
      entityManager.persist(moradorEntity);
      entityManager.getTransaction().commit();
    } catch (Exception ex) {
      ex.printStackTrace();
      entityManager.getTransaction().rollback();
    }
  }
  
  public void merge(MoradorEntity moradorEntity) {
    try {
      entityManager.getTransaction().begin();
      entityManager.merge(moradorEntity);
      entityManager.getTransaction().commit();
    } catch (Exception ex) {
      ex.printStackTrace();
      entityManager.getTransaction().rollback();
    }
  }
  
  public void remove(MoradorEntity moradorEntity) {
    try {
      entityManager.getTransaction().begin();
      moradorEntity = (MoradorEntity)entityManager.find(MoradorEntity.class, Integer.valueOf(moradorEntity.getId()));
      entityManager.remove(moradorEntity);
      entityManager.getTransaction().commit();
    } catch (Exception ex) {
      ex.printStackTrace();
      entityManager.getTransaction().rollback();
    }
  }
  
  public void removeById(int id) {
    try {
      MoradorEntity VagaBean = getById(id);
      remove(VagaBean);
    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }
}