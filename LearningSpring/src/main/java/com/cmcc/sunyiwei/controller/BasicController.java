/**
 * @Title: 	BasicController.java 
 * @Package com.cmcc.sunyiwei.controller 
 * @author:	sunyiwei
 * @date:	2015年4月13日 下午7:49:56 
 * @version	V1.0   
 */
package com.cmcc.sunyiwei.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/** 
 * @ClassName:	BasicController 
 * @Description:  学习spring的入口控制器
 * @author:	sunyiwei
 * @date:	2015年4月13日 下午7:49:56 
 *  
 */
@Controller
@RequestMapping("/basic")
public class BasicController {
	@RequestMapping(value="index", method = RequestMethod.GET)
	public String index(Model model){
		model.addAttribute("name", "sunyiwei");
		return "hello";
	}
}
