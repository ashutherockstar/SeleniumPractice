package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class hashSetandhashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(0, "hello");
		hm.put(1, "Gudbye");
		hm.put(42, "morning");
		hm.put(3, "evening");
		System.out.println(hm.get(42));
//		hm.remove(42); 
//		System.out.println(hm.get(42)); 
		Set sn = hm.entrySet();
		Iterator it = sn.iterator();
		// hashtable -pass table set collections
		while (it.hasNext()) {
//			System.out.println(it.next()); 
			Map.Entry mp = (Map.Entry) it.next();
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
		}

//		/HashSet treeset, LinkedHashset implements Set interface 
//		 does not accept duplicate values // There is no guarantee elements stored in
//		 sequential order..Random order
		HashSet<String> hs = new HashSet<String>();
		hs.add("USA");
		hs.add("UK");
		hs.add("INDIA");
		hs.add("he");
		hs.add("she");
		hs.add("INDIA");
		System.out.println(hs);
		System.out.println(hs.remove("UK"));
		System.out.println(hs.isEmpty());
		System.out.println(hs.size());
		Iterator<String> i = hs.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}

		int a[] = { 4, 5, 5, 5, 4, 6, 6, 9, 4 };
		// Print unique number from the list- Amazon
		// print the string in reverse
		ArrayList<Integer> ab = new ArrayList<Integer>();
		for (int i1 = 0; i1 < a.length; i1++) {
			int k = 0;
			if (!ab.contains(a[i1])) {
				ab.add(a[i1]);
				k++;
				for (int j = i1 + 1; j < a.length; j++) {
					if (a[i1] == a[j]) {
						k++;
					}

				}
				System.out.println(a[i1]);
				System.out.println(k);
				if (k == 1)
					System.out.println(a[i1] + "is unique number");
			}

		}
	}

}
