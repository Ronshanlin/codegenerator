package com.shanlin.demo.codegen.handler;

/**
 * 〈一句话功能简述〉<br> 
 * 〈功能详细描述〉
 *
 * @author 13073457
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class EntityGenerator extends AbstractGenerator {
    @Override
    public String getTemplatePath() {
        return "entity.ftl";
    }

    @Override
    public String getPackagePath() {
        return "entity";
    }

}
