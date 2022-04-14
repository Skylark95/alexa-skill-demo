# Alexa Skill Demo

To view the steps from last session click [here](https://github.com/Skylark95/alexa-skill-demo/blob/2022-04-01/README.md)

## Alexa Skill Slots
Intents can optionally have arguments called slots. Slot values are extracted from utterances and sent with the intent request. Each slot has a `Variable Name` (The slot name as it will appear in the intent request to your skill) and a `Slot Type` (Defines how data in the slot is recognized and handled).

Each group's skill has been given a slot with a variable name of `name`. This slot is of slot type `AMAZON.FirstName`.

## Use the `name` skill slot
For this session look into using the `name` slot added to your skill to have your skill greet people by name. Instead of this guide walking you through step by step you'll need to look at Amazon's JavaDoc to find out how to read the `name` slot value.

The JavaDoc can be found at:
- http://ask-sdk-java-javadocs.s3-website-us-west-2.amazonaws.com/

This link redirects to the JavaDoc above so you can type less:
- https://derekcochran.dev/ask-sdk-javadoc

Here's a few hints:
- The `handle` method of `HelloWorldIntentHandler` has an `input` argument.
- We should be able to get an `IntentRequest` from the `input` (You may have to class cast)
- The `Slot` may be found on an `Intent` which you can get from an `IntentRequest`

## Running the skill
Once you have modified the skill, build the jar (Visual Studio Code Command Pallete (`Ctrl` +`Shift` +`P`) and select *Tasks: Run Build Task*) and upload it to your lambda, replacing the source code.

Now to run the skill with your changes you can ask Alexa:
- "ask {group name} to say hi to {name}"

## Resources
- https://developer.amazon.com/en-US/docs/alexa/alexa-skills-kit-sdk-for-java/develop-your-first-skill.html
- http://ask-sdk-java-javadocs.s3-website-us-west-2.amazonaws.com/
