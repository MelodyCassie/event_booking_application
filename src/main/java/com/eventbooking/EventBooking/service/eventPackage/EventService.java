package com.eventbooking.EventBooking.service.eventPackage;

import com.eventbooking.EventBooking.dto.request.EventCreateRequest;
import com.eventbooking.EventBooking.dto.request.EventSearchRequest;
import com.eventbooking.EventBooking.dto.response.EventCreateResponse;
import com.eventbooking.EventBooking.dto.response.EventSearchResponse;
import com.eventbooking.EventBooking.exception.TicketNotFound;

public interface EventService {
    EventCreateResponse eventCreate(EventCreateRequest request, Long userId)throws TicketNotFound;

    EventSearchResponse eventSearch(EventSearchRequest request)throws TicketNotFound;

}
