package challenges;

public class Matrix {
    private final int[][] matrix;

    // store matrix (constructor)
    public Matrix(int[][] matrix) {
        this.matrix = matrix;
    }

    // Hack: create toString method using nested for loops to format output of a matrix

    //need to go through each row and column of the 2d arrays ==> nested for loops therefore we need to have a for each loop for rows and for each loop for columns

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

    //prints out the flipped version of the maxtrix
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

    // declare and initialize a matrix for a keypad
    static int[][] keypad() {
        return new int[][]{ { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, {-1, 0, -1} };
    }

    // declare and initialize a random length arrays
    static int[][] numbers() {
        return new int[][]{ { 0, 1 },
                { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 },
                { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 } };
    }

    // tester method for matrix formatting
    public static void main(String[] args) {
        Matrix m0 = new Matrix(keypad());
        System.out.println("Keypad:");
        System.out.println(m0);
        System.out.println(m0.flip());

        Matrix m1 = new Matrix(numbers());
        System.out.println("Numbers Systems:");
        System.out.println(m1);
        System.out.println(m1.flip());
    }
}

