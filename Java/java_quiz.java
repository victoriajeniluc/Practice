
// Question 1: What is the output of the following code? 
	
	public class Test_byte {
		public static void main(String[] args) {
			byte b1 = (byte) (127 + 21);
			System.out.println(b1);
		}
	} 
	// Answer: 127 + 21 = 148 = 00000000 00000000 00000000 10010100 Above binary number is +ve, as left most bit is 0. Same binary number after type-casting to byte: 10010100, -ve number as left most bit is 1. 10010100 = -108.

// Question 2: What is the output of the following code? 

	public class DivModTest {
    public static void main(String[] args) {
        System.out.println( 23 / 2.0 );
        System.out.println( 23 % 2.0 );
    }
	}
	// Answer: As floating point numbers are used in the expression, hence result should be in floating point number. Correct result is: 23 / 2.0 = 11.5 23 % 2.0 = 1.0

// Question 3: What is the output of the following code?

	public class Concat1 {
    public static void main(String[] args) {
        System.out.println("Hello" + 1 + 2 + 3 + 4);
    }
	} 
	// Answer: As expression contains + operator only, which is left to right associative. Let us group the expression. "Hello" + 1 + 2 + 3 + 4 = ("Hello" + 1) + 2 + 3 + 4 = (("Hello" + 1) + 2) + 3 + 4 = ((("Hello" + 1) + 2) + 3) + 4 [Let us solve it now, + operator with String behaves as concatenation operator.] = (("Hello1" + 2) + 3) + 4 = ("Hello12" + 3) + 4 = "Hello123" + 4 = "Hello1234"

// Question 4: What is the output of the following code?

	public class Concat2 {
    public static void main(String[] args) {
        System.out.println(1 + 2 + 3 + 4 + "Hello");
    }
	}
		// Answer: As expression contains + operator only, which is left to right associative. Let us group the expression. 1 + 2 + 3 + 4 + "Hello" = (1 + 2) + 3 + 4 + "Hello" = ((1 + 2) + 3) + 4 + "Hello" = (((1 + 2) + 3) + 4) + "Hello" [Let us solve it now,] = ((3 + 3) + 4) + "Hello" = (6 + 4) + "Hello" = 10 + "Hello" [+ operator with String behaves as concatenation operator.] = 10Hello

// Question 5: What is the output of the following code?

	public class EqualityTest {
    public static void main(String[] args) {
        System.out.println("Output is: " + 10 != 5);
    }
	}
		// Answer: Binary plus (+) has got higher precedence than != operator. Let us group the expression. "Output is: " + 10 != 5 = ("Output is: " + 10) != 5 [!= is binary operator, so we have to evaluate the left side first. + operator behaves as concatenation operator.] = "Output is: 10" != 5 Left side of above expression is String, and right side is int. But String can't be compared to int hence compilation error.

// Question 6: What is the output of following code?

public class EqTest {
    public static void main(String[] args) {
        System.out.println("Output is: " + (10 != 5));
    }
}
		// Answer: "Output is: " + (10 != 5) [Nothing to evaluate at left side, so let's evaluate the right side of +, 10 != 5 is true.] = "Output is: " + true [+ operator behaves as concatenation operator] = "Output is: true"

//Question 7:Range of short data type is -32768 to 32767.
		// Answer: true 

// Question 8: What is the output of following code?

	public class Bonus {
    public static void main(String[] args) {
        int ₹ = 80000; //₹ represents Indian Rupee symbol
        String msg = (₹ >= 50000) ? "Good bonus" : "Average bonus";
        System.out.println(msg);
    }
	}
		// Answer: Indian rupee symbol(₹) is valid identifier. ₹ = 80000 This is an example of ternary operator. First operand (₹ >= 50000) is a boolean expression which is true, as 80000 >= 50000 is true. msg will refer to "Good bonus".

// Question 9: What is the output of following code?

	public class Problem {
    public static void main(String[] args) {
        int a = 20;
        int var = ((19) * (19)) + ((20) - (18));
        System.out.println("a = " + a);
        System.out.println("var = " + var);
    }
	}
		// Answer: Correct. int var = --a * a++ + a-- - --a; int var = --a * (a++) + (a--) - --a; int var = (--a) * (a++) + (a--) - (--a); int var = ((--a) * (a++)) + (a--) - (--a); int var = (((--a) * (a++)) + (a--)) - (--a); [Solve the above equation now. - operator is binary operator, so let us solve the left side first] int var = ((19 * (a++)) + (a--)) - (--a); //a = 19 int var = ((19 * 19) + (a--)) - (--a); //a = 20 int var = (361 + 20) - (--a); //a = 19 int var = 381 - (--a); //a = 19 int var = 381 - 18; //a = 18 int var = 363 // a = 18 So, a = 18 var = 363

// What is the output of following code?

	public class Problem2 {
    public static void main(String[] args) {
        int a = 7;
        boolean res = a++ == 7 && ++a == 9 || a++ == 9;
        System.out.println("a = " + a);
        System.out.println("res = " + res);
    }
	}

		// Answer: boolean res = a++ == 7 && ++a == 9 || a++ == 9; boolean res = (((a++) == 7) && ((++a) == 9)) || ((a++) == 9); [Solve the above equation now. || operator is binary operator, so let us solve the left side first] boolean res = ((7 == 7) && ((++a) == 9)) || ((a++) == 9); //a = 8 boolean res = (true && ((++a) == 9)) || ((a++) == 9); //a = 8 boolean res = (true && (9 == 9)) || ((a++) == 9); //a = 9 boolean res = (true && true) || ((a++) == 9); //a = 9 boolean res = true || ((a++) == 9); //a = 9 boolean res = true; //a = 9 So, a = 9 res = true

// What is the output of this? 
    public class IfElseQuest1 {
        public static void main(String[] args) {
            int score = 45; 

            if(score > 60) 
                System.out.println("Congrats!");
                System.out.println("You passed!");
            else 
                System.out.println("You failed...");
        }
    }

        // Answer: Compliation error since the curly braces are not in between the if - else... it's not like the if statement at all! 

