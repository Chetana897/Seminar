import java.util.*;

class tokenring {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the num of nodes:");
        int n = scan.nextInt();

        int token = 0;
        int ch;

        System.out.println("Ring:");
        for (int i = 0; i < n; i++) {
            System.out.print(" " + i);
        }
        System.out.println(" " + 0);

        do {
            System.out.println("\nCurrent Token at: " + token);

            System.out.println("Enter sender:");
            int s = scan.nextInt();

            System.out.println("Enter receiver:");
            int r = scan.nextInt();

            System.out.println("Enter Data:");
            int data = scan.nextInt();

            // Token passing to sender
            System.out.print("Token passing: ");
            while (token != s) {
                System.out.print(token + " -> ");
                token = (token + 1) % n;
            }
            System.out.println(s);

            System.out.println("Sender " + s + " sending data: " + data);

            // Data forwarding
            int temp = s;
            while (temp != r) {
                temp = (temp + 1) % n;
                System.out.println("Data " + data + " forwarded by " + temp);
            }

            System.out.println("Receiver " + r + " received data: " + data);

            // Token moves ahead
            token = (r + 1) % n;

            System.out.print("\nSend again? (1-Yes / 0-No): ");
            ch = scan.nextInt();

        } while (ch == 1);

        scan.close();
    }
}