package com.cpd.hotel_system.hotel_management_service_api.entity;

import java.math.BigDecimal;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "room")
public class Room {
    @Id
    @Column(name = "room_id", length = 80)
    private String roomId;

    @Column(name = "room_number", nullable = false, length = 80)
    private String roomNumber;

    @Column(name = "room_type", nullable = false, length = 50)
    private String type;

    @Column(name = "bed_count", nullable = false)
    private int bedCount;

    @Column(name = "price", nullable = false)
    private BigDecimal price;

    @Column(name = "is_available", nullable = false)
    private boolean isAvailable;

    @ManyToOne()
    @JoinColumn(name = "branch_id", nullable = false)
    private Branch branch;
    
    @OneToMany(mappedBy = "room")
    private List<Facility> facilities;

    @OneToMany(mappedBy = "room")
    private List<RoomImage> roomImages;
}
