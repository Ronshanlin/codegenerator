/**
 * 
 */
package com.shanlin.demo.codegen.handler;

import java.util.HashMap;
import java.util.Map;

import com.shanlin.demo.codegen.model.Table;

/**
 * 定义页面model
 * 
 * @author shanlin
 */
public class PageModelDefination implements FreemarkerModelDefination{

	public Map<String, Object> getModel(Table table) {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("table", table);
		
		String form = FreeMarkerParser.parse("freeMarker/page/pageForm.ftl", model);
		String pageTable = FreeMarkerParser.parse("freeMarker/page/pageTable.ftl", model);
		
		model.put("form", form);
		model.put("table", pageTable);
		
		return model;
	}
	
}
