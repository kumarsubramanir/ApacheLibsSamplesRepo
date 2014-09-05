package com.examples.apache.BeanUtilsExamples.copyproperty;

import java.lang.reflect.InvocationTargetException;

import org.apache.commons.beanutils.BeanUtils;

import com.examples.apache.BeanUtilsExamples.copyproperty.data.BeanOne;
import com.examples.apache.utils.MessageUtils;

public class Main {

	public static void main(String[] args) {
		
		BeanOne beanOne = new BeanOne();
		System.out.println(MessageUtils.getInstance().printHeading("Beanutils.Copyproperty"));
		System.out.println(MessageUtils.getInstance().printHeading(""));
		
		System.out.println("Creating object: " + beanOne.toString());
		
		try {
		
			BeanUtils.copyProperty(beanOne, "id", 1);
			BeanUtils.copyProperty(beanOne, "name", "kumar");
			BeanUtils.copyProperty(beanOne, "company", "thapovan");

			System.out.println("After setting values: " + beanOne.toString());
			
			
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}

	}
	
}
