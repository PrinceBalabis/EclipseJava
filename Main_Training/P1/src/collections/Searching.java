package collections;
/**
 * Klass som söker efter ett objekt i listor
 * @author Prince
 *
 */
public class Searching {
	/**
	 * Metod som söker efter ett objekt i en ArrayList genom binary sökning
	 * @param list ArrayList som ska sökas i
	 * @param element objekt som ska sökas efter
	 * @return positionen i ArrayListen till objektet
	 */
	public static int binearSearch(ArrayList list, Object element){
		Comparable comp = (Comparable)element;
		int res = -1, min=0, max=list.size()-1, pos;
		while((min<=max) && (res == -1)){
			pos =(min+max)/2;
			if(element == list.get(pos))
				res = pos;
			else if(comp.equals(list.get(pos)))
				max = pos - 1;
			else
				min = pos+1;
		}
		return res;
	}
	
	/**
	 * Metod som söker efter ett objekt i en List genom linjär sökning
	 * @param list List som ska sökas i
	 * @param element objekt som ska sökas efter
	 * @return positionen i List till objektet
	 */
	public static int linearSearch(List list, Object element){
		for(int i=0; i<list.size(); i++){
			if(list.get(i).equals(element)){
				return i;
			}
		}
		return -1;
	}
}
