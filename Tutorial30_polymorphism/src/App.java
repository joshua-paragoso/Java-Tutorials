//polymorphism is a object oriented concept
//if you have a child class
//you can use the child class where the parent class w
//would be

public class App {

	public static void main(String[] args) {
		//parent class
		Plant plant1 = new Plant();
		//child class
		Tree tree = new Tree();
		
		//make plant2 referr to plant1
//		Plant plant2 = plant1;
		
		//could also so
		Plant plant2 = tree;
		
		//plant2 will print out grow from tree class
		plant2.grow();
		
		//types of variables will decide what to call
		tree.shedLeaves();
		
		//no shedLeaves in plant2
		//plant2.shedleaves
		
		//polymorphism gurrantees that where ever
		//parent class is expected
		//you can pass a child variable into a method
		doGrow(tree);
		
	}
	
	public static void doGrow(Plant plant) {
		plant.grow();
	}

}
