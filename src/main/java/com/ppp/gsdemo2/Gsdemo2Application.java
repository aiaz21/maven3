package com.ppp.gsdemo2;

import java.util.Random;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Gsdemo2Application {

	public static void main(String[] args) {
		SpringApplication.run(Gsdemo2Application.class, args);
		checkSelectStar();
		switchCaseRule(5);
		nestedIfs();
	}

	private static void checkSelectStar() {
		String str = "SELECT * FROM customers;";
		System.out.println(str);
		
	}

    public static void doSomething()
    {
    }
    
    public static int switchCaseRule(int i) {
        switch (i)
        {
            case 0:
                int j = 10;
                int k = 20;

                if (j > k*i)
                {
                    return k;
                }

                break;
        }
		return i;
    }
    
    public static void foo(String bar) throws Exception
    {
        throw new Exception("My Message");    
    }
    
    public static void nestedIfs() {
    	Random random = new Random();
    	
    	boolean condition1 = random.nextBoolean();
    	boolean condition2 = random.nextBoolean();
    	boolean condition3 = random.nextBoolean();
    	
		if (condition1) // Compliant (depth = 1)
		{
			if (condition2) // Compliant (depth = 2)
			{
				for (int i = 0; i < 10; i++) // Compliant (depth = 3)
				{
					if (condition3) // Non-compliant (depth > 3)
					{
						System.out.println("This is nested statement.");
					}
				}
			}
		}
    }
}
