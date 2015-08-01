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
	    
	    if (StringUtils.isNullOrEmpty(mpackage)) {
	        tempMap.put("mpackage", "");
	        tempMap.put("table", table);
	        
	        return tempMap;
        }
	    
	    String pk="";
	    if (mpackage.endsWith(".")) {
            pk = PropertisBudle.PACKAGE_PREFIX.concat(mpackage);
        }else {
            pk = PropertisBudle.PACKAGE_PREFIX.concat(".").concat(mpackage);
        }
	    
		tempMap.put("mpackage", pk);
		tempMap.put("table", table);
		
		return tempMap;
	}
}
