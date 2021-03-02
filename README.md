# algohw02
Optimal Binary Search Tree
Provide a README file explaining the structure of your implementation, decision designs, and how to execute your program.

I used Java to create the implementation of OBST. I used Object Oriented Programming to structure different classes to help make things a bit more efficient. 
I used the pseudocode from the assigned text book in order to make the OBST algorithm. 
I created a OBST class, which has the OBST algorithm. 
I created a ReadFile class to read in the keys and turn it into an array.
I created a probability class to find the probability of the keys.
I created a dummy key probability class to find the probability of the dummy keys. 
In the Main class, first I used the ReadFile class to read in the keys and turn it into an array.
then I called the probability class's method to find the keys's probabilitys and assigned it as a double variable.
Then I called the DummyKey class's method to find the key's dummy key probability and assigned as a double variable.
Once I have found both the real and dummy key's probabilities; I called the OBST method and plugged in the variables for the
real and dummy key probabilities, as well as the length of the array/keys. 
The OBST method will return a matrix of the root and also return the optimal cost of the tree.

To execute the program, clone this program. Then run the Main class. 
