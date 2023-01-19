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
 * Provides a wrapper for {@link ModelosLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see ModelosLocalService
 * @generated
 */
public class ModelosLocalServiceWrapper
	implements ModelosLocalService, ServiceWrapper<ModelosLocalService> {

	public ModelosLocalServiceWrapper(ModelosLocalService modelosLocalService) {
		_modelosLocalService = modelosLocalService;
	}

	/**
	 * Adds the modelos to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ModelosLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param modelos the modelos
	 * @return the modelos that was added
	 */
	@Override
	public com.pricning.serv.model.Modelos addModelos(
		com.pricning.serv.model.Modelos modelos) {

		return _modelosLocalService.addModelos(modelos);
	}

	/**
	 * Creates a new modelos with the primary key. Does not add the modelos to the database.
	 *
	 * @param id the primary key for the new modelos
	 * @return the new modelos
	 */
	@Override
	public com.pricning.serv.model.Modelos createModelos(long id) {
		return _modelosLocalService.createModelos(id);
	}

	/**
	 * Deletes the modelos with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ModelosLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param id the primary key of the modelos
	 * @return the modelos that was removed
	 * @throws PortalException if a modelos with the primary key could not be found
	 */
	@Override
	public com.pricning.serv.model.Modelos deleteModelos(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _modelosLocalService.deleteModelos(id);
	}

	/**
	 * Deletes the modelos from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ModelosLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param modelos the modelos
	 * @return the modelos that was removed
	 */
	@Override
	public com.pricning.serv.model.Modelos deleteModelos(
		com.pricning.serv.model.Modelos modelos) {

		return _modelosLocalService.deleteModelos(modelos);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _modelosLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _modelosLocalService.dynamicQuery();
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

		return _modelosLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.pricning.serv.model.impl.ModelosModelImpl</code>.
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

		return _modelosLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.pricning.serv.model.impl.ModelosModelImpl</code>.
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

		return _modelosLocalService.dynamicQuery(
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

		return _modelosLocalService.dynamicQueryCount(dynamicQuery);
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

		return _modelosLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.pricning.serv.model.Modelos fetchModelos(long id) {
		return _modelosLocalService.fetchModelos(id);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _modelosLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _modelosLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the modelos with the primary key.
	 *
	 * @param id the primary key of the modelos
	 * @return the modelos
	 * @throws PortalException if a modelos with the primary key could not be found
	 */
	@Override
	public com.pricning.serv.model.Modelos getModelos(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _modelosLocalService.getModelos(id);
	}

	/**
	 * Returns a range of all the modeloses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.pricning.serv.model.impl.ModelosModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of modeloses
	 * @param end the upper bound of the range of modeloses (not inclusive)
	 * @return the range of modeloses
	 */
	@Override
	public java.util.List<com.pricning.serv.model.Modelos> getModeloses(
		int start, int end) {

		return _modelosLocalService.getModeloses(start, end);
	}

	/**
	 * Returns the number of modeloses.
	 *
	 * @return the number of modeloses
	 */
	@Override
	public int getModelosesCount() {
		return _modelosLocalService.getModelosesCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _modelosLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _modelosLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the modelos in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ModelosLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param modelos the modelos
	 * @return the modelos that was updated
	 */
	@Override
	public com.pricning.serv.model.Modelos updateModelos(
		com.pricning.serv.model.Modelos modelos) {

		return _modelosLocalService.updateModelos(modelos);
	}

	@Override
	public ModelosLocalService getWrappedService() {
		return _modelosLocalService;
	}

	@Override
	public void setWrappedService(ModelosLocalService modelosLocalService) {
		_modelosLocalService = modelosLocalService;
	}

	private ModelosLocalService _modelosLocalService;

}