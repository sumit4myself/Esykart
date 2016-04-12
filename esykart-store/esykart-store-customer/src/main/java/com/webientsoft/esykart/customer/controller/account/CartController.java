
package com.webientsoft.esykart.customer.controller.account;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.webientsoft.esykart.common.model.product.SkuModel;

@RestController
@RequestMapping(value = "/account/cart", consumes = { "application/json" }, produces = {
	"application/json" })
public class CartController {

	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Void> add(@RequestBody SkuModel sku) {
		
		
		
		return ResponseEntity.noContent().build();
	}
	
	@RequestMapping(method = RequestMethod.DELETE)
	public ResponseEntity<Void> delete(@RequestBody SkuModel sku) {
		
		
		
		return ResponseEntity.noContent().build();
	}
	
	@RequestMapping(value = "/moveToWishlist",method = RequestMethod.PUT)
	public ResponseEntity<Void> moveToWishlist(@RequestBody SkuModel sku) {
		
		
		
		return ResponseEntity.noContent().build();
	}

}
