package com.creativefusion.feedback.service.impl;


import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.creativefusion.feedback.dto.request.FeedbackDtoRequest;
import com.creativefusion.feedback.dto.response.FeedbackDtoResponse;
import com.creativefusion.feedback.model.Feedback;
import com.creativefusion.feedback.repository.FeedbackRepository;
import com.creativefusion.feedback.service.FeedbackService;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@Service
@Transactional
@RequiredArgsConstructor
public class FeedbackServiceImpl implements FeedbackService {
    private final FeedbackRepository feedbackRepository;

    @Override
    public boolean saveFeedback(FeedbackDtoRequest request) {
        if (feedbackRepository.findByUsernameAndUseremail(request.getUname(),
                request.getUemail()).isPresent()) {
            return false;
        }

        var feedback = Feedback.builder()
                .username(request.getUname())
                .useremail(request.getUemail())
                .question(request.getQuestion())
                .answer(request.getAnswer())
                .build();
        feedbackRepository.save(feedback);
        return true;
    }

    @Override
    public List<FeedbackDtoResponse> getFeedbacks() {
        List<Feedback> feedbacks = feedbackRepository.findAll();
        return feedbacks.stream()
                .map(feedback -> {
                    FeedbackDtoResponse response = new FeedbackDtoResponse();
                    response.setFid(feedback.getFid());
                    response.setUsername(feedback.getUsername());
                    response.setUseremail(feedback.getUseremail());
                    response.setQuestion(feedback.getQuestion());
                    response.setAnswer(feedback.getAnswer());
                    return response;
                })
                .collect(Collectors.toList());
    }
}