
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
