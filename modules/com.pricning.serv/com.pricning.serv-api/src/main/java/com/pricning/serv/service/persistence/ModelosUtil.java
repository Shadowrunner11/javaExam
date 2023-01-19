/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.pricning.serv.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.pricning.serv.model.Modelos;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the modelos service. This utility wraps <code>com.pricning.serv.service.persistence.impl.ModelosPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ModelosPersistence
 * @generated
 */
public class ModelosUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(Modelos modelos) {
		getPersistence().clearCache(modelos);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, Modelos> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Modelos> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Modelos> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Modelos> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Modelos> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Modelos update(Modelos modelos) {
		return getPersistence().update(modelos);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Modelos update(
		Modelos modelos, ServiceContext serviceContext) {

		return getPersistence().update(modelos, serviceContext);
	}

	/**
	 * Returns all the modeloses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching modeloses
	 */
	public static List<Modelos> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the modeloses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ModelosModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of modeloses
	 * @param end the upper bound of the range of modeloses (not inclusive)
	 * @return the range of matching modeloses
	 */
	public static List<Modelos> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the modeloses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ModelosModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of modeloses
	 * @param end the upper bound of the range of modeloses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching modeloses
	 */
	public static List<Modelos> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Modelos> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the modeloses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ModelosModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of modeloses
	 * @param end the upper bound of the range of modeloses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching modeloses
	 */
	public static List<Modelos> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Modelos> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first modelos in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching modelos
	 * @throws NoSuchModelosException if a matching modelos could not be found
	 */
	public static Modelos findByUuid_First(
			String uuid, OrderByComparator<Modelos> orderByComparator)
		throws com.pricning.serv.exception.NoSuchModelosException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first modelos in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching modelos, or <code>null</code> if a matching modelos could not be found
	 */
	public static Modelos fetchByUuid_First(
		String uuid, OrderByComparator<Modelos> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last modelos in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching modelos
	 * @throws NoSuchModelosException if a matching modelos could not be found
	 */
	public static Modelos findByUuid_Last(
			String uuid, OrderByComparator<Modelos> orderByComparator)
		throws com.pricning.serv.exception.NoSuchModelosException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last modelos in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching modelos, or <code>null</code> if a matching modelos could not be found
	 */
	public static Modelos fetchByUuid_Last(
		String uuid, OrderByComparator<Modelos> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the modeloses before and after the current modelos in the ordered set where uuid = &#63;.
	 *
	 * @param id the primary key of the current modelos
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next modelos
	 * @throws NoSuchModelosException if a modelos with the primary key could not be found
	 */
	public static Modelos[] findByUuid_PrevAndNext(
			long id, String uuid, OrderByComparator<Modelos> orderByComparator)
		throws com.pricning.serv.exception.NoSuchModelosException {

		return getPersistence().findByUuid_PrevAndNext(
			id, uuid, orderByComparator);
	}

	/**
	 * Removes all the modeloses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of modeloses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching modeloses
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Caches the modelos in the entity cache if it is enabled.
	 *
	 * @param modelos the modelos
	 */
	public static void cacheResult(Modelos modelos) {
		getPersistence().cacheResult(modelos);
	}

	/**
	 * Caches the modeloses in the entity cache if it is enabled.
	 *
	 * @param modeloses the modeloses
	 */
	public static void cacheResult(List<Modelos> modeloses) {
		getPersistence().cacheResult(modeloses);
	}

	/**
	 * Creates a new modelos with the primary key. Does not add the modelos to the database.
	 *
	 * @param id the primary key for the new modelos
	 * @return the new modelos
	 */
	public static Modelos create(long id) {
		return getPersistence().create(id);
	}

	/**
	 * Removes the modelos with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the modelos
	 * @return the modelos that was removed
	 * @throws NoSuchModelosException if a modelos with the primary key could not be found
	 */
	public static Modelos remove(long id)
		throws com.pricning.serv.exception.NoSuchModelosException {

		return getPersistence().remove(id);
	}

	public static Modelos updateImpl(Modelos modelos) {
		return getPersistence().updateImpl(modelos);
	}

	/**
	 * Returns the modelos with the primary key or throws a <code>NoSuchModelosException</code> if it could not be found.
	 *
	 * @param id the primary key of the modelos
	 * @return the modelos
	 * @throws NoSuchModelosException if a modelos with the primary key could not be found
	 */
	public static Modelos findByPrimaryKey(long id)
		throws com.pricning.serv.exception.NoSuchModelosException {

		return getPersistence().findByPrimaryKey(id);
	}

	/**
	 * Returns the modelos with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the modelos
	 * @return the modelos, or <code>null</code> if a modelos with the primary key could not be found
	 */
	public static Modelos fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	 * Returns all the modeloses.
	 *
	 * @return the modeloses
	 */
	public static List<Modelos> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the modeloses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ModelosModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of modeloses
	 * @param end the upper bound of the range of modeloses (not inclusive)
	 * @return the range of modeloses
	 */
	public static List<Modelos> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the modeloses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ModelosModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of modeloses
	 * @param end the upper bound of the range of modeloses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of modeloses
	 */
	public static List<Modelos> findAll(
		int start, int end, OrderByComparator<Modelos> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the modeloses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ModelosModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of modeloses
	 * @param end the upper bound of the range of modeloses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of modeloses
	 */
	public static List<Modelos> findAll(
		int start, int end, OrderByComparator<Modelos> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the modeloses from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of modeloses.
	 *
	 * @return the number of modeloses
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static ModelosPersistence getPersistence() {
		return _persistence;
	}

	private static volatile ModelosPersistence _persistence;

}