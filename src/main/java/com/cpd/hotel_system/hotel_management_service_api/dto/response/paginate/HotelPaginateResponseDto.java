package com.cpd.hotel_system.hotel_management_service_api.dto.response.paginate;

import java.util.List;

import com.cpd.hotel_system.hotel_management_service_api.dto.response.ResponseHotelDto;

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

public class HotelPaginateResponseDto {
    private List<ResponseHotelDto> dataList;
    private long dataCount;
}
