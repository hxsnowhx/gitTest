package com.hello.javatest;

public class Test {
	public static void main(String[] args) {
		for(int j = 0;j<10;j++){
			if(j==6){
				System.out.println("J此时的值为6");
				continue;
			}
			System.out.println(j);
		}
	}

}
