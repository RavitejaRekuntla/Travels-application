package com;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebXmlRep extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	//servlet xml replacement
	protected Class<?>[] getServletConfigClasses() {
      Class[] confArray = {Config.class};
		
		return confArray;
	}

	//web.xml replace
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		String[] url = {"/Rekuntla/*"};
		return url;
	}

}
