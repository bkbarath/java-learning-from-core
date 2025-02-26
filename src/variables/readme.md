The `variable` is a `container` which holds value while `Java Program` is executed.

A variable is assigned with its `data type`.

A variable is a name of reserved area allocated in memory.

There are three types of Variable in Java. 

    1. Local Variable
    2. Instance Variable
    3. Static Variable

***Local Variable***:
    A variable which is created into the body of the method is `Local Variable`. It cannot be static.
    You can access the variable `within` the method/function. Other methods in the class aren't even aware of the variable 
    is existing.

***Instance Variable***: 
    A variable which is created into the class and out of body of the methods is `Instance` variable. It is not declare 
    as a static.
    It is called as instance because its values are instance specific and not shared among instances.

***Static Variable***
    A variable that is declared with static key is called `Static Variable`. It cannot be local. You can create a single
    copy of the static variable and share it among all the instances of the class. Memory allocation for the static
    variables happens only once when the class is loaded in the memory.
