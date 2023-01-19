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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.pricning.serv.service.http.ModelosServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class ModelosSoap implements Serializable {

	public static ModelosSoap toSoapModel(Modelos model) {
		ModelosSoap soapModel = new ModelosSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setId(model.getId());
		soapModel.setModeloName(model.getModeloName());

		return soapModel;
	}

	public static ModelosSoap[] toSoapModels(Modelos[] models) {
		ModelosSoap[] soapModels = new ModelosSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ModelosSoap[][] toSoapModels(Modelos[][] models) {
		ModelosSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ModelosSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ModelosSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ModelosSoap[] toSoapModels(List<Modelos> models) {
		List<ModelosSoap> soapModels = new ArrayList<ModelosSoap>(
			models.size());

		for (Modelos model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ModelosSoap[soapModels.size()]);
	}

	public ModelosSoap() {
	}

	public long getPrimaryKey() {
		return _id;
	}

	public void setPrimaryKey(long pk) {
		setId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getId() {
		return _id;
	}

	public void setId(long id) {
		_id = id;
	}

	public String getModeloName() {
		return _modeloName;
	}

	public void setModeloName(String modeloName) {
		_modeloName = modeloName;
	}

	private String _uuid;
	private long _id;
	private String _modeloName;

}