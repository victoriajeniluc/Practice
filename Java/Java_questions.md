# Java Questions

1. What does Java SE Development Kit(JDK) do? Why is it needed? 
2. What is Notepad++? 
	[link for info on Notepad++](https://www.cleverfiles.com/howto/notepad-mac.html)
	- It supports several programming languages and features syntax highlighting, syntax folding, PCRE (Perl Compatible Regular Expression) search/replace, auto-completion, multi-document editing, WYSIWYG printing, zoom in and zoom out, bookmarks, macro recording and playback, and more.
	- Notepad++ is free and open source, first released in 2003 by Don Ho. It’s written in C++ and based on powerful editing component Scintilla. This free open source library supports many features to make code editing easier in addition to error indicators, line numbering in the margin, as well as line markers such as code breakpoints. 
3. Why Is Notepad++ Mac Not Available?
	[link for info on Notepad++](https://www.cleverfiles.com/howto/notepad-mac.html)
	- Notepad++ relies extensively on Win32 API, the 32-bit application programming interface for modern versions of Windows. Win32 API consists of many components, including things like file systems, devices, processes, threads, and error handling. It’s also responsible for that instantly recognizable Windows look and feel that many long-term users of the operating system find so appealing. In short, without Win32 API, there’s no Notepad++. At least not without a major rewriting of the application...Porting Notepad++ to another operating system would also break the compatibility with most plugins, essentially fragmenting the Notepad++ community.
4. What does IntelliJ IDEA mean? 
	[link for info on IntelliJ](https://www.techopedia.com/definition/7755/intellij-idea)
	-IntelliJ IDEA is a special programming environment or integrated development environment (IDE) largely meant for Java. This environment is used especially for the development of programs. It is developed by a company called JetBrains, which was formally called IntelliJ. It is available in two editions: the Community Edition which is licensed by Apache 2.0, and a commercial edition known as the Ultimate Edition. Both of them can be used for creating software which can be sold. What makes IntelliJ IDEA so different from its counterparts is its ease of use, flexibility and its solid design....The biggest reason it is regarded as one of the best programming tools based on Java is its assistance features, which makes it easy to use and makes the programs created by it very well designed. It also has advanced error checking features which allows faster and easier error checking.	
5. Why configure the JDK to persist by adding the last command to ~/.profile file? 

6. What is System.out.println in Java? 
	- System is a class in the java.lang package 
	- out is a static member of the System class, and is an instance of java.io.PrintStream
	- println() is am ethod of java.io.PrintStream. 
		--> METHOD THAT IS OVERLOADED TO PRINT MESSAGE TO OUTPUT DESTINATION, WHICH IS TYPICALLY A FILE OR A CONSOLE
7. What is a static member?
8. Eclipse is able to create documentation - so the developer doesn't have to make so many comments, is IntelliJ able to do so too? 
9. When using a reference string type... why doesn't it print out the address of the memory location? 
10. What is the difference between float and double when it comes to integrals? 
11. What is the importance of using modulo... what examples can we do with it? 
12. Do we always have to write public, static, void, main(String[] args) {}? The part I am confused about is that if we are writing a function in a class that does not return anything nor take in an arguments.. why do we need to String[] args? Can't we leave it blank? 
13. difference between post and pre increment/decrement because i got it when the professor explained it... but when we were running the program, it seems the same
14. naming convention for classes verses naming convention for variables (just a review)
15. importance of using a exclusive OR logical operator (^)? 
16. review explict casting and implict casting
17. What is fall through? Importance? 
18. While using the switch case... if I did 1 % 2 ... why wouldn't it run to the default ? It still printed out odd? 
19. MORE WORK ON TERNARY OPEATORS!!!! 
20. Which one is better to use do-while or while?
21. Challenge 6 - Question 4: why is that i put k outside the nested loop... it works perfectly fine than inside the first loop? why is that when i put the incrementor for k inside loop... it doesn't work compared to after i do oneDArray[k] = arr[i][j]; 
22. Challenege 6 - Question 4: why is that i can't use j? isn't it incrementing for each element of the assymetical array? 
23. Why is that I have to run javac first before doing the java command line??
24. What is a package? 
	- A package is a namespace that organizes a set of related classes and interfaces. Conceptually you can think of packages as being similar to different folders on your computer. You might keep HTML pages in one folder, images in another, and scripts or applications in yet another. Because software written in the Java programming language can be composed of hundreds or thousands of individual classes, it makes sense to keep things organized by placing related classes and interfaces into packages.
	- The Java platform provides an enormous class library (a set of packages) suitable for use in your own applications. This library is known as the "Application Programming Interface", or "API" for short. Its packages represent the tasks most commonly associated with general-purpose programming. For example, a String object contains state and behavior for character strings; a File object allows a programmer to easily create, delete, inspect, compare, or modify a file on the filesystem; a Socket object allows for the creation and use of network sockets; various GUI objects control buttons and checkboxes and anything else related to graphical user interfaces. There are literally thousands of classes to choose from. This allows you, the programmer, to focus on the design of your particular application, rather than the infrastructure required to make it work.
25. what is the difference between bin and src? what is the importance with them in java? 
26. Find examples for classpath... didn't really put a lot of notes regarding to this part of the lecture 
27. Why is it important to close the scanner after using it? It seems to me that when i commented it out... it was able to execute other things after the last scanner.nextBoolean()
28. why are we using the word this(); for the constructor made in student example for OOP? the instructor didn't explain it well of why it is needed in order to remove the university out of the argument constructor and place it in the default and assign it to standford
29. Find the display view on IntelliJ especially with debugging!
30. When we are creating constructors... do we really need to create every individual one like how we did for A example in challenge 9 where we test for every scenario? 
31. Okay totally understand why we use non-static methods... but I am confused of why static methods are very important to classes in java.. are they considered "CLASS METHODS IN A WAY"?
32. What is the importance with TODO... like why does the color change when I make it as a comment? 
33. Why would IntelliJ ask us to turn the public method to a private one for Example DogTest1? 
34. Please understand when to use static and nonstatic methods 
35. Understand what is static / class shadowing a little more... i understood it a bit but he kind confused of me why he kept using the static / class variable = 2017 and printed it everywhere there was a local variable 
36. Understand what is instance variables shadowing a little more... especially the setCounter thing .... where it was suppose to be 11 but not 1. 
37. Local variables Test - lecture 11 in localtest.java... why does this allow us to access the int i without the final keyword? for test 4? 
38. Definition for encapsulation 
39. What is the risks of doing implicit or explicit casting with polymorphism and inheritance? 
40. Find the differnce between static and dynamic casting? 
41. Look more into reference overloading 
42. what is '==' really comparing vs. equals() 
43. Covairant return.. look up what that is
44. Maybe play around with reference arrays vs. primitive arrays 
45. WHY can't we just use instance variables? like whats the purpose of dynamic polymorphism....  where we have to have the supertype reference the subtype ... and why the explict casting? 
46. Importance of abstract classes? methods? 
47. Importance of interfaces? What are they? How to create one in IntelliJ? and why the explict casting? Find out how to pass specific arguments for interfaces than hard coding them! What are the variables that interfaces can have? Why use marker interfaces like RandomAccess or Serializable? Why use functional interfaces? Why would interfaces need to be extended from another? 
48. What are the @ signs for?? Tagging? like @param or @FunctionalInterface? 
49. Why did I get an error when I tried tagging @FunctionalInterface on I3 in lecture29? Error: Multiple non-overriding abstract methods found in interface
50. importance of abstraction? 