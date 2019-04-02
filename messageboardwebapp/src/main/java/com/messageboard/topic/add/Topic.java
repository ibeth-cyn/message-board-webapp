package com.messageboard.topic.add;

import java.util.Objects;

public class Topic{

        public Topic(String topic) {
            super();
            this.topic = topic;
        }

        private String topic;

        public String getTopic() {
            return topic;
        }

        public void setTopic(String topic) {
            this.topic = topic;
        }

        @Override
        public String toString() {
            return "Topic [title=" + topic + "]";
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Topic tTopic = (Topic) o;
            return topic.equals(tTopic.topic);
        }

        @Override
        public int hashCode() {
            return Objects.hash(topic);
        }
    }
