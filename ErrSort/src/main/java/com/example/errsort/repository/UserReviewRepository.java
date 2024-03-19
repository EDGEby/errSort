package com.example.errsort.repository;

import com.example.errsort.dto.UserReview;
import org.springframework.data.repository.CrudRepository;


public interface UserReviewRepository extends CrudRepository<UserReview, Long> {
}