package com.parthiv.service;

import java.util.List;

import com.parthiv.exception.ProductException;
import com.parthiv.modal.Rating;
import com.parthiv.modal.User;
import com.parthiv.request.RatingRequest;

public interface RatingServices {
	
	public Rating createRating(RatingRequest req,User user) throws ProductException;
	
	public List<Rating> getProductsRating(Long productId);

}
