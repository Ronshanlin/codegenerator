package com.shanlin.demo.codegen.generator;

import java.util.List;
import java.util.Map;

import com.shanlin.demo.codegen.handler.DataBaseHandler;
import com.shanlin.demo.codegen.handler.FileHandler;
import com.shanlin.demo.codegen.handler.FreeMarkerParser;
import com.shanlin.demo.codegen.model.Table;
import com.shanlin.demo.codegen.utils.PackageHelper;

/**
 * 代码生成器抽象类<br> 
 *
 * @author 13073457
 */
public abstract class AbstractGenerator {
    private static final String TEMPLATE_PATH = "freeMarker/";
    public abstract String getTemplatePath();
    public abstract String getPackagePath();
    public abstract String getFileName(String tableName);
    public abstract Map<String, Object> getTemplateModel(Table table);
    
    private static List<Table> tables;
    
    static{
        DataBaseHandler dbhandler = new DataBaseHandler();
        tables = dbhandler.getAllModel();
    }
    
    public void gen(){
        if (tables.isEmpty()) {
            return;
        }
        
        FileHandler fileHandler = new FileHandler();
        for (Table table : tables) {
        	Map<String, Object> model = getTemplateModel(table);
            String java = FreeMarkerParser.parse(TEMPLATE_PATH.concat(getTemplatePath()),model);
            
            String pkPath = PackageHelper.convertToPath(getPackagePath());
            pkPath = pkPath.concat("/").concat(getFileName(table.getTableClassName()));
            
            fileHandler.writeFile(java, pkPath);
        }
    }
    
}
