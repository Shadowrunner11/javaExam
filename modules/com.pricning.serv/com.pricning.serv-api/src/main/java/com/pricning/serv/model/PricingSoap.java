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
 * This class is used by SOAP remote services, specifically {@link com.pricning.serv.service.http.PricingServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class PricingSoap implements Serializable {

	public static PricingSoap toSoapModel(Pricing model) {
		PricingSoap soapModel = new PricingSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setId(model.getId());
		soapModel.setFirstName(model.getFirstName());
		soapModel.setLastName(model.getLastName());
		soapModel.setCarModel(model.getCarModel());
		soapModel.setIdentityDocument(model.getIdentityDocument());
		soapModel.setSucursal(model.getSucursal());
		soapModel.setDepartment(model.getDepartment());
		soapModel.setProvince(model.getProvince());
		soapModel.setProductType(model.getProductType());
		soapModel.setProductModel(model.getProductModel());
		soapModel.setProductVersion(model.getProductVersion());
		soapModel.setContactChannel(model.getContactChannel());
		soapModel.setPhone(model.getPhone());
		soapModel.setClientType(model.getClientType());
		soapModel.setEmail(model.getEmail());

		return soapModel;
	}

	public static PricingSoap[] toSoapModels(Pricing[] models) {
		PricingSoap[] soapModels = new PricingSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static PricingSoap[][] toSoapModels(Pricing[][] models) {
		PricingSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new PricingSoap[models.length][models[0].length];
		}
		else {
			soapModels = new PricingSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static PricingSoap[] toSoapModels(List<Pricing> models) {
		List<PricingSoap> soapModels = new ArrayList<PricingSoap>(
			models.size());

		for (Pricing model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new PricingSoap[soapModels.size()]);
	}

	public PricingSoap() {
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

	public String getFirstName() {
		return _firstName;
	}

	public void setFirstName(String firstName) {
		_firstName = firstName;
	}

	public String getLastName() {
		return _lastName;
	}

	public void setLastName(String lastName) {
		_lastName = lastName;
	}

	public String getCarModel() {
		return _carModel;
	}

	public void setCarModel(String carModel) {
		_carModel = carModel;
	}

	public String getIdentityDocument() {
		return _identityDocument;
	}

	public void setIdentityDocument(String identityDocument) {
		_identityDocument = identityDocument;
	}

	public String getSucursal() {
		return _sucursal;
	}

	public void setSucursal(String sucursal) {
		_sucursal = sucursal;
	}

	public String getDepartment() {
		return _department;
	}

	public void setDepartment(String department) {
		_department = department;
	}

	public String getProvince() {
		return _province;
	}

	public void setProvince(String province) {
		_province = province;
	}

	public String getProductType() {
		return _productType;
	}

	public void setProductType(String productType) {
		_productType = productType;
	}

	public String getProductModel() {
		return _productModel;
	}

	public void setProductModel(String productModel) {
		_productModel = productModel;
	}

	public String getProductVersion() {
		return _productVersion;
	}

	public void setProductVersion(String productVersion) {
		_productVersion = productVersion;
	}

	public String getContactChannel() {
		return _contactChannel;
	}

	public void setContactChannel(String contactChannel) {
		_contactChannel = contactChannel;
	}

	public String getPhone() {
		return _phone;
	}

	public void setPhone(String phone) {
		_phone = phone;
	}

	public String getClientType() {
		return _clientType;
	}

	public void setClientType(String clientType) {
		_clientType = clientType;
	}

	public String getEmail() {
		return _email;
	}

	public void setEmail(String email) {
		_email = email;
	}

	private String _uuid;
	private long _id;
	private String _firstName;
	private String _lastName;
	private String _carModel;
	private String _identityDocument;
	private String _sucursal;
	private String _department;
	private String _province;
	private String _productType;
	private String _productModel;
	private String _productVersion;
	private String _contactChannel;
	private String _phone;
	private String _clientType;
	private String _email;

}