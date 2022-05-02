
public class Receipe {
	String name;
	String ingredient;
	String recipe;
	
	public Receipe() {
		
	}
	public Receipe(String name, String ingredient, String recipe) {
		this.name = name;
		this.ingredient = ingredient;
		this.recipe = recipe;	
	}
	public void printInfo()
	{
		System.out.println("name : " + name + "\n" + "ingredient " + ingredient +"\n"+ "recipe : " + recipe);
		
	}
	
  
}
