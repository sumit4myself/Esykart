package com.webientsoft.esykart.store.merchant.client.helper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.webientsoft.esykart.common.model.common.AuthenticationModel;
import com.webientsoft.esykart.common.model.user.UserModel;

@Component
public class RestTemplateHelper {

	private static final String BASE_API_SERVICE_URL = "http://api-gateway/";

	@Autowired
	@LoadBalanced
	private RestTemplate restTemplate;

	public UserModel authenticate(AuthenticationModel model) {
		return exchange("user/authenticate", HttpMethod.POST, model, UserModel.class);
	}

	private <T> T exchange(String uri, HttpMethod method, Object request, Class<T> clazz) {
		List<MediaType> acceptableMediaTypes = new ArrayList<MediaType>();
		acceptableMediaTypes.add(MediaType.APPLICATION_JSON);
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(acceptableMediaTypes);
		HttpEntity<Object> requestEntity = new HttpEntity<Object>(request, headers);
		try {
			ResponseEntity<T> response = restTemplate.exchange(BASE_API_SERVICE_URL + uri, method, requestEntity,
					clazz);
			return response.getBody();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