// What is the output of this? 
    public class IfElseQuest2 {
        public static void main(String[] args) {
            int flag = 1;
            if(flag = 1) ;
                System.out.println("Start");
            else 
                System.out.println("Stop");
        }
    }

        // Answer: Compliation error because the '=' is not a boolean operator used to compare in the conditional... it is to assign the value of 1 to flag (aka assignment operator)
        // ONLY BOOLEAN OPERATORS ARE USED IN THE IF STATEMENT!!!

// What is the output of this? 
    public class IfElseQuest2 {
        public static void main(String[] args) {
            int flag = false;
            if(flag = true) ;
                System.out.println("Start");
            else 
                System.out.println("Stop");
        }
    }

        // Answer: "START" because the value of flag will be changed to true.. then it will read: IF (REASSIGNED TO TRUE.. which becomes true) PRINT OUT START ELSE PRINT OUT STOP 

// What is the output of this? 
    public class IfElseQuest2 {
        public static void main(String[] args) {
            int flag = true;
            if(flag) ;
                System.out.println("Start");
            else 
                System.out.println("Stop");
        }
    }

        // Answer: "START" because it will run the statement like the previous example... and read it as: IF TRUE THEN PRINT OUT START ELSE STOP  

// What will be the result of compiling and executing following program?

public class IfTest1 {
    public static void main(String[] args) {
        int grade = 75;
        if(grade > 60)
            System.out.println("Congratulations");
            System.out.println("You passed");
        else
            System.out.println("You failed");
 
    }
}
    
        // Answer: As there is no brackets after if, hence only one statement is part of if block and other is outside. Above code can be written as below: if(grade > 60) { System.out.println("Congratulations"); } System.out.println("You passed"); else System.out.println("You failed"); There should not be anything between if-else block but in this case, System.out.println("You passed"); is between if-else and thus Compilation error.

// What will be the result of compiling and executing following program?

public class IfTest2 {
    public static void main(String[] args) {
        int grade = 60;
        if(grade = 60)
            System.out.println("You passed...");
        else
            System.out.println("You failed...");
    }
}
    // Answer: Following are allowed in boolean expression of if statement: 1. Any expression whose result is either true or false. e.g. age > 20 2. A boolean variable. e.g. flag 3. A boolean literal: true or false 4. A boolean assignment. e.g. flag = true boolean expression in this case is: (grade = 60), which is an int assignment and not boolean assignment. Hence Compilation error.

// What is the output of following code?

public class Switch1 {
    public static void main(String[] args) {
        int x = 2;
        switch (x) {
            case 1:
                System.out.println("x is equal to 1");
                break;
            case 2:
                System.out.println("x is equal to 2");
                break;
            case 3: 
                System.out.println("x is equal to 3");
                break;
            default:
                System.out.println("Still no idea what x is");
        }
    }
}
    // Answer: Reason: Matching case is found, System.out.println("x is equal to 2"); is executed. After that break; statement takes the control out of switch-case block.

// What is the output of following code?

public class Switch2 {
    public static void main(String[] args) {
        int x = 4;
        switch (x) {
            default:
                System.out.println("Still no idea what x is");
            case 1:
                System.out.println("x is equal to 1");
                break;
            case 2:
                System.out.println("x is equal to 2");
                break;
            case 3: 
                System.out.println("x is equal to 3");
                break;
        }
    }
}

    // Answer: No matching case found, control enters default block. "Still no idea what x is" is printed on to the console. No break statement, hence fall-through starts. Prints "x is equal to 1" on to the console. After that break; statement takes the control out of the switch- case block.

// What will be the result of compiling and executing following program?

public class Switch3 {
    public static void main(String[] args) {
        int a = 5;
        int x = 10;
        switch(x) {
            case 10:
                a *= 2;
            case 20:
                a *= 3;
            case 30:
                a *= 4;
        }
        System.out.println(a);
    }
}

    // Answer: Matching case block "case 10:" is found, a *= 2; is executed, which means a = a * 2; => a = 5 * 2; => a = 10; No break statement, hence it enters in fall-through. a *= 3; is executed, which means a = a * 3; => a = 10 * 3; => a = 30; a *= 4; is executed, which means a = a * 4; => a = 30 * 4; => a = 120;

// What will be the result of compiling and executing following program?

public class Switch4 {
    public static void main(String[] args) {
        int score = 60;
        switch (score) {
            default:
                System.out.println("Not a valid score");
            case score < 70:
                System.out.println("Failed");
                break;
            case score >= 70:
                System.out.println("Passed");
                break;
        }
    }
}
    // Answer: case values must evaluate to the same type / compatible type as the switch expression can use. switch expression can accept following: char or Character byte or Byte short or Short int or Integer An enum only from Java 6 A String expression only from Java 7 In this case, switch expressin [switch (score)] is of int type. But case expressions, score < 70 and score >= 70 are of boolean type and hence compilation error.

// What will be the result of compiling and executing following program?

public class Switch5 {
    public static void main(String[] args) {
        byte var = 100;
        switch(var) {
            case 100:
                System.out.println("var is 100");
                break;
            case 200:
                System.out.println("var is 200");
                break;
            default:
                System.out.println("In default");
        }
    }
}
    // Answer: case values must evaluate to the same type / compatible type as the switch expression can use. switch expression can accept following: char or Character byte or Byte short or Short int or Integer An enum only from Java 6 A String expression only from Java 7 In this case, switch expressin [switch (var)] is of byte type. byte range is from -128 to 127. But in case expression [case 200], 200 is outside byte range and hence compilation error.

// Which of the following statement is correct for below code?

public class WhileTest1 {
    public static void main(String[] args) {
        final boolean flag = false;
        while(flag) {
            System.out.println("Good Morning!");
        }
    }
}
    // Answer: final boolean flag = false; statement makes flag a compile time constant. Compiler knows the value of flag, which is false, at compile time and hence it gives "Unreachable Code" error. Check the lecture on switch-case block to know more about compile time constants.

//Which of the following statement is correct for below code?

