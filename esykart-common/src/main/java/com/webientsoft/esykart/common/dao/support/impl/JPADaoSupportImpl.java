package com.webientsoft.esykart.common.dao.support.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.NonUniqueResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.apache.commons.collections4.MapUtils;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.webientsoft.esykart.common.dao.support.JPADaoSupport;

/**
 * Generic Dao implementation class for JPA.It support crude operations on
 * entities.
 */
@Repository
@SuppressWarnings("unchecked")
public class JPADaoSupportImpl implements JPADaoSupport {

	private static Logger LOGGER = LoggerFactory.getLogger(JPADaoSupportImpl.class);
	@PersistenceContext
	private EntityManager entityManager;

	@Transactional
	@Override
	public void flush() {
		entityManager.flush();
	}

	@Transactional
	@Override
	public void persist(Object entity) {
		entityManager.persist(entity);
	}

	@Transactional
	@Override
	public <T> T merge(T entity) {
		return entityManager.merge(entity);
	}

	@Transactional
	@Override
	public void remove(Object entity) {
		entityManager.remove(entity);
	}

	@Override
	public <T> T find(Class<T> entityClass, Object primaryKey) {
		return entityManager.find(entityClass, primaryKey);
	}

	@Transactional
	@Override
	public int executeUpdateByNamedQuery(String queryName) {
		return executeUpdate(entityManager.createNamedQuery(queryName), null);
	}

	@Transactional
	@Override
	public int executeUpdateByQueryString(String queryString) {
		return executeUpdate(entityManager.createQuery(queryString), null);
	}

	@Transactional
	@Override
	public int executeUpdateByNativeQuery(String sqlString) {
		return executeUpdate(entityManager.createNativeQuery(sqlString), null);
	}

	@Transactional
	@Override
	public int executeUpdateByNamedQuery(String queryName, Map<String, Object> params) {
		return executeUpdate(entityManager.createNamedQuery(queryName), params);
	}

	@Transactional
	@Override
	public int executeUpdateByQueryString(String queryString, Map<String, Object> params) {
		return executeUpdate(entityManager.createQuery(queryString), params);
	}

	@Transactional
	@Override
	public int executeUpdateByNativeQuery(String sqlString, Map<String, Object> params) {
		return executeUpdate(entityManager.createNativeQuery(sqlString), params);
	}

	@Override
	public List<?> findByNamedQuery(String queryName) {
		return (List<?>) execute(entityManager.createNamedQuery(queryName), false, null);
	}

	@Override
	public List<?> findByNamedQuery(String queryName, Map<String, Object> params) {
		return (List<?>) execute(entityManager.createNamedQuery(queryName), false, params);
	}

	@Override
	public <T> List<T> findByNamedQuery(String queryName, Map<String, Object> params, Class<T> clazz) {
		return (List<T>) execute(entityManager.createNamedQuery(queryName, clazz), false, params);
	}

	@Override
	public <T> List<T> findByNamedQuery(String queryName, Class<T> clazz) {
		return (List<T>) execute(entityManager.createNamedQuery(queryName, clazz), false, null);
	}

	@Override
	public List<?> findByQueryString(String queryString) {
		return (List<?>) execute(entityManager.createQuery(queryString), false, null);
	}

	@Override
	public List<?> findByQueryString(String queryString, Map<String, Object> params) {
		return (List<?>) execute(entityManager.createQuery(queryString), false, params);
	}

	@Override
	public <T> List<T> findByQueryString(String queryString, Class<T> clazz) {
		return (List<T>) execute(entityManager.createQuery(queryString, clazz), false, null);
	}

	@Override
	public <T> List<T> findByQueryString(String queryString, Map<String, Object> params, Class<T> clazz) {
		return (List<T>) execute(entityManager.createQuery(queryString, clazz), false, params);
	}

	@Override
	public List<?> findByNativeQuery(String sqlString) {
		return (List<?>) execute(entityManager.createNativeQuery(sqlString), false, null);
	}

	@Override
	public List<?> findByNativeQuery(String sqlString, Map<String, Object> params) {
		return (List<?>) execute(entityManager.createNativeQuery(sqlString), false, params);
	}

	@Override
	public <T> List<T> findByNativeQuery(String sqlString, Class<T> clazz) {
		return (List<T>) execute(entityManager.createNativeQuery(sqlString, clazz), false, null);

	}

	@Override
	public <T> List<T> findByNativeQuery(String sqlString, Map<String, Object> params, Class<T> clazz) {
		return (List<T>) execute(entityManager.createNativeQuery(sqlString, clazz), false, params);
	}

	@Override
	public List<?> findByNativeQuery(String sqlString, String resultSetMapping) {
		return (List<?>) execute(entityManager.createNativeQuery(sqlString, resultSetMapping), false, null);
	}

