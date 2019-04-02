package com.messageboard.topic.add;

import java.util.ArrayList;
import java.util.List;

public class TopicService {
    private static List<Topic> topics = new ArrayList();

    public List<Topic> retrieveTopic() {
        return topics;
    }

    public void addtopic(Topic topic){
        topics.add(topic);
    }

    public void deleteTopic(Topic topic){
        topics.remove(topic);
    }

}
