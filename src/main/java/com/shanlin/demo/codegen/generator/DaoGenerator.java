/**
 * 
 */
package com.shanlin.demo.codegen.generator;

import com.shanlin.demo.codegen.utils.StringUtils;

/**
 * @author shanlin
 *
 */
public class DaoGenerator extends JavaFileGenterator {

	/* (non-Javadoc)
	 * @see com.shanlin.demo.codegen.generator.AbstractGenerator#getTemplatePath()
	 */
	@Override
	public String getTemplatePath() {
		return "dao.ftl";
	}

	/* (non-Javadoc)
	 * @see com.shanlin.demo.codegen.generator.AbstractGenerator#getPackagePath()
	 */
	@Override
	public String getPackagePath() {
		return "dao";
	}

	@Override
	public String getFileName(String tableName) {
		return StringUtils.toUpperFirstChar(tableName).concat("Dao.java");
	}

}
