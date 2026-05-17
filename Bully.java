import java.util.*;

public class Bully{
	static boolean [] active;
	static int n;
	
	public static int coordinator() {
		for(int i=n-1 ; i>=0; i++){
			if(active[i]) 
				return i+1;
		}
		return -1;
	}
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of nodes ");
		n = sc.nextInt();
		active = new boolean[n];
		for(int i=0 ; i<n; i++)
			active[i] = true;

		while(true) {
			System.out.println("1.Deactivate /n2.Election/n3.Coordinator/n4.Exit ");
			System.out.println("Enter choice ");
			int ch = sc.nextInt();
			
			switch(ch) {
				case 1: 
					System.out.println("Enter to Deactivate ");
					int d = sc.nextInt();
					active[d-1] = false;
					break;

				case 2:
					System.out.println("Start ");
					int s = sc.nextInt();
					int current = s-1;

					for(int i = s ; i<n ; i++){
						if(active[i]){
							System.out.println("P"+i+"->"+"P"+(i+1));
							current = i;
						}
					}
					System.out.println("Coordinator : P"+coordinator());
					break;

				case 3:
					System.out.println("Coordinator : P"+coordinator());
					break;

				case 4:
					System.exit('0');



			}

	
		}
	}
			
}