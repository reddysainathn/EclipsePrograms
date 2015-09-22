package iterators;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Iterator;
import java.util.LinkedList;

public class UrlLibrarys implements Iterable<String> {
	
	String str;
	private LinkedList<String> urls = new LinkedList<String>();

	//Using Iterator we are downloading the web contnet of the URL elements
	private class UrlIterator implements Iterator<String> {

		private int index = 0;

	
		@Override
		public boolean hasNext() {

			return index < urls.size();
			
		}

		@Override
		public String next() {

			StringBuilder sb = new StringBuilder();

			try {
				
				
				URL url = new URL(urls.get(index));

				BufferedReader br = new BufferedReader(new InputStreamReader(
						url.openStream()));

				String line = null;

				while ((line = br.readLine()) != null) {
					sb.append(line);
					sb.append("\n");

				}

				br.close();

			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			index++;

			return sb.toString();
		}

		public void remove() {
			urls.remove(index);
		}

	}

	public UrlLibrarys(LinkedList<String> urls) {
		super();
		this.urls = urls;
	}

	public UrlLibrarys() {
		urls.add("http://www.google.com");
		urls.add("http://www.yahoo.com");
		urls.add("http://www.bbc.com");
	}

	@Override
	public Iterator<String> iterator() {
		// TODO Auto-generated method stub
		return new UrlIterator();
	}

	/*
	 * Simple Iterator
	 * 
	 * @Override public Iterator<String> iterator() { // TODO Auto-generated
	 * method stub
	 * 
	 * return urls.iterator(); }
	 */

}
