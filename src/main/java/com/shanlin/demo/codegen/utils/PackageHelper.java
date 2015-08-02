package com.shanlin.demo.codegen.utils;

import com.shanlin.demo.codegen.properties.PropertisBudle;

public class PackageHelper {
    private PackageHelper() {}
	
	public static String convertToPath(String mpackage){
		String pk=PropertisBudle.PACKAGE_PREFIX;
		
		if (mpackage == null || mpackage=="") {
			return "f:/"+pk.replaceAll("\\.", "/");
		}
		
	    if (PropertisBudle.PACKAGE_PREFIX.endsWith(".")) {
            pk = pk.concat(mpackage);
        }else {
            pk = pk.concat(".").concat(mpackage);
        }
		
		return "f:/"+pk.replaceAll("\\.", "/");
	}
}
