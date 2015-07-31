package com.shanlin.demo.codegen.utils;

import java.util.HashMap;
import java.util.Map;

import com.mysql.jdbc.StringUtils;
import com.shanlin.demo.codegen.model.Table;
import com.shanlin.demo.codegen.properties.PropertisBudle;

public class PackageHelper {
    private PackageHelper() {}
    
	public static Map<String, Object> bulidModel(String mpackage, Table table){
	    Map<String, Object> tempMap = new HashMap<String, Object>();
	    if (StringUtils.isNullOrEmpty(mpackage)) {
	        tempMap.put("mpackage", "");
	        tempMap.put("table", table);
	        
	        return tempMap;
        }
	    
	    String pk="";
	    if (mpackage.endsWith(".")) {
            pk = PropertisBudle.PACKAGE_PREFIX.concat(mpackage);
        }else {
            pk = mpackage.concat(".").concat(mpackage);
        }
	    
		tempMap.put("mpackage", pk);
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
