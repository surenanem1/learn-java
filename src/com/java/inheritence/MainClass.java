/**
 * 
 */
package com.java.inheritence;

/**
 * @author suren
 *
 */
public class MainClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//ParentClass pc = new ParentClass();
		//System.out.println(pc.getMyValue());
		
		
		ChildClass cc = new ChildClass();
		System.out.println(cc.getMyValue());
		
		System.out.println(cc.getChildValue());
		
		System.out.println(cc.getParentValue());
		
		System.out.println(cc.getChildValue(25));
		
		
		ParentClass pc = new ParentClassImpl();
		System.out.println(pc.getMyValue());
		
		

	}

}
