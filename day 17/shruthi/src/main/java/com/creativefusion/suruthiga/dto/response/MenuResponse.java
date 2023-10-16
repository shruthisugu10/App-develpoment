package com.creativefusion.suruthiga.dto.response;

import com.creativefusion.suruthiga.model.Hotel;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MenuResponse {
    private Long mid;
    private String foodName;
    private float foodPrice;
    private Long foodQuantity;
    private String foodImage;
    private String foodDesc;
//    private Hotel hotel;
}
