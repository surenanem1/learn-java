/**
 * 
 */
package com.lesson.simple;

/**
 * 
 */


/**
 * @author suren
 *
 */
public class HelloWorld {

	
	private int i =11;
	
	private static int j=12;
	
	/**
	 * @param args
	 */
	public static void main(String ...args) {
		// TODO Auto-generated method stub
		System.out.println("hello world.");
		
		HelloWorld hw = new HelloWorld();
		
		int add = hw.add(20, 10);
		
		int sub = hw.sub(20, 10);
		
		int div = hw.div(20, 10);
		
		int mul = hw.mul(20, 10);
		
		System.out.println(add+"---"+ sub+"--"+ div+"---"+mul);
		
		double percent = HelloWorld.percent(10, 100);
		System.out.println("Percent ---"+percent);
		
		
		

	}
	
	
	private int add(int i, int j) {
		System.out.println(i+ "---"+j);
		System.out.println(this.i);
		System.out.println(HelloWorld.j);
		return i+j;
	}
	
	private int sub(int i, int j) {
		System.out.println(i+ "---"+j);
		return i-j;
	}
	private int div(int i, int j) {
		System.out.println(i+ "---"+j);
		return i/j;
	}
	private int mul(int i, int j) {
		System.out.println(i+ "---"+j);
		
		
		
		return i*j;
	}
	
	
	private static double percent(int i, int j) {
			
		return i%j;
	}
	
	
	static {
		System.out.println("this is my personal static block");
	}
	
	
	
	public HelloWorld() {
		System.out.println("default constructor...");
	}
	

}
