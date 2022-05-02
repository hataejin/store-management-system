import java.util.Scanner;

public class RecipeManager {
	Receipe recipe;
	Scanner op;
	RecipeManager(Scanner op){
		this.op = op;
	}
	public void addrecipe() {
		recipe = new Receipe();
		System.out.print("recipe name :");
		recipe.name = op.next();
		System.out.print("ingredient :");
		recipe.ingredient = op.next();
		System.out.print("recipe :");
		recipe.recipe = op.next();
	}
	public void deleterecipe() {
		System.out.print("recipe name :");
		String b = op.next();
		if(recipe==null) {
			System.out.println("we dont have any recipe that you told.");
			return;
		}
		if(recipe.name.equals(b)) {
			recipe = null;
			System.out.println("recipe is deleted.");
		}
	}
	public void editrecipe() {
		System.out.print("recipe name :");
		String b = op.next();
		if(recipe.name.equals(b)) {
			System.out.println("recipe name is edited by" + b);
		}
	}
	public void viewrecipe() {
		System.out.print("recipe name :");
		String b = op.next();	
		if(recipe.name.equals(b)) {
			recipe.printInfo();
		}
	}

}
