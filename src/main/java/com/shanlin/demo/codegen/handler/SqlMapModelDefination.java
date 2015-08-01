/**
 * 
 */
package com.shanlin.demo.codegen.handler;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.shanlin.demo.codegen.model.Column;
import com.shanlin.demo.codegen.model.Table;
import com.shanlin.demo.codegen.utils.StringUtils;

/**
 * 定义sqlMap模型
 * 
 * @author shanlin
 */
public class SqlMapModelDefination implements FreemarkerModelDefination {
	private final static String IFEXISTS_MID = "<#if {0}.{1}?exists && {0}.{1}!=\"\">\n\t {2}, \n</#if>\n";
	private final static String IFEXISTS_END = "<#if {0}.{1}?exists && {0}.{1}!=\"\">\n\t {2} \n</#if>\n";

	/* (non-Javadoc)
	 * @see com.shanlin.demo.codegen.handler.FreemarkerModelDefination#getModel()
	 */
	public Map<String, Object> getModel(Table table) {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("namespace", table.getClassNameFirstLower());
		model.put("insert", this.insertSql(table));
		model.put("update", this.updateSql(table));
		model.put("delete", this.deleteSql(table));
		
		return model;
	}
	
	/**
	 * 生成插入sql
	 * 
	 * @param table
	 * @return
	 */
	private String insertSql(Table table){
		StringBuilder sb = new StringBuilder("insert into ");
		sb.append(table.getTableName()).append(" (").append(this.breakLine());
		
		List<Column> columns = table.columns;
		Column column = null;
		
		for (int i=0; i<columns.size(); i++) {
			column = columns.get(i);
			
			if (column.isAuto()) {
				continue;
			}
			
			Object[] objs = new Object[]{table.getClassNameFirstLower(), column.getAttrName(), column.getAttrName()};
			if (i == columns.size()-1) {
				sb.append(StringUtils.format(IFEXISTS_END, objs));
			}else {
				sb.append(StringUtils.format(IFEXISTS_MID, objs));
			}
		}
		sb.append(") ").append("values (").append(this.breakLine());
		
		for (int i=0; i<columns.size(); i++) {
			column = columns.get(i);
			
			if (column.isAuto()) {
				continue;
			}
			
			Object[] objs = new Object[] { table.getClassNameFirstLower(), column.getAttrName(), 
					":" + column.getAttrName() };
			if (i == columns.size()-1) {
				sb.append(StringUtils.format(IFEXISTS_END, objs));
			}else {
				sb.append(StringUtils.format(IFEXISTS_MID, objs));
			}
		}
		sb.append(")");
		
		return sb.toString();
	}
	
	/**
	 * 生成更新sql
	 * 
	 * @param table
	 * @return
	 */
	private String updateSql(Table table){
		StringBuilder sb = new StringBuilder("update ");
		sb.append(table.getTableName()).append(this.breakLine());
		
		List<Column> columns = table.columns;
		Column column = null;
		
		sb.append("set").append(this.breakLine());
		String where = null;
		
		for (int i=0; i<columns.size(); i++) {
			column = columns.get(i);
			
			if (column.isAuto()) {
				where = column.getAttrName()+"=:"+column.getAttrName();
				continue;
			}
			
			Object[] objs = new Object[]{table.getClassNameFirstLower(), column.getAttrName(), 
					column.getAttrName()+"=:"+column.getAttrName()};

			if (i == columns.size()-1) {
				sb.append(StringUtils.format(IFEXISTS_END, objs));
			}else {
				sb.append(StringUtils.format(IFEXISTS_MID, objs));
			}
		}
		sb.append("where ").append(this.breakLine()).append(where);
		
		return sb.toString();		
	}
	
	/**
	 * 生成删除sql
	 * 
	 * @param table
	 * @return
	 */
	private String deleteSql(Table table){
		StringBuilder sb = new StringBuilder("delete from ");
		sb.append(table.getTableName());
		
		List<Column> columns = table.columns;
		Column column = null;
		String where = null;
		
		for (int i=0; i<columns.size(); i++) {
			column = columns.get(i);
			
			if (column.isAuto()) {
				where = column.getAttrName()+"=:"+column.getAttrName();
				continue;
			}
		}
		sb.append(" where ").append(where);
		
		return sb.toString();		
	}
	
	private String breakLine(){
		return "\n";
	}
}
