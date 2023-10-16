package com.creativefusion.suruthiga.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.creativefusion.suruthiga.dto.request.FeedbackRequest;
import com.creativefusion.suruthiga.vo.Feedback;



@FeignClient(name = "FEEDBACK", url = "http://localhost:8222/feedback")
public interface FeedbackClient {

    @PostMapping("/add")
    boolean saveFeedback(@RequestBody FeedbackRequest request);

    @GetMapping("/get")
    List<Feedback> getFeedbacks();
}
