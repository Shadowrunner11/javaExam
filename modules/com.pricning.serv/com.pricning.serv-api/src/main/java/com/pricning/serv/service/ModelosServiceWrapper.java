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
 * Provides a wrapper for {@link ModelosService}.
 *
 * @author Brian Wing Shun Chan
 * @see ModelosService
 * @generated
 */
public class ModelosServiceWrapper
	implements ModelosService, ServiceWrapper<ModelosService> {

	public ModelosServiceWrapper(ModelosService modelosService) {
		_modelosService = modelosService;
	}

	@Override
	public java.util.List<com.pricning.serv.model.Modelos> getModeloses() {
		return _modelosService.getModeloses();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _modelosService.getOSGiServiceIdentifier();
	}

	@Override
	public ModelosService getWrappedService() {
		return _modelosService;
	}

	@Override
	public void setWrappedService(ModelosService modelosService) {
		_modelosService = modelosService;
	}

	private ModelosService _modelosService;

}