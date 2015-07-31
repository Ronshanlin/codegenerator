/*
 * Copyright (C), 2002-2015, 苏宁易购电子商务有限公司
 * FileName: AbstractGenerator.java
 * Author:   13073457
 * Date:     2015-7-31 下午5:13:58
 * Description: //模块目的、功能描述      
 * History: //修改记录
 * <author>      <time>      <version>    <desc>
 * 修改人姓名             修改时间            版本号                  描述
 */
package com.shanlin.demo.codegen.handler;

import java.util.List;

import com.shanlin.demo.codegen.db.DataBaseHandler;
import com.shanlin.demo.codegen.model.Table;
import com.shanlin.demo.codegen.utils.PackageHelper;

/**
 * 〈一句话功能简述〉<br> 
 * 〈功能详细描述〉
 *
 * @author 13073457
 */
public abstract class AbstractGenerator {
    private static final String TEMPLATE_PATH = "freeMarker/";
    public abstract String getTemplatePath();
    public abstract String getPackagePath();
    
    public void gen(){
        DataBaseHandler dbhandler = new DataBaseHandler();
        List<Table> tables = dbhandler.getAllModel();
        
        if (tables.isEmpty()) {
            return;
        }
        
        for (Table table : tables) {
            String java = FreeMarkerParser.parse(TEMPLATE_PATH.concat(getTemplatePath()),
                    PackageHelper.bulidModel(getPackagePath(),table));
            
            System.out.println(java);
        }
        
        FileHandler fileHandler = new FileHandler();
    }
    
}
