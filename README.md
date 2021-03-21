# hw7-William-Elijah
https://docs.google.com/document/d/1DfUZ2t8-WmfxLToQaax-E7L4deNNM-ptHoGjDT-_DJ8/edit?usp=sharing
hw7-William-Elijah for comp 830 sp 2021


A link to your group's GitHub account which will have your group's source code
https://github.com/elijahcalfin/hw7-William-Elijah


Describe any problems your group had writing the code.
No issues with the execution/writing really. It just took a little bit of time to look over the code to understand how it was written. We also had an issue figuring out the unit testing portion to make it closed. The main problem was our initial understanding of OCP, but we think we did a fine job and expanded our understanding by the end of it. 


Did you change the classes that were tested?  Why or why not?
We did change the classes that were tested. We had to change them so they all had a similar structure to pass the unit test. This was done through making the Animal class and creating return methods for each animal to implement, thus allowing for standardized testing methods. IE every animal will have the same return methods even if the return object is an empty string.


Describe your team's solution.  Explain how it meets the criteria given.
Created Animal class and used an interface to achieve polymorphism. We made it so all of our animal classes followed the animal class structure. The Cow, Dino, Penguin, and Octopus all use the same structure, even if they do not fill all the datatypes. In the main class we were able to add a for loop that utilized the unit test and would iterate through all the animal classes so there would be no need to make modifications to the unit and it would still be able to be extended(without modification).


Do you think unit testing is important? Why or why not?
Unit tests are important. They allow you to know that your code works and to check and see if another person’s code works. It might be more time consuming to write the additional code but it will also serve as documentation so other people can understand your code/intentions a bit better. It isn’t super important in a small project like this, but fundamentally understanding the purpose and how to implement them is important for projects of a larger scale, where input values are not hard-coded.
 
 
Name 3 key parts of the Observer pattern
Create and Remove Observer objects
Get notified when something changes that is being observed
Loose Coupling


When would you use the Observer pattern?  What problem does it solve?
You should use the Observer pattern when multiple objects are dependent on the state of one object. It solves an issue when something changes and the other objects need to be updated.


Name 3 key parts of the Strategy pattern
Algorithms can be defined as class hierarchy  
Client can decide what algorithm to use and avoid using switch or if else statements, encapsulation ensures neat code
Add classes without making drastic changes to existing code


When would you use the Strategy pattern?  What problem does it solve?
You would use the strategy pattern when you want to use different algorithms to adapt to different data’s needs. They give you flexibility to switch algorithms during run time. 

