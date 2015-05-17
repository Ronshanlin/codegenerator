<?xml version="1.0" encoding="UTF-8"?>
<sqlMap name="${namespace}">
	<sql id="insert">
		<![CDATA[
			insert into ${table.tableName}
			values(
				<#if table.columns?? && table.columns?size gt 0>
				<#assign size = table.columns?size/>
    			<#list table.columns as column>
				:${column.attrName}<#if column_index!=size>,</#if>
				</#list>
				</#if>
			)
		]]>
	</sql>
</sqlMap>