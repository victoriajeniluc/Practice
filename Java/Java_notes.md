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

----------------------------------------
## Java Lanaguage 
----------------------------------------
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
----------------------------------------
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
----------------------------------------  
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
----------------------------------------  
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
----------------------------------------
**CONCATENTATION** 
  * Please refer to Variables.java file in the LiteralsVariable project 
----------------------------------------
**Primitive Data Types** 
  * The Java Programming language defines eight primitive data types: 
    1. byte(integral)
      * is a 8-bit signed integer
      * has a minimum value of -128 and a max of 127 

      * Example: 
        * byte b1 = -128; 
        * byte b2 = 127;
        * byte b3 = 25; 

      * [How to convert decimal into binary](decimal_to_binary.png)

      * [How to convert negative decimal into binary](negative_decimal_to_binary.png) 

    2. short (integral)
      * is a 16-bit signed integer
      * has a minimum value of -32768 and a max of 32767
      * this means short = byte + more data

        * Example: 
          * short s1 = -32768;
          * short s2 = 32767; 
          * short s3 = 100; 

    3. int(integral)
      * is a 32- bit signed integer
      * has a minimum of -2^31 [-2,147,483,648] and a max of 2^31-1 [2,147,483,647]
      * this means int = short + more data 

        * Example of when values get rewritten when we reassign the value to i1:
          * int i1 = -50000; 
          * System.out.println(i1) // -50000
          * int i1 = 50000;
          * System.out.println(i1) // 50000 
          * int i1 = 100_000;
          * System.out.println(i1) // 100_000
            * underscores is just for grouping purposes, to improve readability. value stored is 100000

    4. long(integral)
      * is a 64-bit signed integer 
      * has a minimum of -2^63 and a max of 2^63-1 
      * this means: long = int + more data 

      * suffix of the value L(upper case) of l(lower case)
        * Important point to note here is that by default integral literal are of int type and hence for values within int range(-2147483648 to 2147483647), or suffix L or l is not needed. BUt ofr values outside the int range, suffix L is compulsory 
        * In other words, int type values can be easily accommodated by long types 

          * Example: 
            * long l1 = -50000; // suffix L is optional 
            * long l2 = 50000; // suffix L is optional 
            * long l3 = 100_000; // suffix is optional 

            * long l4 = 2147483648L; // suffix is compulsory, this number is out of int range 

    5. float(floating point)
      * have double as default data type 
      * is 32-bit IEEE 754 floating point. Float covers a range from 1.40129846432481707e-45 to 3.40282346638528850e+38 (positive or negative)
      * Floating-point literal includes either a decimal point or one of the following: 
        * E or e // (add exponential value)
        * F or f // (float)
        * D or d // (double)
    6. double(floating point)
      * the double data type is a 64-bit IEEE 754 flaoting point. Double covers a range from 4.94065645841246544e-32d to 1.79769313486231570e+308d (positive or negative)
          * Example for floats and doubles:
            * 5.27 // simple floating-point value (a double)
            * 2.15e22 // a large floating-point value (a double)
            * 2.718F // a simple float size value 
            * 123.4E+306D // a large double value, D is optional  

    7. char(textual)
      * is a single 16-bit Unicode character 
      * has a minimum value of '\u000' (or 0) and a max of '\uffff' (or 65,535 inclusive)
      * each unicode value is integral value, hence int literal can be assigned to a char as  well. Note that value should be between 0 and 65,535. 
        * Example: 
          * char c1 = 65; // December value corresponding to character 'A'
          * char c2 = 'A'// character 'A'
          * char c3 = '/u0041' // Unicode value corresponding to character 'A'
          * char c4 = 8377; // Decimal value code for indian rupee symbol 
          * char c5 = '\u20B9'; // Unicode value for indian rupee symbol 
          * char c6 = 65535; // no error 
          * char c7 = 65536; // compilation error
      * As each unicode value is an integral value, and above range 0 to 65,535 can be easily accomodated by int type. Hecne all char literal can be assigned to int type. 
        * Example: 
          * int i1 = 'A' // corresponding decimal value is 65 
          * int i2 = '/u2980'; //corresponding decimal value is 8377 

    8. boolean(logical)
      * represents two states: true or false 

      * Example:
        * boolean result = false 
          * The example shown above, declares a variable named result as a boolean type and assigns it a value of false 
      * Example: 
        * boolean flag = true; 
        * boolean b1 = 0; // Compliation error 
        * boolean b2 = "true"; // Compilation error 
