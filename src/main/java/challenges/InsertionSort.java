package challenges;

public class InsertionSort extends Sorts {

    public InsertionSort() {
        super();
    }

    public void sort() {
        int n = undone.length;
        // iterate through each element of the array as the starting comparison
        for (int i = 1; i < n; i++) {
            int value = undone[i];
            int j = i - 1;

            // if the current element is smaller than value before it, continue to look back until it is no longer smaller and insert the element there
            //Sort all of the other elements up a position to make space.
            while (j >= 0 && undone[j] > value) {
                compare++;
                sort++;
                undone[j+1] = undone[j];
                j--;
            }
            undone[j+1] = value;
            compare++;
        }
    }
    //actually running the sort method and giving a print statement to format it
    public static void main(String[] args) {
        InsertionSort insert = new InsertionSort();
        System.out.println(insert);
    }
}
