//two kinds of exceptions
//checked: force to handle
//unchecked(Run time): complies but throws an exception
//types of unchecked exceptions:
//A) null pointer: points to an empty space
//B) arayy out of bounds: accessing something that you cant reach
public class App {

	public static void main(String[] args) {
		//checked
//		try {
//			Thread.sleep(111);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		
		//unchecked
		//real serious
		//program would unable to recover
//		int value = 7;
//		value = value/0;
		
		//null pointer
//		String text = null;
//		System.out.println(text.length());
		
		//array out of bounds
		String[] texts = {"one", "two", "three"};
		try{
		System.out.println(texts[3]);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e.toString());
		}
	}

}