----------------------------------------
**OPERATORS** 
  1. Arithmetic operators 
    * are binary operators 
    * take two openings one at the left side of the letter sign and another to the right 

    *ADDITION* 
    * Opr1 + Opr2
    * Adds or Concatenates Opr1 + Opr2

    *SUBTRACTION*
    * Opr1 - Opr2
    * SUBTRACTS Opr2 from Opr1

    *MULTIPLICATION*
    * Opr1 * Op2
    * Multiplies Opr1 by Opr2

    *DIVISION* 
    * Opr1 / Opr2
    * Divides Opr1 by Opr2 

    *MODULE* 
    * Opr1 % Opr2 
    * Calculates the remainder of dividing Opr1 by Opr2 

  *CASTING*
    * Implict 
      * Example: byte b1 = 127;
      * the compiler is actually doing this for us byte b1 = (byte) 127.. but since the 127 is within the range of the byte size.. we don't have do it!

    * Explicit
      * Example: byte res = (byte) (126 + 19) - we have to do it here because it's outside the range of the byte size 
      
  2. Unary operators
    * + : unary plus operator; indicates positive value (by default numbers are always positive) 
    * - : unary minus operaator; negates an expression or value

    * ++ : increment operator; increments a value by 1 
    * -- : decrement operator; decrements a value by 1
      * increment and decrement operators increase and decrease a value stored in a number variable by 1. 
        * Example: 
        int var = 100; // Following two statements are incrementing the value of var by 1 

        var = var + 1; // incrementing the value of var by 1 
        OR 
        var++; // incrementing the value by 1 

      * increment and decrement operators can be placed before or after an operand 
        * when the operator is placed before the operand it is called pre- 
          * Example: 
            * ++var; or --var; 
        * when the operator is placed after the operand it is called post 
          * Example: 
            * var++; or var--;  

      * pre-increment / pre-decrement: 
        * WHEN THE OPERATOR IS PLACED BEFORE AN OPERAND(++expr, --expr), the variable will be incremented or decremented by 1 in the memory, and tehn the new value is used in the expression in which it appears
          * Example:
            * int a = 25; 
            * System.out.println(++a); // 26
            * System.out.println(--a); // 25 
      * post-increment / post-decrement: 
        * WHEN THE OPERATOR IS PLACED AFTER AN OPERAND(expr++, expr--), the old value of the variable will be used in the expression where it appears and then the variable will be incremented or decremented by 1 in the memory... this means: 
          * if b++ is printed out.. right now it is 25 so it will use 25 at this point. THEN it will increment it by 26 and stored in the memory 
          * if b-- is printed out next ... it will use what is right now which is 26... then it will be stored in the memory at 25 later. 
          * Example:
            * int b = 25; 
            * System.out.println(b++); // 25
            * System.out.println(b--); // 26 

    * ! : logical complement operator; 
    inverts the value of a boolean
      * Example: _08LogicalComplement.java   
  3. Relational operators 
    * are binary operators (operates on 2 operands) and compare the values of the operands 
      * the output of the expression is either true or false 
        * > : Opr1 > Opr2 
          * Opr1 is greater than Opr2 
        * < : Opr1 < Opr2
          * Opr is less than Opr2
        * >= : Opr1 >= Opr2 
          * Opr1 is greater than or equal to Opr2 
        * <= : Opr1 <= Opr2 
          * Opr1 is less than or equal to Opr2 
        * == : Opr1 == Opr2 
          * Opr1 is euqal to Opr2 
        * != : Opr1 != Opr2 
          * Opr1 does not equal to Opr2 

  4. Logical operators
    * have two boolean operands that yield as a boolean result 
    * please refer to the table for these below! 
      * && : logical AND 
      * & : bitwise logcal AND
        * && operator supports short - circuit evaluations but & operator doesn't 
        * if the first operand to && operator evalues to false, the result can never be true, hence && does not evalue the second operand 
        * But the & operator evalues both the operands before returning an answer  
      * || : logical OR
      * | : bitwise logical inclusive OR
        * || operator supports short-circuit evaluations but | operator doesn't 
        * if the first operand to || operator evalues to false, the result can never be true, hence || does not evalue the second operand 
        * But the | operator evalues both the operands before returning an answer  
      * ^ : bitwise logical exclusive OR 
        * the result of a bitwise logical exclusive OR operation is true, if and only if one operand is true and the other is false 
        * Note that both operands must always be evaluated in order to calculate the result of a bitwise logical exclusive OR. 
      * ?: : ternary 
        * ternary operators work on 3 operands 
        * the structure of the expression is using a ternary operator is: 
          * expr1 ? expr2 : expr3 
            * expr1 is a boolean expression / variable 
            * if expr1 is true, expr2 is returned
            * if expr1 is false, expr3 is returned 

  5. Assignment operators
    * = : Opr1 = Opr2 
      * Assigns value of Opr2 to Opr1 
    * += : Opr1 += Opr2
      * Assigns result of Opr1 + Opr2 to Opr1  
    * -= : Opr1 -= Opr2
      * Assigns result of Opr1 - Opr2 to Opr1 
    * * = : Opr * = Opr2 (the * and = should be together) 
      * Assigns result of Opr1 * Opr2 to Opr1 
    * /= : Opr1 /= Opr2
      * Assigns result of Opr1 / Opr2 to Opr1 
    * %= : Opr1 %= Opr2
      * Assigns result of Opr1 % Opr2 to Opr1 

