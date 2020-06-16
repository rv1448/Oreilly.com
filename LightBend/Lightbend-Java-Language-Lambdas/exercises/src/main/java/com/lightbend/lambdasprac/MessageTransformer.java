package com.lightbend.lambdasprac;
@FunctionalInterface
 interface MessageTransformer<T> {
    T apply(Message message);
}
