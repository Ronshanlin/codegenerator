/**
 * desc:...
 * 
 * @version 1.0
 *
 */
package ${packagePrefix}.entity;

/**
 *
public class ${table.tableClassName}{
<#if table.columns?? && table.columns?size gt 0>
	<#list table.columns as column>
	/**
	 * ${column.desc}
	 */
	private String ${column.attrName};
	</#list>
</#if>

<#if table.columns?? && table.columns?size gt 0>
	<#list table.columns as column>
	public void set${column.attrNameFirstUpper}(String ${column.attrName}){
		this.${column.attrName} = ${column.attrName};
	};
	
	public String set${column.attrNameFirstUpper}(){
		return ${column.attrName};
	};
	</#list>
</#if>
}