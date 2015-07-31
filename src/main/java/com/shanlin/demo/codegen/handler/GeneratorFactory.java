package com.shanlin.demo.codegen.handler;

public class GeneratorFactory {
    private static GeneratorFactory factory = new GeneratorFactory();
    private AbstractGenerator abstractGenerator;
    
    private GeneratorFactory(){};
    
    public static GeneratorFactory getInstance(){
        return factory;
    }
    
    public AbstractGenerator getGenerator(){
        abstractGenerator = new EntityGenerator();
        
        return abstractGenerator;
    }
}
