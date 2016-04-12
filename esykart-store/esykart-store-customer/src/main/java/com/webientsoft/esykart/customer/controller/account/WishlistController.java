package com.webientsoft.esykart.customer.controller.account;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.webientsoft.esykart.common.model.product.SkuModel;

@Controller
@RequestMapping("/account/wishlist")
public class WishlistController {

	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Void> add(@RequestBody SkuModel sku) {
		
		
		
		return ResponseEntity.noContent().build();
	}
	
	@RequestMapping(method = RequestMethod.DELETE)
	public ResponseEntity<Void> delete(@RequestBody SkuModel sku) {
		
		
		
		return ResponseEntity.noContent().build();
	}
	
	
	@RequestMapping(value = "/moveToCart",method = RequestMethod.PUT)
	public ResponseEntity<Void> moveToCart(@RequestBody SkuModel sku) {
		
		
		
		return ResponseEntity.noContent().build();
	}

}
