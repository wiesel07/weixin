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
 * TODO 音频消息
 *
 * @author wujian (mailto:wujian@bosssoft.com.cn)
 */
public class VoiceMessage extends BaseMessage {
	// 媒体ID
	private String MediaId;

	// 语音格式
	private String Format;

	public String getMediaId() {
		return MediaId;
	}

	public void setMediaId(String mediaId) {
		MediaId = mediaId;
	}

	public String getFormat() {
		return Format;
	}

	public void setFormat(String format) {
		Format = format;
	}
}

/*
 * 修改历史 $Log$
 */