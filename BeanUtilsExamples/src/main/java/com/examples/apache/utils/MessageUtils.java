package com.examples.apache.utils;

public class MessageUtils {

	public static MessageUtils instance = null;

	public static MessageUtils getInstance() {

		if (instance == null) {
			instance = new MessageUtils();
		}

		return instance;
	}

	public String printHeading(String text) {
		String msg = "";
		
		if (text != null && text.length() > 0) {
			msg = "************** Exampel for " + text.trim() + " is here ***********";
		}
		
		return msg;
	}
}