**OPERATOR PRECEDENCE AND ASSOCIATIVITY** 
  * Please refer to the table to any notes below! 
    * Example: 
        * int a = 100; 
        * a = --a + a++ + a-- + a++; 

    * Step 1: 
      * Group the operators based on precedence 

      * SINCE THE EXPR++ and EXPR-- have higher precedence... group those first
        * a = --a + (a++) + (a--) + (a++);
      * THEN THEN NEXT ONE
        * a = (--a) + (a++) + (a--) + (a++);

    * Step 2: 
      * THEN GROUP BY THE ASSOCIATION.. since + is left to right... group it left to right until you get 1 huge expression on the left and one to the right 
        * a = ((--a) + (a++)) + (a--) + (a++);
        * a = (((--a) + (a++)) + (a--)) + (a++);

    * Step 3: 
      * EVALUATE IT 
        * a = (((--a) + (a++)) + (a--)) + (a++); 
        * a = ((99+99) + (a--)) + (a++); 
        * a = (198 + 100) + (a++);
        * a = (298) + 99; 
        * a = 397;  

  * Example2: 
        * int a = 1; 
        * a = -a-- + a++ / -a-- * --a; 

      Step 1: 
        * a = -(a--) + (a++) / -(a--) * --a;       
        * a = (-(a--)) + (a++) / (-(a--)) * (--a);

      Step 2: 
        * a = (-(a--)) + ((a++) / (-(a--))) * (--a);
        * a = (-(a--)) + (((a++) / (-(a--))) * (--a));

      Step 3: 
          * a = (-(a--)) + (((a++) / (-(a--))) * (--a));
          * a = (-1) + ((0 / (-1)) * (--a));
           * a = (-1) + (0 * (-1));
           * a = (-1) + 0; 
           * a = -1; 

    * Example3: 
        * int a = 2; 
        * boolean res = a++ == 2 || --a == 2 && --a == 2; 
        * System.out.println(a);

      Step 1: 
        * boolean res = (a++) == 2 || --a == 2 && --a == 2;
        * boolean res = (a++) == 2 || (--a) == 2 && (--a) == 2;

      Step 2: 
       * boolean res = ((a++) == 2) || ((--a) == 2) && ((--a) == 2);
      * boolean res = ((a++) == 2) || (((--a) == 2) && ((--a) == 2));
      
      Step 3: 
       * boolean res = ((2) == 2) || (((--a) == 2) && ((--a) == 2));
       * boolean res = true || ...;
       * boolean res = true;  
       * a = 3; // because it stopped evaluating once the true hit in line 488
