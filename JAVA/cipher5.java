import java.util.Scanner;
public class cipher5 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            char ch;
            System.out.print("Enter the string: ");
            String message = scanner.nextLine();
            System.out.print("Enter the key: ");
            int key = scanner.nextInt();
            
            System.out.print("Enter the operation (+, -, *, /): ");
            ch = scanner.next().charAt(0);
            
            StringBuilder message1 = new StringBuilder();
            int i;
            switch (ch) {
                case '+':
                    for (i = 0; i < message.length(); i++) {
                        message1.append((char) (message.charAt(i) + key));
                    }
                    System.out.println(message1);
                    break;
                case '-':
                    for (i = 0; i < message.length(); i++) {
                        message1.append((char) (message.charAt(i) - key));
                    }
                    System.out.println(message1);
                    break;
                case '*':
                    for (i = 0; i < message.length(); i++) {
                        message1.append((char) (message.charAt(i) * key));
                    }
                    System.out.println(message1);
                    break;
                case '/':
                    for (i = 0; i < message.length(); i++) {
                        message1.append((char) (message.charAt(i) / key));
                    }
                    System.out.println(message1);
                    break;
                default:
                    System.out.println("Invalid operation.");
                    break;
            }
    
            scanner.close();   
        }
}
    
    

