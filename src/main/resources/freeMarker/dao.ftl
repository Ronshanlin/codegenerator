/**
 * desc:...
 * 
 * @version 1.0
 *
 */
package ${mpackage};

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.suning.framework.dal.client.DalClient;
import ${entityPakcage}

/**
 * @author
 */
@Repository
public class ${table.tableClassName}Dao{
	private static final String NS="${table.classNameFirstLower}.";
	private static final String QUERYBYPAGE="queryByPage";
	private static final String INSERT="insert";
	private static final String UPDATE="update";
	private static final String DELETE="delete";
	
	@Autowired
    private DalClient dalClient;
    
    /**
     * 分页查询
     */
    public void queryByPage(){
    	
    }
    
    /**
     * 插入
     */    
    public void insert(${table.tableClassName} ${table.classNameFirstLower}){
    	
    }
    
    /**
     * 更新
     */    
    public void update(${table.tableClassName} ${table.classNameFirstLower}){
    	
    }

	/**
     * 删除
     */    
    public void delete(){
    	
    }
}