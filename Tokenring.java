import java.util.*;
public class Tokenring{
	public static void main(String [] args){
		Scanner sc  = new Scanner(System.in);
		int token = 0;
		System.out.println("No of nodes = ");
		int n = sc.nextInt();

		for(int i=0; i<n ; i++){
			System.out.print(i + " -> ");
		}

		System.out.println("0\n");

		System.out.println("Sender : ");
		int s = sc.nextInt();

		System.out.println("Reciever :  ");
		int r = sc.nextInt();

		 if (s >= n || r >= n) {
                System.out.println("Invalid node number!\n");
                
            }

		System.out.println("Data :  ");
		int d = sc.nextInt();

		System.out.println("Token : "+token);
		while(token!=s){
			token = (token+1)%n;
			System.out.println("Token : "+token);
		}
		
		while(s!=r){
					
			System.out.println("Data fwd by " + s);
			s=(s+1)%n;					
		}
		
	}
}