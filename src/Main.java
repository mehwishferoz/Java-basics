import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void printHello(){
        System.out.println("HEMLO :0");
    }

    public static void printName(String name){
        System.out.println(name);
    }

    public static void main(String[] args) {
        System.out.println("Hello Java!");
        //shortcut - sout

        // Primitive Data types
        /*byte - 1
        * short - 2
        * int - 4
        * long - 8
        * float - 4
        * double - 8
        * char - 2
        * boolean - 1 */

        byte age2 = 30;
        int phone = 948296694;
        long phone2 = 9482966947L;
        float pi = 3.14F;
        char letter = 'A';
        boolean isAdult = true;

        // Non-primitive Data types

        // Strings
        String name = "Aman";
        String name2 = "Mehwish";
        // length
        System.out.println(name2.length());
        // concatenate
        String name3 = name + " loves "  + name2;
        System.out.println(name3);
        // charAt
        System.out.println(name.charAt(1));
        // replace
        String name4 = name.replace('a', 'o');
        System.out.println(name4);
        // substring
        System.out.println(name2.substring(3, 7));

        // Arrays
        int[] marks = new int[3];
        marks[0] = 97;
        marks[1] = 98;
        marks[2] = 95;
        // int[] marks = {97, 98, 95};

        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);

        // length
        System.out.println(marks.length);

        // sort
        Arrays.sort(marks);
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);

        // 2D array
        int[][] finalMarks = {{97,98,95},{94,93,96}};
        System.out.println(finalMarks[1][1]);

        // casting
        // two types - implicit, explicit
        /* Implicit casting, also known as widening or automatic type conversion,
occurs when a value of one data type is automatically converted to another data type
by the compiler without the need for explicit notation from the programmer. */
        int x = 5;
        double y = x; // Implicit casting from int to double
        System.out.println(y);

        int p = 100;
        int fp = p + (int)18.97;
        System.out.println(fp);

        // Constants
        final float PI = 3.14F;
        // usually denoted in uppercase

        // Operators
        double a = 1, b = 2;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
        // unary operators
        System.out.println(++a);
        System.out.println(a++);
        System.out.println(a);

        // Maths
        System.out.println(Math.max(5, 6));
        System.out.println(Math.min(5, 6));
        System.out.println(Math.random());
        System.out.println((int)(Math.random()*100));

        // Taking Input
        Scanner sc = new Scanner(System.in); //int input
        System.out.print("Enter your roll no: ");
        int rollNo = sc.nextInt();
        sc.nextLine(); // Consume the newline character
        System.out.println(rollNo);

        System.out.print("Enter your name: "); //string input
        String name5 = sc.nextLine();
        System.out.println(name5);

        System.out.print("Enter your address: "); //string input (line)
        String addr = sc.nextLine();
        System.out.println(addr);

        // Comparison Operators
        int m = 5;
        int n = 10;

        // Equality operator (==)
        System.out.println("m == n: " + (m == n));  // false

        // Inequality operator (!=)
        System.out.println("m != n: " + (m != n));  // true

        // Greater than operator (>)
        System.out.println("m > n: " + (m > n));    // false

        // Less than operator (<)
        System.out.println("m < n: " + (m < n));    // true

        // Greater than or equal to operator (>=)
        System.out.println("m >= n: " + (m >= n));  // false

        // Less than or equal to operator (<=)
        System.out.println("m <= n: " + (m <= n));  // true

        // Conditional Statements
        boolean isSunUp = false;
        if(isSunUp)
            System.out.println("day");
        else
            System.out.println("night");

        // Logical Operators
        int a1 = 60, b1 = 40;
        if(a < 50 && b < 50)
            System.out.println("Both less than 50");
        else if(a < 50 || b < 50)
            System.out.println("Atleast one less than 50");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number between 1 and 7 to represent a day of the week:");
        int day = scanner.nextInt();

        String dayName;
        switch (day) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid day";
                break;
        }

        System.out.println("The day is: " + dayName);

        scanner.close();

        for(int i=0;i<10;i++){
            System.out.println(i);
        }

        int i = 1;
        do{
            System.out.println(i);
            i++;
        } while(i<10);

        while(i<20){
            System.out.println(i);
            i++;
        }

        //TRY-CATCH EXCEPTION HANDLING
        int[] markss = {97, 98, 95};
        try{
            System.out.println(markss[5]);
        }catch (Exception e){
            throw e;
        }
        System.out.println("HELOO:)");

        //Methods
        // see line 7
        printHello();
        printName("Aman");
        printName("Mehwish");
    }
}