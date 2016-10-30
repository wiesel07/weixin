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
 * TODO 地理位置消息
 *
 * @author wujian (mailto:wujian@bosssoft.com.cn)
 */
public class LocationMessage extends BaseMessage {
	// 地理位置维度
	private String Location_X;

	// 地理位置经度
	private String Location_Y;

	// 地图缩放大小
	private String Scale;

	// 地理位置信息
	private String Label;

	public String getLocation_X() {
		return Location_X;
	}

	public void setLocation_X(String location_X) {
		Location_X = location_X;
	}

	public String getLocation_Y() {
		return Location_Y;
	}

	public void setLocation_Y(String location_Y) {
		Location_Y = location_Y;
	}

	public String getScale() {
		return Scale;
	}

	public void setScale(String scale) {
		Scale = scale;
	}

	public String getLabel() {
		return Label;
	}

	public void setLabel(String label) {
		Label = label;
	}
}

/*
 * 修改历史 $Log$
 */