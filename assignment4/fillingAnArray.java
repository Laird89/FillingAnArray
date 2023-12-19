import java.util.Scanner;

public class fillingAnArray{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		//decalring an array with 6 elements
		int[] numbers= new int[6];
		//declaring other variables
		int validEntries = 5;
		int minValue = 30;
		int maxValue = 60;
		
		
		
		//get users input
		System.out.println("Enter number: ");
		int userInput = input.nextInt();
		
		for (int  count = 0; count < numbers.length; count++){
			numbers[count] = userInput;
			count++;
		}
		
		//check if appropriate range
		System.out.println(numberOutOfRange(minValue, maxValue, userInput));
		if(numberOutOfRange(minValue, maxValue, userInput)){
			printError("Number out of range");
			printValidEntries(numbers, validEntries);
		}
		
		///add to arry, up the valid entries count
		numbers[validEntries] = userInput;
		validEntries++;
		printValidEntries(numbers, validEntries);
	}
	
	public static void printError(String errorMsg){
		System.out.println(errorMsg);
	}
	
	public static void printValidEntries(int[] arr, int valid){
		String seperator = " , ";
		for (int i = 0; i < valid - 1; i++) {
			System.out.printf("%d%s", arr[i], seperator);
		}
		
		System.out.printf("%d", arr[valid - 1]);
	}
	
	public static boolean numberOutOfRange(int min, int max, int toCheck){
		if (toCheck > max || toCheck < min) {
			return true;
		}
		return false;
	}
	public static boolean numberExists(int[] arr, int toCheck){
		for (int i = 0; i < arr.length; i++){
		if (toCheck == arr[i]) {
				System.out.println("Number already exists":);
			}
	}
}