// Your solution to MIE250 Project 1 goes here
// This is the "default package" hence there should be *no* line that starts with "package ...;"
import java.io.*;
public class FizzBuzz{
	public static BufferedReader cin = new BufferedReader(new InputStreamReader(System.in));
	public static void main (String[] args) throws NumberFormatException, IOException{
		boolean playing = true;
		do {
			System.out.println("   JAVA FIZZBUZZ PROGRAM");
			//get and store valid inputs
			int fizz, buzz, start, end;
			fizz = getValidFBInput("Fizz");
			
			//check if the game should end
			if (!gameOver(fizz)) {
				playing = false;
				break;
			}
			
			
			buzz = getValidFBInput("Buzz");
			
			//check if the game should end
			if (!gameOver(buzz)) {
				playing = false;
				break;
			}
			
			
			System.out.print("Enter starting number: ");
            start = Integer.parseInt(cin.readLine());
            System.out.println("Enter ending number: ");
            end = Integer.parseInt(cin.readLine());
			
            if (end < start) {
    			do{
                    System.out.print("ERROR: Ending number cannot be less than starting number! Try again: ");
                    end = Integer.parseInt(cin.readLine());
                }while(end < start);
            }
            
            play(fizz, buzz, start, end);
            
		}while(playing);
		
	}
	
	private static int getValidFBInput(String s) throws NumberFormatException, IOException {
		int temp;
		System.out.print("Enter " + s + " number: ");
        temp = Integer.parseInt(cin.readLine());
        if (temp < 0){
            do{
                System.out.print("ERROR: Negative numbers are not allowed! Try again: ");
                temp = Integer.parseInt(cin.readLine());
            }while (temp < 0);
        }
        return temp;
	}

	private static boolean gameOver(int temp) {
		if(temp == 0) {
			System.out.print("\nThe end.\n");
		    return false;
		}
		else 
			return true;
	}
	
	private static void play(int fizz, int buzz, int start, int end) {
		
		for (int i = start ; i <= end ; i++) {
			if (i % buzz == 0 && i % fizz == 0)
                System.out.println(i + ". FizzBuzz");
			else if(i % fizz == 0)
                System.out.println(i + ". Fizz");  
			else if (i % buzz == 0)
                System.out.println(i + ". Buzz");
			else
				System.out.println(i + ". " + i);
		}
		System.out.println("");
	}
}
