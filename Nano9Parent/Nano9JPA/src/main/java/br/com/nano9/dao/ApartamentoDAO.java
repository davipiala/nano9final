package br.com.nano9.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.nano9.jpa.bean.ApartamentoEntity;

public class ApartamentoDAO
{
  private static ApartamentoDAO instance;
  protected EntityManager entityManager;
  
  public static ApartamentoDAO getInstance()
  {
    if (instance == null) {
      instance = new ApartamentoDAO();
    }
    
    return instance;
  }
  
  private ApartamentoDAO() {
    entityManager = getEntityManager();
  }
  
  private EntityManager getEntityManager() {
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("nano9-jpa");
    if (entityManager == null) {
      entityManager = factory.createEntityManager();
    }
    
    return entityManager;
  }
  
  public ApartamentoEntity getById(int id) {
    return (ApartamentoEntity)entityManager.find(ApartamentoEntity.class, Integer.valueOf(id));
  }
  
  public java.util.List<ApartamentoEntity> findAll()
  {
    return entityManager.createQuery("FROM " + ApartamentoEntity.class.getName()).getResultList();
  }
  
  public void persist(ApartamentoEntity apartamentoEntity) {
    try {
      entityManager.getTransaction().begin();
      entityManager.persist(apartamentoEntity);
      entityManager.getTransaction().commit();
    } catch (Exception ex) {
      ex.printStackTrace();
      entityManager.getTransaction().rollback();
    }
  }
  
  public void merge(ApartamentoEntity apartamentoEntity) {
    try {
      entityManager.getTransaction().begin();
      entityManager.merge(apartamentoEntity);
      entityManager.getTransaction().commit();
    } catch (Exception ex) {
      ex.printStackTrace();
      entityManager.getTransaction().rollback();
    }
  }
  
  public void remove(ApartamentoEntity apartamentoEntity) {
    try {
      entityManager.getTransaction().begin();
      apartamentoEntity = (ApartamentoEntity)entityManager.find(ApartamentoEntity.class, Integer.valueOf(apartamentoEntity.getId()));
      entityManager.remove(apartamentoEntity);
      entityManager.getTransaction().commit();
    } catch (Exception ex) {
      ex.printStackTrace();
      entityManager.getTransaction().rollback();
    }
  }
  
  public void removeById(int id) {
    try {
      ApartamentoEntity apartamentoEntity = getById(id);
      remove(apartamentoEntity);
    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }
}