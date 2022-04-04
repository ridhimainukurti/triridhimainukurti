package challenges;

public class BubbleSort extends Sorts {

    public BubbleSort() {
        super();
    }

    public void sort() {
        int n = undone.length;
        // iterate through each possible pair in the list
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                compare++;
                // if the value with larger index is smaller in value, then swap the two values
                if (undone[j] > undone[j+1]) {
                    sort++;
                    int temp = undone[j];
                    undone[j] = undone[j+1];
                    undone[j+1] = temp;
                }
            }
        }
    }

}
