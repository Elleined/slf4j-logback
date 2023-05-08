# slf4j-logback-template
This logging template uses Slf4j API with Logback implementation
# Why you should use Logging Framework
  - Have you ever bump or found yourself opening your project and running it but end up wondering where the hell that print statements is coming from and end up scanning all your classes just to delete that annoying print statement that in fact you written long time ago.
  - And also spending time just to delete all of print statements all over your project because you are ready to deploy or present your project and you don't want them to see your print statements and probably you dont want to delete those because they are very useful print statements in the future when debugging.
  - THATS WHEN YOU NEED A LOGGING FRAMEWORK
# Why I used SLF4J(Simple Logging Facade for Java) and Logback framework library implementation
  - I Choose SLF4J as an API because it provides an abstraction on top of logging libraries that allows us developers to
  choose any of the logging library we want and achieve less coupling in logging libraries to switch to other libraries anytime we want
  - I Choose Logback as implementation because it is also the default logging library used in spring and why I don't choose Log4j-core got involved in one major security issue that affected big companies 
  check out this link for full list of companies that got affected by security issue https://www.cybersecurity-help.cz/reports/ApacheLog4J.php
  thats why I don't choose Log4j-core as framework library implementation.
  
# 5 types of logging levels
 - INFO: Used when you want to log an important message.
 - WARN: Used when there some potential process that will lead to application error or unusual behavior but your program is still running.
 - DEBUG: Used when you want to log message that will be used when debugging.
 - TRACE: Used when you want every process of your application to be log usually this is verbose and messages here are not that needed // more comprehensive than debug log
 - ERROR: Used when your application hits an error that should be stopped and your functions are working properly for some reasons
  
# Note
 - private static final org.slf4j.Logger = org.slf4j.LoggerFactory.getLogger(Classname.class);
 should be always declared as static and final we dont want many instance of logger in our application.
 - You can use @Slf4j annotation of project lombok to skip the boilerplate above. I recommend IntelliJ as IDE because it provides support for lombok unlike any other IDE's  
  
# For more reference
 - SLF4J with other library implementation. https://www.baeldung.com/slf4j-with-log4j2-logback
 - Logback comprehensive setup. https://mkyong.com/logging/slf4j-logback-tutorial/



    
  
  
  


	


 




 









