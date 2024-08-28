/* 
   String
   
   String s1="abc";
   String s2="mno";
   String s3="xyz";
   s3=s2;
   String s4="efg";
   String s5="xyz";
   
   string constant memory pool
    statck memory             Heap memory 
	    s1           ->          abc  - string object
	    s2           ->          mno  - string object
	    s3           ->          xyz  - string object
		s3=s2 -> s3  ->          mno  - String object
		s4           ->          efg  - string object
		s5    -> s3  ->          xyz  - string object
*/