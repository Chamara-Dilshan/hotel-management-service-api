package com.cpd.hotel_system.hotel_management_service_api.dto.response;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

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

public class ResponseHotelDto {
    private String hotelId;
    private String hotelName;
    private String description;
    private boolean activeStatus;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private int starRating;
    private BigDecimal startingFrom;

    private List<ResponseBranchDto> branches;




    
}
