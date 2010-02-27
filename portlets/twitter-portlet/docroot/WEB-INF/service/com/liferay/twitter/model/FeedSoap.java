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

package com.liferay.twitter.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * <a href="FeedSoap.java.html"><b><i>View Source</i></b></a>
 *
 * <p>
 * ServiceBuilder generated this class. Modifications in this class will be
 * overwritten the next time is generated.
 * </p>
 *
 * <p>
 * This class is used by
 * {@link com.liferay.twitter.service.http.FeedServiceSoap}.
 * </p>
 *
 * @author    Brian Wing Shun Chan
 * @see       com.liferay.twitter.service.http.FeedServiceSoap
 * @generated
 */
public class FeedSoap implements Serializable {
	public static FeedSoap toSoapModel(Feed model) {
		FeedSoap soapModel = new FeedSoap();

		soapModel.setFeedId(model.getFeedId());
		soapModel.setTwitterUserId(model.getTwitterUserId());
		soapModel.setTwitterScreenName(model.getTwitterScreenName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setLastStatusId(model.getLastStatusId());

		return soapModel;
	}

	public static FeedSoap[] toSoapModels(Feed[] models) {
		FeedSoap[] soapModels = new FeedSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static FeedSoap[][] toSoapModels(Feed[][] models) {
		FeedSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new FeedSoap[models.length][models[0].length];
		}
		else {
			soapModels = new FeedSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static FeedSoap[] toSoapModels(List<Feed> models) {
		List<FeedSoap> soapModels = new ArrayList<FeedSoap>(models.size());

		for (Feed model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new FeedSoap[soapModels.size()]);
	}

	public FeedSoap() {
	}

	public long getPrimaryKey() {
		return _feedId;
	}

	public void setPrimaryKey(long pk) {
		setFeedId(pk);
	}

	public long getFeedId() {
		return _feedId;
	}

	public void setFeedId(long feedId) {
		_feedId = feedId;
	}

	public long getTwitterUserId() {
		return _twitterUserId;
	}

	public void setTwitterUserId(long twitterUserId) {
		_twitterUserId = twitterUserId;
	}

	public String getTwitterScreenName() {
		return _twitterScreenName;
	}

	public void setTwitterScreenName(String twitterScreenName) {
		_twitterScreenName = twitterScreenName;
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

	public long getLastStatusId() {
		return _lastStatusId;
	}

	public void setLastStatusId(long lastStatusId) {
		_lastStatusId = lastStatusId;
	}

	private long _feedId;
	private long _twitterUserId;
	private String _twitterScreenName;
	private Date _createDate;
	private Date _modifiedDate;
	private long _lastStatusId;
}