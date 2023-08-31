package W3resource;

import java.util.Scanner;

public class w3resourceBasic {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();


        w3resourceBasicPrograms calculatorProgram = new w3resourceBasicPrograms();
        int aCalculation = calculatorProgram.firstCalculation(a,b,c);
        System.out.println(aCalculation);

        int d = scanner.nextInt();
        int e = scanner.nextInt();
        int f = scanner.nextInt();
        int bCalculation = calculatorProgram.secondCalculation(d, e, f);
        System.out.println(bCalculation);





    }


}
