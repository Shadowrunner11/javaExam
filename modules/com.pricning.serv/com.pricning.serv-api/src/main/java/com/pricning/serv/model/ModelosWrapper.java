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

package com.pricning.serv.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Modelos}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Modelos
 * @generated
 */
public class ModelosWrapper
	extends BaseModelWrapper<Modelos>
	implements Modelos, ModelWrapper<Modelos> {

	public ModelosWrapper(Modelos modelos) {
		super(modelos);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("id", getId());
		attributes.put("modeloName", getModeloName());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String modeloName = (String)attributes.get("modeloName");

		if (modeloName != null) {
			setModeloName(modeloName);
		}
	}

	/**
	 * Returns the ID of this modelos.
	 *
	 * @return the ID of this modelos
	 */
	@Override
	public long getId() {
		return model.getId();
	}

	/**
	 * Returns the modelo name of this modelos.
	 *
	 * @return the modelo name of this modelos
	 */
	@Override
	public String getModeloName() {
		return model.getModeloName();
	}

	/**
	 * Returns the primary key of this modelos.
	 *
	 * @return the primary key of this modelos
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the uuid of this modelos.
	 *
	 * @return the uuid of this modelos
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the ID of this modelos.
	 *
	 * @param id the ID of this modelos
	 */
	@Override
	public void setId(long id) {
		model.setId(id);
	}

	/**
	 * Sets the modelo name of this modelos.
	 *
	 * @param modeloName the modelo name of this modelos
	 */
	@Override
	public void setModeloName(String modeloName) {
		model.setModeloName(modeloName);
	}

	/**
	 * Sets the primary key of this modelos.
	 *
	 * @param primaryKey the primary key of this modelos
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the uuid of this modelos.
	 *
	 * @param uuid the uuid of this modelos
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	protected ModelosWrapper wrap(Modelos modelos) {
		return new ModelosWrapper(modelos);
	}

}