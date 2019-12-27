import java.io.IOException;
import java.text.ParseException;

public class test {
	// if you throw an exception
	// you need a throws

	// now we have a list of exceptions to throw
	// you could throw either one of these exception
	// NOTE: this is not working code
	public void run() throws IOException, ParseException {
//		throw new IOException();

		// another error occquires
		throw new ParseException("Error in command list.", 2);
	}

	// throw a IOException as a child
	public void input() throws IOException {

	}
}
