package com.hackerrank.gevents.service;

import com.hackerrank.gevents.model.Event;
import com.hackerrank.gevents.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class EventService {

```
private static final List<String> VALID_EVENT_TYPES = Arrays.asList(
"PushEvent", "ReleaseEvent", "WatchEvent"
);

@Autowired
private EventRepository eventRepository;

public boolean isValidEventType(String type) {
return VALID_EVENT_TYPES.contains(type);
}

public Event createEvent(Event event) {
return eventRepository.save(event);
}

public List<Event> getAllEvents() {
return eventRepository.findAllOrderById();
}

public List<Event> getEventsByRepoId(Integer repoId) {
return eventRepository.findByRepoIdOrderById(repoId);
}

public List<Event> getEventsByActorId(Integer actorId) {
return eventRepository.findByActorIdOrderById(actorId);
}

public Optional<Event> getEventById(Integer id) {
return eventRepository.findById(id);
}
```

}
