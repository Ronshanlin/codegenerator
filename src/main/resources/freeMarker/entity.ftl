/**
 * desc:...
 * 
 * @version 1.0
 *
 */
package ${mpackage};

/**
 * @author
 * @created ${table.createTime}
 */
public class ${table.tableClassName}{
<#if table.columns?? && table.columns?size gt 0>
    <#list table.columns as column>
    /**
     * ${column.desc}
     */
    private ${column.javaTypeName} ${column.attrName};
    </#list>
</#if>

<#if table.columns?? && table.columns?size gt 0>
    <#list table.columns as column>
    public void set${column.attrNameFirstUpper}(${column.javaTypeName} ${column.attrName}){
        this.${column.attrName} = ${column.attrName};
    };
    
    public ${column.javaTypeName} get${column.attrNameFirstUpper}(){
        return this.${column.attrName};
    };
    </#list>
</#if>
}