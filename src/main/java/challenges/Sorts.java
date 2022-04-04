package challenges;

//hi
import java.util.*;
import java.time.*;

public class Sorts {
    //created the multiple variables that were needed
    int sort = 0;
    int compare = 0;
    int result;
    int[] undone;

    //created the sort variables that were needed in order for it to run
    public void Sort() {
        this.undone = getUndone();
        Instant starts = Instant.now();
        sort();
        Instant stop = Instant.now();
        Duration res = Duration.between(starts, stop);
        result = res.getNano();
    }

    //innclulded the get methods for the compare, sort and time variables
    public int getCompare() {
        return compare;
    }

    public int getSort() {
        return sort;
    }

    public int getTime() {
        return result;
    }

    // customize sort method based on type of sort
    public void sort() {

    }

    //created the undone in order to get the array that the user wanted to input into the replit
    public int[] getUndone() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter unsorted integer array (separated      by commas): ");
        String str = sc.next();
        String[] strArr = str.split(",");
        int[] array = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            array[i] = Integer.valueOf(strArr[i]);
        }
        return array;
    }

    //created the two string to display thhe information correctly
    public String toString() {
        String format = "";
        format += "\nSorted: ";
        format += "Compare: " + compare;
        format += "\nSwap: " + sort;
        format += "\nTime: " + result;
        for (int i = 0; i <  undone.length; i++) {
            format += undone[i] + ", ";
        }
        return format;
    }

}