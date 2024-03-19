package com.example.errsort.controller;

import com.example.errsort.dto.UserReview;
import com.example.errsort.repository.UserReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/userreviews")
public class UserReviewController {

    @Autowired
    private UserReviewRepository userReviewRepository;

    @PostMapping
    public UserReview addReview(@RequestBody UserReview userReview) {
        return userReviewRepository.save(userReview);
    }

    @GetMapping
    public Iterable<UserReview> getAllReviews() {
        return userReviewRepository.findAll();
    }
}