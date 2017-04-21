/*

  Team SpiderGeckos - Xing Tao Shi, Taylor Wong
  APCS2 pd4
  HW32 -- Getting Past the Velver Rope
  2017-4-19

 */

import java.util.ArrayList;

public class ArrayPriorityQueue implements PriorityQueue {

    private ArrayList<Integer> ALPQ
;
    public ArrayPriorityQueue () {

	ALPQ = new ArrayList<Integer>();

    }
    
    public boolean isEmpty() {

        return ALPQ.size() == 0;

    }

    public void add(int input) {

	if ( isEmpty() ) {

	    ALPQ.add(input);
	    return;
	    
	}

	else if ( ALPQ.size() == 1 ) {

	    if (input > ALPQ.get(0)) {

		ALPQ.add(0, input);
		
	    }
	    
	    else {

		ALPQ.add(input);
		
	    }

	}
	
	else {

	    for (int x = 0; x < ALPQ.size() - 1; x++) {

		if (input < ALPQ.get(x) && input > ALPQ.get(x + 1)) {
		    ALPQ.add(x + 1, input);
		    return;
		}

		else if (input == ALPQ.get(x)) {
		    ALPQ.add(x, input);
		    return;
		}
			
	    }

	    ALPQ.add(input);
	    return;
	    
	}
	
    }

    public int removeMin() {

	return ALPQ.remove(ALPQ.size() - 1);
	
    }

    public int peekMin() {

	return ALPQ.get(ALPQ.size() - 1);
	
    }

    public String toString() {
	
	String retStr = "";

	for (int x = 0; x < ALPQ.size(); x++) {

	    retStr += ALPQ.get(x);
	    
	}

	return retStr;

    }
	

    public static void main(String[] args) {

	ArrayPriorityQueue tester = new ArrayPriorityQueue();

	tester.add(1);
	System.out.println(tester);
	tester.add(2);
	System.out.println(tester);
	tester.add(0);
	System.out.println(tester);
	tester.add(1);
	System.out.println(tester);
	tester.add(2);
	System.out.println(tester);

	System.out.println(tester.peekMin());
	System.out.println(tester.removeMin());
	System.out.println(tester);
	
	System.out.println(tester.peekMin());
	System.out.println(tester.removeMin());
	System.out.println(tester);
	
	System.out.println(tester.peekMin());
	System.out.println(tester.removeMin());
	System.out.println(tester);
	
	System.out.println(tester.peekMin());
	System.out.println(tester.removeMin());
	System.out.println(tester);
	
	System.out.println(tester.peekMin());
	System.out.println(tester.removeMin());
	System.out.println("SHOULD BE EMPTY");
	System.out.println(tester);
        
	
    }

}
