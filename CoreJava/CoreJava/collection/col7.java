/* 
	| -> extends 
	^ -> implements
	[] -> interface
	othres -> classes.

                            [Itrable]
							    |
							[Collection]
							    |
	[List]					[Queue]					[Set]
	
	^							^						^
		ArrayList               PriorityQueue			HashSet
		
	^						|							^
		LinkedList   ...^   Deque						LinkedHashSet
		
	^						^						|
		Vector				ArrayDeque				SortedSet
		
		   |										^
		Stack										TreeSet
	
	
	interface to class => extends
	class to interface => implements
	class to class 	   => extends
	interface to class => cannot do anything
 */