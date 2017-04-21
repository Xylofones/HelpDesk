//Team HelpDesk
//Taylor Wong, Xing Tao, James Zhang
//APCS2 pd4
//Lab03
//2017-04-19

import java.util.ArrayList;


public class ArrayPriorityQueue implements PriorityQueue {

    private ArrayList<String> _data;

    public ArrayPriorityQueue() {
	_data = new ArrayList<String>();
    }

    public int getPriority(String s) {
	return (int)s.charAt(0);
    }
    
    public void add(String s) {
	int i = _data.size() - 1;
	while (i >= 0 && getPriority(s) > getPriority(_data.get(i))) {
	    i--;
	}
	_data.add(i + 1, s);
    }

    public boolean isEmpty(){
	return _data.size() == 0;
    }

    public String peekMin(){
	return _data.get(0);
    }

    public String removeMin(){
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

