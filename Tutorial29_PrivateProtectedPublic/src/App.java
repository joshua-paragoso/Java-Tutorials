import world.Plant;

public class App {

	public static void main(String[] args) {
		Plant plant = new Plant();
		System.out.println(plant.name);
		
		System.out.println(plant.ID);
		
		//wont work since type is private
//		 System.out.println(plant.type);
		
		//wont work
		//size is protected
		//plant is in a different package
//		System.out.println(plant.size);
		
		//wont work 
		//height is in another class
//		System.out.println(plant.height);
	}
	

}
