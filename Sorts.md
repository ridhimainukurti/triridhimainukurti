### Challenge 1 ~ Sorts 

[Code](https://replit.com/@ridhimainukurti/triridhimainukurti#src/TechTalk3)
- Under src.TechTalk3

[Ticket](https://github.com/ridhimainukurti/triridhimainukurti/issues/4)

Big O complexity with sorts gives to the notation to measure the upper bound performance of each of the algorithms.
merge sort: (n log(n))
bubble sort: (n) 
insertion sort: (n) 
selection sort: (n^2) 

In order to demonstrate the ability to be able to execute multiple sorts we tried executing it so that it portrayed the concept well. Another thing we focused on was the different sorts which were the bubble sort, insertion sort and selection sort. 

With the bubble sort I focused on demonstrating how it moves onto the next item or element within the arraylist by traversing through the array and holding a tempm variable that would be used in order to move to the next element. 

```java
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
```
Also I focused on the insertion sort where it look for the place to which the item or object should move towards and goes through a for loop process that also traverses through the array. It looks for the position to which it can be inserted and takes the element and moves it to the new locationn to where it needs to be inserted. 

```java
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
```

The last sort that I analyzed at was the fact that there was a selection sort which chooses the location to which the sort can be used for and then proceeds to insert that cetain element within that locaio in order to move to the next part which is then done by th for loop that again travereses through the array in order to get the element or object to that specific location. 

```java 
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
```
