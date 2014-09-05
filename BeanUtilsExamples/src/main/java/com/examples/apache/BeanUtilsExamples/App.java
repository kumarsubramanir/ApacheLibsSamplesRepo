package com.examples.apache.BeanUtilsExamples;

import com.examples.apache.BeanUtilsExamples.copyproperty.Main;

/**
 * Hello world!
 *
 */
public class App {
	
	public static void main(String[] args) {
		System.out.println("Welcome to Apache Tutorials");
		System.out.println("=======================================");
		System.out.println("\n");
		try {
			String[] arguments = new String[]{"123"};
			Main.main(arguments);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
