package com.cpd.hotel_system.hotel_management_service_api.dto.response;

import java.math.BigDecimal;
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

public class ResponseRoomDto {
	private String roomId;
    private int bedCount;
    private boolean isAvailable;
	private String roomNumber;
    private BigDecimal price;
	private String roomType;

	private String branchId;
	private List<ResponseFacilityDto> facilities;
	private List<ResponseRoomImageDto> images;

}
