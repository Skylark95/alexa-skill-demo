package com.amazon.ask.helloworld.handlers;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.IntentRequest;
import com.amazon.ask.model.Response;
import com.amazon.ask.model.Slot;
import com.amazon.ask.request.Predicates;

import java.util.Map;
import java.util.Optional;

/**
 * Configure a handler to be invoked when the skill receives the "HelloWorldIntent".
 */
public class HelloWorldIntentHandler implements RequestHandler {

    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(Predicates.intentName("HelloWorldIntent"));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {
        String speechText = "Whats Up?";
        IntentRequest request = (IntentRequest) input.getRequest();
        Map<String, Slot> slots = request.getIntent().getSlots();
        Slot slot = slots.get("name");
        if (slot != null && slot.getValue() != null) {
            speechText = "Whats up " + slot.getValue() + "?";
        }
        return input.getResponseBuilder()
                .withSpeech(speechText)
                .withSimpleCard("HelloWorld", speechText)
                .build();
    }

}
