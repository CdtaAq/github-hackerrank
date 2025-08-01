package com.hackerrank.gevents.controller;

import com.hackerrank.gevents.model.Event;
import com.hackerrank.gevents.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(”/users”)
public class UserController {

```
@Autowired
private EventService eventService;

@GetMapping("/{userId}/events")
public ResponseEntity<List<Event>> getEventsByUserId(@PathVariable Integer userId) {
List<Event> events = eventService.getEventsByActorId(userId);
return ResponseEntity.ok(events);
}
```

}
