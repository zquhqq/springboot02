package org.com.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * jdk自带的md5加密算法
 *
 */
public class MD5Until {
	public static String md5Jdk(String message){
		String temp = "";
		try {
			MessageDigest md5Digest = MessageDigest.getInstance("MD5");
			byte[] encodeMd5Digest = md5Digest.digest(message.getBytes());
			temp = converByteToHexString(encodeMd5Digest);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		return temp;
	}
	/**
	 * 将bytes数组转换成16进制输出
	 * @param bytes
	 * @return
	 */
	private static String converByteToHexString(byte[] bytes) {

		String result = "";
		for(int i = 0;i<bytes.length;i++) {
			int temp = bytes[i] & 0xff;
			String tempHex = Integer.toHexString(temp);
			if(tempHex.length()<2) {
				result += "0" + tempHex;
			}
			else {
				result += tempHex;
			}
		}
		return result;
	}
	/**
	 * 主方法，函数执行入口
	 * 执行加密测试功能
	 * @param args
	 */
//	public static void main(String[] args) {
//		//md5加密算法
//		String md5Encode = md5Jdk("123456");
//		System.out.println(md5Encode);
//		System.out.println("MD5JDK加密后为："+ md5Encode);
//		System.out.println("MD5JDK加密后长度为："+md5Encode.length());
//	}
}
