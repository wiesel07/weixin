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

package com.wiesel.util;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/**
 * TODO 此处填写 class 信息
 *
 * @author wujian (mailto:wujian@bosssoft.com.cn)
 */
public class CheckUtil {
	private static final String token = "wujianwiesel";

	public static boolean checkSingnature(String signature, String timestamp,
			String nonce) {
		String[] arr = new String[] { token, timestamp, nonce };

		Arrays.sort(arr);

		StringBuffer content = new StringBuffer();

		for (String string : arr) {
			content.append(string);
		}

		String temp = getSha1(content.toString());

		return temp.equals(signature);
	}

	private static String getSha1(String content) {
		if (null == content || 0 == content.length()) {
			return null;
		}
		char[] hexDigits = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
				'a', 'b', 'c', 'd', 'e', 'f' };
		try {
			MessageDigest mdTemp = MessageDigest.getInstance("SHA1");
			mdTemp.update(content.getBytes("UTF-8"));

			byte[] md = mdTemp.digest();
			int j = md.length;
			char[] buf = new char[j * 2];
			int k = 0;
			for (int i = 0; i < j; i++) {
				byte byte0 = md[i];
				buf[k++] = hexDigits[byte0 >>> 4 & 0xf];
				buf[k++] = hexDigits[byte0 & 0xf];
			}
			return new String(buf);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();

		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return null;

	}
}

/*
 * 修改历史 $Log$
 */