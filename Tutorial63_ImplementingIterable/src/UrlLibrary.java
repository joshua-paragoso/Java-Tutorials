import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.LinkedList;

/*
 * class that stores URLs
 */
public class UrlLibrary implements Iterable<String> {

	private LinkedList<String> urls = new LinkedList<String>();

	// inncer class
	// will have access to URLS
	// you can return it for your iterator method
	private class UrlIterator implements Iterator<String> {

		// where this url is pointing out
		// iterators point to random points in the beginning
		// as long is index is less than URLS size
		private int index = 0;

		// return true if there is another url
		@Override
		public boolean hasNext() {
			return index < urls.size();
		}

		// increments to wind foward to next object
		@Override
		public String next() {

			StringBuilder sb = new StringBuilder();

			try {
				URL url = new URL(urls.get(index));

				BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));

				String line = null;

				// line is not equal null
				// loop through here and append the line to the string builder
				while ((line = br.readLine()) != null) {
					// append line to string builder
					sb.append(line);
					// append new line character
					sb.append("\n");
				}
				br.close();

			} catch (Exception e) {
				e.printStackTrace();
			}
			index++;
			return sb.toString();
		}

		@Override
		public void remove() {
			urls.remove(index);
		}

	}

	/**
	 * constructor that stores urls
	 */
	public UrlLibrary() {
		urls.add("http://www.caveofprogramming.com");
		urls.add("http://www.facebook.com/caveofprogramming");
		urls.add("http://www.news.bbc.co.uk");
	}

	// sole method of iterable interface
	// iterator over strings
	// iterator object that has the next
	// points to each of your objects
	// returns an iterator
//	@Override
//	public Iterator<String> iterator() {
//		return URLS.iterator();
//	}

	// now we are creating a our own iterator
	@Override
	public Iterator<String> iterator() {
		return new UrlIterator();
	}

}
