# alexa-skill-demo-complete

## Clone Repository
Open Visual Studio Code and on the _Getting Started_ page use the _Clone Git Repository_ link and fill in the following URL:
- https://github.com/Skylark95/alexa-skill-demo-complete.git

## Alexa Skills Kit SDK for Java
We will be following the _Developing Your First Skill_ guide on Amazon's developer documentation site. Open a browser tab to this guide and keep it handy.
- https://developer.amazon.com/en-US/docs/alexa/alexa-skills-kit-sdk-for-java/develop-your-first-skill.html

## Developing Your First Skill

### Implementing request handlers
The `LaunchRequestHandler` is already in the `com.amazon.ask.helloworld.handlers` package.

Read through the [Implementing request handlers](https://developer.amazon.com/en-US/docs/alexa/alexa-skills-kit-sdk-for-java/develop-your-first-skill.html#implementing-request-handlers) section of the guide. Copy the remaining handlers in the guide into Visual Studio Code. After this step you should have created the following files in the folder `src/main/java/com/amazon/ask/helloworld/handlers`:
- CancelandStopIntentHandler.java
- FallbackIntentHandler.java
- HelloWorldIntentHandler.java
- HelpIntentHandler.java
- SessionEndedRequestHandler.java

### Implementing the SkillStreamHandler
This step has already been done for you in `HelloWorldStreamHandler.java`

### Building Your Skill
Open the Visual Studio Code _Command Pallete_ (`Ctrl` + `Shift` + `P`) and select _Tasks: Run Build Task_ to build a jar file for your skill.
- The jar file will be output to the project directory with the name _alexa-skill-demo.jar_

### Uploading your skill to AWS Lambda
Below is a modified version of the [Uploading your skill to AWS Lambda](https://developer.amazon.com/en-US/docs/alexa/alexa-skills-kit-sdk-for-java/develop-your-first-skill.html#uploading-your-skill-to-aws-lambda) section in the guide for this demo

1. If you do not already have an account on AWS, go to Amazon Web Services and create an account.
1. Log in to the AWS Management Console and navigate to AWS Lambda.
1. Click the region drop-down in the upper-right corner of the console and select one of the regions supported for Alexa skills: Asia Pacific (Tokyo), EU (Ireland), US East (N. Virginia), or US West (Oregon).
1. If you have no Lambda functions yet, click Get Started Now. Otherwise, click Create function.
1. Make sure to confirm that "Author from scratch" option is selected.
1. Enter a Name for the function.
1. Select the Role for the function. This defines the AWS resources the function can access.
   - To create a new role: 
     1. For Role (under Lambda function handler and role), select Create new role from template(s).
     1. Enter the Role Name.
     1. From the Policy templates list, select Simple Microservice permissions.
1. Select the language you want to use for the Runtime which is Java 11 in our case.
1. Click "Create function".
1. Configure the Alexa Skills Kit trigger for the function
   1. Click your function in the list to open the configuration details.
   1. Make sure you are on the Configuration page.
   1. In the Designer section, under Add triggers, click Alexa Skills Kit to select the trigger.
   1. Under Configure triggers, select Enable for Skill ID verification.
   1. Enter your skill ID in the Skill ID edit box (A mentor will provide you with this ID).
   1. Click Add.
   1. Click Save to save the change.
1. Upload the JAR file produced in the previous step under Function code.
1. Fill in the Handler information with fully qualified class name of your stream handler class (in our example this value will be `com.amazon.ask.helloworld.HelloWorldStreamHandler`).
1. Finally, copy the ARN of your AWS Lambda so it may be configured in Amazon Developer console. You can find this on the top right corner. A mentor will give you further instructions on what to do with the ARN.
