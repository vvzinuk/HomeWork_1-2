public class Main {

    public static void main(String[] args) {
        //Home work #1
//        System.out.println(     "**** ****   *   *       *\n" +
//                                "*    *  *  * *  * *   * *\n" +
//                                "**** **** *   * *   *   *\n" +
//                                "*    *    ***** *       *\n" +
//                                "**** *    *   * *       *\n");
//    }
        //Home work #2

        //Task #1 Bitwise
        int a = 7;
        int b = 2;
        System.out.println("A was " + a + " and B was " + b);
        a ^= b;
        b ^= a;
        a ^= b;
        System.out.println("But now A become " + a + " and B become " + b);

        //Task #1 Arithmetical
//        int a = 7;
//        int b = 2;
//        System.out.println("A was " + a + " and B was " + b);
//        a += b;
//        b = a - b;
//        a -= b;
//        System.out.println("But now A become " + a + " and B become " + b);

        //Task #2
//        int number = 123;
//        int units = number % 10;
//        int tens = (number / 10) % 10;
//        int hundreds = number / 100;
//        int reversedNumber = units * 100 + tens *10  + hundreds;
//        int difference = number - reversedNumber;
//        System.out.println("Number = " + number + ", Reversed number = " + reversedNumber +
//                "\nAnd the difference between them = " + difference);

        //Task #3
//        double pounds = 10;
//        int gramms = (int)(pounds * 453.6) % 1000;
//        int kilos = (int)(pounds * 453.6) / 1000;
//
//        System.out.println("In " + pounds + " pound(s) " + kilos + " kilos and " + gramms + " gramms.");

        //Task #4
//        double deposit = 10_000;
//        double annualInterestRate = 12;
//        int months = 6;
//        double profit = deposit * ((annualInterestRate / 12 * months) / 100);
//        System.out.println("Our profit is: " + profit);


    }
}
