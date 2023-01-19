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

import com.pricning.serv.model.Modelos;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Modelos in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class ModelosCacheModel implements CacheModel<Modelos>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof ModelosCacheModel)) {
			return false;
		}

		ModelosCacheModel modelosCacheModel = (ModelosCacheModel)object;

		if (id == modelosCacheModel.id) {
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
		StringBundler sb = new StringBundler(7);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", id=");
		sb.append(id);
		sb.append(", modeloName=");
		sb.append(modeloName);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Modelos toEntityModel() {
		ModelosImpl modelosImpl = new ModelosImpl();

		if (uuid == null) {
			modelosImpl.setUuid("");
		}
		else {
			modelosImpl.setUuid(uuid);
		}

		modelosImpl.setId(id);

		if (modeloName == null) {
			modelosImpl.setModeloName("");
		}
		else {
			modelosImpl.setModeloName(modeloName);
		}

		modelosImpl.resetOriginalValues();

		return modelosImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		id = objectInput.readLong();
		modeloName = objectInput.readUTF();
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

		if (modeloName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(modeloName);
		}
	}

	public String uuid;
	public long id;
	public String modeloName;

}