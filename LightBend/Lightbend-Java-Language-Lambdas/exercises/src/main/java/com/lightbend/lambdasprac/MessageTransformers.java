package com.lightbend.lambdasprac;

import java.time.Instant;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MessageTransformers {


    static  MessageTransformer<Instant> toTimestamp = Message::getTimestamp;
    static MessageTransformer<String> toString = Message::toString;
    static MessageTransformer<Message> toUpper = message -> new Message(message.getId(),message.getTimestamp(),message.getContent().toUpperCase());


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
