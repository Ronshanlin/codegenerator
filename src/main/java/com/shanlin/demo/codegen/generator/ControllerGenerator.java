/**
 * 
 */
package com.shanlin.demo.codegen.generator;

import com.shanlin.demo.codegen.utils.StringUtils;

/**
 * @author shanlin
 *
 */
public class ControllerGenerator extends JavaFileGenterator {

	/* (non-Javadoc)
	 * @see com.shanlin.demo.codegen.generator.AbstractGenerator#getTemplatePath()
	 */
	@Override
	public String getTemplatePath() {
		return "controller.ftl";
	}

	/* (non-Javadoc)
	 * @see com.shanlin.demo.codegen.generator.AbstractGenerator#getPackagePath()
	 */
	@Override
	public String getPackagePath() {
		return "web.controller";
	}

	@Override
	public String getFileName(String tableName) {
		return StringUtils.toUpperFirstChar(tableName).concat("Controller.java");
	}

}
