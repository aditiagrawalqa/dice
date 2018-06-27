package com.qainfotech.training.Test_002;


import java.util.Random;
import java.util.Scanner;

import org.testng.annotations.Test;

public class dice {
	static int side;
	static int inputType;
	static String attempts;
	String result;
	dice(int side)
	{
		dice.side=side;
	}
	@Test
	public String getResult() {
		if(side==2||side==4||side==6) 
			return this.result;
			return "Invalid sides";
			}
	@Test
	public  void selectRoll()
	{
		Random ran=new Random();
		int result=ran.nextInt(side)+1;
		this.result=getSides(result);
	}
	@Test
	public String getSides(int n)
	{
		if(side==2)
		{
			switch( n)
			{
			case 1: return "Head";
		
			case 2: return "Tail";
			
			}
		}
		else if(side==4)
		{
			switch(n)
			{
			case 1:return "one";
			case 2:return "two";
			case 3:return "three";
			case 4:return "four";
	
			}
		}
		else 
		{
			switch(n)
			{case 1:return "one";
			case 2:return "two";
			case 3:return "three";
			case 4:return "four";
	
			
			case 5:return "five";
			case 6:return "six";
			}
		}
		return "null";
	}
	@Test
	public static void main(String[] args) {
		
		do{
			System.out.println("Enter the Type of dice");
			Scanner sc = new Scanner(System.in);
			inputType = sc.nextInt();
			dice dicey  = new dice(inputType);
			dicey.selectRoll();
			System.out.println(dicey.getResult());
			System.out.println("Do You wish to continue press Y or N");
			Scanner sc1 = new Scanner(System.in);
			attempts = sc1.nextLine();
			if(!attempts.equalsIgnoreCase("Y")) {
				System.out.println("Thank you");
				System.exit(0);
			
				sc.close();
				sc1.close();}
		}while("Y".equalsIgnoreCase(attempts));

		
}
}

