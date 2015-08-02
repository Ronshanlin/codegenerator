<#assign dao="${table.classNameFirstLower}Dao">
/**
 * desc:...
 * 
 * @version 1.0
 *
 */
package ${mpackage};

import org.springframework.beans.factory.annotation.Autowired;

import ${basePackage}${table.tableClassName}Dao;

/**
 * @author ${author}
 * @created ${table.createTime}
 */
@Service("${table.classNameFirstLower}Service")
public class ${table.tableClassName}ServiceImpl{
	
	@Autowired
    private ${table.tableClassName}Dao ${dao};
    
    /**
     * 分页查询
     */
     @Override
    public void queryByPage(){
    	${dao}.queryByPage();
    }
    
    /**
     * 插入
     */    
    @Override
    public void insert(${table.tableClassName} ${table.classNameFirstLower}){
    	${dao}.insert(${table.classNameFirstLower});
    }
    
    /**
     * 更新
     */    
	@Override
    public void update(${table.tableClassName} ${table.classNameFirstLower}){
    	${dao}.update(${table.classNameFirstLower});
    }

	/**
     * 删除
     */ 
	@Override   
    public void delete(Long id){
    	${dao}.delete(id);
    }
}