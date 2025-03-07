In java all the codes are executed from `top` to `bottom`.
The `statements` in the code are executed according to the order.
Java provides statements that will control the flow of the code. 
That statements called as `Control statements`. 
It is the fundamental feature in Java.

There are `three` control statements in Java

    Decision making statements
        1. if-else statements
        2. switch statements
    
    Loop statements
        1. do-while
        2. while
        3. for
        4. for each

    Jump statements
        1. break
        2. continue

***Decision-making statement***

Provided in the name decision-making the statements take the decision for whether the code block need to execute or not 
based on the conditions.


**if:** `if` is the most basic statement among all the control flow statements. It evaluates 
a boolean condition and enables to enter a block of code if the condition is `true`.

    if (condition) {
        // block of code
    }

**if-else:** `if-else` is the extension of the `if` statement. It will contain another block of code
which will executed if the `if` condition is `false`.
    
    if (condition) {
        // block of code
    } else {
        // block of code
    }

**if-else-if:** `if-else-if` statement contains multiple of else-if statements. In another way we can say
it as `if-else-if` chain that create a decision tree may enter the block of code where the condition is true.

    if (condition-1) {
        // block of code
    } else if (condition-2) {
        // block of code
    } else if (condition-3) {
        // block of code
    } else {
        // block of code
    }

**switch:** `switch` statements are similar to `if-else-if` statements. The switch statements contain multiple block of
code which is called as cases. A single case will be executed based on the variable which is being switched.
It is straightforward to use instead of if-else-if, and it provides more readability.

***Main Points to Note***
1. The case variable can be int, byte, short, char, enum and even String since Java 7
2. The case cannot be duplicate
3. Default statement is similar to else statement it will execute when any of the code doesn't match the expression. 
It is optional. But it used to handle unexpected values
4. Break statement terminates the switch block when the condition is satisfied. It is optional, If is not use, the next
case will be executed
5. While using switch statement we must ensure both the expression and case variable in same type 


    switch (expressio) {
        case value1:
            // block of code for case 1
            break;
        case value2:
            // block of code for case 2
            break;
        default:
            // block of code for default case
            break;
    }

***Loop Statements***

    1. for 
    2. while
    3. do-while

**for loop:**
    Java for loop is similar to C and C++ for loops. it enables us to initialize, check the condition and 
increment/decrement in single line. We need to use the for loop when we exactly know how much times the block 
of code need to be executed.

    for ( initialize; condition; increment/decrement) {
        // block of code
    }

***for each loop:***
    Java provides an enhanced for loop to traverse data structure like array or any collection. If the for loop we not
need to update the loop variable
    
    for (type variable: array/collection) {
        // block of code
    }

****while loop***
    `while loop` is also used for execute the block of statements number of times. However, if we don't know how many
iterations in advance while loop is recommended. Unlike for loop initialization, increment/decrement doesn't take place.
It has also known as entry controlled loop since the condition is checked at the start of the loop. If the condition is true
the block of code in the loop will be executed. if the condition is false the block of code after loop will be executed.