package com.CartService.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CartService.model.CartEntity;
import com.CartService.repository.CartRepo;
@Service
public class CartServiceImpl implements CartService{

	@Autowired
	private CartRepo cartRepo;
	
	@Override
	public CartEntity getCartByUserId(int id) {
		return this.cartRepo.getCartByUserId(id);
	}

	@Override
	public void deleteById(int id) {
		this.cartRepo.deleteById(id);
	}

	@Override
	public CartEntity addCart(CartEntity cartEntity) {
		return this.cartRepo.save(cartEntity);
	}

	@Override
	public CartEntity getCartByProductId(int id) {
		return this.cartRepo.findById(id).get();
	}

	@Override
	public List<CartEntity> getAllCart() {
		return this.cartRepo.findAll();
	}
}