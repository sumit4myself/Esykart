
package com.webientsoft.esykart.customer.controller.catalog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.webientsoft.esykart.customer.service.store.StoreService;

/**
 * 
 * @author SumitS2
 */

@Controller
@RequestMapping("/")
public class CatelogController {

	@Autowired
	private StoreService storeService;

	@RequestMapping(method = RequestMethod.GET)
	public String home(Model model) {

		model.addAttribute("LAYOUT", storeService.findLayout());
		return "layout/home";
	}

}
