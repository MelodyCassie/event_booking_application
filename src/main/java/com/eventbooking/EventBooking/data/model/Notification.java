package com.eventbooking.EventBooking.data.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import static jakarta.persistence.FetchType.EAGER;
import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
@Setter
@Getter
public class Notification {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
    @ManyToOne(fetch = EAGER)
    private ReserveTicket reserveTicket;
    private String eventName;
    private String message;

    @Override
    public String toString() {
        return "Notification{" +
                "id=" + id +
                ", reserveTicket=" + reserveTicket +
                ", eventName='" + eventName + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