public class WhileTest2 {
    public static void main(String[] args) {
        final boolean flag;
        flag = false;
        while(flag) {
            System.out.println("Good Morning!");
        }
    }
}
    // Answer: final boolean flag; flag = false; doesn't make flag a compile time constant. Compiler doesn't know flag's value at compile-time and hence it allows this syntax. At runtime, as boolean expression of while loop is false, loop doesn't execute even once and hence no output. Check the lecture on switch-case block to know more about compile time constants.

// What will be the result of compiling and executing following program?

public class WhileTest3 {
    public static void main(String[] args) {
        int x = 5;
        while (x < 10) 
            System.out.println(x);
            x++;
    }
}
    // Answer: while loop doesn't have curly bracket over here, so only System.out.println(x) belongs to while loop. Above syntax can be written as follows: int x = 5; while (x < 10) { System.out.println(x); } x++; As x++; is outside loop, hence value of x is always 5 within loop, 5 < 10 is true for all the iterations and hence infinite loop.

// Which of the following statement is correct?

public class DoWhileTest1 {
    public static void main(String[] args) {
        do {
            System.out.println(100);
        } while (true);
        
        System.out.println("Bye");
    }
}
    // Answer: Boolean expression of do-while loop uses literal true (compile-time constant), hence Java compiler knows that this loop is an infinte loop. It also knows that once at runtime Java Control enters an infinite loop, none of the statements after loop block will get executed. Hence it marks all the codes after infinite loop as Unreachable Code, which results in compilation error. If boolean variable was used instead of boolean literal, then this program would have compiled and executed successfully.

//Which of the following statement is correct?

public class DoWhileTest2 {
    public static void main(String[] args) {
        do {
            System.out.println(100);
        } while (false);
 
        System.out.println("Bye");
    }
}
    // Answer: As do-while loop executes at least once, hence none of the code is unreachable in this case. Java runtime prints 100 to the console, then it checks boolean expression, which is false. Hence control goes out of do-while block. Java runtime executes 2nd System.out.println statement to print "Bye" on to the console.

// What will be the result of compiling and executing following program?

public class DoWhileTest3 {
    public static void main(String[] args) {
        int start = 1;
        int sum = 0;
        do {
            if(start % 2 == 0) {
                continue;
            }
            sum += start;
        } while(++start <= 10);
        System.out.println(sum);
    }
}
    // Answer: When start is divisible by 2 [2, 4, 6, 8, 10], continue; statement takes the control to boolean expression and hence sum += start; is not executed. Hence result is the sum of numbers 1,3,5,7,9.

// What will be the result of compiling and executing following program?

public class ForLoop2 {
    public static void main(String[] args) {
        for(int i=0; i<=2; i++){}
        System.out.println(i);
    }
}
    // Answer: Variable i is declared inside for loop, hence it is not accessible beyond loop's body. System.out.println(i); gives compilation error.

//What will be the result of compiling and executing following program?

public class ForLoop1 {
    public static void main(String[] args) {
        int i;
        for(i=0; i<=2; i++){}
        System.out.println(i);
    }
}
    //Answer: There is nothing inside loop body, hence loop body is blank. This loop executes 3 times, for i = 0, i = 1 and i = 2. For i = 3, control goes out of the for loop. Now, as i is declared outside for loop, hence it is accessible outside loop body. System.out.println(i); prints 3 to the console.

// What will be the result of compiling and executing following program?

public class ForLoop3 {
    public static void main(String[] args) {
        for:
        for (int i = 2; i <= 100; i = i + 2) {
            for(int j = 1; j <= 10; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();
            if(i == 10) {
                break for;
            }
        }
    }
}
    // Answer: for is a keyword and hence can't be used as a lable. Java labels follow the identifier naming rules and one rule is that we can't use java keywords as identifier. Hence, Compilation error.

// What will be the result of compiling and executing following program?

public class NestedLoops1 {
    public static void main(String[] args) {
        int i;
        outer: 
        do {
            i = 5;
            inner:
            while (true) {
                System.out.println(i--);
                if (i == 4) {
                    break outer;
                }
            }
        } while (true);
    }
}
    // Answer: "outer" and "inner" are valid label names. On execution, control enters main method and creates int variable i. On encountering do-while loop, control goes inside and initializes variable i to 5. Then it executes while loop and it's boolean expression is always true. System.out.println(i--); prints 5 to the console first, and then decrements the value of i by 1. So, i becomes 4. Boolean expression of if(i == 4) evaluates to true. break outer; statement executes and takes the control out of do-while loop. main method ends and program terminates successfully. So, 5 gets printed only once.

// What will be the result of compiling and executing following program?

public class NestedLoops2 {
    public static void main(String[] args) {
        int i;
        outer: 
        do {
            i = 5;
            inner:
            while (true) {
                System.out.println(i--);
                if (i == 4) {
                    break;
                }
            }
        } while (true);
    }
}
    // Answer: "outer" and "inner" are valid label names. It prints 5 in an infinite loop. 

// What will be the result of compiling and executing following program?

public class ArrayTest1 {
    public static void main(String[] args) {
        String msg = "Hello";
        boolean [] flag = new boolean[1];
        if(flag[0]) {
            msg = "Welcome";
        }
        System.out.println(msg);
    }
}
    // Answer: Variable msg is referring to String object "Hello". There is only one element in boolean array object and it is initialized to default value of boolean, which is false. flag[0] is false, if-check fails and control doesn't enter if block. System.out.println(msg) prints original value of msg, which is "Hello". 

//Which of the following array declarations and initializations is NOT legal?
    // A) char [] arr1 [] = new char[5][]; 
    // B) int [] arr2 = {1, 2, 3, 4, 5};
    // C) int [] arr3 = new int[3]{10, 20, 30};
    // D) byte [] val = new byte[10]; 
        // Answer: Options A, B and D are valid syntaxes to create array objects. Option C will give compilation error as we can't specify size at the time of initializing with data. new int[3]{10, 20, 30}; gives compilation error.

//What will be the result of compiling and executing following program?

public class ArrayTest3 {
    public static void main(String[] args) {
        String [] arr = new String[7];
        System.out.println(arr);
    }
}
    // Answer: Variable arr refers to an array object of String of 7 elements. Variable arr contains the memory address of String array object. arr is of reference type, hence it prints some String Containing @ symbol. We will talk on this more after Inheritance lecture.

// Which is the correct way to find the number of elements in an array object? Consider array variable name is arr.
    // A) arr.length()
    // B) arr.size()
    // C) arr.length 
    // D) arr.size
        // Answer: C - All array objects have length property, which is used to find out number of elements in the array object.

// What will be the result of compiling and executing following program?

public class ArrayTest4 {
    public static void main(String[] args) {
        int [] arr = {200, 100, 300, 400};
        for (int i = arr.length - 1; i >= 0; ){
            System.out.print(arr[i--] + " ");
        }
    }
}
    // Answer: 400 300 100 200 - Regular for loop starts with last index of the array [ last index = length of the array - 1] and runs till i >=0. There is no step expression but variable i is decremented by 1 in System.out.print(arr[i--] + " "); statement. Thus given for loop prints array elements in reverse order, last element to first element.

// What will be the result of compiling and executing following program?

public class ArrayTest5 {
    public static void main(String[] args) {
        char [][] arr = {
                {'A', 'B', 'C'},
                {'D', 'E', 'F'},
                {'G', 'H', 'I'}
        };
        
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][1]);
            }
            System.out.println();
        }
    }
}
    // Answer: NOTE: System.out.print statement is printing arr[i][1], which means it prints 2nd array element of a particular row, for each iteration of inner loop. That is why output is: BBB EEE HHH To get all the array elements printed correctly, use arr[i][j] in System.out.print statement.

