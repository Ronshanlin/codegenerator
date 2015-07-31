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
public interface ${table.tableClassName}Dao{
	
	@Autowired
    private DalClient dalClient;
    
    /**
     * 分页查询
     */
    public void queryByPage(){
    	
    }
}