package com.eventbooking.EventBooking.data.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import static jakarta.persistence.FetchType.EAGER;
import static jakarta.persistence.GenerationType.IDENTITY;

@Setter
@Getter
@Entity
public class ReserveTicket {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
    @ManyToOne(fetch = EAGER)
    private User user;
    private String name;
    @ManyToOne(fetch = EAGER)
    @JoinColumn(name = "event_id")
    private Event eventName;
    private boolean reserved;
    private int numberOfTicket;

    @Override
    public String toString() {
        return "ReserveTicket{" +
                "id=" + id +
                ", user=" + user +
                ", name='" + name + '\'' +
                ", eventName=" + eventName +
                ", reserved=" + reserved +
                ", numberOfTicket=" + numberOfTicket +
                '}';
    }
}