// What will be the result of compiling and executing following program?

public class ArrayTest6 {
     public static void main(String[] args) {
         int [] arr = new int[2];
         arr[0] = 100;
         arr[1] = 200;
         arr = new int[2];
         for(int x : arr) {
             System.out.print(x + " ");
         }
     }
}
    // Answer: Initially, arr refers to an array object of 2 elements. 1st array element is 100 and 2nd array element is 200. Consider the statement, arr = new int[2]; Variable arr now refers to another array object of 2 elements, whose elements are initialized to default value of int, which is 0. So for loop prints, 0 0

// What will be the result of compiling and executing following program?

public class ArrayTest7 {
    public static void main(String[] args) {
        int [] arr1 = {1, 2, 3};
 
        //Ascii value of 'A' is 65, 'B' is 66
        int [] arr2 = {'A', 'B'};
        
        arr1 = arr2;
        for(int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
    }
}
    //Answer: Initially arr1 refers to an int array object of 3 elements: 1, 2, 3 And arr2 refers to an int array object of 2 elements: 65, 66 [char type is compatible with int type] Consider the statement arr1 = arr2; Variable arr1 copies the content of arr2. As arr2 refers to an int array object of 2 elements: 65, 66 so do arr1. for loop prints all the elements of an array object referred by arr1, which is 65 66

// What will be the result of compiling and executing following program?

public class ArrayTest8 {
    public static void main(String[] args) {
        int [] arr1 = {1, 2, 3};
 
        //Ascii value of 'A' is 65, 'B' is 66
        char [] arr2 = {'A', 'B'}; 
        
        arr1 = arr2;
        for(int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
    }
}
    // Answer: Initially arr1 refers to an int array object of 3 elements: 1, 2, 3 And arr2 refers to an char array object of 2 elements: 'A', 'B' Statement arr1 = arr2; gives compilation error as char [] is not compatible with int [] even though char is compatible with int.

// Which of the following array declarations give compilation error?

    // A) int [][] arr1;
    // B) int [] arr2 [];
    // C) int [][][] arr3;
    // D) int arr4[3];
        //Answer: D - Array size can't be specified at the time of declaration.

// What is the output if below program is run with the command line:
java ArrayTest10 Red Green Blue

public class ArrayTest10 {
    public static void main(String[] args) {
        System.out.print(args[1] + ", " + args[2]);
    }
}
    // Answer: Green, Blue - args refers to a String array object of size 3. Element at index 0 refers to "Red", Element at index 1 refers to "Green" & Element at index 2 refers to "Blue". In System.out.print statement we are printing element at index 1 and 2 and thus output is: Green, Blue

// What is the output if below program is run with the command line:
java ArrayTest11

public class ArrayTest11 {
    public static void main(String[] args) {
        System.out.println(args.length);
    }
}
    // Answer: We have not passed any command-line arguments, hence args refers to an array object of Size 0. args.length prints 0. args is not null and hence no NullPointerException. Also we are not accessing array element so no question of ArrayIndexOutOfBoundsException as well.

// Which of the following is true for code below?

public class ArrayTest12 {
    public static void main(String[] args) {
        char arr[] = {'A', 'E', 'I', 'O', 'U'};
        int i = 0;
        while (arr[i++] != '\u0000') {
            System.out.println(i);
        }
        System.out.println(i);
    }
}
    // Answer: 1st iteration, arr[0] != '\u0000' (true), i = 1, Prints: 1 2nd iteration, arr[1] != '\u0000' (true), i = 2, Prints: 2 3rd iteration, arr[2] != '\u0000' (true), i = 3, Prints: 3 4th iteration, arr[3] != '\u0000' (true), i = 4, Prints: 4 5th iteration, arr[4] != '\u0000' (true), i = 5, Prints: 5 6th iteration, arr[5] != '\u0000' -> this throws ArrayIndexOutOfBoundsException. No compilation error, and 0 and 6 are not in the output. Output contains number from 1 to 5 and after that exception is thrown.

// Which of the following is true for code below?

public class ArrayTest9 {
    public static void main(String[] args) {
        byte [] arr = new byte[0];
        System.out.println(arr[0]);
    }
}
    // Answer arr refers to an array object of size 0. That means arr stores some memory address. So we will not get NullPointerException in this case. But index 0 is not available for an array object of size 0 and thus ArrayIndexOutOfBoundsException is thrown at runtime.

// Which of the following is not a valid array declaration?

