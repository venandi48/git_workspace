package com.kh.animal;

public class Cat {
	private String name; // master에서 작업
	private String color; // animal에서 추가
	private String breed; // master에서 작업
	private int age;

	public void cry() {
		System.out.println("야오오옹");
	}
}
