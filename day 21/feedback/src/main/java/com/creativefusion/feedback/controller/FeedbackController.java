package com.creativefusion.feedback.controller;


import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.creativefusion.feedback.dto.request.FeedbackDtoRequest;
import com.creativefusion.feedback.dto.response.FeedbackDtoResponse;
import com.creativefusion.feedback.service.FeedbackService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/feedback")
@RequiredArgsConstructor
public class FeedbackController {
    private final FeedbackService feedbackService;

    @PostMapping("/add")
    public ResponseEntity<String> saveFeedback(@RequestBody FeedbackDtoRequest request) {
        boolean isSaved = feedbackService.saveFeedback(request);
        return isSaved ? ResponseEntity.ok().body("Feedback Saved") : ResponseEntity.badRequest().build();
    }

    @GetMapping("/get")
    public ResponseEntity<List<FeedbackDtoResponse>> getFeedbacks() {
        List<FeedbackDtoResponse> feedbackList = feedbackService.getFeedbacks();
        return !feedbackList.isEmpty() ? ResponseEntity.ok(feedbackList) : ResponseEntity.noContent().build();
    }
}
