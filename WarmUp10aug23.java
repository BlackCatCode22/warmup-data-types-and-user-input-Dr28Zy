import java.util.Scanner;

class LargestNumberFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third integer: ");
        int num3 = scanner.nextInt();

        int largest = num1;
        
        if (num2 > largest) {
            largest = num2;

        }
        if (num3 > largest) {
            largest = num3;
        }
        System.out.println("The largest number is: " + largest);
        scanner.close();
    }
}