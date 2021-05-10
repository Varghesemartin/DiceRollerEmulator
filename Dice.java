import java.util.Scanner;
import java.util.Random;
public class Dice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println("Enter the no of times you want to roll the dice");
     Scanner sc=new Scanner(System.in);
     int numberOfDice=sc.nextInt();
     
     Random random=new Random();
     
     System.out.print("You have rolled: ");
     
     int total=0;
     int randomNumber=0;
     
     for(int i=0;i<numberOfDice;i++) {
    	 randomNumber=random.nextInt(6)+1;
    	 total=total+randomNumber;
    	 System.out.print(randomNumber+" ");
     }
     System.out.println();
     System.out.println("Total: "+total);
    	 
     }

	}


