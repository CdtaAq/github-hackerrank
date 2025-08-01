package com.hackerrank.gevents.model;

import javax.persistence.*;

@Entity
@Table(name = “events”)
public class Event {

```
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer id;

@Column(nullable = false)
private String type;

@Column(nullable = false)
private Boolean isPublic;

@Column(nullable = false)
private Integer repoId;

@Column(nullable = false)
private Integer actorId;

// Default constructor
public Event() {}

// Constructor without id (for creation)
public Event(String type, Boolean isPublic, Integer repoId, Integer actorId) {
this.type = type;
this.isPublic = isPublic;
this.repoId = repoId;
this.actorId = actorId;
}

// Getters and Setters
public Integer getId() {
return id;
}

public void setId(Integer id) {
this.id = id;
}

public String getType() {
return type;
}

public void setType(String type) {
this.type = type;
}

public Boolean getPublic() {
return isPublic;
}

public void setPublic(Boolean isPublic) {
this.isPublic = isPublic;
}

public Integer getRepoId() {
return repoId;
}

public void setRepoId(Integer repoId) {
this.repoId = repoId;
}

public Integer getActorId() {
return actorId;
}

public void setActorId(Integer actorId) {
this.actorId = actorId;
}
```

}
