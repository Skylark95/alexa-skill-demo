package com.amazon.ask.helloworld.handlers;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;
import static com.amazon.ask.request.Predicates.intentName;

import java.util.Optional;

/**
 * Intent handler for "AMAZON.StopIntent" and "AMAZON.CancelIntent".
 * 
 * <h4>AMAZON.StopIntent</h4>
 * Exits the skill. Your skill must implement this intent and shouldEndSession must be true or null in the response.
 * Common Utterances: stop, off, shut up
 * 
 * <h4>AMAZON.CancelIntent</h4>
 * Lets the user cancel a transaction or task (but remain in the skill) or Lets the user completely exit the skill.
 * Common Utterances: cancel, never mind, forget it
 */
public class CancelandStopIntentHandler implements RequestHandler {

    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(intentName("AMAZON.StopIntent").or(intentName("AMAZON.CancelIntent")));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {
        return input.getResponseBuilder()
                .withSpeech("Goodbye")
                .withSimpleCard("HelloWorld", "Goodbye")
                .withShouldEndSession(true)
                .build();
    }
}
