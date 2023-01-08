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

import com.pricning.serv.exception.NoSuchPricingException;
import com.pricning.serv.model.Pricing;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the pricing service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PricingUtil
 * @generated
 */
@ProviderType
public interface PricingPersistence extends BasePersistence<Pricing> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link PricingUtil} to access the pricing persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the pricings where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching pricings
	 */
	public java.util.List<Pricing> findByUuid(String uuid);

	/**
	 * Returns a range of all the pricings where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PricingModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of pricings
	 * @param end the upper bound of the range of pricings (not inclusive)
	 * @return the range of matching pricings
	 */
	public java.util.List<Pricing> findByUuid(String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the pricings where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PricingModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of pricings
	 * @param end the upper bound of the range of pricings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching pricings
	 */
	public java.util.List<Pricing> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Pricing>
			orderByComparator);

	/**
	 * Returns an ordered range of all the pricings where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PricingModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of pricings
	 * @param end the upper bound of the range of pricings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching pricings
	 */
	public java.util.List<Pricing> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Pricing>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first pricing in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching pricing
	 * @throws NoSuchPricingException if a matching pricing could not be found
	 */
	public Pricing findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Pricing>
				orderByComparator)
		throws NoSuchPricingException;

	/**
	 * Returns the first pricing in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching pricing, or <code>null</code> if a matching pricing could not be found
	 */
	public Pricing fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Pricing>
			orderByComparator);

	/**
	 * Returns the last pricing in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching pricing
	 * @throws NoSuchPricingException if a matching pricing could not be found
	 */
	public Pricing findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Pricing>
				orderByComparator)
		throws NoSuchPricingException;

	/**
	 * Returns the last pricing in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching pricing, or <code>null</code> if a matching pricing could not be found
	 */
	public Pricing fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Pricing>
			orderByComparator);

	/**
	 * Returns the pricings before and after the current pricing in the ordered set where uuid = &#63;.
	 *
	 * @param id the primary key of the current pricing
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next pricing
	 * @throws NoSuchPricingException if a pricing with the primary key could not be found
	 */
	public Pricing[] findByUuid_PrevAndNext(
			long id, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Pricing>
				orderByComparator)
		throws NoSuchPricingException;

	/**
	 * Removes all the pricings where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of pricings where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching pricings
	 */
	public int countByUuid(String uuid);

	/**
	 * Caches the pricing in the entity cache if it is enabled.
	 *
	 * @param pricing the pricing
	 */
	public void cacheResult(Pricing pricing);

	/**
	 * Caches the pricings in the entity cache if it is enabled.
	 *
	 * @param pricings the pricings
	 */
	public void cacheResult(java.util.List<Pricing> pricings);

	/**
	 * Creates a new pricing with the primary key. Does not add the pricing to the database.
	 *
	 * @param id the primary key for the new pricing
	 * @return the new pricing
	 */
	public Pricing create(long id);

	/**
	 * Removes the pricing with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the pricing
	 * @return the pricing that was removed
	 * @throws NoSuchPricingException if a pricing with the primary key could not be found
	 */
	public Pricing remove(long id) throws NoSuchPricingException;

	public Pricing updateImpl(Pricing pricing);

	/**
	 * Returns the pricing with the primary key or throws a <code>NoSuchPricingException</code> if it could not be found.
	 *
	 * @param id the primary key of the pricing
	 * @return the pricing
	 * @throws NoSuchPricingException if a pricing with the primary key could not be found
	 */
	public Pricing findByPrimaryKey(long id) throws NoSuchPricingException;

	/**
	 * Returns the pricing with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the pricing
	 * @return the pricing, or <code>null</code> if a pricing with the primary key could not be found
	 */
	public Pricing fetchByPrimaryKey(long id);

	/**
	 * Returns all the pricings.
	 *
	 * @return the pricings
	 */
	public java.util.List<Pricing> findAll();

	/**
	 * Returns a range of all the pricings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PricingModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pricings
	 * @param end the upper bound of the range of pricings (not inclusive)
	 * @return the range of pricings
	 */
	public java.util.List<Pricing> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the pricings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PricingModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pricings
	 * @param end the upper bound of the range of pricings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of pricings
	 */
	public java.util.List<Pricing> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Pricing>
			orderByComparator);

	/**
	 * Returns an ordered range of all the pricings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PricingModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pricings
	 * @param end the upper bound of the range of pricings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of pricings
	 */
	public java.util.List<Pricing> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Pricing>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the pricings from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of pricings.
	 *
	 * @return the number of pricings
	 */
	public int countAll();

}