	@Override
	public List<?> findByNativeQuery(String sqlString, Map<String, Object> params, String resultSetMapping) {
		return (List<?>) execute(entityManager.createNativeQuery(sqlString, resultSetMapping), false, params);
	}

	@Override
	public Object findSingleResultByNamedQuery(String queryName) {
		return execute(entityManager.createNamedQuery(queryName), true, null);
	}

	@Override
	public Object findSingleResultByNamedQuery(String queryName, Map<String, Object> params) {
		return execute(entityManager.createNamedQuery(queryName), true, params);
	}

	@Override
	public <T> T findSingleResultByNamedQuery(String queryName, Map<String, Object> params, Class<T> clazz) {
		return (T) execute(entityManager.createNamedQuery(queryName, clazz), true, params);
	}

	@Override
	public <T> T findSingleResultByNamedQuery(String queryName, Class<T> clazz) {
		return (T) execute(entityManager.createNamedQuery(queryName, clazz), true, null);
	}

	@Override
	public Object findSingleResultByQueryString(String queryString) {
		return execute(entityManager.createQuery(queryString), true, null);
	}

	@Override
	public Object findSingleResultByQueryString(String queryString, Map<String, Object> params) {
		return execute(entityManager.createQuery(queryString), true, params);
	}

	@Override
	public <T> T findSingleResultByQueryString(String queryString, Class<T> clazz) {
		return (T) execute(entityManager.createQuery(queryString, clazz), true, null);
	}

	@Override
	public <T> T findSingleResultByQueryString(String queryString, Map<String, Object> params, Class<T> clazz) {
		return (T) execute(entityManager.createQuery(queryString, clazz), true, params);
	}

	@Override
	public Object findSingleResultByNativeQuery(String sqlString) {
		return execute(entityManager.createNativeQuery(sqlString), true, null);
	}

	@Override
	public Object findSingleResultByNativeQuery(String sqlString, Map<String, Object> params) {
		return execute(entityManager.createNativeQuery(sqlString), true, params);
	}

	@Override
	public <T> T findSingleResultByNativeQuery(String sqlString, Class<T> clazz) {
		return (T) execute(entityManager.createNativeQuery(sqlString, clazz), true, null);

	}

	@Override
	public <T> T findSingleResultByNativeQuery(String sqlString, Map<String, Object> params, Class<T> clazz) {
		return (T) execute(entityManager.createNativeQuery(sqlString, clazz), true, params);
	}

	@Override
	public Object findSingleResultByNativeQuery(String sqlString, String resultSetMapping) {
		return execute(entityManager.createNativeQuery(sqlString, resultSetMapping), true, null);
	}

	@Override
	public Object findSingleResultByNativeQuery(String sqlString, Map<String, Object> params, String resultSetMapping) {
		return execute(entityManager.createNativeQuery(sqlString, resultSetMapping), true, params);
	}

	/**
	 * 
	 * @return Map<String, Object> with given key and value.
	 */
	@Override
	public Map<String, Object> addQueryNamedParameters(Object... parameters) {
		if (ArrayUtils.isNotEmpty(parameters)) {
			Map<String, Object> params = new HashMap<>(parameters.length / 2);
			for (int i = 0; i < parameters.length - 1; i = i + 2) {
				if (StringUtils.isNotBlank((String) parameters[i])) {
					params.put((String) parameters[i], parameters[i + 1]);
				} else {
					throw new IllegalArgumentException("Named parameter can't be null");
				}

			}
			return params;
		}
		return null;
	}

	private Object execute(Query query, boolean singleResult, Map<String, Object> params) {
		applyNamedParametersToQuery(query, params);
		if (singleResult) {
			try {
				return query.getSingleResult();
			} catch (NoResultException | NonUniqueResultException ex) {
				LOGGER.warn("{} with this criteria:{}", ex.getMessage(), params);
				return null;
			}
		} else {
			return query.getResultList();
		}

	}

	private int executeUpdate(Query query, Map<String, Object> params) {
		applyNamedParametersToQuery(query, params);
		return query.executeUpdate();
	}

	private void applyNamedParametersToQuery(Query query, Map<String, Object> params) {
		if (MapUtils.isNotEmpty(params)) {
			for (Map.Entry<String, Object> entry : params.entrySet()) {
				if (entry.getKey().equals("firstResult")) {
					query.setFirstResult((int) entry.getValue());
				} else if (entry.getKey().equals("maxResult")) {
					query.setMaxResults((int) entry.getValue());
				} else {
					query.setParameter(entry.getKey(), entry.getValue());
				}
			}
		}

	}

}
