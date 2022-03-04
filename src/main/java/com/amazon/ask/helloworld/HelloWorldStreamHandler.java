package com.amazon.ask.helloworld;

import com.amazon.ask.Skill;
import com.amazon.ask.Skills;
import com.amazon.ask.SkillStreamHandler;

import com.amazon.ask.helloworld.handlers.CancelandStopIntentHandler;
import com.amazon.ask.helloworld.handlers.HelloWorldIntentHandler;
import com.amazon.ask.helloworld.handlers.HelpIntentHandler;
import com.amazon.ask.helloworld.handlers.SessionEndedRequestHandler;
import com.amazon.ask.helloworld.handlers.LaunchRequestHandler;

/**
 * The stream handler is the entry point for your AWS Lambda function. 
 * Every request made by an end user to Alexa which invokes your skill will pass through this class, 
 * into your configured Skill instance, and then be forwarded to the handler appropriate for the request.
 * 
 * The SkillStreamHandler is an SDK provided subclass of AWS Lambda's RequestStreamHandler 
 * that takes care of boilerplate logic for serializing and deserializing Alexa requests
 * 
 * The fully qualified class name of your stream handler class consists of the package and class name 
 * and is required when configuring your AWS Lambda function
 */
public class HelloWorldStreamHandler extends SkillStreamHandler {

    private static Skill getSkill() {
        return Skills.standard()
                .addRequestHandlers(
                        new CancelandStopIntentHandler(),
                        new HelloWorldIntentHandler(),
                        new HelpIntentHandler(),
                        new LaunchRequestHandler(),
                        new SessionEndedRequestHandler())
                .build();
    }

    public HelloWorldStreamHandler() {
        super(getSkill());
    }

}
