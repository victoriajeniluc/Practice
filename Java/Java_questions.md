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