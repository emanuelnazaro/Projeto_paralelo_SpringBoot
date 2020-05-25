package com.demo.projeto.spring.dao;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;


public abstract class AbstractDao<T,PK extends Serializable> {

	@SuppressWarnings("unchecked")
	private final Class<T> EntityClass =
			(Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
	
	@PersistenceContext
	private EntityManager entityManager;
	
	protected EntityManager getEntityManager() {
		return entityManager;
	}
	
	public void save(T entity) {
		entityManager.persist(entity);
	}
	
	public void update(T entity) {
		entityManager.merge(entity);
	}
	
	public void delete(PK id) {
		entityManager.remove(entityManager.getReference(EntityClass, id));
	}
	
	public T findById(PK id) {
		return entityManager.find(EntityClass, id);
	}
	
	public List<T> findAll(){
		return entityManager
			   .createQuery("from " + EntityClass.getSimpleName(), EntityClass)
			   .getResultList();
		
	}
	
	
	protected List<T> createQuery(String jpql, Object... params){
		TypedQuery<T> query = entityManager.createQuery(jpql, EntityClass);
		for(int i = 0; i< params.length; i++) {
			query.setParameter(i+1, params[i]);
		}
		
		return query.getResultList();
	}
}
