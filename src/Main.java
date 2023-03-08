import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
        System.out.println("3. Print isosceles triangle");
        System.out.println("4. Exit");
        System.out.println("Enter your choice");
        int choice = input.nextInt();
        System.out.println("Width: ");
        int width = input.nextInt();
        System.out.println("Height: ");
        int height = input.nextInt();
        switch (choice) {
            case 1:
                for (int i = 1; i <= height; i++) {
                    for (int j = 1; j <= width; j++) {
                        System.out.print("* ");
                    }
                    System.out.println(" ");
                }
                break;
            case 2:
                System.out.println("bottom-left");
                //bottom-left
                for (int i = 1; i <= height; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print(" * ");
                    }
                    System.out.println(" ");
                }
                // top-left
                System.out.println("top-left");
                for (int i = height; i >= 1; i--) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print(" * ");
                    }
                    System.out.println(" ");
                }
                break;
            case 3:
//                for (int i = 0; i < height; i++) {
//                    for (int j = 0; j < 2*height-1; j++) {
//                        if(j>= (height-i)&& j<= (height+i-2)){
//                            System.out.print(" * ");
//                        }else {
//                            System.out.print("   ");
//                        }
//                    }
//                    System.out.println();
//                }
                for (int i = 0; i < height; i++) {
                    for (int j = 0; j < height - i; j++) {
                        System.out.print("   ");
                    }
                    for (int j = 0; j < 2*i-1 ; j++) {
                        System.out.print(" * ");
                    }
                    System.out.println();
                }
                    break;
            default:
                break;
        }

    }


}
    
