/*******************************************************************************
 * $Header$
 * $Revision$
 * $Date$
 *
 *==============================================================================
 *
 * Copyright (c) 2001-2016 Bosssoft Co, Ltd.
 * All rights reserved.
 * 
 * Created on 2016年10月29日
 *******************************************************************************/

package com.wiesel.messager.req;

/**
 * TODO 链接消息
 *
 * @author wujian (mailto:wujian@bosssoft.com.cn)
 */
public class LinkMessage extends BaseMessage {
	// 消息标题
	private String Title;

	// 消息描述
	private String Description;

	// 消息链接
	private String Url;

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public String getUrl() {
		return Url;
	}

	public void setUrl(String url) {
		Url = url;
	}
}

/*
 * 修改历史 $Log$
 */