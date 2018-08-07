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
    * Sequence of characters known as a String 
    * String literal is values placed inside double quotation mark
      * Example: 
        * "" : Empty String 
        * " ": Single Space 
        * "A": String containing the single character A
        * "Java": String for the text Java 
        * "Hello\n": String containing Hello and newline or linefeed character (NOTE use of escape sequence)
        * "\"": String containg a double quote
  * Null Literals
    * Null literal is defined in Java source code file as null. 
    * We typically assign null literals to object reference variables. 
      * Example: 
        * String name = null;
        * Object obj = null; 
          * Note: String and Object are classes. 
  
  *IMPORTANCE OF VARIABLES*
    * [Example Variable](variable.png)
      * Starting number of apples: 5
        * Count = 5 .. meaning that it stores the value of five in the variable name count 
      * Add apples: 2
        * Count = 7 .. meaning that it stores the value of 7 in the variable name count 
      * Subtract apples: 3 
        * Count = 4 .. meaning that it stores the value of 4 in the variable name count 
    * This is why location is know as variable. Generally the binary representation is stored in the memory location. The decimal 5,7,4 just to explain the concept of variable. 

**Variables in Java** 
* A variable is a: 
  * Data type - the data type indicates the type of value, variable can hold.
    * Example: integer numbers, floating point numbers, strings and so on. 
  * Name - the variable name must follow rules for identifiers 
* Declare a variable as follows: 
  <data type> <name> [=Initial value]; 
* The Java programming language is statically-typed, which means that the <data type> must be declared before variables can be used and it can't be changed later. 
* The <data type> can be either:
  1. Primitive type
    * int x = 100; // Primitive type 
    * char var = 'a'; // Primitive type  
  2. Reference type
    * String name = "Vikky"; // Reference type 
      * String is a class in Java 
    * Car myCar; // Reference type
      * Car is a user defined class 

*EXAMPLE OF MEMORY LOCATION WITH VARIABLES* 
(memory_location.png)
1. int x = 100 
  * We have a memory location name is x, type is int
  * We have assigned an initial value of 100 
  * CAN ONLY STORE VALUES THAT ARE COMPATIBLE WITH INTEGER TYPE - NOT A FLOATING POINT NUMBER, STRING, ETC 
2. char = var; var = 'A';
  * We have another memory location name is var, type is char 
    * First line is declared a variable and second line we're assigning a value of 'A' to this memory location 
  * CAN ONLY STORE VALUES THAT ARE COMPATIBLE WITH CHAR TYPE - NOT A FLOATING POINT NUMBER, STRING, ETC 
3. String name = "Udayan";
  * String type is which is a reference type, the memory location stores the address pointing to the string value and not the actual string value( the value is stored in another memory location getting pointed from the name name and type string)   

**CONCATENTATION** 
  * Please refer to Variables.java file in the LiteralsVariable project 


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