# alexa-skill-demo-complete

## Clone Repository
Open Visual Studio Code and on the _Getting Started_ page use the _Clone Git Repository_ link and fill in the following URL:
- https://github.com/Skylark95/alexa-skill-demo-complete.git

## Alexa Skills Kit SDK for Java
We will be following the _Developing Your First Skill_ guide on Amazon's developer documentation site. Open a browser tab to this guide and keep it handy.
- https://developer.amazon.com/en-US/docs/alexa/alexa-skills-kit-sdk-for-java/develop-your-first-skill.html

### Developing Your First Skill

#### Implementing request handlers
The `LaunchRequestHandler` is already in the `com.amazon.ask.helloworld.handlers` package.

Read through the [Implementing request handlers](https://developer.amazon.com/en-US/docs/alexa/alexa-skills-kit-sdk-for-java/develop-your-first-skill.html#implementing-request-handlers) section of the guide. Copy the remaining handlers in the guide into Visual Studio Code. After this step you should have created the following files in the folder `src/main/java/com/amazon/ask/helloworld/handlers`:
- CancelandStopIntentHandler.java
- FallbackIntentHandler.java
- HelloWorldIntentHandler.java
- HelpIntentHandler.java
- SessionEndedRequestHandler.java

## Building Your Skill
Open the Visual Studio Code _Command Pallete_ (`Ctrl` + `Shift` + `P`) and select _Tasks: Run Build Task_ to build a jar file for your skill.
- The jar file will be output to the project directory with the name _alexa-skill-demo.jar_
