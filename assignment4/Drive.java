//Laird,Chris
//1229_4026; November 19,2022
/*description:declares an array of integer and ask a user to enter numerical values to fill the
array elements*/

import java.util.Scanner;

public class Drive{
		
		//checking if the number is within range
		public static boolean numberOutOfRange(int toCheck){
			if (toCheck >= 91 || toCheck <= 29) {
				return true;
			}
			return false;
		}
		
		//checking if the number exists within array
		public static boolean numberExists(int[] arr, int toCheck){
			for (int i = 0; i < arr.length; i++){
				if (toCheck == arr[i]) 
					return true;
			}
			return false;
		}
		
		public static int validInput(int[] arr, int toCheck){
			Scanner input = new Scanner(System.in);
			//if input isn't valid user has to re-enter number
			while(numberExists(arr,toCheck) || numberOutOfRange(toCheck)){
				
				if(numberOutOfRange(toCheck))
					System.out.print("number must be between 30 and 90");
				
				
				if(numberExists(arr,toCheck))
					System.out.print(toCheck + " is a repeat! Not accepted");
				
				
				System.out.print("\nEnter number: ");
				toCheck = input.nextInt();
			}
			return toCheck;
		}
}