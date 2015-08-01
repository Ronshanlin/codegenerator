/**
 * 
 */
package com.shanlin.demo.codegen.generator;

import java.util.Map;

import com.shanlin.demo.codegen.model.Table;

/**
 * @author shanlin
 *
 */
public abstract class FreeMakerFileGenerator extends AbstractGenerator {
	@Override
	public Map<String, Object> getTemplateModel(Table table) {
		return null;
	}

}
