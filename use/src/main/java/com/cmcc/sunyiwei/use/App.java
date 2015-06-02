package com.cmcc.sunyiwei.use;

import java.io.IOException;

import com.cmcc.sunyiwei.jar.Test;

import freemarker.template.TemplateException;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Test test = new Test();
		try {
			System.out.println(test.test("patrick"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (TemplateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
