package mypackage.a.b.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {

	@Autowired
	TopicRepository topicRepository;
	
	public List<Topic> getTopics() {
		List<Topic> topics = new ArrayList<Topic>();
		topicRepository.findAll().forEach(topics::add);
		return topics;
	}

	public Topic getTopicById(String id) {
		Optional<Topic> result = topicRepository.findById(id);
		if(result.isPresent())
			return result.get();
		else
			return null;
		//return topicRepository.findById(id).get();
	}

	public void addTopic(Topic topic) {
		topicRepository.save(topic);
	}

	public void updateTopic(String id, Topic topic) {
		topicRepository.save(topic);
	}

	public void deleteTopic(String id) {
		topicRepository.deleteById(id);
	}
//	List<Topic> topics = new ArrayList<Topic>(Arrays.asList(
//	                                    new Topic("1", "computer", "computer science"),
//	                                    new Topic("2", "bio", "biology")
//	                                   ));
//	
//	public List<Topic> getTopics(){
//		return topics;
//	}
//
//	public Topic getTopicById(String id) {
//		for(Topic topic: topics) {
//			if(topic.getId().equals(id))
//				return topic;
//		}
//		return null;
//	}
//
//	public void addTopic(Topic topic) {
//		topics.add(topic);
//	}
//
//	public void updateTopic(String id, Topic topic) {
//		for(int i=0;i<topics.size();i++) {
//			if(topics.get(i).getId().equals(id)) {
//				topics.set(i, topic);
//			}
//		}
//	}
//
//	public void deleteTopic(String id) {
//		for(int i=0;i<topics.size();i++) {
//			if(topics.get(i).getId().equals(id)) {
//				topics.remove(i);
//			}
//		}
//	}
}
