import java.util.*;

class Test{
	public static void main(String[] args){
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(1);
		list2.add(3);
		boolean check = list1.containsAll(list2);

		System.out.println(check);
	}
}