    // A) int [] arr1 = new int[8];
    // B) int [][] arr2 = new int[8][8];
    // C) int [] arr3 [] = new int[8][];
    // D) int arr4[][] = new int[][8];
        // Answer: D - 1st array dimension must be specified at the time of declaration.


// Which of the following correctly imports Animal class from com.jimcorbett package?
    // A) Import com.jimcorbett.Animal;
    // B) import com.jimcorbett; 
    // C) import com.jimcorbett*; 
    // D) Import com.jimcorbett.Animal;
        // Answer: C - Following import statements are correct: import com.jimcorbett.*; import com.jimcorbett.Animal; Note, all small case letters in import keyword.

// Which of the following is the correct package declaration to declare Test class in com.university.exam package?
    // A) package com.university.exam.Test;
    // B) package com.university.exam; 
    // C) package com.university.exam.*;
    // D) Package com.university.exam;
        // Answer: B - To declare Test class in com.university.exam package, use following declaration: package com.university.exam; No wildcard (*) allowed in package declaration. Don't include class name in package declaration. Note, all small case letters in package keyword.

// System class belongs to which package? 
    // A) java.lang
    // B) java.io
    // C) com.java.lang
    // D) com.lang
        // Answer: A - java.lang package contains classes that are fundamental to the design of the Java programming language. Some of the classes available under java.lang package are: String, System, Object, StringBuffer, all Wrapper classes etc.


// What is the output of the following code, if input String is "Welcome"?

import java.util.Scanner;
public class Scan01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner();
        String msg = scan.nextLine();
        System.out.println(msg + "!");
        scan.close();
    }
}
    // Answer: new Scanner(); statement doesn't have any parameter and hence compilation error.

//What will be the result of compiling and executing following program?

public class String1 {
    public static void main(String[] args) {
        String str = "Java Rocks!";
        System.out.println(str.length() + " : " + str.charAt(10));
    }
}
    //Answer: String class has length() method, which returns number of characters in the String. So length() method returns 11. String class has charAt(int index) method, which returns character at passed index. str.charAt(10) looks for character at index 10. index starts with 0. ! sign is at index 10. Hence output is: 11 : !

// What will be the result of compiling and executing following program?

public class String2 {
    public static void main(String[] args) {
        String s1 = "JaCk";
        String s2 = "jAcK";
        System.out.println(s1.equals(s2));
    }
}
    // Answer: equals(String str) method of String class matches two String objects and it takes character's case into account while matching. Alpahbet A in upper case and alphabet a in lower case are not equal according to this method. As String objects referred by s1 and s2 have different cases, hence output is false.

//What will be the result of compiling and executing following program?

public class String3 {
    public static void main(String[] args) {
        String fName = "Udayan";
        String lName = "Khattry";
        System.out.println(fName = lName);
    }
}
    // Answer: Both fName and lName are of reference type. fName refers to "Udayan" and lName refers to "Khattry" In System.out.println() statement, we have used assignment operator (=) and not equality operator (==). So result is never boolean. fName = lName means copy the contents of lName to fName. As lName is referring to "Khattry" and so after the assignment, fName starts referring to "Khattry" as well. System.out.println() finally prints the String referred by fName, which is "Khattry". This option is is not available, hence correct answer is D(none of the above).

//Consider following code snippet:

package com.udayan.test;
 
public class Exam {
    public static void main(String [] args) {
        System.out.println("All the best!");
    }
}
// Location of Exam.java file:

// D:\WORK\QUIZ\SEC07
// ├───classes
// └───src
//     └───com
//         └───udayan
//             └───test
//                     Exam.java
// You are currently at Sec07 folder.

// D:\WORK\Quiz\Sec07>

// Type javac command from above location to generate Exam.class file structure under classes directory.

// D:\WORK\QUIZ\SEC07
// ├───classes
// │   └───com
// │       └───udayan
// │           └───test
// │                   Exam.class
// │
// └───src
//     └───com
//         └───udayan
//             └───test
//                     Exam.java

    // Answer: javac -d classes\ src\com\udayan\test\Exam.java, correct. Go through the lectrues for details

// Consider following code snippet:

package com.udayan.test;
 
public class Exam {
    public static void main(String [] args) {
        System.out.println("All the best!");
    }
}
// Location of files:

// D:\WORK\QUIZ\SEC07
// ├───classes
// │   └───com
// │       └───udayan
// │           └───test
// │                   Exam.class
// │
// └───src
//     └───com
//         └───udayan
//             └───test
//                     Exam.java
// You are currently at WORK folder.

// D:\WORK>

// Which of the following java command will show All the best! on  the console?
    // Answer: Option D is correct as it correctly specifies the classpath (Quiz\Sec07\classes\) which contains whole path of the class(com\udayan\test\Exam.class).

//What is the output of the following code, if input String is A? Note, ASCII value of A is 65.

import java.util.Scanner;
public class Scan02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.close();
        System.out.println(num);
    }
}
    //Answer: Even though int and char are compatible and following works: int x = 'A'; System.out.println(x); // -> 65 But Scanner class accepts all the inputs as String and later on converts it to a particular type. For nextBoolean() method, input String is converted to boolean type For nextDouble() method, input String is converted to double type For nextInt() method, input String is converted to int type and so on. So in this case, internally nextInt() method tries to convert "A" to int and java.util.InputMismatchException is thrown.

// Which of the following can be used as a constructor for the class given below?

public class Animal {

}
    // Answer: public Animal(String str){ } - Constructors don't have return type.This is a valid syntax of parameterized constructor

// What will be the result of compiling and executing the following program?

public class Greetings {
 String msg = null;
 
 public Greetings() {
 this("Good Morning!");
 }
 
 public Greetings(String str) {
 msg = str;
 }
 
 public void displayMsg() {
 System.out.println(msg);
 }
 
 public static void main(String [] args) {
 Greetings g1 = new Greetings();
 Greetings g2 = new Greetings("Good Evening!");
 g1.displayMsg();
 g2.displayMsg();
 }
}
    // Answer: Good Morning! Good Evening! - Greetings g1 = new Greetings(); invokes no-arg constructor. No-arg constructor calls parameterized constructor with the argument "Good Morning!" Parameterized constructor assigns "Good Morning!" to msg variable of the object referred by g1. Greetings g2 = new Greetings("Good Evening!"); invokes parameterized constructor, which assigns "Good Evening!" to msg variable of the object referred by g2. g1.displayMsg(); prints Good Morning! g2.displayMsg(); prints Good Evening!

