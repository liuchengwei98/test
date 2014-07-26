/**
 * 
 */
package com.gohighsoft.test;

import java.util.Date;

/**
 * @author liuchengwei
 * @email liuchengwei98@163.com
 * @since 2013-9-13 ÏÂÎç10:28:48
 */
public class Test {
	public static void main(String[] args) {
		
		System.out.println(-2%-3);
		String oldCode = "KCJHL0003000X4";
		System.out.println(oldCode.length());
		String newCode2 = oldCode.substring(0,oldCode.length()-5);
		String newCode3 = oldCode.substring(oldCode.length()-5);
		System.out.println(newCode2+":"+newCode2.length()+"--"+newCode3+":"+newCode3.length());
		
		/*
		RefTest test = new RefTest();
		byte[] data = test.getData();
		System.out.println(data[0]);
		data[0] = 20;
		byte[] data2 = test.getData();
		System.out.println(data2[0]);
		*/
	}
}

class RefTest {
	public static final int DATA_LEN = 10;

	private final byte[] data = new byte[DATA_LEN];

	public RefTest() {
	}

	public byte[] getData() {
		return data;
	}
}
