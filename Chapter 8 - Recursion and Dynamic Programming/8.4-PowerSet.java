// 8.4) Power Set (Incomplete)

public Set<Set<Integer>> PowerSet(Set<Integer> set) {
	Set<Set<Integer>> result = new HashSet<Set<Integer>>();
	Set<Integer> cur = new HashSet<Integer>();
	result.add(cur);
	PowerSet(result, set);
	return result;
}

public void PowerSet(Set<Set<Integer>> result, Set<Integer> set) {
	if (set.empty()) {
		return;
	}

	int i = set.ElementAt(random.Next(set.Count));
	set.remove(i);

	foreach (Set<Integer> s : result) {
		Set<Integer> newSet = new HashSet<Integer>();
		foreach (int j : s) {
			newSet.append(j);
		}
		newSet.append(i);
		result.append(newSet)
	}

	return PowerSet(result, set);
}

