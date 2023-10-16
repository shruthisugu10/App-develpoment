package com.creativefusion.suruthiga.service;

import java.util.List;
import java.util.Optional;

import com.creativefusion.suruthiga.dto.request.HotelRequest;
import com.creativefusion.suruthiga.dto.response.HotelResponse;
import com.creativefusion.suruthiga.model.Hotel;

public interface HotelService {

    List<HotelResponse> getAllHotels();

	boolean saveHotel(HotelRequest request);

	Optional<HotelResponse> getHotelById(Long hid);

	Hotel getHotelModelId(Long hid);

	HotelResponse getHotel(Long hid);

}
