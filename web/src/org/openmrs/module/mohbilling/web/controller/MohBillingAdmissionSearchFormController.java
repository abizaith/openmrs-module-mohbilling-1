/**
 * 
 */
package org.openmrs.module.mohbilling.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.ParameterizableViewController;

/**
 * @author emr
 *
 */
public class MohBillingAdmissionSearchFormController extends
		ParameterizableViewController {

	/* (non-Javadoc)
	 * @see org.springframework.web.servlet.mvc.ParameterizableViewController#handleRequestInternal(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
	ModelAndView mav =new  ModelAndView();
	
	mav.setViewName(getViewName());	
	return mav;
	}

}
