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

**if-else-if:** `if-else-if` statement contains multiple of else-if statements. In other way we can say
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
It is easy to use instead of if-else-if, and it provides more readability.

***Main Points to Note***
1. The case variable can be int, byte, short, char, enum and even String since Java 7
2. The case cannot be duplicate
3. Default statement is similar to else statement it will execute when any of the code doesn't match the expression. 
It is optional. But it used to handle unexpected values
4. Break statement terminates the switch block when the condition is satisfied. It is optional, If is not use, the 
    