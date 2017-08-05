# Make Change Project
## Week 1 homework

This is my first assignment. The focus of this project is to design a program that will provide change based on the amount of an item and the cash provided by a customer. This program is being completed after 1 week of Java training.

### Goals!

At this point in the training I feel the area that I am weakest in is methods and the passing of variables between methods. With that being said, I will be using methods heavily in this program to help in learning this important concept. My second major goal is to complete the project with functional program; meeting all stated requirements.

Program began using methods, but was having difficulty in making it work. MakeChange.java contains a working model based on the project parameters. A second class was started, MakeChangeMethod.java where I will work on getting the program to work using methods.

### What I learned!

Still struggle with methods. However, this program helped solidify many of the concepts being discussed in class. For instance the use of modular mathematics to get the amount of pennies remaining after each round of division was particularly useful. Some research online provided insight into controlling rounding and decimal location. A particularly interesting find was the use of multiplying and dividing by 100.00 after a Math.round in order to get the correct decimal places when displaying cash amounts. It would be interesting to investigate this further and see to what number of decimal places can be controlled. Based off of this program, it seems that any number of decimals could be controlled in a double or float, constrained only by the size of memory. 

### To do!

It would be interesting to see if arrays would work on this. Perhaps an array for coin denominations and paper denominations. Additionally, need to add methods to the program and get it to work with methods as previously stated. 

### How the program works.

The program begins by asking the user for how much an items costs. It then asks the user for the amount of funds collected. If the amount of funds collected is less than the amount of the item, an error is displayed and the program ends. If the amount collected covers the cost of the item, some simple math is conducted to determine the amount of change that should be given back to the customer. The program then takes the change amount and converts it to pennies. From here, the program determines the number of each denomination that should be given to the customer. Finally, the program prints the results for the user to see. 