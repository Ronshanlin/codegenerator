package com.shanlin.demo.codegen.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class JsonUtil {
	private static Gson gson = new GsonBuilder()
			.enableComplexMapKeySerialization().serializeNulls()
			.setDateFormat("yyyy-MM-dd HH:mm:ss").create();
	
	public static String toJson(Object obj){
		return gson.toJson(obj);
	}
}
