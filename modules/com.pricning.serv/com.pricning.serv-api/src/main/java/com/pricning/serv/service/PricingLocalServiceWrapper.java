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

package com.pricning.serv.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link PricingLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see PricingLocalService
 * @generated
 */
public class PricingLocalServiceWrapper
	implements PricingLocalService, ServiceWrapper<PricingLocalService> {

	public PricingLocalServiceWrapper(PricingLocalService pricingLocalService) {
		_pricingLocalService = pricingLocalService;
	}

	/**
	 * Adds the pricing to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PricingLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param pricing the pricing
	 * @return the pricing that was added
	 */
	@Override
	public com.pricning.serv.model.Pricing addPricing(
		com.pricning.serv.model.Pricing pricing) {

		return _pricingLocalService.addPricing(pricing);
	}

	/**
	 * Creates a new pricing with the primary key. Does not add the pricing to the database.
	 *
	 * @param id the primary key for the new pricing
	 * @return the new pricing
	 */
	@Override
	public com.pricning.serv.model.Pricing createPricing(long id) {
		return _pricingLocalService.createPricing(id);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _pricingLocalService.deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the pricing with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PricingLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param id the primary key of the pricing
	 * @return the pricing that was removed
	 * @throws PortalException if a pricing with the primary key could not be found
	 */
	@Override
	public com.pricning.serv.model.Pricing deletePricing(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _pricingLocalService.deletePricing(id);
	}

	/**
	 * Deletes the pricing from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PricingLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param pricing the pricing
	 * @return the pricing that was removed
	 */
	@Override
	public com.pricning.serv.model.Pricing deletePricing(
		com.pricning.serv.model.Pricing pricing) {

		return _pricingLocalService.deletePricing(pricing);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _pricingLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _pricingLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.pricning.serv.model.impl.PricingModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _pricingLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.pricning.serv.model.impl.PricingModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _pricingLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _pricingLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _pricingLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.pricning.serv.model.Pricing fetchPricing(long id) {
		return _pricingLocalService.fetchPricing(id);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _pricingLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _pricingLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _pricingLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _pricingLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the pricing with the primary key.
	 *
	 * @param id the primary key of the pricing
	 * @return the pricing
	 * @throws PortalException if a pricing with the primary key could not be found
	 */
	@Override
	public com.pricning.serv.model.Pricing getPricing(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _pricingLocalService.getPricing(id);
	}

	/**
	 * Returns a range of all the pricings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.pricning.serv.model.impl.PricingModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pricings
	 * @param end the upper bound of the range of pricings (not inclusive)
	 * @return the range of pricings
	 */
	@Override
	public java.util.List<com.pricning.serv.model.Pricing> getPricings(
		int start, int end) {

		return _pricingLocalService.getPricings(start, end);
	}

	/**
	 * Returns the number of pricings.
	 *
	 * @return the number of pricings
	 */
	@Override
	public int getPricingsCount() {
		return _pricingLocalService.getPricingsCount();
	}

	/**
	 * Updates the pricing in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PricingLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param pricing the pricing
	 * @return the pricing that was updated
	 */
	@Override
	public com.pricning.serv.model.Pricing updatePricing(
		com.pricning.serv.model.Pricing pricing) {

		return _pricingLocalService.updatePricing(pricing);
	}

	@Override
	public PricingLocalService getWrappedService() {
		return _pricingLocalService;
	}

	@Override
	public void setWrappedService(PricingLocalService pricingLocalService) {
		_pricingLocalService = pricingLocalService;
	}

	private PricingLocalService _pricingLocalService;

}