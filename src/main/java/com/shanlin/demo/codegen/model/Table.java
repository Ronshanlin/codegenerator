//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Untitled
//  @ File Name : Table.java
//  @ Date : 2015/5/9
//  @ Author : shanlin
//
//
package com.shanlin.demo.codegen.model;

import java.util.ArrayList;
import java.util.List;

public class Table {
    private String tableName;
    private String tableClassName;
    private String classNameFirstLower;
    public List<Column> columns = new ArrayList<Column>();
    
	public String getTableName() {
		return tableName;
	}
	
	public void setTableName(String tableName) {
		this.tableName = tableName.toLowerCase();
		String[] names = tableName.toLowerCase().split("_");
		
		for (int i=0; i<names.length; i++) {
			this.tableClassName = this.tableClassName+
					names[i].substring(0, 1).toUpperCase()+
					names[i].substring(1);
		}
		
		this.classNameFirstLower = this.tableClassName.substring(0, 1)
				.toLowerCase() + this.tableClassName.substring(1);
	}
	public String getTableClassName() {
		return tableClassName;
	}
	public List<Column> getColumns() {
		return columns;
	}
	public void setColumns(List<Column> columns) {
		this.columns = columns;
	}

	public String getClassNameFirstLower() {
		return classNameFirstLower;
	}
}