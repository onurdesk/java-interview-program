package com.onurdesk.exception.programs;

public class ExceptionHanfling {

	public static void main(String[] args) {
		doWork();
	}

	public static void doWork() {
		doMoreWork();
		System.out.println(10 / 0);
	}

	public static void doMoreWork() {
		System.out.println("hello");

		System.out.println("Thanks for reading onurdesk");
	}

}
