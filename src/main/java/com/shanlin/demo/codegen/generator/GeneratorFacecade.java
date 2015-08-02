package com.shanlin.demo.codegen.generator;

public class GeneratorFacecade {
    
    public void gen(){
        AbstractGenerator generator = new EntityGenerator();
        generator.gen();
        
        generator = new DaoGenerator();
        generator.gen();
        
        generator = new SqlMapGenerator();
        generator.gen();
        
        generator = new ServiceGenerator();
        generator.gen();
        
        generator = new ServiceImplGenerator();
        generator.gen();
        
        generator = new ControllerGenerator();
        generator.gen();
        
        generator = new PageGenerator();
        generator.gen();
    }
}
