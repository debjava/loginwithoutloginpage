package com.ddlab.rnd.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * The Class SpringFormController.
 *
 * @author Debadatta Mishra (Piku)
 */
@Controller
public class SpringFormController {

	/**
	 * Login page.
	 *
	 * @return the model and view
	 */
	@RequestMapping(value = { "/index" }, method = RequestMethod.GET)
	public ModelAndView loginPage() {

		ModelAndView model = new ModelAndView();
		model.addObject("title", "Spring Security Hello World");
		model.addObject("message", "This is welcome page!");
		model.setViewName("hello");
		return model;
	}

	/**
	 * A1 page.
	 *
	 * @return the model and view
	 */
	@RequestMapping(value = { "/a1" }, method = RequestMethod.GET)
	public ModelAndView a1Page() {

		ModelAndView model = new ModelAndView();
		model.setViewName("a1");
		return model;
	}
}