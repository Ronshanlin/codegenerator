//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Untitled
//  @ File Name : PropertisBudle.java
//  @ Date : 2015/5/9
//  @ Author : shanlin
//
//
package com.shanlin.demo.codegen.properties;


public class PropertisBudle extends NLS{
	/**
	 * 数据库路径
	 */
	public static String DB_DRIVER_CLASS;
	public static String DB_URL;
	public static String DB_SCHEAME;
	public static String DB_USERNAME;
	public static String DB_PASSWORD;
	public static String DB_TABLE_PREFIX;
	public static String DB_TABLE_GEN;
	/**
	 * 包路径
	 */
	public static String PACKAGE_PREFIX;
	public static String AUTHOR;
	// 目标文件夹
	public static String TARGET_DIR;
	
    static{
    	NLS.initializeMessages("com.shanlin.demo.codegen.properties.config", PropertisBudle.class);
    }
}
