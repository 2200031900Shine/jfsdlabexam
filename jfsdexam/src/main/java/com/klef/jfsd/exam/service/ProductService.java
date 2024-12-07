package com.klef.jfsd.exam.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Service
public class ProductService {
    private final String BASE_URL = "https://fakestoreapi.com/products";

    public List<Map<String, Object>> getAllProducts() {
        RestTemplate restTemplate = new RestTemplate();
        Map<String, Object>[] products = restTemplate.getForObject(BASE_URL, Map[].class);
        return Arrays.asList(products);
    }
}
