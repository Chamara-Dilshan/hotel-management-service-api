package com.cpd.hotel_system.hotel_management_service_api.dto.response.paginate;

import java.util.List;

import com.cpd.hotel_system.hotel_management_service_api.dto.response.ResponseFacilityDto;

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

public class FacilityPaginateResponseDto {
    private List<ResponseFacilityDto> dataList;
    private long dataCount;
}
