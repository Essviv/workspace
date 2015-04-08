package com.cmcc.sunyiwei;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

public class TestActionForm extends ActionForm {
	
	@Override
	public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request) {
		System.out.println("Test form...");
		return super.validate(mapping, request);
		
	}
	
}
