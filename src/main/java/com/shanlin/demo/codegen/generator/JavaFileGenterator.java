/**
 * 
 */
package com.shanlin.demo.codegen.generator;

import java.util.HashMap;
import java.util.Map;

import com.mysql.jdbc.StringUtils;
import com.shanlin.demo.codegen.model.Table;
import com.shanlin.demo.codegen.properties.PropertisBudle;

/**
 * @author shanlin
 *
 */
public abstract class JavaFileGenterator extends AbstractGenerator{
	
	@Override
	public Map<String, Object> getTemplateModel(Table table){
	    Map<String, Object> tempMap = new HashMap<String, Object>();
	    String mpackage = getPackagePath();
	    
	    if (StringUtils.isNullOrEmpty(PropertisBudle.PACKAGE_PREFIX)) {
	        tempMap.put("mpackage", "");
	        tempMap.put("basePackage", "");
	        tempMap.put("table", table);
	        tempMap.put("author", PropertisBudle.AUTHOR);
	        
	        return tempMap;
        }
	    
	    String pk="";
	    if (PropertisBudle.PACKAGE_PREFIX.endsWith(".")) {
            pk = PropertisBudle.PACKAGE_PREFIX.concat(mpackage);
            tempMap.put("basePackage", PropertisBudle.PACKAGE_PREFIX);
        }else {
            pk = PropertisBudle.PACKAGE_PREFIX.concat(".").concat(mpackage);
            tempMap.put("basePackage", PropertisBudle.PACKAGE_PREFIX.concat("."));
        }
	    
		tempMap.put("mpackage", pk);
		tempMap.put("table", table);
		tempMap.put("author", PropertisBudle.AUTHOR);
		
		return tempMap;
	}
}
