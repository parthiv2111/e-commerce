package com.parthiv.service;

import java.util.List;

import com.parthiv.exception.ProductException;
import com.parthiv.modal.Review;
import com.parthiv.modal.User;
import com.parthiv.request.ReviewRequest;

public interface ReviewService {

	public Review createReview(ReviewRequest req,User user) throws ProductException;
	
	public List<Review> getAllReview(Long productId);
	
	
}
