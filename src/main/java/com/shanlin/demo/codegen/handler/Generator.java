//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Untitled
//  @ File Name : Generator.java
//  @ Date : 2015/5/9
//  @ Author : shanlin
//
//
package com.shanlin.demo.codegen.handler;

import java.util.List;

import com.shanlin.demo.codegen.model.Table;
import com.shanlin.demo.codegen.properties.PropertisBudle;
import com.shanlin.demo.codegen.utils.JsonUtil;
import com.shanlin.demo.codegen.utils.PackageHelper;


public class Generator {
	public void gen(){
		DataBaseHandler dbhandler = new DataBaseHandler();
		List<Table> tables = dbhandler.getAllModel();
		System.out.println(JsonUtil.toJson(tables));
		
		if (tables.isEmpty()) {
			return;
		}
		
		for (Table table : tables) {
			String java = FreeMarkerParser.parse(PropertisBudle.FREEMARKER_TEMPLATE_ENTITY,
					PackageHelper.bulidModel(PropertisBudle.PACKAGE_ENTITY,table));
			
			System.out.println(java);
		}
	}
	
	public static void main(String[] args){
		new Generator().gen();
	}
}
