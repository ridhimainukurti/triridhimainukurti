package challenges;

public class SelectionSort extends Sorts {
    public SelectionSort() {
        super();
    }

    public void sort() {
        int n = undone.length;
        // iterate through each element of list as starting index
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            // within this sublist that has starting index of i, find the minimum value
            for (int j = i+1; j < n; j++) {
                compare++;
                if (undone[j] < undone[min]) {
                    min = j;
                }
            }
            // sort minimum value to the start of the list.
            int temp = undone[min];
            undone[min] = undone[i];
            undone[i] = temp;
            sort++;
        }
    }
    //actually running the sort method and giving a print statement to format it
   ]
}