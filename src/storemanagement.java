import java.util.Scanner;

public class storemanagement {
	public static void main(String[] args) {
		int a=0;
		Scanner op = new Scanner(System.in);
		while(a!=6) {
			System.out.println("1. add recipe");
			System.out.println("2. delete recipe");
			System.out.println("3. edit recipe");
			System.out.println("4. view recipe");
			System.out.println("5. show menu");
			System.out.println("6. end");
			System.out.print("choose menu :");
			a = op.nextInt();
			if(a==1) {
				addrecipe();
			}
			else if(a==2) {
				deleterecipe();
			}
			else if(a==3) {
				editrecipe();
			}
			else if(a==4) {
				viewrecipe();
			}
			else {
				continue;
			}
		}
		
	}
	public static void addrecipe() {
		Scanner ad = new Scanner(System.in);
		System.out.print("recipe name :");
		String b = ad.next();
		System.out.print("ingredient :");
		String c = ad.next();
		System.out.println(c);
		System.out.print("recipe :");
		String d = ad.next();
		System.out.println(d);
	}
	public static void deleterecipe() {
		Scanner ad = new Scanner(System.in);
		System.out.print("recipe name :");
		String b = ad.next();
	}
	public static void editrecipe() {
		Scanner ad = new Scanner(System.in);
		System.out.print("recipe name :");
		String b = ad.next();		
	}
	public static void viewrecipe() {
		Scanner ad = new Scanner(System.in);
		System.out.print("recipe name :");
		String b = ad.next();		
	}
				
			
		
}


