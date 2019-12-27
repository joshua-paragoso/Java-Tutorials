
//autocloaseable specifice that you  r program needs a close method
class Temp implements AutoCloseable {

	@Override
	public void close() throws Exception {
		System.out.println("Closing!");
		throw new Exception("oh no");
	}
	

}

public class App {

	public static void main(String[] args) {
//		Temp temp = new Temp();

		// always remeber to close
//		try {
//			temp.close();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		//try with resources
		//assigning some variable that implements 
		//autoCloseable
		//try calls close
		//dont have to worry if an exception is thrown

		try(Temp temp = new Temp()){
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
