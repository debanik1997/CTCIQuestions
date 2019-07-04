// 8.4) Power Set (Incomplete)

public Set<Set<Integer>> PowerSet(Set<Integer> set) {
	Set<Set<Integer>> result = new HashSet<Set<Integer>>();
	Set<Integer> cur = new HashSet<Integer>();
	result.add(cur);
	PowerSet(set, result);
	return result;
}

public Set<Set<Integer>> PowerSet(Set<Integer> set, Set<Integer> cur, Set<Set<Integer>> result) {
	if (result.count == 2^set.count) {
		return;
	}

	Iterator<Set<Integer>> itr = result.iterator(); 
	while(itr.hasNext()){ 
		Set<Integer> curSet = itr.next();
		set.

	}
}

