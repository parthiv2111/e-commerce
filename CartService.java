package com.parthiv.service;

import com.parthiv.exception.ProductException;
import com.parthiv.modal.Cart;
import com.parthiv.modal.CartItem;
import com.parthiv.modal.User;
import com.parthiv.request.AddItemRequest;

public interface CartService {
	
	public Cart createCart(User user);
	
	public CartItem addCartItem(Long userId,AddItemRequest req) throws ProductException;
	
	public Cart findUserCart(Long userId);

}