// What will be the result of compiling and executing the following program?

public class Greetings2 {
    String msg = null;
    public Greetings2() {
    }
    
    public Greetings2(String str) {
        msg = str;
    }
    
    public void displayMsg() {
        System.out.println(msg);
    }
    
    public static void main(String [] args) {
        Greetings2 g1 = new Greetings2();
        Greetings2 g2 = new Greetings2("Good Evening!");
        g1.displayMsg();
        g1.displayMsg();
    }
}
    // Answer: null null - Greetings2 g1 = new Greetings2(); invokes no-arg constructor. Property msg (of object referred by g1) is assigned to null. Greetings g2 = new Greetings("Good Evening!"); invokes parameterized constructor, which assigns "Good Evening!" to msg of object referred by g2. g1.displayMsg(); prints null Again we have same call g1.displayMsg(); which prints null. NOTE: We haven't called displayMsg() on object referred by g2.

// What will be the result of compiling and executing the following program?

public class Test1 {
    int i = -1;
    public Test1(int num) {
        this.i = num;
    }
    
    public void print() {
        System.out.println(this.i);
    }
    
    public static void main(String[] args) {
        Test1 obj = new Test1();
        obj.print();
    }
}
    // Answer: compliation error - new Test1(); invokes no-arg constructor but as we have parameterized constructor available in the Test1 class, java compiler doesn't add default constructor and hence we get Compilation error.

// What will be the result of compiling and executing the following program?

public class Test2 {
    public String name;
    public void Test2() {
        name = "Jack";
    }
    
    public static void main(String [] args) {
        Test2 obj = new Test2();
        System.out.println(obj.name);
    }
}
    // Answer: null -public void Test2() is method and not constructor, as return type is void. method can have same name as the class name, so no issues with Test2() method declaration. As there are no constructors available for this class, java compiler adds following constructor. public Test2() {} Test2 obj = new Test2(); invokes the default constructor but it doesn't change the value of name property (by default null is assigned to name property) System.out.println(obj.name); prints null.

// What will be the result of compiling and executing the following program?

public class Test3 {
    
    public static void method1(int num) {
        num = 2;
        System.out.println(num);
    }
    
    public static void method2(int num) {
        num++;
        System.out.println(num);
    }
    
    public static void main(String[] args) {
        int i1 = 1;
        Test3.method1(i1);
        System.out.println(i1);
        Test3.method2(i1);
        System.out.println(i1);
    }
}
    // Answer: 2 1 2 1 - It is pass-by-value scheme. On method invocation, parameter variable num gets a copy and changes are made to this copy inside the method. Original value of i1 stay intact.

// What will be the result of compiling and executing Test4.java?

//Message.java
public class Message {
    String msg = "Welcome!";
    
    public void print() {
        System.out.println(msg);
    }
}
 
//Test4.java
public class Test4 {
    public static void m1(Message m) {
        m.msg = "Good Night!";
    }
    
    public static void m2(Message m) {
        m = new Message();
        m.msg = "Good Morning!";
    }
    
    public static void main(String [] args) {
        Message obj = new Message();
        obj.print();
        Test4.m2(obj);
        obj.print();
        Test4.m1(obj);
        obj.print();
    }
}
    // Answer: Welcome! Welcome! Good Night! - It is pass-by-reference scheme. Method m1(Message) modifies msg property of passed object, whereas method m2(Message) modifies msg property of another object. Initially, msg = "Welcome!" call to m2() doesn't change msg properly, so msg is still "Welcome!" but call to m1() changes the msg property to "Good Night!" Hence in the output, we get: Welcome! Welcome! Good Night!

// What will be the result of compiling and executing the following program?

public class Test5 {
    public static void m1() {
        System.out.println("static method.");
    }
    
    public static void main(String[] args) {
        Test5 obj = null;
        obj.m1();
    }
}
    // Answer: static method - m1() is static method of class Test5. So correct syntax to call method m1() is Test5.m1(); but static methods can also be invoked using reference variable: obj.m1(); Warning is displayed in this case. Even though obj has null value, we don't get NullPointerException as objects are not needed to call static methods.

// What will be the result of attempting to compile and run the following program?

public class Test6 {
    public static void m1() {
        m2();
        System.out.println("m1");
    }
    
    public static void m2() {
        Test6.m3();
        System.out.println("m2");
    }
    
    public static void m3() {
        System.out.println("m3");
    }
    
    public static void main(String[] args) {
        m1();
    }
}
    // Answer: m3 m2 m1 - Static method of a class can invoke other static methods. As all the methods are in same class hence using <class_name> and dot operator is not compulsory. But if used no issues as well. Hence both the calls: m2(); and Test6.m3(); will execute successfully.

// When does a class get the default constructor?
    // Answer: if the class does not define any constructors explicity - Default constructor (which is no-argument constructor) is added by Java compiler, only if there are no constructors in the class.

// What will be the result of compiling and executing the following program?

public class Wall {
    public static void main(String args[]) {
        double area = 7.5;
        String color;
        if (area < 5)
            color = "green";
        
        System.out.println(color);
    }
}
    // Answer: Compliation error - color is LOCAL variable and it must be initialized before it can be used. As area is not complie time constant, java compiler doesn't have an idea of the value of variable area. There is no else block available as well. So compiler cannot be sure of whether variable color will be initialized or not. So it gives compilation error at System.out.println(color);

// For the class Mango, which option, if used to replace /* INSERT CODE HERE */, will print GREEN on to the console?

public class Mango {
    public String color;
    
    public Mango(String color) {
        /* INSERT CODE HERE */
    }
    
    public static void main(String [] args) {
        Mango mango = new Mango("GREEN");
        System.out.println(mango.color);
    }
}
    // Answer: this.color = color; Instance variable color is shadowed by the parameter variable color of parameterized constructor. So, color = color will have no effect, because short hand notation within constructor body will always refer to LOCAL variable. To refer to instance variable, this reference is needed. Hence Option B is correct. 'color = GREEN;' and 'this.color = GREEN;' causes compilation error as GREEN is not within double quotes(""). NOTE: 'color = "GREEN";' will only assign 'GREEN' to local variable and not instance variable but 'this.color = "GREEN";' will assign 'GREEN' to instance variable.

