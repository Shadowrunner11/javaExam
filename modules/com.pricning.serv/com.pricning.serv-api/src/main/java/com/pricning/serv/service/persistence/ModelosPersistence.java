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

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.pricning.serv.exception.NoSuchModelosException;
import com.pricning.serv.model.Modelos;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the modelos service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ModelosUtil
 * @generated
 */
@ProviderType
public interface ModelosPersistence extends BasePersistence<Modelos> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ModelosUtil} to access the modelos persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the modeloses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching modeloses
	 */
	public java.util.List<Modelos> findByUuid(String uuid);

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
	public java.util.List<Modelos> findByUuid(String uuid, int start, int end);

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
	public java.util.List<Modelos> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Modelos>
			orderByComparator);

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
	public java.util.List<Modelos> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Modelos>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first modelos in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching modelos
	 * @throws NoSuchModelosException if a matching modelos could not be found
	 */
	public Modelos findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Modelos>
				orderByComparator)
		throws NoSuchModelosException;

	/**
	 * Returns the first modelos in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching modelos, or <code>null</code> if a matching modelos could not be found
	 */
	public Modelos fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Modelos>
			orderByComparator);

	/**
	 * Returns the last modelos in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching modelos
	 * @throws NoSuchModelosException if a matching modelos could not be found
	 */
	public Modelos findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Modelos>
				orderByComparator)
		throws NoSuchModelosException;

	/**
	 * Returns the last modelos in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching modelos, or <code>null</code> if a matching modelos could not be found
	 */
	public Modelos fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Modelos>
			orderByComparator);

	/**
	 * Returns the modeloses before and after the current modelos in the ordered set where uuid = &#63;.
	 *
	 * @param id the primary key of the current modelos
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next modelos
	 * @throws NoSuchModelosException if a modelos with the primary key could not be found
	 */
	public Modelos[] findByUuid_PrevAndNext(
			long id, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Modelos>
				orderByComparator)
		throws NoSuchModelosException;

	/**
	 * Removes all the modeloses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of modeloses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching modeloses
	 */
	public int countByUuid(String uuid);

	/**
	 * Caches the modelos in the entity cache if it is enabled.
	 *
	 * @param modelos the modelos
	 */
	public void cacheResult(Modelos modelos);

	/**
	 * Caches the modeloses in the entity cache if it is enabled.
	 *
	 * @param modeloses the modeloses
	 */
	public void cacheResult(java.util.List<Modelos> modeloses);

	/**
	 * Creates a new modelos with the primary key. Does not add the modelos to the database.
	 *
	 * @param id the primary key for the new modelos
	 * @return the new modelos
	 */
	public Modelos create(long id);

	/**
	 * Removes the modelos with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the modelos
	 * @return the modelos that was removed
	 * @throws NoSuchModelosException if a modelos with the primary key could not be found
	 */
	public Modelos remove(long id) throws NoSuchModelosException;

	public Modelos updateImpl(Modelos modelos);

	/**
	 * Returns the modelos with the primary key or throws a <code>NoSuchModelosException</code> if it could not be found.
	 *
	 * @param id the primary key of the modelos
	 * @return the modelos
	 * @throws NoSuchModelosException if a modelos with the primary key could not be found
	 */
	public Modelos findByPrimaryKey(long id) throws NoSuchModelosException;

	/**
	 * Returns the modelos with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the modelos
	 * @return the modelos, or <code>null</code> if a modelos with the primary key could not be found
	 */
	public Modelos fetchByPrimaryKey(long id);

	/**
	 * Returns all the modeloses.
	 *
	 * @return the modeloses
	 */
	public java.util.List<Modelos> findAll();

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
	public java.util.List<Modelos> findAll(int start, int end);

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
	public java.util.List<Modelos> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Modelos>
			orderByComparator);

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
	public java.util.List<Modelos> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Modelos>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the modeloses from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of modeloses.
	 *
	 * @return the number of modeloses
	 */
	public int countAll();

}