package world;

public class Field {
	private Plant plant = new Plant();
	
	public Field() {
		//this works
		//field is in the same package as Plant
		System.out.println(plant.size);
	}
}
