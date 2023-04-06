package pg90;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetByKashi {

	public static void main(String[] args) {

		LinkedHashSet<String> htr = new LinkedHashSet<String>();
		htr.add("Kashi");
		htr.add("Prasad");
		htr.add("Yash");
		htr.add("KashiPrasad");

		Iterator<String> itr = htr.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
//output : Kashi
//Prasad
//Yash
//KashiPrasad