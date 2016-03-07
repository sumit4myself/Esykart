package com.webientsoft.esykart.common.dao.support;

import java.util.List;
import java.util.Map;

/**
 * Generic base interface for JPA.
 * 
 */
public interface JPADaoSupport {

	void flush();

	void persist(Object entity);

	<T> T merge(T entity);

	void remove(Object entity);

	<T> T find(Class<T> entityClass, Object primaryKey);

	Map<String, Object> addQueryNamedParameters(Object... parameters);

	int executeUpdateByNamedQuery(String queryName);

	int executeUpdateByQueryString(String queryString);

	int executeUpdateByNativeQuery(String sqlString);

	int executeUpdateByNamedQuery(String queryName, Map<String, Object> params);

	int executeUpdateByQueryString(String queryString, Map<String, Object> params);

	int executeUpdateByNativeQuery(String sqlString, Map<String, Object> params);

	List<?> findByNamedQuery(String queryName);

	<T> List<T> findByNamedQuery(String queryName, Class<T> clazz);

	List<?> findByNamedQuery(String queryName, Map<String, Object> params);

	<T> List<T> findByNamedQuery(String queryName, Map<String, Object> params, Class<T> clazz);

	List<?> findByQueryString(String queryString);

	<T> List<T> findByQueryString(String queryString, Class<T> clazz);

	List<?> findByQueryString(String queryString, Map<String, Object> params);

	<T> List<T> findByQueryString(String queryString, Map<String, Object> params, Class<T> clazz);

	List<?> findByNativeQuery(String sqlString);

	List<?> findByNativeQuery(String sqlString, Map<String, Object> params);

	<T> List<T> findByNativeQuery(String sqlString, Class<T> clazz);

	<T> List<T> findByNativeQuery(String sqlString, Map<String, Object> params, Class<T> clazz);

	List<?> findByNativeQuery(String sqlString, String resultSetMapping);

	List<?> findByNativeQuery(String sqlString, Map<String, Object> params, String resultSetMapping);

	Object findSingleResultByNamedQuery(String queryName);

	<T> T findSingleResultByNamedQuery(String queryName, Class<T> clazz);

	Object findSingleResultByNamedQuery(String queryName, Map<String, Object> params);

	<T> T findSingleResultByNamedQuery(String queryName, Map<String, Object> params, Class<T> clazz);

	Object findSingleResultByQueryString(String queryString);

	<T> T findSingleResultByQueryString(String queryString, Class<T> clazz);

	Object findSingleResultByQueryString(String queryString, Map<String, Object> params);

	<T> T findSingleResultByQueryString(String queryString, Map<String, Object> params, Class<T> clazz);

	Object findSingleResultByNativeQuery(String sqlString);

	Object findSingleResultByNativeQuery(String sqlString, Map<String, Object> params);

	<T> T findSingleResultByNativeQuery(String sqlString, Class<T> clazz);

	<T> T findSingleResultByNativeQuery(String sqlString, Map<String, Object> params, Class<T> clazz);

	Object findSingleResultByNativeQuery(String sqlString, String resultSetMapping);

	Object findSingleResultByNativeQuery(String sqlString, Map<String, Object> params, String resultSetMapping);

}
