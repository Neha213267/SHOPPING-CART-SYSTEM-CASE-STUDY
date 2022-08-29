package com.ProductService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.ProductService.entity.Product;
import com.ProductService.repo.ProductRepo;



@RestController
@RequestMapping("/product")
@CrossOrigin(origins = "*")
public class ProductController {
	
	@Autowired
	private ProductRepo productRepo;

	@PostMapping("/add")
	public ResponseEntity<?> saveProduct(@RequestBody Product product) {
		Product saveProduct = this.productRepo.save(product);
		return ResponseEntity.ok(saveProduct);
	}
	
	@GetMapping("/get")
	public List<Product>getProductId(){
		return productRepo.findAll();
	}
	
	@DeleteMapping("/{id}")
	public int	deleteprofile(@PathVariable("id") int id) {
		this.productRepo.deleteById(id);
		return id;
	}
}