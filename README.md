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

# Problem 2

2. Now, we have 2 special kinds of birds: the Duck and the Chicken... 
Can you implement them to make their own special sound?
a. A duck says: “Quack, quack”
b. A duck can swim
c. A chicken says: “Cluck, cluck”
d. A chicken cannot fly (assumption: its wings are clipped but ignore that)

# Solution 2

As we had used a flexible approach of using a Strategy design pattern
we just had to implement a behavior for Quacking and Clucking

# Problem 3

3. Now how would you model a rooster?
a. A rooster says: “Cock-a-doodle-doo”
b. How is the rooster related to the chicken?
c. Can you think of other ways to model a rooster without using inheritance?

# Solution 3
Did some cleanup of classes. Added abstract class to move the redundant code.
Used class level attributes to store properties of the object. The sex attribute 
is added to determine if the bird is a rooster.

# Problem 4

4. Can you model a parrot? We are specifically interested in three parrots, 
one that lived in a house with dogs one in a house with cats, the other lived 
on a farm next to the rooster.
a. A parrot living with dogs says: “Woof, woof”
b. A parrot living with cats says: “Meow”
c. A parrot living near the rooster says: “Cock-a-doodle-doo”
d. How do you keep the parrot maintainable? What if we need another parrot
lives near a Duck? Or near a phone that rings frequently?

# Solution 4
Added a companion Animal object to base class and injected its singing behavior 
for the parrot.

# Section B
Points 1,2 & 3 are covered in one commit. The design is very flexible to 
accommodate the requirements.

# Section D
Points 1,2 are covered in one commit. The design is very flexible to 
accommodate the requirements.