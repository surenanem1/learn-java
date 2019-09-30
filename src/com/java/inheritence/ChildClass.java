package com.java.inheritence;

public class ChildClass extends ParentClassImpl {
	private int propertyValue = 10;

	public int getMyValue() {
		return this.propertyValue;
	}
	
	public int getChildValue() {
		return this.propertyValue;
	}
	
	public int getChildValue(int i) {
		return this.propertyValue+i;
	}
	
	public int getMyParentValue() {
		return super.getMyValue();
	}
}
