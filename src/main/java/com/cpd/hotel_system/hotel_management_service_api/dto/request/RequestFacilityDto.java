package com.cpd.hotel_system.hotel_management_service_api.dto.request;

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

public class RequestFacilityDto {
    private String name;
    private String roomId;
}
