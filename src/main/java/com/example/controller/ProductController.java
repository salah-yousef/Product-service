package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.entity.Product;
import com.example.service.ProductServiceImpl;

@RestController
@RequestMapping("/rest/api/products")
public class ProductController {

	@Autowired
	private ProductServiceImpl productService;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@PostMapping
	public Product saveAndSendProduct(@RequestBody Product product) {
		String apiUrl = "http://microservice2:8301/rest/api/products/date";
		Product savedProduct = productService.saveProduct(product);
		return (Product) restTemplate.postForObject(apiUrl, savedProduct, Product.class);
		
	}
}
