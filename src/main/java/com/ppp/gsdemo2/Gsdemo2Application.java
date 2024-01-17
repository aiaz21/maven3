package com.ppp.gsdemo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Gsdemo2Application {

	public static void main(String[] args) {
		SpringApplication.run(Gsdemo2Application.class, args);
		checkSelectStar();
		switchCaseRule(5);
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
}
