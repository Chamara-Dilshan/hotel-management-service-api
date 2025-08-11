package com.cpd.hotel_system.hotel_management_service_api.dto.response.paginate;

import java.util.List;
import com.cpd.hotel_system.hotel_management_service_api.dto.response.ResponseRoomDto;

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

public class RoomPaginateResponseDto {
    private List<ResponseRoomDto> dataList;
    private long dataCount;
}
