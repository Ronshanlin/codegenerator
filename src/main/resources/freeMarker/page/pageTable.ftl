<#if table.columns?? && table.columns?size gt 0>
    <#list table.columns as column>
	<th>${column.desc}</th>
    </#list>
</#if>