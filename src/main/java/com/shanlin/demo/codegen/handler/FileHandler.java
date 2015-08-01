/**
 * 
 */
package com.shanlin.demo.codegen.handler;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * @author shanlin
 *
 */
public class FileHandler {
	
	public void writeFile(String content, String filename){
		Writer writer = null;
		try {
			this.createDir(filename);
			File file = new File(filename);
			if (!file.exists()) {
				file.createNewFile();
			}
			writer = new FileWriter(file);
			writer.write(content);
			writer.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			if (writer != null) {
				try {
					writer.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	private void createDir(String path){
		String dir = path.substring(0,path.lastIndexOf("/"));
		File file = new File(dir);
		if (!file.exists()) {
			file.mkdirs();
		}
	}
}
