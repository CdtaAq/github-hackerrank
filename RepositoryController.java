package com.hackerrank.gevents.controller;

import com.hackerrank.gevents.model.Event;
import com.hackerrank.gevents.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(”/repos”)
public class RepoController {

```
@Autowired
private EventService eventService;

@GetMapping("/{repoId}/events")
public ResponseEntity<List<Event>> getEventsByRepoId(@PathVariable Integer repoId) {
List<Event> events = eventService.getEventsByRepoId(repoId);
return ResponseEntity.ok(events);
}
```

}
