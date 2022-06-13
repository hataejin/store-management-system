import java.util.ArrayList;
import java.util.Scanner;

public class RecipeManager {
	ArrayList<Receipe> recipes = new ArrayList<Receipe>(); 
	Scanner op;
	RecipeManager(Scanner op){
		this.op = op;
	}
	public void addrecipe() {
		Receipe recipe = new Receipe();
		System.out.print("recipe name :");
		recipe.name = op.next();
		System.out.print("ingredient :");
		recipe.ingredient = op.next();
		System.out.print("recipe :");
		recipe.recipe = op.next();
		recipes.add(recipe);
	}
	public void deleterecipe() {
		System.out.print("recipe name :");
		String b = op.next();
		int index = -1;
		for(int i = 0; i <recipes.size();i++) {
			if(recipes.get(i).name.equals(b)) {
				index = i;
				break;
			}	
		}
		if(index >=0) {
			recipes.remove(index);
		System.out.println("recipe is deleted.");
		}
		else {
			System.out.println("we dont have any recipe that you told.");
			return;
		}
	}
	public void editrecipe() {
		System.out.print("recipe name :");
		String b = op.next();
		for(int i =0; i< recipes.size(); i++) {
			Receipe recipe = recipes.get(i);
			if(recipes.equals(b)) {
				int a=-1;
				while(a!=4) {
					System.out.println("1. edit name");
					System.out.println("2. edit ingredient");
					System.out.println("3. edit recipe");
					System.out.println("4. end");
					a = op.nextInt();
					if(a==1) {
						System.out.print("recipe name:");
						recipe.name = op.next();
					}
					else if(a==2) {
						System.out.print("recipe ingredient :");
						recipe.ingredient = op.next();
					}
					else if(a==3) {
						System.out.print("recipe :");
						recipe.recipe = op.next();
					}
					else {
						continue;
					}
				}
				break;
			}
		}
}
	public void viewrecipes() {
		for(int i =0; i< recipes.size(); i++) {
			recipes.get(i).printInfo();
		}
	}

}
