package com.parthiv.service;

import com.parthiv.exception.CartItemException;
import com.parthiv.exception.UserException;
import com.parthiv.modal.Cart;
import com.parthiv.modal.CartItem;
import com.parthiv.modal.Product;

public interface CartItemService {
	
	public CartItem createCartItem(CartItem cartItem);
	
	public CartItem updateCartItem(Long userId, Long id,CartItem cartItem) throws CartItemException, UserException;
	
	public CartItem isCartItemExist(Cart cart,Product product,String size, Long userId);
	
	public void removeCartItem(Long userId,Long cartItemId) throws CartItemException, UserException;
	
	public CartItem findCartItemById(Long cartItemId) throws CartItemException;
	
}
