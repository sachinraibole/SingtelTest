# This is a Netbeans 8.2 project. 
# Open the project and run Solution01.java

# Problem 1
1. Can you implement the sing() method for the bird?
a. How did you unit test it?
b. How did you optimize the code for maintainability?

# Solution 1
To implement the sing behavior the simplest way would be to add the
sing method to the Bird class as given below.
    public void sing(){
        System.out.println("I am Singing");
    }

But this design is fragile and would break if we need to customize the
behavior for different types of birds. 

So we would have to apply some design principals and make the code more maintainable.
The details of the design principles are mentioned in the code inline.

I would be using Strategy Design pattern to implement the solution.