package com.CartService.service;

import java.util.List;

import com.CartService.model.CartEntity;

public interface CartService {
	public CartEntity addCart(CartEntity cartEntity);
	public CartEntity getCartByUserId(int id);
	public void deleteById(int id);
	public CartEntity getCartByProductId(int id);
	public List<CartEntity> getAllCart();
}