<#assign service="${table.classNameFirstLower}Service">
<#assign className="${table.tableClassName}">
<#assign lowerClassName="${table.classNameFirstLower}">
/**
 * desc:...
 * 
 * @version 1.0
 *
 */
package ${mpackage};

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import ${basePackage}${className}Service;

/**
 * @author ${author}
 * @created ${table.createTime}
 */
@Controller
@RequestMapping("${lowerClassName}")
public class ${className}Controller{
	
	@Autowired
    private ${className}Service ${service};
    
    /**
     * 分页查询
     */
	@RequestMapping("queryByPage.do")
    public String queryByPage(Model model){
    	${service}.queryByPage();
    	
		return "${lowerClassName}/${lowerClassName}List.ftl";
    }
    
    /**
     * 插入
     */  
	@RequestMapping("save.do")
    public void insert(${className} ${lowerClassName}){
    	${service}.insert(${lowerClassName});
		
		return "${lowerClassName}/${lowerClassName}Update.ftl";
    }
        
    /**
     * 更新
     */ 
	@RequestMapping("update.do")   
    public void update(${className} ${lowerClassName}){
    	${service}.update(${lowerClassName});
    }

	/**
     * 删除
     */ 
	@RequestMapping("delete.do")
    public void delete(Long id){
    	${service}.delete(id);
    	
		return "${lowerClassName}/${lowerClassName}List.ftl";
    }
}