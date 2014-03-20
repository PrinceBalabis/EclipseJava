package collections;

/**
 * Klass som sorterar arrayer genom quicksort och mergesort
 * @author Prince
 *
 */
public class Sorting {
	/**
	 * Sorterar värdena i en double-array, genom att kalla på quicksort-metoden.
	 * @param arr double-arrayen som ska sorteras
	 */
	public static void sort(double[] arr) {
		quicksort(arr, 0, arr.length-1);
	}

	private static void quicksort(double[] arr, int left, int right) {
		int pivotIndex;
		if (left < right) {
			pivotIndex = partition(arr, left, right, (left+ right)/2);
			quicksort(arr, left, pivotIndex-1);
			quicksort(arr, pivotIndex+1, right);
		}
	}

	private static int partition(double[] arr, int left, int right, int pivotIndex) {
		double pivotValue = arr[pivotIndex];
		int storeIndex = left;
		swap(arr, pivotIndex, right);
		for (int i = left; i < right; i++) {
			if (arr[i] < pivotValue) {
				swap(arr, i, storeIndex);
				storeIndex++;
			}
		}
		swap(arr, storeIndex, right);
		return storeIndex;
	}

	private static void swap(double[] arr, int pos1, int pos2) {
		double temp = arr[pos1];
		arr[pos1] = arr[pos2];
		arr[pos2] = temp;
	}

	/**
	 * Metod som sorterar ArrayList med hjälp av mergesort-metoden
	 * @param list ArrayList som ska sorteras
	 */
	public static void sort(ArrayList list) {
		ArrayList temp = new ArrayList(list.size());
		mergesort(list, 0, list.size(), temp);
		temp = null;
	}

	/**
	 * Metod som använder mergesort för att sortera en ArrayList
	 * @param list ArrayList som ska sorteras
	 * @param first första int i listan som ska sorteras
	 * @param last sista int i listan som ska sorteras
	 * @param temp temporär ArrayList lika stor som list
	 */
	public static void mergesort(ArrayList list, int first, int last, ArrayList temp) {
		int n1, n2;
		if (last > 1) {
			n1 = last/2;
			n2 = last - n1;
			mergesort(list, first, n1, temp);
			mergesort(list, first+ n1, n2, temp);
			merge(list, first, n1, n2, temp);
		}
	}

	private static void merge(ArrayList list, int first, int n1, int n2, ArrayList temp) {
		int counter = 0;
		int elem1 = 0;
		int elem2 = n1;
		int end = n1 + n2; 
		while ((elem1 < n1) && (elem2 < end)) {
			Comparable comp = (Comparable) list.get(first + elem1);
			if (comp.compareTo(list.get(first + elem2)) < 0){
				temp.set(counter, list.get(first + elem1));
				elem1++;
			} else {
				temp.set(counter, list.get(first + elem2));
				elem2++;
			}
			counter++;
		}
		while (elem1 < n1) {
			temp.set(counter, list.get(first + elem1));
			elem1++;
			counter++;
		}
		while (elem2 < end) {
			temp.set(counter, list.get(first + elem2));
			elem2++;
			counter++;
		}
		for (int i = 0; i < n1 + n2; i++) {
			list.set((first + i), temp.get(i));
		}
	}

}
