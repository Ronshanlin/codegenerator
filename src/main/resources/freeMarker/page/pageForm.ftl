<#if table.columns?? && table.columns?size gt 0>
    <#list table.columns as column>
	<#if column.isAuto>
	<#else>
	<label>${column.desc}</lable>&nbsp;<input name="${column.attrName}" id="${column.attrName}" type="text" value="">
	</#if>
    </#list>
</#if>