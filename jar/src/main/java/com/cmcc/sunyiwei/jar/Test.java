package com.cmcc.sunyiwei.jar;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

import freemarker.cache.ClassTemplateLoader;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

/**
 * Hello world!
 *
 */
public class Test 
{
    public static void main( String[] args )
    {
        Test test = new Test();
        try {
			System.out.println(test.test("lisa"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (TemplateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    public String test(String name) throws IOException, TemplateException{
        /* Create and adjust the configuration singleton */
        Configuration cfg = new Configuration();
        cfg.setDefaultEncoding("UTF-8");
        cfg.setTemplateLoader(new ClassTemplateLoader(getClass(), "/"));
        
        /* ------------------------------------------------------------------------ */    
        /* You usually do these for MULTIPLE TIMES in the application life-cycle:   */    

        /* Create a data-model */
        Map<String, String> model = new HashMap<String, String>();
        model.put("name", name);
        
        /* Get the template (uses cache internally) */
        

        Template temp = cfg.getTemplate("msg.ftl");

        /* Merge data-model with template */
        Writer writer = new StringWriter();
        temp.process(model, writer);
        
        return writer.toString();
    }
}
