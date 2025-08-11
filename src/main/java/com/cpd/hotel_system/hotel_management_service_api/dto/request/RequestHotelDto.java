package com.cpd.hotel_system.hotel_management_service_api.dto.request;
import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class RequestHotelDto {
    private String hotelName;
    private String description;
    private int starRating;
    private BigDecimal startingFrom;

;
}
