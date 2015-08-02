/**
 * desc:...
 * 
 * @version 1.0
 *
 */
package ${mpackage};

import ${basePackage}${table.tableClassName};

/**
 * @author ${author}
 * @created ${table.createTime}
 */
public interface ${table.tableClassName}Service{
    /**
     * 分页查询
     */
    public void queryByPage();
    /**
     * 插入
     */    
    public void insert(${table.tableClassName} ${table.classNameFirstLower});
    /**
     * 更新
     */    
    public void update(${table.tableClassName} ${table.classNameFirstLower});
	/**
     * 删除
     */    
    public void delete(Long id);
}