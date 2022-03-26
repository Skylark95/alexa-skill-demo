# Alexa Skill Demo

## Creating The Skill Function in AWS Lambda
1. Log in to the AWS Management Console and navigate to AWS Lambda by searching for it in the search bar.\
![lambda](img/lambda.png)

2. Click **Create function.**\
![create function](img/create_function.png)

3. Make sure to confirm that "Author from scratch" option is selected.\
![author from scratch](img/author_from_scratch.png)

4. Enter a **Function Name** for the function.
5. Select **Java 11 (Correto)** as the **Runtime**
6. Select **x86_64** as the **Architecture**\
![function page](img/function_page.png)

7. Click on **Change default execution role** and select **Use an existing role**. In the Existing Role dropdown select **LabRole**\
![select role](img/select_role.png)

8. Click **Create function.**

9. Copy the **Function ARN** of your AWS Lambda and save it in a location mentioned during the class period.\
![copy arn](img/copy_arn.png)

10. Under **Runtime Settings** on the function page click **Edit**\
![edit runtime](img/edit_runtime.png)
10. Fill in the Handler information with fully qualified class name of your stream handler class (in our example this value will be `com.amazon.ask.helloworld.HelloWorldStreamHandler`)\
![runtime settings](img/runtime_settings.png)

## Clone Repository
11. Open Visual Studio Code click the **Source Control** Button.\
![source control button](img/source_control.png)

12. Click Clone repository. In the text prompt provide the url: https://github.com/Skylark95/alexa-skill-demo.git\
![clone repository](img/clone_repository.png)

## Build The Skill Code
13. Open the Visual Studio Code _Command Pallete_ (`Ctrl` + `Shift` + `P`) and select _Tasks: Run Build Task_ to build a jar file for your skill. The jar file will be output to the project directory with the name _alexa-skill-demo.jar_\
![run build task](img/run_build_task.png)

## Upload the Jar File to your Function
16. Upload the JAR file produced in the previous step under Function code.\
![upload jar](img/upload_jar.png)

17. Congratulations! You're done for this session!

## Resources
- https://developer.amazon.com/en-US/docs/alexa/alexa-skills-kit-sdk-for-java/develop-your-first-skill.html