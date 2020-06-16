package com.lightbend.lambdasprac;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.UUID;

import static java.util.UUID.randomUUID;

public class Message {
    private final UUID id;
    private final Instant timestamp;
    private final String content;

    Message(String content){
        this(randomUUID(),Instant.now(),content);
    }
    Message(UUID id, Instant timestamp, String content){
        this.id = id;
        this.timestamp = timestamp;
        this.content = content;
    }

      UUID getId() {
        return id;
    }

      Instant getTimestamp() {
        return timestamp;
    }

      String getContent() {
        return content;
    }

    @Override
    public String toString() {
        return "Message("+ id.toString()+"," + timestamp.toString() +","+ content.toString() +")";
    }
}