// What will be the result of compiling and executing TestStudent.java file?

//TestStudent.java
class Student {
    String name;
    int age;
    boolean result;
    double height;
}
 
public class TestStudent {
    public static void main(String[] args) {
        Student stud = new Student();
        System.out.println(stud.name + stud.height + stud.result + stud.age);
    }
}
    // Answer: name, height, result and age are instance variables of Student class. And instance variables are initialized to their respective default values. name is initialized to null, age to 0, result to false and height to 0.0. Statement System.out.println(stud.name + stud.height + stud.result + stud.age); prints null0.0false0

// this keyword in java refers to:
    // Answer: Variable this in java refers to currently executing object.

// Given:

public class Initializer {
    static int a = 10000;
 
    static {
        --a;
    }
 
    {
        ++a;
    }
 
    public static void main(String[] args) {
        System.out.println(a);
    }
}
// What is the result?
    // Answer: 9999- We can write statements inside initialization blocks, variable 'a' is of static type so both static and instance initialization blocks can access it.We have not created instance of Initializer class, so instance initialization block is not executed.Execution of static initialization block decrements the value of 'a' by 1. Hence the output is 9999.

// What will be the result of compiling and executing  following program?

public class Test7 {
    public static void main(String[] args) {
        double price = 5000;
        String model;
        if(price > 5000) {
            model = "A001";
        } else if(price <= 5000) {
            model = "A002";
        }
        System.out.println(model);
    }
}
    // Answer: In this case we have used "if - else if" block and not "if - else" block. Value of price variable is not known to the compiler as variable price is not compile-time constant. So, Java Compiler is not sure whether variable model will be initialized or not. Use of LOCAL variable without initialization gives compilation error. Hence, System.out.println(model); gives compilation error.

// Following statement in a Java program compiles successfully:

student.report(course); 

// What can you say for sure?
    // Answer:  report is a method name - Syntax to invoke static method is: Class_Name.method_name(<arguments>); OR reference_variable_name.method_name(<arguments>); Syntax to invoke instance method is: reference_variable_name.method_name(<arguments>); If student represents class_name or refernce_variable_name, then report might be the static method of the class. If student represents reference_variable_name, then report is the instance method of the class. In both the cases, report must be the method name. Hence, this is correct.

// How can you force JVM to run Garbage Collector?
    // Answer: This is correct, as Garbage Collection cannot be forced.

// Given the code:

public class A {
    public static void main(String[] args) {
        A a1 = new A(); //Line 1
        A a2 = new A(); //Line 2
        a1 = a2; //Line 3
        a1 = null; //Line 4
    }
}
//When is the A object, created at Line 1 eligible for Garbage Collection?
    // Answer: At Line 3, a1 starts referring to the object referred by a2(Created at Line 2). So, after Line 3, object created at Line 1 becomes unreachable and thus eligible for Garbage Collection.

// How many objects of B class are eligible for Garbage Collection at Line 4?

class B {
    
}
 
public class TestB {
    public static void main(String[] args) {
        new B(); //Line 1
        B b2 = new B(); // Line 2
        change(b2); //Line 3
        System.out.println("About to end."); //Line 4
    }
    
    public static void change(B b) { //Line 5
        b = new B(); //Line 6
    }
}
    // Answer: Object created at Line 1 becomes eligible for Garbage collection after Line 1 only, as there are no references to it. So We have one object marked for GC. Object created at Line 6 becomes unreachable after change(B) method pops out of the STACK, and this happens after Line 3. So at Line 4, we have two B objects eligible for Garbage collection: Created at Line 1 and Created at Line 6.

//Choose the options that meets the following specification: Create a well encapsulated class Phone with one instance variable model. The value of model should be accessible and modifiable outside Phone.
    // ANSWER: 
        // public class Phone { 
        //     private String model; 
        //     public String getModel() {
        //         return model;
        //     }

        //     public void setModel(String val) {
        //         model = val; 
        //     }
        // }

// Super keyword in Java is used to: 
    //Answer: super refers to parent class object and this refers to currently executing object.

// Consider the following class:

    public class Employee {
        public int passportNo; //line 2
    }
// Which of the following is the correct way to make the variable 'passportNo' read only for any other class? 
    // Answer: 'passportNo' should be read-only for any other class. This means make 'passportNo' private and provide public getter method. Don't provide public setter as then 'passportNo' will be read-write property.

// Predict Output, if the below code is run with given command?
// java Test good morning everyone

    private class Test
    { 
       public static void main(String args[])
       { 
         System.out.println(args[1]) 
       }
    }
    // Answer: Top level class can have two access modifiers: public and default. Over here Test class has private modifier and hence compilation error.

// What is the output of the following code?

    class A {
        A() {
            this(10);
            System.out.println("A");
        }
        
        A(int i) {
            System.out.println("B");
        }
    }
     
    class B extends A {
        
    }
     
    public class TestAB {
        public static void main(String[] args) {
            new B();
        }
    }
    // Answer: Reason: Default constructor added by Java compiler in B class is: B() { super(); } On executing new B(); statement, class B's default constructor is invoked, which invokes no-arg constructor of class A [super();]. no-arg constructor of class A invokes parameterized constructor of class A [this(10);]. B is printed first and after that A is printed.

// What will be the result of compiling and executing following program?

    class Super {
        public Super(int i) {
            System.out.println(100);
        }
    }
     
    class Sub extends Super {
        public Sub() {
            System.out.println(200);
        }
    }
     
    public class TestSuperSub {
        public static void main(String[] args) {
            new Sub();
        }
    }
        // Answer: super(); is added by the compiler as the first statement in both the constructors. Class Super extends from Object class and Object class has no-argument constructor, hence no issues with the constructor of Super class. But no-arg constructor is not available in Super class, hence calling super(); from Sub class constructor gives compilation error.

