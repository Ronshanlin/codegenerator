/**
 * 
 */
package com.shanlin.demo.codegen.generator;

import java.util.Map;

import com.shanlin.demo.codegen.handler.FreemarkerModelDefination;
import com.shanlin.demo.codegen.handler.SqlMapModelDefination;
import com.shanlin.demo.codegen.model.Table;
import com.shanlin.demo.codegen.utils.StringUtils;

/**
 * @author shanlin
 *
 */
public class SqlMapGenerator extends AbstractGenerator{

	@Override
	public String getTemplatePath() {
		return "sqlMap.ftl";
	}

	@Override
	public String getPackagePath() {
		return null;
	}

	@Override
	public String getFileName(String tableName) {
		return "sqlMap_"+StringUtils.toLowwerFirstChar(tableName).concat(".xml");
	}

	@Override
	public Map<String, Object> getTemplateModel(Table table) {
		FreemarkerModelDefination defination = new SqlMapModelDefination();
		return defination.getModel(table);
	}
	
}
