//Laird,Chris
//1229_4026; November 19,2022
/*description:declares an array of integer and ask a user to enter numerical values to fill the
array elements*/

import java.util.Scanner;

public class FillAnArray{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);//creating a scanner
		
		int[] numbers = new int[6];//declaring array
		
		String output = "";
		
		for(int i = 0; i < numbers.length; i++){
			//having user input a number
			System.out.print("Enter number: ");
			int userInput = input.nextInt();
		
			numbers[i] = Drive.validInput(numbers,userInput);//add value to array
			
			output+= numbers[i] + " ";//add array index values to output
					
			System.out.println(output);//print final output
		}
	}
}

