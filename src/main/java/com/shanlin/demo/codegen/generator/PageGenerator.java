/**
 * 
 */
package com.shanlin.demo.codegen.generator;

import java.util.Map;

import com.shanlin.demo.codegen.handler.FreemarkerModelDefination;
import com.shanlin.demo.codegen.handler.PageModelDefination;
import com.shanlin.demo.codegen.model.Table;
import com.shanlin.demo.codegen.utils.StringUtils;

/**
 * @author shanlin
 *
 */
public class PageGenerator extends AbstractGenerator{

	@Override
	public String getTemplatePath() {
		return "page.ftl";
	}

	@Override
	public String getPackagePath() {
		return "page";
	}

	@Override
	public String getFileName(String tableName) {
		return StringUtils.toLowwerFirstChar(tableName).concat(".ftl");
	}

	@Override
	public Map<String, Object> getTemplateModel(Table table) {
		FreemarkerModelDefination defination = new PageModelDefination();
		
		return defination.getModel(table);
	}

}
