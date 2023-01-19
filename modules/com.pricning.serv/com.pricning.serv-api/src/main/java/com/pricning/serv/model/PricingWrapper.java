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
 * This class is a wrapper for {@link Pricing}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Pricing
 * @generated
 */
public class PricingWrapper
	extends BaseModelWrapper<Pricing>
	implements ModelWrapper<Pricing>, Pricing {

	public PricingWrapper(Pricing pricing) {
		super(pricing);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("id", getId());
		attributes.put("firstName", getFirstName());
		attributes.put("lastName", getLastName());
		attributes.put("carModel", getCarModel());
		attributes.put("identityDocument", getIdentityDocument());
		attributes.put("sucursal", getSucursal());
		attributes.put("department", getDepartment());
		attributes.put("province", getProvince());
		attributes.put("productType", getProductType());
		attributes.put("productModel", getProductModel());
		attributes.put("productVersion", getProductVersion());
		attributes.put("contactChannel", getContactChannel());
		attributes.put("phone", getPhone());
		attributes.put("clientType", getClientType());
		attributes.put("email", getEmail());

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

		String firstName = (String)attributes.get("firstName");

		if (firstName != null) {
			setFirstName(firstName);
		}

		String lastName = (String)attributes.get("lastName");

		if (lastName != null) {
			setLastName(lastName);
		}

		String carModel = (String)attributes.get("carModel");

		if (carModel != null) {
			setCarModel(carModel);
		}

		String identityDocument = (String)attributes.get("identityDocument");

		if (identityDocument != null) {
			setIdentityDocument(identityDocument);
		}

		String sucursal = (String)attributes.get("sucursal");

		if (sucursal != null) {
			setSucursal(sucursal);
		}

		String department = (String)attributes.get("department");

		if (department != null) {
			setDepartment(department);
		}

		String province = (String)attributes.get("province");

		if (province != null) {
			setProvince(province);
		}

		String productType = (String)attributes.get("productType");

		if (productType != null) {
			setProductType(productType);
		}

		String productModel = (String)attributes.get("productModel");

		if (productModel != null) {
			setProductModel(productModel);
		}

		String productVersion = (String)attributes.get("productVersion");

		if (productVersion != null) {
			setProductVersion(productVersion);
		}

		String contactChannel = (String)attributes.get("contactChannel");

		if (contactChannel != null) {
			setContactChannel(contactChannel);
		}

		String phone = (String)attributes.get("phone");

		if (phone != null) {
			setPhone(phone);
		}

		String clientType = (String)attributes.get("clientType");

		if (clientType != null) {
			setClientType(clientType);
		}

		String email = (String)attributes.get("email");

		if (email != null) {
			setEmail(email);
		}
	}

	/**
	 * Returns the car model of this pricing.
	 *
	 * @return the car model of this pricing
	 */
	@Override
	public String getCarModel() {
		return model.getCarModel();
	}

	/**
	 * Returns the client type of this pricing.
	 *
	 * @return the client type of this pricing
	 */
	@Override
	public String getClientType() {
		return model.getClientType();
	}

	/**
	 * Returns the contact channel of this pricing.
	 *
	 * @return the contact channel of this pricing
	 */
	@Override
	public String getContactChannel() {
		return model.getContactChannel();
	}

	/**
	 * Returns the department of this pricing.
	 *
	 * @return the department of this pricing
	 */
	@Override
	public String getDepartment() {
		return model.getDepartment();
	}

	/**
	 * Returns the email of this pricing.
	 *
	 * @return the email of this pricing
	 */
	@Override
	public String getEmail() {
		return model.getEmail();
	}

	/**
	 * Returns the first name of this pricing.
	 *
	 * @return the first name of this pricing
	 */
	@Override
	public String getFirstName() {
		return model.getFirstName();
	}

	/**
	 * Returns the ID of this pricing.
	 *
	 * @return the ID of this pricing
	 */
	@Override
	public long getId() {
		return model.getId();
	}

	/**
	 * Returns the identity document of this pricing.
	 *
	 * @return the identity document of this pricing
	 */
	@Override
	public String getIdentityDocument() {
		return model.getIdentityDocument();
	}

	/**
	 * Returns the last name of this pricing.
	 *
	 * @return the last name of this pricing
	 */
	@Override
	public String getLastName() {
		return model.getLastName();
	}

	/**
	 * Returns the phone of this pricing.
	 *
	 * @return the phone of this pricing
	 */
	@Override
	public String getPhone() {
		return model.getPhone();
	}

	/**
	 * Returns the primary key of this pricing.
	 *
	 * @return the primary key of this pricing
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the product model of this pricing.
	 *
	 * @return the product model of this pricing
	 */
	@Override
	public String getProductModel() {
		return model.getProductModel();
	}

	/**
	 * Returns the product type of this pricing.
	 *
	 * @return the product type of this pricing
	 */
	@Override
	public String getProductType() {
		return model.getProductType();
	}

	/**
	 * Returns the product version of this pricing.
	 *
	 * @return the product version of this pricing
	 */
	@Override
	public String getProductVersion() {
		return model.getProductVersion();
	}

	/**
	 * Returns the province of this pricing.
	 *
	 * @return the province of this pricing
	 */
	@Override
	public String getProvince() {
		return model.getProvince();
	}

	/**
	 * Returns the sucursal of this pricing.
	 *
	 * @return the sucursal of this pricing
	 */
	@Override
	public String getSucursal() {
		return model.getSucursal();
	}

	/**
	 * Returns the uuid of this pricing.
	 *
	 * @return the uuid of this pricing
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
	 * Sets the car model of this pricing.
	 *
	 * @param carModel the car model of this pricing
	 */
	@Override
	public void setCarModel(String carModel) {
		model.setCarModel(carModel);
	}

	/**
	 * Sets the client type of this pricing.
	 *
	 * @param clientType the client type of this pricing
	 */
	@Override
	public void setClientType(String clientType) {
		model.setClientType(clientType);
	}

	/**
	 * Sets the contact channel of this pricing.
	 *
	 * @param contactChannel the contact channel of this pricing
	 */
	@Override
	public void setContactChannel(String contactChannel) {
		model.setContactChannel(contactChannel);
	}

	/**
	 * Sets the department of this pricing.
	 *
	 * @param department the department of this pricing
	 */
	@Override
	public void setDepartment(String department) {
		model.setDepartment(department);
	}

	/**
	 * Sets the email of this pricing.
	 *
	 * @param email the email of this pricing
	 */
	@Override
	public void setEmail(String email) {
		model.setEmail(email);
	}

	/**
	 * Sets the first name of this pricing.
	 *
	 * @param firstName the first name of this pricing
	 */
	@Override
	public void setFirstName(String firstName) {
		model.setFirstName(firstName);
	}

	/**
	 * Sets the ID of this pricing.
	 *
	 * @param id the ID of this pricing
	 */
	@Override
	public void setId(long id) {
		model.setId(id);
	}

	/**
	 * Sets the identity document of this pricing.
	 *
	 * @param identityDocument the identity document of this pricing
	 */
	@Override
	public void setIdentityDocument(String identityDocument) {
		model.setIdentityDocument(identityDocument);
	}

	/**
	 * Sets the last name of this pricing.
	 *
	 * @param lastName the last name of this pricing
	 */
	@Override
	public void setLastName(String lastName) {
		model.setLastName(lastName);
	}

	/**
	 * Sets the phone of this pricing.
	 *
	 * @param phone the phone of this pricing
	 */
	@Override
	public void setPhone(String phone) {
		model.setPhone(phone);
	}

	/**
	 * Sets the primary key of this pricing.
	 *
	 * @param primaryKey the primary key of this pricing
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the product model of this pricing.
	 *
	 * @param productModel the product model of this pricing
	 */
	@Override
	public void setProductModel(String productModel) {
		model.setProductModel(productModel);
	}

	/**
	 * Sets the product type of this pricing.
	 *
	 * @param productType the product type of this pricing
	 */
	@Override
	public void setProductType(String productType) {
		model.setProductType(productType);
	}

	/**
	 * Sets the product version of this pricing.
	 *
	 * @param productVersion the product version of this pricing
	 */
	@Override
	public void setProductVersion(String productVersion) {
		model.setProductVersion(productVersion);
	}

	/**
	 * Sets the province of this pricing.
	 *
	 * @param province the province of this pricing
	 */
	@Override
	public void setProvince(String province) {
		model.setProvince(province);
	}

	/**
	 * Sets the sucursal of this pricing.
	 *
	 * @param sucursal the sucursal of this pricing
	 */
	@Override
	public void setSucursal(String sucursal) {
		model.setSucursal(sucursal);
	}

	/**
	 * Sets the uuid of this pricing.
	 *
	 * @param uuid the uuid of this pricing
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	protected PricingWrapper wrap(Pricing pricing) {
		return new PricingWrapper(pricing);
	}

}