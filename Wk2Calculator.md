### Important Links
* [Code](https://replit.com/@ridhimainukurti/triridhimainukurti#src/TechTalk2/Calculator.java)
* [Ticket](https://github.com/ridhimainukurti/triridhimainukurti/issues/3)

### Challenge 1 ~ Calculator 

In order to pop the tokens from the tokenized list and calculate them I had to use the reverse polish notation and calculate the results. First I had to tokenize all the elemnts within the math expression.

```java
private void termTokenizer() {
        // contains final list of tokens
        this.tokens = new ArrayList<>();

        int start = 0;  // term split starting index
        StringBuilder multiCharTerm = new StringBuilder();    // term holder
        for (int i = 0; i < this.expression.length(); i++) {
            Character c = this.expression.charAt(i);
            if ( isOperator(c.toString() ) || isSeperator(c.toString())  ) {
                // 1st check for working term and add if it exists
                if (multiCharTerm.length() > 0) {
                    tokens.add(this.expression.substring(start, i));
                }
                // Add operator or parenthesis term to list
                if (c != ' ') {
                    tokens.add(c.toString());
                }
                // Get ready for next term
                start = i + 1;
                multiCharTerm = new StringBuilder();
            } else {
                // multi character terms: numbers, functions, perhaps non-supported elements
                // Add next character to working term
                multiCharTerm.append(c);
            }

        }
        // Add last term
        if (multiCharTerm.length() > 0) {
            tokens.add(this.expression.substring(start));
        }
    }
```

Then I had to conver them to polish notation. Once that was completed the reverse polish notation had to be calculated and in order for the calculator to understand the PEMDAS process I had to feed through multiple if statements in order to tell the calculator that once this operator was in place it needed to take the first two tokens and perform this action. 

```java
public void reversePolishNotationToResult() {
    //need a new stack to pop seperate the numbers and operators
    Stack calculate = new Stack();

    //need to go through each of the tokens in the reverse polish notation 
    for (String tokens : reverse_polish) {
      if (!isOperator(tokens)) {
        //trying to push the number to the stack using the methods of the Operators 
        Double num = Double.parseDouble(tokens);
        calculate.push(num);
      }

      else {
        // tryig to pop of the first two entries as done in the example during the tech talk 
        Double temporary1 = (Double)calculate.pop();
        Double temporary2 = (Double)calculate.pop();
        Double ans = 0.0;

        if (tokens.equals("^")) {
          ans = Math.pow(temporary2, temporary1);
        }
        
        if (tokens.equals("*")) {
          ans = temporary1 * temporary2;
        }
        
        if (tokens.equals("/")) {
          ans = temporary2 / temporary1; 
        }

        if (tokens.equals("%")) {
          ans = temporary2 % temporary1;
        }
        
        if (tokens.equals("+")) {
          ans = temporary2 + temporary1;
        }
        
        if (tokens.equals("-")) {
          ans = temporary2 - temporary1;
        }

        calculate.push(ans);
      }
    }

    result = (Double)calculate.pop();
    
  }
```

Then I had just used to the toString method to print out the results and make sure that everything was properly calculting the math expressions and printing out the correct result 

```java
ublic String toString() {
    return ("Original expression: " + this.expression + "\n" +
            "Tokenized expression: " + this.tokens.toString() + "\n" +
            "Reverse Polish Notation: " +this.reverse_polish.toString() + "\n" +
            "Final result: " + String.format("%.2f", this.result));
  }
```

Another one is the merge sorts where it has multiple sorts that are combined together as one and then executed in one shot which is done through a for loop traversing the array and printing out the merge sort. 

```java
public void sort(int[] a, int n) {
    if (n < 2) {
      return;
    }
    
    int mid = n / 2;
    int[] l = new int[mid];
    int[] r = new int[n - mid];

    for (int i = 0; i < mid; i++ ) {
      l[i] = a[i];
    }
    for (int j = mid; j < n; j++ ) {
      r[j - mid] = a[j];
    }

    sort(l, mid);
    sort(r, n - mid);

    mergeS(a, l, r, mid, n - mid);
    
  }
```
