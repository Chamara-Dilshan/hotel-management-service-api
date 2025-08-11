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

public class RequestRoomDto {
    private int bedCount;
    private boolean isAvailable;
    private BigDecimal price;
    private String roomNumber;
    private String roomType;
    private String branchId;
}
