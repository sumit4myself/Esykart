package com.webientsoft.esykart.customer.service.catalog;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.webientsoft.esykart.common.model.review.ReviewModel;

@Controller
public class RatingsController {

	@RequestMapping(value = "/reviews/product/{itemId}")
	public String viewReviewForm(Model model, @PathVariable("itemId") String itemId,
			@ModelAttribute("ReviewModel") ReviewModel reviewModel) {
		return null;
	}

	
}
