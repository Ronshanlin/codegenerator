/**
 * 
 */
package com.shanlin.demo.codegen.generator;

import java.util.Map;

import com.shanlin.demo.codegen.handler.FreemarkerModelDefination;
import com.shanlin.demo.codegen.handler.PageUpdateModelDefination;
import com.shanlin.demo.codegen.model.Table;
import com.shanlin.demo.codegen.utils.StringUtils;

/**
 * @author shanlin
 *
 */
public class PageUpdateGenerator extends AbstractGenerator{

	@Override
	public String getTemplatePath() {
		return "pageUpdate.ftl";
	}

	@Override
	public String getPackagePath() {
		return "page";
	}

	@Override
	public String getFileName(String tableName) {
		return StringUtils.toLowwerFirstChar(tableName).concat("update.ftl");
	}

	@Override
	public Map<String, Object> getTemplateModel(Table table) {
		FreemarkerModelDefination defination = new PageUpdateModelDefination();
		
		return defination.getModel(table);
	}

}
