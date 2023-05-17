/*PROJECT for ITA-225 
 @Kyla Caryl B. Españo
 Language: Java 
 Program that asks and calculates the user input of sum and product notation.

 integer = number(1, 2, 3, etc.)
 string = series of characters
 scanner = used to scan/ask for user input*/

// import is used to ask for the user input.
import java.util.Scanner; 

public class NotationCalculator{
    //Main method; where the calculation is processed
	public static void main(String[] args) { 
		//Scanner named 'input'
		Scanner input = new Scanner(System.in); 

		//Display
		System.out.println("    Sum and Product Notation Calculator    ");
		//Display
		System.out.println("===========================================");
		//Display
		System.out.println("Enter the Sum Notation (e.g., 1+2+3):");
		//The inputed Sum Notation will store in 'sumNotation' as string
		String sumNotation = input.nextLine(); 

		//Display
		System.out.println("Enter the Product Notation (e.g., 2*3*4):");
		//The inputed Product Notation will store in 'productNotation' as string 
		String productNotation = input.nextLine();

		// 'sumResult' will get the 'calculateSum(sumNotation) method's calculation
		int sumResult = calculateSum(sumNotation); 
		// 'productResult' will get the 'calculateProduct(productNotation) method's calculation
		int productResult = calculateProduct(productNotation); 
		

		System.out.println("===========================================");
		System.out.println("Sum Result: " + sumResult); //Displays the sum
		System.out.println("Product Result: " + productResult); //Displays the product
		System.out.println("===========================================");
	}

	//Method used to calculate the sum
	private static int calculateSum(String notation) { 
		//splits the user input sum into an array of individual numbers(string pa)
		String[] numbers = notation.split("\\+"); 
		int sum = 0;
		//For loop
		for (String number : numbers) {
			sum += Integer.parseInt(number.trim()); //Converts the string into integer(integer na)
		}
		return sum;
	}

	//Method used to calculate the product
	private static int calculateProduct(String notation) {
	    //splits the user input product into an array of individual numbers(string pa)
		String[] numbers = notation.split("\\*"); 
		int product = 1;
		//For loop
		for (String number : numbers) {
			product *= Integer.parseInt(number.trim()); //Converts the string into integer(integer na)
		}
		return product;
	}
}