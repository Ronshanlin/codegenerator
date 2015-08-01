/**
 * 
 */
package com.shanlin.demo.codegen.utils;


/**
 * @author shanlin
 *
 */
public class StringUtils {
	private StringUtils() {}
	
	/**
	 * 首字母小写
	 * 
	 * @param str
	 * @return
	 */
	public static String toLowwerFirstChar(String str){
		if (str==null || str == "" || str.length()<2) {
			return str;
		}
		
		return str.substring(0, 1).toLowerCase() + str.substring(1);
	}
	
	/**
	 * 首字母大写
	 * 
	 * @param str
	 * @return
	 */
	public static String toUpperFirstChar(String str){
		if (str==null || str == "" || str.length()<2) {
			return str;
		}
		
		return str.substring(0, 1).toUpperCase() + str.substring(1);
	}
	
	/**
	 * 格式化数据
	 * 
	 * @param format
	 * @param args
	 * @return
	 */
	public static String format(String format, Object[] args){
		int length = format.length();
		StringBuffer buffer = new StringBuffer();
		for (int i = 0; i < length; i++) {
			char c = format.charAt(i);
			switch (c) {
				case '{':
					int index = format.indexOf('}', i);
					// if we don't have a matching closing brace then...
					if (index == -1) {
						buffer.append(c);
						break;
					}
					i++;
					if (i >= length) {
						buffer.append(c);
						break;
					}
					// look for a substitution
					int number = -1;
					try {
						number = Integer.parseInt(format.substring(i, index));
					} catch (NumberFormatException e) {
						throw (IllegalArgumentException) new IllegalArgumentException()
								.initCause(e);
					}
					if (number >= args.length || number < 0) {
						buffer.append("<missing argument>"); //$NON-NLS-1$
						i = index;
						break;
					}
					buffer.append(args[number]);
					i = index;
					break;
				default:
					buffer.append(c);
			}
		}
		
		return buffer.toString();
	}
}
