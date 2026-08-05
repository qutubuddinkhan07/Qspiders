## How left shift operator works (<<)
1. the expression 1<<5 equals 32

	```text
	00000001  <-- Start
	00000010  (Shift 1)
	00000100  (Shift 2)
	00001000  (Shift 3)
	00010000  (Shift 4)
	00100000  (Shift 5)
	```

2. Convert back to decimal:
	The resulting binary sequence 00100000 
	represents:\(1\times 2^{5}=32\)

## Subsequence Program DRY RUN
### How This Logic Works (Visual Dry Run for "abc")[iterative approach]
1. Initial State: result = [""]
2. Process 'a':
	1. Take "", add 'a' → "a"
	2. result = ["", "a"]
3. Process 'b':
	1. Take "", add 'b' → "b"
	2. Take "a", add 'b' → "ab"
	3. result = ["", "a", "b", "ab"]
4. Process 'c':
	1. Take "", add 'c' → "c"
	2. Take "a", add 'c' → "ac"
	3. Take "b", add 'c' → "bc"Take "ab", add 'c' → "abc"
	4. result = ["", "a", "b", "ab", "c", "ac", "bc", "abc"]
	
