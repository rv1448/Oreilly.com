package com.lightbend.lambdasprac;

import java.util.function.Function;

public interface MessageTransformerTest<Message , T >{
    T apply(Message t);
}
