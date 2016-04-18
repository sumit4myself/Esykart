
package com.webientsoft.esykart.customer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.webientsoft.esykart.common.model.store.LayoutModel;
import com.webientsoft.esykart.common.model.user.UserModel;
import com.webientsoft.esykart.customer.service.LayoutService;
import com.webientsoft.esykart.customer.service.PageService;

@Controller
// @RequestMapping("/account")
public class StoreController {

	@Autowired
	private LayoutService layoutService;

	@Autowired
	private PageService pageService;

	private static final String LOGIN_VIEW = "account/login";

	private static final String REGISTER_VIEW = "account/register";

	private static final String HOME_VIEW = "layout/home";

	private static final String PAGE_VIEW = "layout/page";

	private static final String REDIRECT_HOME_VIEW = "redirect:/";

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String loginGet(@ModelAttribute("MODEL") UserModel model) {
		return LOGIN_VIEW;
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String loginPost(@ModelAttribute("MODEL") UserModel model) {
		// accountService.authenticate(model);
		return REDIRECT_HOME_VIEW;
	}

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String registerGet(@ModelAttribute("MODEL") UserModel model) {

		return REGISTER_VIEW;
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String registerPost(@ModelAttribute("MODEL") UserModel model) {
		// accountService.register(model);
		return REDIRECT_HOME_VIEW;
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model Model) {
		LayoutModel layout = layoutService.findDefaultLayout();
		Model.addAttribute("layout", layout);
		return HOME_VIEW;
	}

	@RequestMapping(value = "/cat/{category}", method = RequestMethod.GET)
	public String viewStoreByCategory(@PathVariable("category") String category,
			Model Model) {
		LayoutModel layout = layoutService.findDefaultLayout();
		Model.addAttribute("layout", layout);
		return HOME_VIEW;
	}

	@RequestMapping(value = "/page/{pageName}", method = RequestMethod.GET)
	public String viewPage(@PathVariable("pageName") String pageName, Model Model) {
		Model.addAttribute("PAGE", pageService.find(pageName));
		return PAGE_VIEW;
	}

}
