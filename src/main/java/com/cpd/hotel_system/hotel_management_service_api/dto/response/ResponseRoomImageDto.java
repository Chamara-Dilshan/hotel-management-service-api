package com.cpd.hotel_system.hotel_management_service_api.dto.response;

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

public class ResponseRoomImageDto {
	private Long id;
	private String fileName;
	private String resourceUrl;
	private String directory;
	private String hash;

    private String roomId;

}
