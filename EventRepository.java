package com.hackerrank.gevents.repository;

import com.hackerrank.gevents.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EventRepository extends JpaRepository<Event, Integer> {

```
// Find all events ordered by id
@Query("SELECT e FROM Event e ORDER BY e.id ASC")
List<Event> findAllOrderById();

// Find events by repository id ordered by id
@Query("SELECT e FROM Event e WHERE e.repoId = :repoId ORDER BY e.id ASC")
List<Event> findByRepoIdOrderById(@Param("repoId") Integer repoId);

// Find events by actor id ordered by id
@Query("SELECT e FROM Event e WHERE e.actorId = :actorId ORDER BY e.id ASC")
List<Event> findByActorIdOrderById(@Param("actorId") Integer actorId);
```

}
