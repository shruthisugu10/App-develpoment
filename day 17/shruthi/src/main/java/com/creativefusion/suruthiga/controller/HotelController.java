package com.creativefusion.suruthiga.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.creativefusion.suruthiga.dto.request.HotelRequest;
import com.creativefusion.suruthiga.dto.request.MenuRequest;
import com.creativefusion.suruthiga.dto.response.HotelResponse;
import com.creativefusion.suruthiga.dto.response.MenuResponse;
import com.creativefusion.suruthiga.service.HotelService;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/happytummy/hotel")
@RequiredArgsConstructor
@Tag(name = "Hotel")
public class HotelController {

    private final HotelService hotelService;

    @GetMapping("/get")
    public ResponseEntity<List<HotelResponse>> getAllCategories() {
        List<HotelResponse> hotelResponse = hotelService.getAllHotels();
        return !hotelResponse.isEmpty() ? ResponseEntity.ok().body(hotelResponse)
                : ResponseEntity.noContent().build();
    }
    @PostMapping("/add")
    public ResponseEntity<String> saveHotel(@RequestBody HotelRequest request) {
        boolean isSaved = hotelService.saveHotel(request);
        return isSaved ? ResponseEntity.status(201).body("Hotel added successfully!")
                : ResponseEntity.badRequest().build();
    }
    @GetMapping("/gethotelbyId/{hid}")
    public ResponseEntity<HotelResponse> getHotelById(@PathVariable Long hid) {
        HotelResponse hotelResponse = hotelService.getHotel(hid);
        return hotelResponse != null ? ResponseEntity.ok().body(hotelResponse) : ResponseEntity.notFound().build();
    }

}
