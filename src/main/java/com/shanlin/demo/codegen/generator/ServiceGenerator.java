/**
 * 
 */
package com.shanlin.demo.codegen.generator;

import com.shanlin.demo.codegen.utils.StringUtils;

/**
 * @author shanlin
 *
 */
public class ServiceGenerator extends JavaFileGenterator{

	@Override
	public String getTemplatePath() {
		return "service.ftl";
	}

	@Override
	public String getPackagePath() {
		return "service";
	}

	@Override
	public String getFileName(String tableName) {
		return StringUtils.toUpperFirstChar(tableName).concat("Service.java");
	}

}
