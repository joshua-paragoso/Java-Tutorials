package world;

public class Oak extends Plant {

	public Oak() {
		//cant work since type is private
	    //type = "tree";
		
		//this works because size is protected
		//oak is subclass of plant
		this.size = "Large";
		
		//no access specifier
		this.height = 10;
	}
}
