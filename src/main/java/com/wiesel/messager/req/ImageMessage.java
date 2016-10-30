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
 * TODO 图片消息
 *
 * @author wujian (mailto:wujian@bosssoft.com.cn)
 */
public class ImageMessage extends BaseMessage {
	// 图片链接
	private String PicUrl;

	public String getPicUrl() {
		return PicUrl;
	}

	public void setPicUrl(String picUrl) {
		PicUrl = picUrl;
	}
}

/*
 * 修改历史 $Log$
 */