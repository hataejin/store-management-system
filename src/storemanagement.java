import java.util.Scanner;

public class storemanagement {
	public static void main(String[] args) {
		int a=0;
		Scanner op = new Scanner(System.in);
		while(a!=6) {
			System.out.println("1. add store");
			System.out.println("2. delete store");
			System.out.println("3. edit store");
			System.out.println("4. view store");
			System.out.println("5. show menu");
			System.out.println("6. end");
			System.out.print("choose menu :");
			a = op.nextInt();
			if(a==1) {
				System.out.print("storeid :");
				int b = op.nextInt();
				System.out.print("storename :");
				String c = op.next();
			}
		}
		
	}

}
