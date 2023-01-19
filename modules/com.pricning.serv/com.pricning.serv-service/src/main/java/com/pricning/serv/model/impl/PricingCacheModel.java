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

package com.pricning.serv.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.pricning.serv.model.Pricing;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Pricing in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class PricingCacheModel implements CacheModel<Pricing>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof PricingCacheModel)) {
			return false;
		}

		PricingCacheModel pricingCacheModel = (PricingCacheModel)object;

		if (id == pricingCacheModel.id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(33);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", id=");
		sb.append(id);
		sb.append(", firstName=");
		sb.append(firstName);
		sb.append(", lastName=");
		sb.append(lastName);
		sb.append(", carModel=");
		sb.append(carModel);
		sb.append(", identityDocument=");
		sb.append(identityDocument);
		sb.append(", sucursal=");
		sb.append(sucursal);
		sb.append(", department=");
		sb.append(department);
		sb.append(", province=");
		sb.append(province);
		sb.append(", productType=");
		sb.append(productType);
		sb.append(", productModel=");
		sb.append(productModel);
		sb.append(", productVersion=");
		sb.append(productVersion);
		sb.append(", contactChannel=");
		sb.append(contactChannel);
		sb.append(", phone=");
		sb.append(phone);
		sb.append(", clientType=");
		sb.append(clientType);
		sb.append(", email=");
		sb.append(email);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Pricing toEntityModel() {
		PricingImpl pricingImpl = new PricingImpl();

		if (uuid == null) {
			pricingImpl.setUuid("");
		}
		else {
			pricingImpl.setUuid(uuid);
		}

		pricingImpl.setId(id);

		if (firstName == null) {
			pricingImpl.setFirstName("");
		}
		else {
			pricingImpl.setFirstName(firstName);
		}

		if (lastName == null) {
			pricingImpl.setLastName("");
		}
		else {
			pricingImpl.setLastName(lastName);
		}

		if (carModel == null) {
			pricingImpl.setCarModel("");
		}
		else {
			pricingImpl.setCarModel(carModel);
		}

		if (identityDocument == null) {
			pricingImpl.setIdentityDocument("");
		}
		else {
			pricingImpl.setIdentityDocument(identityDocument);
		}

		if (sucursal == null) {
			pricingImpl.setSucursal("");
		}
		else {
			pricingImpl.setSucursal(sucursal);
		}

		if (department == null) {
			pricingImpl.setDepartment("");
		}
		else {
			pricingImpl.setDepartment(department);
		}

		if (province == null) {
			pricingImpl.setProvince("");
		}
		else {
			pricingImpl.setProvince(province);
		}

		if (productType == null) {
			pricingImpl.setProductType("");
		}
		else {
			pricingImpl.setProductType(productType);
		}

		if (productModel == null) {
			pricingImpl.setProductModel("");
		}
		else {
			pricingImpl.setProductModel(productModel);
		}

		if (productVersion == null) {
			pricingImpl.setProductVersion("");
		}
		else {
			pricingImpl.setProductVersion(productVersion);
		}

		if (contactChannel == null) {
			pricingImpl.setContactChannel("");
		}
		else {
			pricingImpl.setContactChannel(contactChannel);
		}

		if (phone == null) {
			pricingImpl.setPhone("");
		}
		else {
			pricingImpl.setPhone(phone);
		}

		if (clientType == null) {
			pricingImpl.setClientType("");
		}
		else {
			pricingImpl.setClientType(clientType);
		}

		if (email == null) {
			pricingImpl.setEmail("");
		}
		else {
			pricingImpl.setEmail(email);
		}

		pricingImpl.resetOriginalValues();

		return pricingImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		id = objectInput.readLong();
		firstName = objectInput.readUTF();
		lastName = objectInput.readUTF();
		carModel = objectInput.readUTF();
		identityDocument = objectInput.readUTF();
		sucursal = objectInput.readUTF();
		department = objectInput.readUTF();
		province = objectInput.readUTF();
		productType = objectInput.readUTF();
		productModel = objectInput.readUTF();
		productVersion = objectInput.readUTF();
		contactChannel = objectInput.readUTF();
		phone = objectInput.readUTF();
		clientType = objectInput.readUTF();
		email = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(id);

		if (firstName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(firstName);
		}

		if (lastName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(lastName);
		}

		if (carModel == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(carModel);
		}

		if (identityDocument == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(identityDocument);
		}

		if (sucursal == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(sucursal);
		}

		if (department == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(department);
		}

		if (province == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(province);
		}

		if (productType == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(productType);
		}

		if (productModel == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(productModel);
		}

		if (productVersion == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(productVersion);
		}

		if (contactChannel == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(contactChannel);
		}

		if (phone == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(phone);
		}

		if (clientType == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(clientType);
		}

		if (email == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(email);
		}
	}

	public String uuid;
	public long id;
	public String firstName;
	public String lastName;
	public String carModel;
	public String identityDocument;
	public String sucursal;
	public String department;
	public String province;
	public String productType;
	public String productModel;
	public String productVersion;
	public String contactChannel;
	public String phone;
	public String clientType;
	public String email;

}