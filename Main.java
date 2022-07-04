import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static StackArray stack = new StackArray(10);
    public static void main(String[]args){
        MenuForStack();



    }
    public static void MenuForStack(){
        System.out.println("Welcome to Stack");
        System.out.println("1. Print Stack");
        System.out.println("2. Push on Stack");
        System.out.println("3. Pop from Stack");
        System.out.println("4. Peak");
        do{


            System.out.println("Enter Option");

            int option = sc.nextInt();
            sc.nextLine();

            switch(option){
                case 1:
                    stack.print();
                    break;
                case 2:
                    System.out.println("Enter Element to push");
                    String item = sc.next();
                    sc.nextLine();
                    stack.push(item);
                    break;
                case 3:
                    stack.pop();
                    break;
                case 4:
                    System.out.println(stack.peak());
                    break;
                default:
                    System.exit(0);
                    break;
            }

        }while(true);

    }
}
