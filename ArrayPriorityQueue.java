//Team HelpDesk
//Taylor Wong, Xing Tao, James Zhang
//APCS2 pd4
//Lab03
//2017-04-19

import java.util.ArrayList;


public class ArrayPriorityQueue<T> implements PriorityQueue<T> {

    private ArrayList<T> _data;

    public ArrayPriorityQueue() {
	_data = new ArrayList<T>();
    }
    
    public void add(T s){
	
	if ( isEmpty() ) {
	    _data.add(s);
	    return;
	}

	else if ( _data.size() == 1 ) {
	    if (((Comparable)s).compareTo(_data.get(0)) > 0) {
		_data.add(0, s);
	    }
	    else {
		_data.add(s);
	    }
	}
	else {
	    for (int x = 0; x < _data.size() - 1; x++) {
		if (((Comparable)s).compareTo(_data.get(x)) < 0 && ((Comparable)s).compareTo(_data.get(x + 1)) > 0) {
		    _data.add(x + 1, s);
		    return;
		}

		else if (s == _data.get(x)) {
		    _data.add(x, s);
		    return;
		}		    
	    }
	    _data.add(s);
	    return;
	}
    }

    public boolean isEmpty(){
	return _data.size() == 0;
    }

    public T peekMin(){
	return _data.get(0);
    }

    public T removeMin(){
	return _data.remove(0);
    }

    public String toString(){
	return _data.toString();
    }

    public static void main(String[] args){

	ArrayPriorityQueue APQ = new ArrayPriorityQueue();
	APQ.add("2popsicle");	
	System.out.println(APQ);
	APQ.add("1ice cream");
	System.out.println(APQ);
	APQ.add("3sundae");
	System.out.println(APQ);
	APQ.add("3milkshake");
	System.out.println(APQ);
	System.out.println(APQ.removeMin());
	System.out.println(APQ);
    }
    
}

