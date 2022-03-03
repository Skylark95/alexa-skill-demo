package com.amazon.ask.helloworld.handlers;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;

import java.util.Optional;

import static com.amazon.ask.request.Predicates.intentName;

/**
 * Intent handler for "AMAZON.FallbackIntent".
 * 
 * <h4>AMAZON.FallbackIntent</h4>
 * Provides a fallback for user utterances that do not match any of your skill's intents. 
 * Your AMAZON.FallbackIntent handler can give the user more details on what your skill does and how they can interact with it.
 * Common Utterances: Varies. This intent uses an out-of-domain model generated based on your interaction model.
 */
public class FallbackIntentHandler implements RequestHandler {

    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(intentName("AMAZON.FallbackIntent"));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {
        String speechText = "Sorry, I don't know that. You can say try saying help!";
        return input.getResponseBuilder()
                .withSpeech(speechText)
                .withSimpleCard("HelloWorld", speechText)
                .withReprompt(speechText)
                .build();
    }
}
