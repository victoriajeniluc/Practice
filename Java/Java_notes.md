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

## Files in Program 
* src folder is where you save all the java files 

## SYNTAX 
* Semicolon must be at the end for every line in java 

## SHORTCUT 
* sout + tab will type out System.out.println("Hello World");