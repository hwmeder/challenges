package hwm.challenges;


import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class Graph {
	private static Map<Character, Collection<Character>> neighbors = new HashMap<Character, Collection<Character>>();
	static {
		Collection<Character> a = new HashSet<Character>();
		a.add('b');
		neighbors.put('a', a);
		
		Collection<Character> b = new HashSet<Character>();
		b.add('c');
		b.add('d');
		neighbors.put('b', b);
		
		Collection<Character> c = new HashSet<Character>();
		neighbors.put('c', c);
		
		Collection<Character> d = new HashSet<Character>();
		d.add('e');
		neighbors.put('d', d);
		
		Collection<Character> e = new HashSet<Character>();
		e.add('b');
		neighbors.put('e', e);
		
		Collection<Character> f = new HashSet<Character>();
		neighbors.put('f', f);
		
	}

	public static Collection<Character> getReachable(char c) {
		More more = new More();
		Collection<Character> initial = new HashSet<Character>();
		initial.add(c);
		more.addAll(initial);
		
		while (more.hasMore()){
			Character node = more.next();
			more.addAll(neighbors.get(node));
		}
		return more.reachable();
	}

}

class More {
	List<Character> more = new ArrayList<Character>();
	Collection<Character> reachable = new HashSet<Character>();

	public boolean hasMore() {
		return more.size() > 0;
	}

	public Collection<Character> reachable() {
		return reachable;
	}

	public void addAll(Collection<Character> collection) {
		for(Character c : collection)
		if(!reachable.contains(c)){
			reachable.add(c);
			more.add(c);
		}
	}

	public Character next() {
		return more.remove(0);
	}
	
}