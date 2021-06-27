package mypackage.a.b.topic;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//@Repository optional as springs sees that TopicRepository extends "CrudRepository"
public interface TopicRepository extends CrudRepository<Topic, String> {

}
