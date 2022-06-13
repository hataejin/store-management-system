import java.util.Scanner;

public class storemanagement {
	public static void main(String[] args) {
		Scanner op = new Scanner(System.in);
		RecipeManager recipe = new RecipeManager(op);
		int a=-1;
		while(a!=5) {
			System.out.println("1. add recipe");
			System.out.println("2. delete recipe");
			System.out.println("3. edit recipe");
			System.out.println("4. view recipes");
			System.out.println("5. end");
			System.out.print("choose menu :");
			a = op.nextInt();
			if(a==1) {
				recipe.addrecipe();
			}
			else if(a==2) {
				recipe.deleterecipe();
			}
			else if(a==3) {
				recipe.editrecipe();
			}
			else if(a==4) {
				recipe.viewrecipes();
			}
			else {
				continue;
			}
		}
		
	}	
			
		
}


