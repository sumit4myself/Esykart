package com.webientsoft.esykart.product.rest.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.webientsoft.esykart.common.model.InfoModel;

@RestController
@RequestMapping("/info")
public class InfoController {

	
	@RequestMapping(method = RequestMethod.GET , produces = "application/json")
	public ResponseEntity<InfoModel> info(){
		
		
		
		
		return null;
	}
}
