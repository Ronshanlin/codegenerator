package com.shanlin.demo.codegen.utils;

import com.mysql.jdbc.StringUtils;
import com.shanlin.demo.codegen.properties.PropertisBudle;

public class PackageHelper {
    private PackageHelper() {}
	
	public static String convertToPath(String mpackage){
		String pk=PropertisBudle.PACKAGE_PREFIX;
		String dir = getTargetDir();
		
		if (mpackage == null || mpackage=="") {
			return dir+pk.replaceAll("\\.", "/");
		}
		
	    if (PropertisBudle.PACKAGE_PREFIX.endsWith(".")) {
            pk = pk.concat(mpackage);
        }else {
            pk = pk.concat(".").concat(mpackage);
        }
		
		return dir+pk.replaceAll("\\.", "/");
	}
	
	private static String getTargetDir(){
	    String target = PropertisBudle.TARGET_DIR;
	    
	    if (StringUtils.isNullOrEmpty(target)) {
            return System.getenv("HOME").concat("\\");
        }
	    
	    if (target.endsWith("\\") || target.endsWith("/")) {
            return target;
        }
	    
	    return target.concat("\\");
	}
}
