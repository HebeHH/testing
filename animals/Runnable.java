import java.util.*;

public class Runnable {
	public static void main(String [ ] args) {

		Set<Unicorn> unicornList = new TreeSet<Unicorn>();
		unicornList.add(new Unicorn());
		unicornList.add(new Unicorn());
		unicornList.add(new Unicorn());
		    
		for (Unicorn u : unicornList) {
		    u.talk();
		}

		Map<String,Unicorn> map=new HashMap<String,Unicorn>();
		map.put ( "premier",  new Unicorn() ) ;
		map.put ( "second",  new Unicorn() ) ;
		map.put ( "troisieme",  new Unicorn() ) ;
		map.put ( "premier",  new Unicorn() ) ;

		for (Unicorn u : map.values()) {
		    u.talk();
		}
	}
}