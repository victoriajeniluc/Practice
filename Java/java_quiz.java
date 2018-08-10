
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

// Question 3: What is the output of the following code?
	public class Concat2 {
    public static void main(String[] args) {
        System.out.println(1 + 2 + 3 + 4 + "Hello");
    }
	}

		// Answer: As expression contains + operator only, which is left to right associative. Let us group the expression. 1 + 2 + 3 + 4 + "Hello" = (1 + 2) + 3 + 4 + "Hello" = ((1 + 2) + 3) + 4 + "Hello" = (((1 + 2) + 3) + 4) + "Hello" [Let us solve it now,] = ((3 + 3) + 4) + "Hello" = (6 + 4) + "Hello" = 10 + "Hello" [+ operator with String behaves as concatenation operator.] = 10Hello





