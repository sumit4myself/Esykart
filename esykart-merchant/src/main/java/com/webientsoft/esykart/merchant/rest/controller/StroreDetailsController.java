package com.webientsoft.esykart.merchant.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.webientsoft.esykart.common.model.Status;
import com.webientsoft.esykart.common.model.merchant.StoreDetailsModel;
import com.webientsoft.esykart.merchant.service.StoreDetailsService;

@Controller
public class StroreDetailsController {
	@Autowired
	private StoreDetailsService storeDetailsService;

	@RequestMapping(method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public @ResponseBody ResponseEntity<?> create(@RequestBody StoreDetailsModel model) {
		MultiValueMap<String, String> headers = new HttpHeaders();
		storeDetailsService.save(model);
		return new ResponseEntity<>(headers, HttpStatus.CREATED);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT, consumes = "application/json", produces = "application/json")
	public @ResponseBody ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody StoreDetailsModel model) {
		MultiValueMap<String, String> headers = new HttpHeaders();
		storeDetailsService.update(id, model);
		return new ResponseEntity<>(headers, HttpStatus.OK);
	}

	@RequestMapping(value = "/{id}", params = "status", method = RequestMethod.DELETE, produces = "application/json")
	public @ResponseBody ResponseEntity<?> changeStatus(@PathVariable("id") int id,
			@RequestParam("status") Status status) {

		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}

	@RequestMapping(value = "/detail/{id}", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody ResponseEntity<StoreDetailsModel> getDetail(@PathVariable("id") int id) {
		return new ResponseEntity<>(storeDetailsService.find(id), HttpStatus.OK);
	}
}
