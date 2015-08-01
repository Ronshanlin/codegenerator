/**
 * 
 */
package com.shanlin.demo.codegen.handler;

import java.util.Map;

import com.shanlin.demo.codegen.model.Table;

/**
 * @author shanlin
 * 
 */
public interface FreemarkerModelDefination {
	/**
	 * 生成freemarker model
	 * 
	 * @param table
	 * @return
	 */
	public Map<String, Object> getModel(Table table);
}
