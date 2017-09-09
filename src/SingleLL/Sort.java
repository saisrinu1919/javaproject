package SingleLL;
import java.util.*;

public class Sort {
	public static void main(String []args)
	{
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(120);
		list.add(55);
		list.add(55);
		list.add(12);
		list.add(0);
		ArrayList<Integer> list1=new ArrayList<Integer>();
		list1.add(1210);
		list1.add(515);
		list1.add(055);
		list1.add(112);
		list1.add(10);
		list.addAll(list1);
		System.out.println("Sorted list is:"+list);
		Collections.sort(list);
		System.out.println("Sorted list is:"+list);
		
		
	}

}
