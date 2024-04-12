package com.eventbooking.EventBooking.data.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

import static jakarta.persistence.EnumType.STRING;
import static jakarta.persistence.FetchType.EAGER;
import static jakarta.persistence.GenerationType.IDENTITY;

@Setter
@Getter
@Entity
public class Event {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
    private String name;
    @JsonIgnore
    private LocalDateTime localDateTime;
    private int attendantCount;
    private String numberOfAttendants;
    private String description;
    @Enumerated(STRING)
    private Category category;
    @ManyToOne(fetch = EAGER)
    private User user;

    @Override
    public String toString() {
        return "Event{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", localDateTime=" + localDateTime +
                ", attendantCount=" + attendantCount +
                ", numberOfAttendants='" + numberOfAttendants + '\'' +
                ", description='" + description + '\'' +
                ", category=" + category +
                ", user=" + user +
                '}';
    }
}
