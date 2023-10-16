package com.creativefusion.suruthiga.service;

import java.util.List;

import com.creativefusion.suruthiga.dto.request.FeedbackRequest;
import com.creativefusion.suruthiga.dto.response.FeedbackResponse;


public interface FeedbackService {

    

    List<FeedbackResponse> getFeedbacks();

}
  