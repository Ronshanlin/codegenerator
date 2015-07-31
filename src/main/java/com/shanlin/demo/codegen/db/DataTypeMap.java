/**
 * 
 */
package com.shanlin.demo.codegen.db;

import java.sql.Types;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
/**
 * @author shanlin
 *
 */
public class DataTypeMap {
    private static Map<Integer, JavaType> typeMap=new HashMap<Integer, JavaType>();
    
    public static class JavaType {
        private String jdbcTypeName;

        private FullyQualifiedJavaType fullyQualifiedJavaType;

        public JavaType(String jdbcTypeName,
                                   FullyQualifiedJavaType fullyQualifiedJavaType) {
            this.jdbcTypeName = jdbcTypeName;
            this.fullyQualifiedJavaType = fullyQualifiedJavaType;
        }

        public String getJdbcTypeName() {
            return jdbcTypeName;
        }

        public FullyQualifiedJavaType getFullyQualifiedJavaType() {
            return fullyQualifiedJavaType;
        }
    }

    public static JavaType getType(Object key) {
        return typeMap.get(Integer.valueOf(String.valueOf(key)));
    }

    static {
        typeMap.put(Types.ARRAY, new JavaType("ARRAY", 
                new FullyQualifiedJavaType(Object.class.getName())));
        typeMap.put(Types.BIGINT, new JavaType("BIGINT", 
                new FullyQualifiedJavaType(Long.class.getName())));
        typeMap.put(Types.BINARY, new JavaType("BINARY", 
                new FullyQualifiedJavaType("byte[]"))); 
        typeMap.put(Types.BIT, new JavaType("BIT", 
                new FullyQualifiedJavaType(Boolean.class.getName())));
        typeMap.put(Types.BLOB, new JavaType("BLOB", 
                new FullyQualifiedJavaType("byte[]"))); 
        typeMap.put(Types.BOOLEAN, new JavaType("BOOLEAN", 
                new FullyQualifiedJavaType(Boolean.class.getName())));
        typeMap.put(Types.CHAR, new JavaType("CHAR", 
                new FullyQualifiedJavaType(String.class.getName())));
        typeMap.put(Types.CLOB, new JavaType("CLOB", 
                new FullyQualifiedJavaType(String.class.getName())));
        typeMap.put(Types.DATALINK, new JavaType("DATALINK", 
                new FullyQualifiedJavaType(Object.class.getName())));
        typeMap.put(Types.DATE, new JavaType("DATE", 
                new FullyQualifiedJavaType(Date.class.getName())));
        typeMap.put(Types.DISTINCT, new JavaType("DISTINCT", 
                new FullyQualifiedJavaType(Object.class.getName())));
        typeMap.put(Types.DOUBLE, new JavaType("DOUBLE", 
                new FullyQualifiedJavaType(Double.class.getName())));
        typeMap.put(Types.FLOAT, new JavaType("FLOAT", 
                new FullyQualifiedJavaType(Double.class.getName())));
        typeMap.put(Types.INTEGER, new JavaType("INTEGER", 
                new FullyQualifiedJavaType(Integer.class.getName())));
        typeMap.put(Types.JAVA_OBJECT, new JavaType("JAVA_OBJECT", 
                new FullyQualifiedJavaType(Object.class.getName())));
        typeMap.put(Types.LONGNVARCHAR, new JavaType("LONGNVARCHAR", 
                new FullyQualifiedJavaType(String.class.getName())));
        typeMap.put(Types.LONGVARBINARY, new JavaType("LONGVARBINARY", 
                new FullyQualifiedJavaType("byte[]"))); 
        typeMap.put(Types.LONGVARCHAR, new JavaType("LONGVARCHAR", 
                new FullyQualifiedJavaType(String.class.getName())));
        typeMap.put(Types.NCHAR, new JavaType("NCHAR", 
                new FullyQualifiedJavaType(String.class.getName())));
        typeMap.put(Types.NCLOB, new JavaType("NCLOB", 
                new FullyQualifiedJavaType(String.class.getName())));
        typeMap.put(Types.NVARCHAR, new JavaType("NVARCHAR", 
                new FullyQualifiedJavaType(String.class.getName())));
        typeMap.put(Types.NULL, new JavaType("NULL", 
                new FullyQualifiedJavaType(Object.class.getName())));
        typeMap.put(Types.OTHER, new JavaType("OTHER", 
                new FullyQualifiedJavaType(Object.class.getName())));
        typeMap.put(Types.REAL, new JavaType("REAL", 
                new FullyQualifiedJavaType(Float.class.getName())));
        typeMap.put(Types.REF, new JavaType("REF", 
                new FullyQualifiedJavaType(Object.class.getName())));
        typeMap.put(Types.SMALLINT, new JavaType("SMALLINT", 
                new FullyQualifiedJavaType(Short.class.getName())));
        typeMap.put(Types.STRUCT, new JavaType("STRUCT", 
                new FullyQualifiedJavaType(Object.class.getName())));
        typeMap.put(Types.TIME, new JavaType("TIME", 
                new FullyQualifiedJavaType(Date.class.getName())));
        typeMap.put(Types.TIMESTAMP, new JavaType("TIMESTAMP", 
                new FullyQualifiedJavaType(Date.class.getName())));
        typeMap.put(Types.TINYINT, new JavaType("TINYINT", 
                new FullyQualifiedJavaType(Byte.class.getName())));
        typeMap.put(Types.VARBINARY, new JavaType("VARBINARY", 
                new FullyQualifiedJavaType("byte[]"))); 
        typeMap.put(Types.VARCHAR, new JavaType("VARCHAR", 
                new FullyQualifiedJavaType(String.class.getName())));
    }
}
