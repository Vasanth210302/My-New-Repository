/* 
   ArrayList are unsynchronized 
   if multiple threads access an ArrayList instance concurrently.
 */
import java.util.ArrayList;
import java.util.List;
public class col8 extends ArrayList{
	//ArrayList al = new ArrayList();
	//unsynchronized
	
	List al = Collections.synchronizedList(new ArrayList(...));
	//synchronized
	//List is superclass 
	al.add();
	System.out.println(al);
}