----------------------------------------
**IF - ELSE STATEMENTS**
  * Selection statements 
    * if, if - else, if - else if - else 
    * switch - case 
  * Looping statements 
    * while, do - while 
    * for 
  * Branching statements 
    * break
    * continue 
    * return 

  * IF STATEMENT 
    * executes a statement or block of statements if the specified expression is true 
      * the simple if statement syntax: 

        if (<boolean_expression>)
         statement,  --> this is used when you only need to execute one  statement when it is true

        OR 

        if (<boolean_expression>) {
          statement; --> this is similar to the one above... they say that it is very common for people ot not use the curly brackets after one statement ... but as a habit, it is good to use it
        }  

        OR 

        if (<(boolean_expression>) {
          statement 1; 
          statement 2;
          ...
        }

  * IF - ELSE STATEMENT
    * executes the block of statement(s) if the specified expression is true and execute other block of statement(s) if the expression is false 

      * SYNTAX: 

        if(<boolean_expression>) 
          statement; 
        else 
          statement; 

        OR 

        if(<boolean_expression>) {
          statement 1; 
          statement 2;
        } else {
          statement 1; 
          statement 2; 
        }

  * IF - ELSE IF - ELSE STATEMENT 
    * When we want to test more than two scenarios then implementing logic using if-else statement is not easy. In such scenarios we have if - else if - else statements 

      * SYNTAX: 

      if(<boolean_expression>) {
        statement 1; 
        statement 2;
      } else if (<boolean_expression>) {
        statement 1; 
        statement 2; 
      } else {
        statement 1; 
        statement 2; 
      }

    ** you can have as many if else blocks and the else block is optional
----------------------------------------

**SWITCH-CASE STATEMENTS**
  * used to compare the value of a variable with multiple values and execute some statements based on the match 

  * SNYTAX: 

    switch(expression) {
      case constant1:
        statement 1; 
        statement 2; 
        ... 
        break;
      default: 
        statement 1; 
        statement 2; 
        ... 
        break;
      case constant2: 
        statement 1; 
        statement 2; 
        ... 
        break;
    }

    ** NO CURLY BRACKETS FOR CASE BLOCKS, EVEN IN CASE OF MORE THAN 1 STATEMENTS 
    ** ALL THE CASE BLOCK STATEMENTS ARE OPTIONAL INCLUDING BREAK. BLANK CASE BLOCK IS PERFECTLY LEGAL CODE.
    ** DEFAULT BLOCK CAN APPEAR ANYWHERE IN THE CODE. IT SHOULD NOT BE THE LAST ONE

  * switch expression can accept the following: 
    * char or character 
    * byte or Byte
    * short or Short 
    * int or Integer 
    * an enum only from Java 6 
    * a string expression only from Java 7 

  * case values: 
    * must evaluate to the same type / compatible type as the switch expression can use
    * case values can be compile-time constants 
      * final int n1 = 5; --> final means that once it is assigned for the first time... it can never be changed 
        final int n2 = 10;
        final int n3; 
        n3 = 20; 

        in this case ^^, 
        100 -> compile time constant 
        n1 -> compile time constant 
        n2 -> compile time constant 
        n1 + n2 -> compile time constant because each variable is a compile constant with the info given before 
        n1 * n2 -> compile time constant
        8 + 15 -> compile time constant because mathematical equations are compile constant 
        n3 -> not considered as compile time constant 
        n1 + n3 -> not considered as a compile time constant 

  * switch - case blocks can only check for equality(==operator) 
----------------------------------------

**CONTROL FLOW STATEMENTS**

  * Selection Statements 
    * if, if-else, if-else if-else 
    * switch-case

  * Looping statements 
    * while, do-while 
    * for 

  * Branching Statements 
    * break 
    * continue 
    * return  


  * WHILE LOOP 

    * SYNTAX: 

      while(boolean_expression) {
        statement1;
        statement2;
        ...
      }  

      OR 

      while(boolean_expression) 
        statement1; 

    * boolean expression represents: 
      1. any expression whose result is either rue or false e.g: age > 20 
      2. a boolean variable e.g: flag
      3. a boolean literal: true 
      4. a boolean assignemnt e.g: flag = true 

    * As with it, if-else or if-else if- else, you can omit curly braces, if there is only one statement.. but not recommended for practice 

    * The statements inside the while loop are executed as long as the boolean_expression evaluates to true 

  * DO-WHILE LOOP
    * SYNTAX: 

      do {
        statement1; 
        statement2; 
        ... 
      } while(boolean_expression); 

      OR 

      do 
        statement1; 
      while(boolean_expression); 

        * boolean_expression represents either of the following: 
          1. any expression whose result is either rue or false e.g: age > 20 
          2. a boolean variable e.g: flag
          3. a boolean literal: true or false 
          4. a boolean assignemnt e.g: flag = true 

      * The main difference between a while and do-while loop: 
        * The statements inside a do-while loop are executed at least once 
        * Literal false is allowed in boolean_expression of a do-while loop, but in while loop it is not allowed 

        * DO-WHILE: 
          * evaluates the boolean_expression after executing the statements 
        * WHILE: 
          * Evaluates the boolean_expression before executing the statements 

    * FOR LOOPS 
      * 2 types of for loops in java: 
        1. regular for loop 
        2. enhanced for loop or for-each loop (JAVA SE 5 onwards)

      * SNYTAX | regular 

        for (initialization_expm; boolean_exprn; step_exprn) {
          statement1; 
          statement2; 
          ....
        }
          > FOR LOOPS... THIS IS HOW IT WORKS: so it first goes to the initialization expression... then to the boolean expression.. if that is true... it will execute the block of statements. then it will go to the step_exprn to do the counter. though if the boolean_expression is false... it will exit the loop and stop. 
        OR 

        for (initialization_expm; boolean_exprn; step_exprn)
          statement1;

      * initialization_exprn:
        > int ctr = 0; 
        or 
        > l = 1;

      * boolean_exprn:
        > same as boolean expression of if, while, do-while etc. 
        > if it was just two semicolons... it will be an infinite loop - so as ;true; 
        > it will stop the loop if the literal boolean false is given in the boolean expression in the for loop 

      * step_exprn: 
        > any java statement is allowed but it usually increments / decrements loop counter variable 
        > ctr++; 
        > i--; 

    * ENHANCED FOR LOOP WILL BE COVERED WITH ARRAYS 


  * Nested control statement 
    * One control statement used inside other control statement 

    * Some Examples: 
      * if statement inside another if statement 
      * if statement inside a loop statement 
      * lopp inside another loop 
      * etc 

  * Labeled statements: 
    * label is the identifier for the statements 

    * in java following statements can be labeled: 
      * selection statements: if and switch statements 
      * looping statements: while, do-while, and for
      * expressions 
      * assignments 
      * a code block defined using {}
      * return statements 
      * try block 
      * throws statements 

    * Names of the labels follow the same rules of the name of identifiers in java 


  * BREAK STATEMENT 
    * used to break out of looping statements and switch - case block 

  * CONTINUE STATEMENT 
    * skips the current iteration of the loop and jumps to the next iteration 

----------------------------------------
**1 - D ARRAY** 
  * An object that stores the collection of values (primitives / objects)
  * use one variable to store multiple items of same / compatible type and we use the ame variable to modify the items 
    * Example: 
      scores: 85, 70, 95, 90 
      names: viet, vikky, jessica, kezia 

  * DECLARING ONE-DIMENISIONAL ARRAYS 
    * 2 WAYS OF DOING THIS:   
      1. Specify the type (primitive or object), and tehn specify the square brackets and then finally the array variable name: 
        * Example: 
          int [] scores; 
          String [] names;
          Student [] students;
      2. Specify the type (primitive or object) and then the name of the array which is followed by the brackets: 
        * int scores []; 
        * String names []; 
        * Student students [];

  * CONSTRUCT / INSTANTIATE ONE-DIMENSIONAL ARRAY 
    * use the keyword new, followed by the type and then finally specify the size within square brakcets []; 
    1. Declare and instantiate in separate statements; 
      * Example: 
        int [] scores; 
        scores = new int[4]; 
    2. Declare and instantiate in thes ame line 
      * Example: 
        int [] scores = new int[4]; 
        String [] names = new String[5]; 

  * IT IS ILLEGAL TO INCLUDE THE SIZE OF THE ARRAY IN THE DECLARATION.. IT WILL GIVE YOU AN ERROR IF YOU DO THIS: 
    * Example: 
      X int [5] scores; 

  * ONCE THAT THE SIZE OF THE ARRAY IS CREATED... THEN IT CAN NO LONGER BE CHANGED - so can't assign a position that is outside of the amount given 
    * Example: 
      X int [] scores = new int[4];
        scores[5] = 8; 

  * IT IS ALSO ILLEGAL TO TRY TO ASSIGN ANOTHER DATA TYPE TO THE POSITION OF AN ARRAY... 
    * Example: 
      X int [] scores = new int[4];
        scores[1] = 'a'; --> this is not an int type but a char 
        OR 
        scores[4] = 29348507326789029837; --> this is outside of the int range

  * LENGTH PROPERTY OF AN ARRAY OBJECT 
    * Every array object in java has length property, which gives the size of the array 
      > int [] scores = new int[4]; 
      System.out.println(scores.length) // Prints out 4

      > String [] names = new String[5]; 
      System.out.println(names.length) // Prints out 5

    * Relationship between last index and length of the array 
      * last index == length of the array - 1

  * 1 - D Array Object instantiation with data 
    1. Instantiated directly by initializing it with data: 
      > int [] scores = new int [] {85, 70, 95, 90};
      OR 
      > int [] scores = {85, 70, 95, 90}

      * YOU DON'T HAVE TO GIVE THE SIZE IF YOU DO IT THE FIRST WAY: 
        X int [] scores = new int[4] {85, 70, 95,90} ... this will give you a compliation error 

----------------------------------------

**MULTIDEMSIONAL ARRAYS** 
  * IS IMPLEMENTED AS ARRAY OF AN ARRAY 
  * SYNTAX for 2-D: 
      int[][]arr1; 
      int[]arr2[];
      int arr3[][];
  * SYNTAX for 3-D; 
      int[][][]arr1;
      int[][]arr2[];
      int[]arr3[][]; 
      int arr4[][][]; 

  * CONSTRUCT/INSTANTIATE TWO-D ARRAYS: 
    * use the keyword new, followed by the type and then finally specify the size within the first square brackets []. leave the 2nd square bracket as blank:
      1. Provide the size of 1st dimension:
        int[][]arr1; 
        arr1 = new int[3][]; 
      2. Provide size of both the dimensions: 
        int [] arr2= new int[3][3]; 

  ** IT IS ILLEGAL TO NOT INCLUDE THE SIZE OF THE 1ST DIMENSION... WILL GIVE A COMPLIATION ERROR 
    X int[][]arr3 = new int[]; 
    X int[][]arr4 = new int[][3]; 

  ** AS WITH 1-D ARRAY, IT IS ILLEGAL TO SPECIFY SIZE AT THE TIME OF THE DECLARATION... WILL GIVE AN COMPLIATION ERROR 
    X int[4][]arr5;
    X int[4][4]arr6;   


  * [[1,2], 
     [3,4], 
     [5,6]] 
   --> 1,3,5 represent the beginning of each row - there should be three rows
   --> 1, 3, 5 are in column 1 
   --> 2, 4, 6 are in column 2 
----------------------------------------

**ENHANCED FOR LOOPS FOR ARRAYS** 
  * AKA: for-each loop - introduced in JDK 5.0 
  * simplifies iterating through an array 
    * Example: 
      * Old way: 
        int [] arr = {10, 20, 30, 40, 50}
        for(int i = 0; i < arr.length; i++){
        System.out.println(arr[i]); 
      }

      * New way - using for-each loop:
        for(int x : arr) {
        System.out.println(x);  
      }

  * SYNTAX 

    for(declaration :expression) {...}
      * declaration: the varaible declaration, of a type compatible with the elements of the array you are accessing 
      * expression: this must evaluate to the array you want to loop through. the array can be of any type: primitive, objects, even arrays of arrays(multidimensional arrays)

  ** DO NOT USE ENHANCED FOR LOOP TO ENHANCE OR MODIFY THE DATA.... example is with the picture of (whyDoesntForEachModify.png) because it is able to assign and print it out for the first for-each... but once the second for each happens... you are exiting out of it... where the x can't be stored... thats why the numbers are all 0s.  
    --> with the original for loop... we access a particular array element using arrays index and we were able to modify the elements 

  ** DO NOT USE ENHANCED FOR LOOP TO PRINT ITEMS FROM BACKWARDS... ONLY THE ORIGINAL FOR LOOP CAN GO BOTH WAYS... ENHANCED CAN ONLY GO ONE DIRECTION

  ** DO NOT USE ENHANCED FOR LOOP TO COUNT HOW MANY TIMES IT WAS ITERATED.. because you would use a variable x that is within the enhanced for loop which is not accessible to the outside scope compared to the original for loop where you can declare the variable on the gloabl scope to be be accessed. 

* ENHANCED FOR LOOP FOR MULTIDIMENSIONAL ARRAYS 
  * refer to the picture of (forEachMultiDimensional.png) 
----------------------------------------
**COMMAND LINE ARGUMENTS** 

* type javac + Filename to compile the file - to check errors 

* type java + Filename -without the extension to run the file and get the output of the file 
  * the reason why this works because it will look for the file and the method call main... and it will print out everything in that method 

* type dirs to find out the pathway of the file 

**YOU HAVE TO COMPILE FIRST IN THE TERMINAL BEFORE RUNNING THE PROGRAM.. SO JAVAC THEN JAVA WITHOUT THE EXTENSION OF THE FILE** 

* HOW TO PASS VALUES THROUGH THE COMMAND LINE: 
  * java + className + arguments
    * EXAMPLE: 
      java CommandLine1 Red Green 
  * GREAT EXAMPLE WOULD BE THE FIBONACCI EXAMPLE!!! 

----------------------------------------

**PACKAGES** 
  * So normally if we don't specify the package... we most likely will be putting our files in the default package -aka a special name for a folder in java.

  * Example why we need packages:

  COMPANY 1  
    - So lets say that one company has a program - StringUtils.java and StringUtils.class - which reverses a name. 
      ** NORMALLY COMPANIES WILL PROVIDE THE .CLASS FILE - which are mostly comments and just a general idea of what the code is doing .. but no specifics like data. 
    - Let's say that someone wants to use company 1's StringUtils file... someone will just copy the .class file into the same folder as their project.. it runs perfectly fine. 

  COMPANY 2 
    - the second company may have the same file name as company one.. but the code is different - it concats two string variables together.
    - So you do the same thing... and it runs perfectly fine  

  PROBLEM: 
    - we create a new file call UseStringUtils3 where it uses both of the methods that company one and company two had... if we copy the class files into the same folder as ours... it'll try to rewrite eachother since the name is the same.. and we know that we can't change the file name at all due to other people using these files 

  SOLUTION:  
    - instead of putting the files in the same location... java can put these files in a different location and it can change the name of the de-classfied new name ... it will be in folder called com, under subfolders company 1 and company 2.. with files which are StringUtils.class... but the file name you will be using to important into the program you are using is com1.company.StringUtils and com.company2.StringUtils

** PACKAGES HAVE THE SYNTAX OF a.b.className -- a & b can be the folder and subfolder you place the .class file in

  * type javac -help to pull up all the things you can do in the command line
* type javac - d . fileName to generate the folders it needs to be created 

* HOW TO USE A PACKAGE CLASS IN ANOTHER CLASS 
  * lets say that you are using a file from another place and it has a pckage... well you must use the package name it is listed than the class name.. you can't just use the class name as StringUtils... you would have to use com1.company.StringUtils instead

    public class UseStringUtils3 {
      public static void main(String [] args) {
        String c = com1.company.StringUtils.concat("Vikky", "Luc");
        System.out.print(c);
      }
    }

  OR 

  * you can use import statement before the class is defined... that way you can use the class name instead. 

  EXAMPLE CODE: 
    import com.company2.StringUtils; 

    public class UseStringUtils3 {
      public static void main(String [] args) {
        String c = StringUtils.concat("Vikky", "Luc");
        System.out.print(c);
      }
    }

* IF YOU USE MULTIPLE OF PACKAGES/ IMPORTS.... THIS IS THE ORDER IN THE FILE: 
   1. PACKAGE 
   2. IMPORTS - instead of writing multiple of imports statements - or using multiple of classes from the same package ... use a WILDCARD which is an asterisk * in place of the class name

   import com.company2.*; 

    public class UseStringUtils3 {
      public static void main(String [] args) {
        String c = StringUtils.concat("Vikky", "Luc");
        System.out.print(c);
      }
    } 

   3. CLASS DECLARATION 
----------------------------------------

## Files in Program 
* src folder is where you save all the java files 
* File name should match the public class's name 

----------------------------------------
## SYNTAX 
* Semicolon must be at the end for every line in java 
	* but multiple semicolons are legal.. even if they don't make sense 
		* example: [picture of multiple semicolons](too_many_semi.png)

----------------------------------------
## Miscellanos 
* javadoc command is used to generate documents for code   
* you can have a lot of white space in side the if-else blocks.. it will still be ran - it won't throw an error 

## SHORTCUT 
* sout + tab will type out System.out.println("Hello World");
* up arrow + F6 will select all the variables / classes / method naming convention and change it
* psvm + tab will generate the main method
* ctrl + shift + / will make it into a comment the highlighting part of the code  