package com.hackerrank.gevents.controller;

import com.hackerrank.gevents.model.Event;
import com.hackerrank.gevents.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(”/events”)
public class EventController {

```
@Autowired
private EventService eventService;

@PostMapping
public ResponseEntity<Event> createEvent(@RequestBody Event event) {
// Validate event type
if (!eventService.isValidEventType(event.getType())) {
return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
}

// Create the event (id will be generated automatically)
Event createdEvent = eventService.createEvent(event);
return ResponseEntity.status(HttpStatus.CREATED).body(createdEvent);
}

@GetMapping
public ResponseEntity<List<Event>> getAllEvents() {
List<Event> events = eventService.getAllEvents();
return ResponseEntity.ok(events);
}

@GetMapping("/{eventId}")
public ResponseEntity<Event> getEventById(@PathVariable Integer eventId) {
Optional<Event> event = eventService.getEventById(eventId);
if (event.isPresent()) {
return ResponseEntity.ok(event.get());
} else {
return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
}
}
```

}
