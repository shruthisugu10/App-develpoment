package com.creativefusion.suruthiga.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MenuRequest {
    private String foodName;
    private float foodPrice;
    private Long foodQuantity;
    private String foodImage;
    private String foodDesc;
    private Long hid;
}
