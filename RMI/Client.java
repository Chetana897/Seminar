import java.rmi.*;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            String serverUrl = "rmi://localhost/Server";
            ServerInterface serverIntf = (ServerInterface) Naming.lookup(serverUrl);

            System.out.print("Enter first number: ");
            double a = sc.nextDouble();

            System.out.print("Enter second number: ");
            double b = sc.nextDouble();

            double result = serverIntf.addSquares(a, b);

            System.out.println("Result (a^2 + b^2) = " + result);

        } catch(Exception e) {
            System.out.println("Exception at Client: " + e);
        }
    }
}