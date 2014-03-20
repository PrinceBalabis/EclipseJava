package collections;
import java.util.Iterator;
import java.util.Random;
import javax.swing.JOptionPane;

public class TestP1 {
    
    private static void test(boolean condition, String... message ) {
        if (condition && message.length>0)
            System.out.println(message[0]);
        else if (message.length > 1)
            System.out.println(message[1]);
    }
    
    private static <E> String strList(List<E> arr) {
        StringBuilder str = new StringBuilder();
        str.append("[");
        for(int i=0; i<arr.size(); i++) {
            str.append(arr.get(i).toString());
            if(i<arr.size()-1)
                str.append(", ");
        }
        str.append("]");
        return str.toString();
    }

    private static boolean equals(List<Long> list, long[] arr) {
        if(list.size()!=arr.length)
            return false;
        boolean res = true;
        for(int i=0; i<arr.length && res; i++)
            res = arr[i]==list.get(i);
        return res;
    }
    
    private static int indexOf(long[] arr, long value) {
        for(int i=0; i<arr.length; i++)
            if(arr[i]==value)
                return i;
        return -1;
    }
    
    private static boolean sameMembers(List<Long> list, long[] arr) {
        boolean res = true;
        int pos;
        for(int i=0; list.size()==arr.length && i<arr.length && res; i++) {
            res = (pos = indexOf(arr,list.get(i))) >= 0;
            if(res)
                arr[pos]=-1;
        }
        return res;
    }
    
    private static void setList(List<Long> list, long min, long max) {
        list.clear();
        while(min<=max)
            list.add(min++);
    }
    
    private static void shuffle(List<Long> list) {
        Random rand = new Random();
        int pos;
        Long temp;
        for(int i=list.size()-1; i>0; i--) {
            pos = rand.nextInt(i+1);
            temp = list.get(pos);
            list.set(pos,list.get(i));
            list.set(i,temp);
        }
    }
    
    private static void testList(List<Long> list) {
        System.out.println("------------------------");
        for(int i=0; i<3; i++)
            list.add(i,new Long(i+2));
            test(!equals(list,new long[]{2,3,4}), "add(element) {2,3,4} != " + strList(list), "  add(index,element) OK");
        list.clear();
        test(list.size()!=0, "clear() - size()!=0", "  clear() OK");

        setList(list,15,19);
        test(list.size()!=5, "size="+list.size());
        test(!equals(list,new long[]{15,16,17,18,19}), "add(element) {15,16,17,18,19} != " + strList(list), "  add(element) OK");

        for(long i=20; i<22; i++)
            list.addLast(i);
        test(!equals(list,new long[]{15,16,17,18,19,20,21}), "addLast(element) {15,16,17,18,19,20,21} !=" + strList(list), "  addLast(element) OK");

        setList(list,15,19);
        for(long i=20; i<22; i++)
            list.add(list.size(),i);
        list.add(0, new Long(14));
        test(!equals(list,new long[]{14,15,16,17,18,19,20,21}), "add(index,element) {14,15,16,17,18,19,20,21} != " + strList(list), "  add(index,element) OK");

        setList(list,15,19);
        for(long i=14; i>=12; i--)
            list.addFirst(i);
        test(!equals(list,new long[]{12,13,14,15,16,17,18,19}), "addFirst(element) {12,13,14,15,16,17,18,19} != " + strList(list), "  addFirst(element) OK");

        setList(list,15,19);
        list.set(0, new Long(100));
        list.set(1, new Long(200));
        test(!equals(list,new long[]{100,200,17,18,19}), "set(index,element) {100,200,17,18,19} != " + strList(list), "  set(index,element) OK");

        setList(list,15,19);
        test(list.indexOf(new Long(17))!=2, "indexOf(17)!=2 {15,16,17,18,19}", "  indexOf(element) OK");
        test(list.indexOf(3,new Long(17))!=-1, "indexOf(3,17)!=-1 {15,16,17,18,19}", "  indexOf(index,element) OK");

        long[] arr = new long[list.size()];
        Iterator<Long> iter = list.iterator();
        int index=0;
        while(iter.hasNext()) {
            arr[index] = iter.next();
            index++;
        }
        test(!sameMembers(list,new long[]{15,16,17,18,19}), "iterator {15,16,17,18,19}", "  iterator() OK");

        setList(list,15,19);
        for(int i=0; i<3; i++)
            list.removeFirst();
        test(!equals(list,new long[]{18,19}), "removeFirst() {18,19} != " + strList(list), "  removeFirst() OK");

        setList(list,15,19);
        for(int i=0; i<2; i++)
            list.remove(i);
        test(!equals(list,new long[]{16,18,19}), "remove(index) {16,18,19} != " + strList(list), "  remove(index) OK");

        setList(list,15,19);
        for(int i=0; i<3; i++)
            list.removeLast();
        test(!equals(list,new long[]{15,16}), "removeLast() {15,16} != " + strList(list), "  removeLast() OK");
    }

    private static void testStack(Stack<Long> stack) {
        System.out.println("------------------------");
        stack.push(8L);
        stack.push(10L);
        test(stack.size()!=2, "push(element) - size()!=2", "  push(element) OK");
        stack.push(12L);
        test(stack.size()!=3, "push(element) - size()!=3", "  push(element) OK");

        test(stack.size()!=3, "peek() - size()!=3", "  peek() OK");
        test(!stack.pop().equals(new Long(12)),"pop()!=12", "  pop() OK");
        test(stack.size()!=2, "pop() - size()!=2", "  pop() OK");
        test(stack.empty() && stack.size()>=2, "empty()!=false", "  empty() OK");
        test(!stack.pop().equals(new Long(10)),"pop()!=10", "  pop() OK");
        test(!stack.pop().equals(new Long(8)),"pop()!=10", "  pop() OK");
        test(!stack.empty(), "empty()!=true", "  empty() OK");
    }
    
    public static void testSearchSort() {
    }
    
    private static int getChoice(String[] menu) {
        String str = "";
        int choice=-1;
        for(int i=0; i<menu.length; i++) {
            str += menu[i] + "\n";
        }
        try {
            choice = Integer.parseInt(JOptionPane.showInputDialog(str));
        }catch(Exception e) {}
        return choice;
    }

	public static void main(String[] args) {
	    String[] menu = {"1. ArrayList<Long>()", "2. ArrayList<Long>(2)", "3. LinkedList<Long>()", "4. ArrayStack<Long>(10)","5. Searching, Sorting", "0. Exit"};
	    int choice = getChoice(menu);
	    while(choice != 0) {
	        switch(choice) {
	        case 1 : testList(new ArrayList<Long>()); break;
	        case 2 : testList(new ArrayList<Long>(2)); break;
	        case 3 : testList(new LinkedList<Long>()); break;
	        case 4 : testStack(new ArrayStack<Long>(10)); break;
	        case 5 : testSearchSort(); break;
	        }
	        choice = getChoice(menu);
	    }
	}
	
}
