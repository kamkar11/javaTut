
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author XYZ
 */
public class HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("Hello World");
        
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        
        switch(n)
        {
            case 1:
            {
                System.out.println("Yes");
            }
        }

    }

}
