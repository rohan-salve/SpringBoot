package com.ron.methodref;

import java.util.Arrays;

public class MethodTest {

	public static void test(String... args) {
		{ System.out.println("Hello from MethodRef "+Arrays.asList(args)); };
	}
}
