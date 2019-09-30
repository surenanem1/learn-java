package com.java.inheritence;

public class ParentClassImpl implements ParentClass {
	private int propertyValue = 150;
	
	@Override
	public int getMyValue() {
		return propertyValue;
	}
	
	@Override
	public int getParentValue() {
		return propertyValue;
	}
}
