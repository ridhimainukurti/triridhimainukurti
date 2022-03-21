# Welcome to Ridhima's Study Guide 

[Github Code](https://github.com/ridhimainukurti/triridhimainukurti/tree/master/src/main/java/challenges)

[Repl Link](https://replit.com/@ridhimainukurti/triridhimainukurti#src/main/java/challenges/Menu.java)

## Test Prep Plans 
**Goal: 5 on AP Exam**
Complete each of the challenges that are presented within each of the tech talks. Also in my spare time look over the collegeboard videos and review any units that I feel that I need to improve on. Then look over previous college board FRQ's and try to complete one to the best of my capability each weekend in order to become more comfortable with solving the free response questions in a limited amount of time (be sure to time myself). Also get a AP Computer Science A prep book and work on the questions given there in order to improve for the multiple choice questions


### Challenge 1 ~ Menu

The data collection that is needed in order to create a dynamic menu is a hash map which is what I created below. 
```
//need to create the hashmap
    public static void main(String[] args) {
        //created the HashMap object called Menu
        Map<Integer, Menu> menu = new HashMap<>();
        //in order to add key,value pairs into the HashMap need to have the put() method
        //add the java files that I want to run on menu
        menu.put(1, new Menu("ChallengeFRQ2", (IntByReference.main(null))));
        menu.put(2, new Menu("ChallengeFRQ3", (Matrix.main(null))));

        //once entered within the Menu we need to print the Menu out using a for loop
        //going through each of the HashMap's elements and traversing through them
        for (Map.Entry mapelement : menu.entrySet()) {
            //getting the key for each element within the HashMap
            int key = (int)mapelement.getKey;

            //now going to print the keys and values for each element within the HashMap
            System.out.println(key + "=" + mapelement.getValue()getBanner());
            
```

### Challenge 2 ~ IntByReference

I created the constructor that was needed which was the IntByReference
```
// Hack: create IntByReference, swapToLowHighOrder and toString methods

    //created the IntByReference constructor and intialized the private instance variable value
    public IntByReference(Integer value) {
        this.value = value;
    }
```

Then created the swapping method so that the numbers were sorted from least to greatest 
```
//swapping the numbers so it goes from least the greatest
    public void swapToLowHighOrder(IntByReference i) {
        //when the first value passed is greater than the second value passed then the swapping begins
        if (this.value > i.value) {
            //creates a variable placeholder to actually switch the value from one spot to the other
            int placeholder = this.value;
            this.value = i.value;
            placeholder = i.value;

        }
    }
```

Finally created the toString Method that printed the information out in a formatted way. 
```
//formatting the output into a particular way
    public String toString() {
        //String.format is a method that allows the output to be printed in a certain way according to the % characters
        //%d in reference to Decimal Integers
        return (String.format("%d", this.value));
    }
```

### Challenge 3 ~ Matrix

Created the toString method that had contained the nested for each loops that traversed through the rows and columns of the matrix. 
```
//creation of toString method
    public String toString() {

        //creation of the nested for loops (iterates through each row and column)
        //String builder creates a modifiable succession of characters
        StringBuilder finalresult = new StringBuilder();
        //for each loop that traverses through each row within the maxtrix
        for (int[] row : matrix) {
            //for each loop that traverses through each column within a row
            for (int cell : row ){
                //goes through each cell and prints out the hexadecimal for each cell
                finalresult.append((cell == -1) ? " " : String.format("%x",cell)).append(" "));
            }

            //create a new line to follow sample code's format
            finalresult.append("\n");
        }
        //returns that finalresult character sequence to the toString (connects all the strings together into one)
        return finalresult.toString();
    }
```

Then created the method that flipped the matrix using nested for loops (almost very similar to the code above). 
```
public String flip() {

        //creation of the nested for loops (iterates through each row and column)
        //String builder creates a modifiable succession of characters
        StringBuilder finalresult = new StringBuilder();
        //need to begin at the end of the row so use a for loop to move towards the end of the row and then to the beginning
        for (int i = matrix.length; 0 < i; i--) {
            //need to grow through each column for each row within the matrix
            for (int j = matrix[i - 1].length; 0 < j; j--) {
                //goes through each cell and prints out the value within it
                finalresult.append((matrix[i-1][j-1] == -1) ? " " : String.format("%x",matrix[i-1][j-1])).append(" "));
            }

            //create a new line to follow sample code's format
            finalresult.append("\n");
        }
        //returns that finalresult character sequence to the toString (connects all the strings together into one)
        return finalresult.toString();
    }
```

