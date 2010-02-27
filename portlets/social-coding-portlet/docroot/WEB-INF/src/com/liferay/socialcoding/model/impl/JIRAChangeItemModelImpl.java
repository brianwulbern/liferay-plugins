/**
 * Copyright (c) 2000-2010 Liferay, Inc. All rights reserved.
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

package com.liferay.socialcoding.model.impl;

import com.liferay.portal.kernel.bean.ReadOnlyBeanHandler;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.HtmlUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import com.liferay.socialcoding.model.JIRAChangeItem;
import com.liferay.socialcoding.model.JIRAChangeItemSoap;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.sql.Types;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="JIRAChangeItemModelImpl.java.html"><b><i>View Source</i></b></a>
 *
 * <p>
 * ServiceBuilder generated this class. Modifications in this class will be
 * overwritten the next time is generated.
 * </p>
 *
 * <p>
 * This interface is a model that represents the changeitem table in the
 * database.
 * </p>
 *
 * @author    Brian Wing Shun Chan
 * @see       JIRAChangeItemImpl
 * @see       com.liferay.socialcoding.model.JIRAChangeItem
 * @see       com.liferay.socialcoding.model.JIRAChangeItemModel
 * @generated
 */
public class JIRAChangeItemModelImpl extends BaseModelImpl<JIRAChangeItem> {
	public static final String TABLE_NAME = "changeitem";
	public static final Object[][] TABLE_COLUMNS = {
			{ "id", new Integer(Types.BIGINT) },
			{ "groupid", new Integer(Types.BIGINT) },
			{ "field", new Integer(Types.VARCHAR) },
			{ "oldValue", new Integer(Types.VARCHAR) },
			{ "oldString", new Integer(Types.VARCHAR) },
			{ "newValue", new Integer(Types.VARCHAR) },
			{ "newString", new Integer(Types.VARCHAR) }
		};
	public static final String TABLE_SQL_CREATE = "create table changeitem (id LONG not null primary key,groupid LONG,field VARCHAR(75) null,oldValue VARCHAR(75) null,oldString VARCHAR(75) null,newValue VARCHAR(75) null,newString VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table changeitem";
	public static final String DATA_SOURCE = "jiraDataSource";
	public static final String SESSION_FACTORY = "jiraSessionFactory";
	public static final String TX_MANAGER = "jiraTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.liferay.socialcoding.model.JIRAChangeItem"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.liferay.socialcoding.model.JIRAChangeItem"),
			true);

	public static JIRAChangeItem toModel(JIRAChangeItemSoap soapModel) {
		JIRAChangeItem model = new JIRAChangeItemImpl();

		model.setJiraChangeItemId(soapModel.getJiraChangeItemId());
		model.setJiraChangeGroupId(soapModel.getJiraChangeGroupId());
		model.setField(soapModel.getField());
		model.setOldValue(soapModel.getOldValue());
		model.setOldString(soapModel.getOldString());
		model.setNewValue(soapModel.getNewValue());
		model.setNewString(soapModel.getNewString());

		return model;
	}

	public static List<JIRAChangeItem> toModels(JIRAChangeItemSoap[] soapModels) {
		List<JIRAChangeItem> models = new ArrayList<JIRAChangeItem>(soapModels.length);

		for (JIRAChangeItemSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.liferay.socialcoding.model.JIRAChangeItem"));

	public JIRAChangeItemModelImpl() {
	}

	public long getPrimaryKey() {
		return _jiraChangeItemId;
	}

	public void setPrimaryKey(long pk) {
		setJiraChangeItemId(pk);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_jiraChangeItemId);
	}

	public long getJiraChangeItemId() {
		return _jiraChangeItemId;
	}

	public void setJiraChangeItemId(long jiraChangeItemId) {
		_jiraChangeItemId = jiraChangeItemId;
	}

	public long getJiraChangeGroupId() {
		return _jiraChangeGroupId;
	}

	public void setJiraChangeGroupId(long jiraChangeGroupId) {
		_jiraChangeGroupId = jiraChangeGroupId;
	}

	public String getField() {
		return GetterUtil.getString(_field);
	}

	public void setField(String field) {
		_field = field;
	}

	public String getOldValue() {
		return GetterUtil.getString(_oldValue);
	}

	public void setOldValue(String oldValue) {
		_oldValue = oldValue;
	}

	public String getOldString() {
		return GetterUtil.getString(_oldString);
	}

	public void setOldString(String oldString) {
		_oldString = oldString;
	}

	public String getNewValue() {
		return GetterUtil.getString(_newValue);
	}

	public void setNewValue(String newValue) {
		_newValue = newValue;
	}

	public String getNewString() {
		return GetterUtil.getString(_newString);
	}

	public void setNewString(String newString) {
		_newString = newString;
	}

	public JIRAChangeItem toEscapedModel() {
		if (isEscapedModel()) {
			return (JIRAChangeItem)this;
		}
		else {
			JIRAChangeItem model = new JIRAChangeItemImpl();

			model.setNew(isNew());
			model.setEscapedModel(true);

			model.setJiraChangeItemId(getJiraChangeItemId());
			model.setJiraChangeGroupId(getJiraChangeGroupId());
			model.setField(HtmlUtil.escape(getField()));
			model.setOldValue(HtmlUtil.escape(getOldValue()));
			model.setOldString(HtmlUtil.escape(getOldString()));
			model.setNewValue(HtmlUtil.escape(getNewValue()));
			model.setNewString(HtmlUtil.escape(getNewString()));

			model = (JIRAChangeItem)Proxy.newProxyInstance(JIRAChangeItem.class.getClassLoader(),
					new Class[] { JIRAChangeItem.class },
					new ReadOnlyBeanHandler(model));

			return model;
		}
	}

	public ExpandoBridge getExpandoBridge() {
		if (_expandoBridge == null) {
			_expandoBridge = ExpandoBridgeFactoryUtil.getExpandoBridge(0,
					JIRAChangeItem.class.getName(), getPrimaryKey());
		}

		return _expandoBridge;
	}

	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		getExpandoBridge().setAttributes(serviceContext);
	}

	public Object clone() {
		JIRAChangeItemImpl clone = new JIRAChangeItemImpl();

		clone.setJiraChangeItemId(getJiraChangeItemId());
		clone.setJiraChangeGroupId(getJiraChangeGroupId());
		clone.setField(getField());
		clone.setOldValue(getOldValue());
		clone.setOldString(getOldString());
		clone.setNewValue(getNewValue());
		clone.setNewString(getNewString());

		return clone;
	}

	public int compareTo(JIRAChangeItem jiraChangeItem) {
		long pk = jiraChangeItem.getPrimaryKey();

		if (getPrimaryKey() < pk) {
			return -1;
		}
		else if (getPrimaryKey() > pk) {
			return 1;
		}
		else {
			return 0;
		}
	}

	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		JIRAChangeItem jiraChangeItem = null;

		try {
			jiraChangeItem = (JIRAChangeItem)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long pk = jiraChangeItem.getPrimaryKey();

		if (getPrimaryKey() == pk) {
			return true;
		}
		else {
			return false;
		}
	}

	public int hashCode() {
		return (int)getPrimaryKey();
	}

	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{jiraChangeItemId=");
		sb.append(getJiraChangeItemId());
		sb.append(", jiraChangeGroupId=");
		sb.append(getJiraChangeGroupId());
		sb.append(", field=");
		sb.append(getField());
		sb.append(", oldValue=");
		sb.append(getOldValue());
		sb.append(", oldString=");
		sb.append(getOldString());
		sb.append(", newValue=");
		sb.append(getNewValue());
		sb.append(", newString=");
		sb.append(getNewString());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(25);

		sb.append("<model><model-name>");
		sb.append("com.liferay.socialcoding.model.JIRAChangeItem");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>jiraChangeItemId</column-name><column-value><![CDATA[");
		sb.append(getJiraChangeItemId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>jiraChangeGroupId</column-name><column-value><![CDATA[");
		sb.append(getJiraChangeGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>field</column-name><column-value><![CDATA[");
		sb.append(getField());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>oldValue</column-name><column-value><![CDATA[");
		sb.append(getOldValue());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>oldString</column-name><column-value><![CDATA[");
		sb.append(getOldString());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>newValue</column-name><column-value><![CDATA[");
		sb.append(getNewValue());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>newString</column-name><column-value><![CDATA[");
		sb.append(getNewString());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _jiraChangeItemId;
	private long _jiraChangeGroupId;
	private String _field;
	private String _oldValue;
	private String _oldString;
	private String _newValue;
	private String _newString;
	private transient ExpandoBridge _expandoBridge;
}