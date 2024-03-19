package com.example.errsort.controller;

import com.example.errsort.dto.Review;
import com.example.errsort.repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/reviews")
public class ReviewController {

    @Autowired
    private ReviewRepository reviewRepository;

    @PostMapping
    public Review addReview(@RequestBody Review review) {
        return reviewRepository.save(review);
    }

    @GetMapping
    public Iterable<Review> getAllReviews() {
        return reviewRepository.findAll();
    }
}