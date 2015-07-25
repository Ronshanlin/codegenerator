package com.shanlin.demo.codegen.utils;

import java.util.HashMap;
import java.util.Map;

import com.shanlin.demo.codegen.model.Table;

public class PackageHelper {
    private PackageHelper() {}
    
	public static Map<String, Object> bulidModel(String mpackage, Table table){
		Map<String, Object> tempMap = new HashMap<String, Object>();
		tempMap.put("mpackage", mpackage);
		tempMap.put("table", table);
		
		return tempMap;
	}	
	
	public static String convertToPath(String mpackage){
		if (mpackage == null || mpackage=="") {
			return null;
		}
		
		return mpackage.replaceAll("\\.", "/");
	}
}
