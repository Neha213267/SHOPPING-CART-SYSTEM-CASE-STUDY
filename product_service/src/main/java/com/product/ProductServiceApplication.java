package com.product;

import com.product.entity.Product;
import com.product.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class ProductServiceApplication  {

	public static void main(String[] args) {
		SpringApplication.run(ProductServiceApplication.class, args);
	}
	@Bean
	public CommandLineRunner addData(ProductRepository productRepository) {
		Map<Integer, Double> rating = new HashMap<>();
		rating.put(1, 10.00);
		Map<Integer, String> review = new HashMap<>();
		review.put(1, "Excellent");
		List<String> image = new ArrayList<>();
		Map<String, String> specification = new HashMap<>();
		specification.put("SpecOne", "two compartments");
		specification.put("SpecTwo", "Adjustable strap");
		return (arg) -> {

			productRepository.save(new Product(101, "handbag","Chanel", "bags and Luggage", rating, review, image, 1500.00, "good product",
					specification));
			productRepository.save(new Product(102, "camera","GoPro HERO7 Black Camera", "electronics", rating, review, image, 1500.00, "excellent product",
					specification));
		};
	}


}
