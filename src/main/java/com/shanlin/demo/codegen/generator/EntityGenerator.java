package com.shanlin.demo.codegen.generator;

import com.shanlin.demo.codegen.utils.StringUtils;

/**
 * 实体代码生成器<br> 
 *
 * @author 13073457
 */
public class EntityGenerator extends JavaFileGenterator {
    @Override
    public String getTemplatePath() {
        return "entity.ftl";
    }

    @Override
    public String getPackagePath() {
        return "entity";
    }

	@Override
	public String getFileName(String tableName) {
		return StringUtils.toUpperFirstChar(tableName).concat(".java");
	}

}
