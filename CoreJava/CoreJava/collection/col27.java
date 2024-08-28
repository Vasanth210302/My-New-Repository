/* 
	Collection frameWork.
	
						[I] Map


		[I]SortedMap	[c]HashMap 			[c]Hashtable
		
		[c]TreeMap		[c]LinkedHashMap
		
		
		Java Map Interface
		
	-> Map will hold values in the basis of key.i.e,key and value 	pair.
	-> Each key and value pair is called as an entry.
	-> Map will have unique keys.
	-> Map is very useful if we have to serach, update  or delete elements on the basis of key.
	-> Map doesnot allow duplicate keys,but it can have duplicate values.
	
	1.HashMap -> doesnot mainatain any order (shaffuling). not-synchronized and fast process.
	2.LinkedHashMap -> maintains the insertion order.
	3.TreeMap -> It maintains ascending order.
	4.HashTable -> this is synchronized ,thread safety,slow process.
	
	Note :
		A map cannot be traversed, so we used to convert map into Set using keySet() or entrySet() method.
*/
