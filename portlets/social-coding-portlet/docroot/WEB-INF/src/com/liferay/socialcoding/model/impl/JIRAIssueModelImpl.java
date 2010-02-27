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
import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.HtmlUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import com.liferay.socialcoding.model.JIRAIssue;
import com.liferay.socialcoding.model.JIRAIssueSoap;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * <a href="JIRAIssueModelImpl.java.html"><b><i>View Source</i></b></a>
 *
 * <p>
 * ServiceBuilder generated this class. Modifications in this class will be
 * overwritten the next time is generated.
 * </p>
 *
 * <p>
 * This interface is a model that represents the jiraissue table in the
 * database.
 * </p>
 *
 * @author    Brian Wing Shun Chan
 * @see       JIRAIssueImpl
 * @see       com.liferay.socialcoding.model.JIRAIssue
 * @see       com.liferay.socialcoding.model.JIRAIssueModel
 * @generated
 */
public class JIRAIssueModelImpl extends BaseModelImpl<JIRAIssue> {
	public static final String TABLE_NAME = "jiraissue";
	public static final Object[][] TABLE_COLUMNS = {
			{ "id", new Integer(Types.BIGINT) },
			{ "created", new Integer(Types.TIMESTAMP) },
			{ "updated", new Integer(Types.TIMESTAMP) },
			{ "project", new Integer(Types.BIGINT) },
			{ "pkey", new Integer(Types.VARCHAR) },
			{ "summary", new Integer(Types.VARCHAR) },
			{ "description", new Integer(Types.VARCHAR) },
			{ "reporter", new Integer(Types.VARCHAR) },
			{ "assignee", new Integer(Types.VARCHAR) },
			{ "resolution", new Integer(Types.VARCHAR) },
			{ "issuestatus", new Integer(Types.VARCHAR) }
		};
	public static final String TABLE_SQL_CREATE = "create table jiraissue (id LONG not null primary key,created DATE null,updated DATE null,project LONG,pkey VARCHAR(75) null,summary VARCHAR(75) null,description VARCHAR(75) null,reporter VARCHAR(75) null,assignee VARCHAR(75) null,resolution VARCHAR(75) null,issuestatus VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table jiraissue";
	public static final String ORDER_BY_JPQL = " ORDER BY jiraIssue.modifiedDate DESC";
	public static final String ORDER_BY_SQL = " ORDER BY jiraissue.updated DESC";
	public static final String DATA_SOURCE = "jiraDataSource";
	public static final String SESSION_FACTORY = "jiraSessionFactory";
	public static final String TX_MANAGER = "jiraTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.liferay.socialcoding.model.JIRAIssue"),
			false);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.liferay.socialcoding.model.JIRAIssue"),
			false);

	public static JIRAIssue toModel(JIRAIssueSoap soapModel) {
		JIRAIssue model = new JIRAIssueImpl();

		model.setJiraIssueId(soapModel.getJiraIssueId());
		model.setCreateDate(soapModel.getCreateDate());
		model.setModifiedDate(soapModel.getModifiedDate());
		model.setProjectId(soapModel.getProjectId());
		model.setKey(soapModel.getKey());
		model.setSummary(soapModel.getSummary());
		model.setDescription(soapModel.getDescription());
		model.setReporterJiraUserId(soapModel.getReporterJiraUserId());
		model.setAssigneeJiraUserId(soapModel.getAssigneeJiraUserId());
		model.setResolution(soapModel.getResolution());
		model.setStatus(soapModel.getStatus());

		return model;
	}

	public static List<JIRAIssue> toModels(JIRAIssueSoap[] soapModels) {
		List<JIRAIssue> models = new ArrayList<JIRAIssue>(soapModels.length);

		for (JIRAIssueSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.liferay.socialcoding.model.JIRAIssue"));

	public JIRAIssueModelImpl() {
	}

	public long getPrimaryKey() {
		return _jiraIssueId;
	}

	public void setPrimaryKey(long pk) {
		setJiraIssueId(pk);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_jiraIssueId);
	}

	public long getJiraIssueId() {
		return _jiraIssueId;
	}

	public void setJiraIssueId(long jiraIssueId) {
		_jiraIssueId = jiraIssueId;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public long getProjectId() {
		return _projectId;
	}

	public void setProjectId(long projectId) {
		_projectId = projectId;
	}

	public String getKey() {
		return GetterUtil.getString(_key);
	}

	public void setKey(String key) {
		_key = key;

		if (_originalKey == null) {
			_originalKey = key;
		}
	}

	public String getOriginalKey() {
		return GetterUtil.getString(_originalKey);
	}

	public String getSummary() {
		return GetterUtil.getString(_summary);
	}

	public void setSummary(String summary) {
		_summary = summary;
	}

	public String getDescription() {
		return GetterUtil.getString(_description);
	}

	public void setDescription(String description) {
		_description = description;
	}

	public String getReporterJiraUserId() {
		return GetterUtil.getString(_reporterJiraUserId);
	}

	public void setReporterJiraUserId(String reporterJiraUserId) {
		_reporterJiraUserId = reporterJiraUserId;
	}

	public String getAssigneeJiraUserId() {
		return GetterUtil.getString(_assigneeJiraUserId);
	}

	public void setAssigneeJiraUserId(String assigneeJiraUserId) {
		_assigneeJiraUserId = assigneeJiraUserId;
	}

	public String getResolution() {
		return GetterUtil.getString(_resolution);
	}

	public void setResolution(String resolution) {
		_resolution = resolution;
	}

	public String getStatus() {
		return GetterUtil.getString(_status);
	}

	public void setStatus(String status) {
		_status = status;
	}

	public JIRAIssue toEscapedModel() {
		if (isEscapedModel()) {
			return (JIRAIssue)this;
		}
		else {
			JIRAIssue model = new JIRAIssueImpl();

			model.setNew(isNew());
			model.setEscapedModel(true);

			model.setJiraIssueId(getJiraIssueId());
			model.setCreateDate(getCreateDate());
			model.setModifiedDate(getModifiedDate());
			model.setProjectId(getProjectId());
			model.setKey(HtmlUtil.escape(getKey()));
			model.setSummary(HtmlUtil.escape(getSummary()));
			model.setDescription(HtmlUtil.escape(getDescription()));
			model.setReporterJiraUserId(HtmlUtil.escape(getReporterJiraUserId()));
			model.setAssigneeJiraUserId(HtmlUtil.escape(getAssigneeJiraUserId()));
			model.setResolution(HtmlUtil.escape(getResolution()));
			model.setStatus(HtmlUtil.escape(getStatus()));

			model = (JIRAIssue)Proxy.newProxyInstance(JIRAIssue.class.getClassLoader(),
					new Class[] { JIRAIssue.class },
					new ReadOnlyBeanHandler(model));

			return model;
		}
	}

	public ExpandoBridge getExpandoBridge() {
		if (_expandoBridge == null) {
			_expandoBridge = ExpandoBridgeFactoryUtil.getExpandoBridge(0,
					JIRAIssue.class.getName(), getPrimaryKey());
		}

		return _expandoBridge;
	}

	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		getExpandoBridge().setAttributes(serviceContext);
	}

	public Object clone() {
		JIRAIssueImpl clone = new JIRAIssueImpl();

		clone.setJiraIssueId(getJiraIssueId());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setProjectId(getProjectId());
		clone.setKey(getKey());
		clone.setSummary(getSummary());
		clone.setDescription(getDescription());
		clone.setReporterJiraUserId(getReporterJiraUserId());
		clone.setAssigneeJiraUserId(getAssigneeJiraUserId());
		clone.setResolution(getResolution());
		clone.setStatus(getStatus());

		return clone;
	}

	public int compareTo(JIRAIssue jiraIssue) {
		int value = 0;

		value = DateUtil.compareTo(getModifiedDate(),
				jiraIssue.getModifiedDate());

		value = value * -1;

		if (value != 0) {
			return value;
		}

		return 0;
	}

	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		JIRAIssue jiraIssue = null;

		try {
			jiraIssue = (JIRAIssue)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long pk = jiraIssue.getPrimaryKey();

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
		StringBundler sb = new StringBundler(23);

		sb.append("{jiraIssueId=");
		sb.append(getJiraIssueId());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", projectId=");
		sb.append(getProjectId());
		sb.append(", key=");
		sb.append(getKey());
		sb.append(", summary=");
		sb.append(getSummary());
		sb.append(", description=");
		sb.append(getDescription());
		sb.append(", reporterJiraUserId=");
		sb.append(getReporterJiraUserId());
		sb.append(", assigneeJiraUserId=");
		sb.append(getAssigneeJiraUserId());
		sb.append(", resolution=");
		sb.append(getResolution());
		sb.append(", status=");
		sb.append(getStatus());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(37);

		sb.append("<model><model-name>");
		sb.append("com.liferay.socialcoding.model.JIRAIssue");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>jiraIssueId</column-name><column-value><![CDATA[");
		sb.append(getJiraIssueId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>projectId</column-name><column-value><![CDATA[");
		sb.append(getProjectId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>key</column-name><column-value><![CDATA[");
		sb.append(getKey());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>summary</column-name><column-value><![CDATA[");
		sb.append(getSummary());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>reporterJiraUserId</column-name><column-value><![CDATA[");
		sb.append(getReporterJiraUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>assigneeJiraUserId</column-name><column-value><![CDATA[");
		sb.append(getAssigneeJiraUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>resolution</column-name><column-value><![CDATA[");
		sb.append(getResolution());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>status</column-name><column-value><![CDATA[");
		sb.append(getStatus());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _jiraIssueId;
	private Date _createDate;
	private Date _modifiedDate;
	private long _projectId;
	private String _key;
	private String _originalKey;
	private String _summary;
	private String _description;
	private String _reporterJiraUserId;
	private String _assigneeJiraUserId;
	private String _resolution;
	private String _status;
	private transient ExpandoBridge _expandoBridge;
}