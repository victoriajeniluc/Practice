# Java Notes 

## IntelliJ 
* Using IntelliJ, it will automatically create a public class for you!  
* Using VCS allows me to push, pull, commit changes with my Github by using the terminal on it. 
		- Use the VCS Pop up to do that stuff! 

## JVM, JRE, JDK
[picture of JVM, JRE, JDK](JDK,JVM,JRE.png)	
* JVM aka Java Virtual Machine  
		- runs the Java bytecode. 
		- understand java grammar and syntax; therefore, we have to complie our java programs to generate the bytecode and JVM understands these bytecode
* JRE aka Java runtime environment 
		- provides the JVM, libraries, and other tools to run 
* JDK aka Java Development Kit 
		- the superset of JRE and contains everything that is in the JRE plus tools such as the compiler and debugger; **necessary developing java applications**!!

## Java Lanaguage 
** IDENTIFIERS ** 
		* IDENTIFIERS are case sensitive.
	  	*  write it as --> MyFirstClass NOT Myfirstclass
	  * IDENTIFIERS NAMING RULES:
	     * 1. Name must begin with
		      * A to Z (upper and lower case)
		      * _ (underscore)
		      * $ (dollar sign) or other currency symbol such as Indian Rupee
	           * VALID EXAMPLES OF IDENTIFIERS IN JAVA:
	              * TESTCLASS
	              * testClass
	              * _Student
	              * underscoreunderscoreCourse -- had to do this because the markdown was coming out weird 
	            	* $Fees
	              * $$Test
		    * 2. After the first character, subsequent characters may use numbers from 0 to 9.
	        * EXAMPLES:
	          * T1Example
	          * _012Test
	          * $2Score
		    * 3. CAN NOT USE JAVA KEYWORDS
	        * INVALID EXAMPLES:
	          * public
	          * class
	          * void
	          * static 
	          * [more in picture](NONOs_for_identifiers_naming.png)
	      * 4. Cannot use following literals: 
	      	* true 
	      	* false 
	      	* null 
	      		* true, false, and null are not keywords in Java, these are literals 
** COMMENTS **
	* Comments are notes written to a code for documentation purpose
	* Comments are not part of the program and doesn't affect the flow of the program 
	* Comments are also excluded from the complied code 

	* TWO TYPES OF COMMENTS: 
		* Javadoc comments(notes for those use your class): 
			* 1. Define the purpose of the class
			* 2. Authors and version details 
			* 3. Its method details:
				* Core functionality of the method 
				* Parameter details 
				* Return type 
				* Any exception it throws  
			/**
				* An example of javadoc comments 
			*/

		* Developer comments(those that will be coding and learning what you did in your program):
			* 1. Writing technical details related to implementation, such as particular algorithm or logic you used to solve the problem 
			2. Any issues in the current logic 
			3. Things you left for future implementation i.e TODOS  
			/* Comment - 
				This block is used for multi-line comments 
			*/

		* Single - Line comments 
			// Comment - Used for single - line comments  

## Files in Program 
* src folder is where you save all the java files 
* File name should match the public class's name 

## SYNTAX 
* Semicolon must be at the end for every line in java 
	* but multiple semicolons are legal.. even if they don't make sense 
		* example: [picture of multiple semicolons](too_many_semi.png)

## Miscellanos 
* javadoc command is used to generate documents for code   

## SHORTCUT 
* sout + tab will type out System.out.println("Hello World");