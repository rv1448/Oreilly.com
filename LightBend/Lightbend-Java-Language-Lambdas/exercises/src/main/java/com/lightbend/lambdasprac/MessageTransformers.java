package com.lightbend.lambdasprac;

import java.time.Instant;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MessageTransformers {


    static  MessageTransformer<Instant> toTimestamp = new MessageTransformer() {
        @Override
        public Instant apply(Message message) {
            return message.getTimestamp();
        }
    };

    static MessageTransformer<String> toString = new MessageTransformer<String>() {
        @Override
        public String apply(Message message) {
            return message.toString();
        }
    };

    static MessageTransformer<Message> toUpper = new MessageTransformer<Message>() {
        @Override
        public Message apply(Message message) {
            return new Message(message.getId(),message.getTimestamp(),message.getContent().toUpperCase());
        }
    };


    static <T> List<T> mapMessage(List<Message> list, MessageTransformer<T> transformer){
        return list.stream().map(transformFunction(transformer)).collect(Collectors.toList());
    }

    static <T> Function<Message,T> transformFunction(MessageTransformer<T> func){
        return new Function<Message, T>() {
            @Override
            public T apply(Message message) {
                return func.apply(message);
            }
        };
    }



    public static void main(String[] args) {
        Message mess = new Message("test1");
        Message mess1  = new Message("test3");





    }

}
