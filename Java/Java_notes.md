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
**IDENTIFIERS** 
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
**COMMENTS**
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

**LITERALS**
* Java Literals are syntactic representations of numeric, boolean, character or string data. 
* Literals provide means of expressing specific values in your program 
  * Example: 
    * 1. 100
    * 2. 12.4
    * 3. true 
    * 4. 'A'
    * 5. "Java"

* The different types of literals in Java are: 
  * Integer Literals - ex. 1 from above 
    * An integer in Java can be representated in 4 forms: 
      1. Decimal (Base 10)
        * No special notation 
        * Example: 15 
      2. Octal (Base 8)
        * Precede by 0
        * Example: 017 (represents 15)
      3. Hexadecimal (Base 16)
        * Precede by 0x or 0X
        * Example: 0xF (represents 15)
      4. Binary (Base 2)
        * Precede by 0b or 0B
        * Example 0b1111 (represents 15)
  * Floating-Point Literals - ex. 2 from above 
    * Represents decimal with fractional parts 
      * Example: 7.873 or -0.089 
    * 2 notations are possible for floating point numbers: 
      1. Standard Notation: 
        * Example: 74589787.12 or 0.314567821 
      2. Scentific Notation: 
        * Example: 7.458978712E7 or 3.12567821E-1 
  * Boolean Literals - ex. 3 from above 
    * There are two boolean literals in Java: 
      1. true 
      2. false 
        * Note: "true" and "false" are String literals 
        * true(without quotes) and false(without the quotes) are boolean literals 
  * Character Literals - ex. 4 from above 
    * Character Literals represent Unicode characters 
    * Unicode provides a unique number for every character: 
      * No matter what platform, program, language 

    * To use a character literal, enclose the character in single quote delimiter 
      * Example: 
        * The letter a is represented as 'a'
        * For special characters, a backslash (escape character) is used, followed by the character code
          * '\n': new line or line feed(LF)
          * '\t': tab 
          * '\\': Backslash 
          * '\'': Single quotation mark 
        * Characters from other languages or other symbols can be represented by Unicode value 
          * For Alphabet A, use '\u0041'
          * For number 4 in devanagri script, use '\u096A'
          * For hourglass symbol, use '\u23f3'
          * For indian rupree symbol, use '\u20B9'
  * String Literals - ex. 5
  * Null Literals



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