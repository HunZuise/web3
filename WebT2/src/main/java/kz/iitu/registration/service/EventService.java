package kz.iitu.registration.service;

import kz.iitu.registration.model.EventInfo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EventService {

    public String getWelcomeMessage() {
        return "Welcome to the Event Registration API";
    }

    public List<EventInfo> getEvents() {
        List<EventInfo> events = new ArrayList<>();
        events.add(new EventInfo(1, "Web Design Workshop", "Room 101"));
        events.add(new EventInfo(2, "JavaScript Quiz", "Lab 302"));
        events.add(new EventInfo(3, "IT Career Talk", "Main Auditorium"));
        return events;
    }
}