// Every class has ____ as a superclass 
    // Answer: java.lang.Object class is the root of the class hierarchy.

// What will be the result of compiling and executing following program?

    class Parent {
        static {
            System.out.println(10);
        }
     
        {
            System.out.println(20);
        }
     
        public Parent() {
            System.out.println(30);
        }
    }
     
    class Child extends Parent {
        static {
            System.out.println(40);
        }
     
        {
            System.out.println(50);
        }
     
        public Child() {
            System.out.println(60);
        }
    }
     
    public class TestParentChild {
        public static void main(String[] args) {
            new Child();
        }
}
    // Answer: xCorrect Sequence is: 1. static initialization block of Parent class. (10) 2. static initialization block of Child class. (40) 3. instance initialization block of Parent class. (20) 4. Constructor of Parent class. (30) 5. instance initialization block of Child class. (50) 6. Constructor of Child class. (60)

// Which of these keywords can be used to prevent inheritance of a class?
    // Answer: Class declared as final can't be inherited. Examples are: String, Integer, System etc.

// What will be the result of compiling and executing following program?

    class Rectangle {
        private int height;
        private int width;
        
        public Rectangle(int height, int width) {
            this.height = height;
            this.width = width;
        }
        
        public int getHeight() {
            return height;
        }
        
        public int getWidth() {
            return width;
        }
    }
     
    public class Test {
        public static void main(String[] args) {
            private int i = 10;
            private int j = 20;
            Rectangle rect = new Rectangle(i, j);
            System.out.println(rect.getHeight() + ", " + rect.getWidth());
        }
    }
        // Answer: i and j cannot be declared private as i and j are local variables. Only final modifier can be used with local variables.

// Which of the following statement declares a constant field in Java?
    // Answer: final static int x = 10; Fields declared with final are constant fields.

//  Two methods are said to be overloaded if they have,
    // Answer: Methods are said to be overloaded if they have same name and different parameters.

// What will be the result of compiling and executing following program?

//Circus.java
    class Animal {
        protected void jump() {
            System.out.println("Animal");
        }
    }
     
    class Cat extends Animal {
        public void jump(int a) {
            System.out.println("Cat");
        }
    }
     
    class Deer extends Animal {
        public void jump() {
            System.out.println("Deer");
        }
    }
     
    public class Circus {
        public static void main(String[] args) {
            Animal cat = new Cat();
            Animal deer = new Deer();
            cat.jump();
            deer.jump();
        }
    }
    // Answer: Cat class doesnot override the jump() method of Animal class, infact jump(int) method is overloaded in Cat class. Deer class overrides jump() method of Animal class. Reference variable cat is of Animal type, cat.jump() syntax is fine and as Cat doesnot override jump() method hence Animal version is invoked, which prints Animal to the console. Even though reference variable deer is of Animal type but at runtime deer.jump(); invokes overriding method of Deer class, this prints Deer to the console.

// What will be the result of compiling and executing following program?

//TestBaseDerived.java
    class Base {
        protected void m1() {
            System.out.println("Base: m1()");
        }
    }
     
    class Derived extends Base {
        void m1() {
            System.out.println("Derived: m1()");
        }
    }
     
    public class TestBaseDerived {
        public static void main(String[] args) {
            Base b = new Derived();
            b.m1();
        }
    }
    // Answer: Derived class overrides method m1() of Base class. Access modifier of method m1() in Base class is protected, so overriding method can use protected or public. But overriding method in this case used default modifier and hence we get compilation error.

// Which is not a valid statement based on given code?

    class A{}
    class B extends A{}
        // Answer: B b = new A(); -> child class reference cannot refer to parent class object. This will give compilation error. A a = new B(); -> parent class reference can refer to child class object. This is Polymorphism. B a = new B(); -> No issues at all. A a = new A(); -> No issues at all.

// What will be the result of compiling and executing following program?
//InstanceOfTest.java
    class M { }
    class N extends M { }
    class O extends N { }
    class P extends O { }
     
    public class InstanceOfTest {
        public static void main(String args []) {
            M obj = new O();
            if(obj instanceof M) 
              System.out.print("M");
            if(obj instanceof N) 
              System.out.print("N");
            if(obj instanceof O) 
              System.out.print("O");
            if(obj instanceof P) 
              System.out.print("P");
        }
    }
        // Answer: M ^ N ^ O [obj referes to instance of O class] ^ P obj instanceof M -> true obj instanceof N -> true obj instanceof O -> true but obj instanceof P -> false

// Which one of these top level classes cannot be sub-classed?
    // Answer: class Dog {}: can be sub-classed within the same package. abstract class Cat {}: can be sub-classed within the same package. final class Electronics {}: a class with final modifier cannot be subclassed. private class Car {}: a top level class cannot be declared with private modifier.

// What will be the result of compiling and executing following program?
//Test1.java
    class Vehicle {
        public int getRegistrationNumber() {
            return 1;
        }
    }
     
    class Car {
        public int getRegistrationNumber() {
            return 2;
        }
    }
     
    public class Test1 {
        public static void main(String[] args) {
            Vehicle obj = new Car();
            System.out.println(obj.getRegistrationNumber());
        }
} 
    // Answer: class Car doesn't extend from Vehicle class, this means Vehicle is not supertype of Car. Hence, Vehicle obj = new Car(); gives compilation error.

// For the given code:

    interface I01 {
        void m1();
    }
     
    public class Implementer extends Object implements I01{
        protected void m1() {
            
        }
    }
// Which of the statement is true?
    // Answer: As method m1() is implicitly public in I01, hence overriding method in Implementer class should also be public. But it is protected and hence compiler complains.


// Given the following definitions of the class Insect and the interface Flyable, the task is to declare a class Mosquito that inherits from the class Insect and implements the interface Flyable.
//Select the correct option to accomplish this task:

    class Insect {}
    interface Flyable {}
    // Answer: class Mosquito extends Insect implements Flyable() {} // A class in Java extends class and implements interface.


// Which of these access modifiers can be used for a top level interface?
    // Answer: A top level interface can be declared with either public or default modifiers. public interface is accessible across all packages but interface declared with default modifier and be accessed in the defining package only.
