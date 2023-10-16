package com.creativefusion.feedback.service;


import java.util.List;

import com.creativefusion.feedback.dto.request.FeedbackDtoRequest;
import com.creativefusion.feedback.dto.response.FeedbackDtoResponse;

public interface FeedbackService {

    boolean saveFeedback(FeedbackDtoRequest request);

    List<FeedbackDtoResponse> getFeedbacks();

}
  