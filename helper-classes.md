# Helper classes
Imagine that a colleague of yours started working on this project. 
He's a good programmer and a TDD practitioner, and you trust his abilities to have good test code coverage. 
In other words, you can rely on his work. However, that colleague did not finish the application before he left for 
his vacations and it's up to you to continue where he stopped. He created all the helper classes: Direction, 
Location, Planet, and Point. You'll notice that the corresponding test classes are there as well. They have the 
same name as the class they're testing with the Spec suffix (that is, DirectionSpec). The reason for using this 
suffix is to make clear that tests are not only intended to validate the code, but also to serve as an executable specification.
On top of the helper classes, you'll find the Ship (implementation) and ShipSpec (specifications/tests) classes. 
We'll spend most of our time in those two classes. We'll write tests in ShipSpec and then we'll write the implementation 
code in the Ship class (just as we did before).
Since we already learned that tests are not only used as a way to validate the code, but also as executable 
documentation, from this moment on, we'll use the phrase specification or spec instead of test.
Every time we finish writing a specification or the code that implements it, we'll run gradle test either 
from the command prompt or by using the Gradle projects IDEA Tool Window:
With the project set up, we're ready to dive into the first requirement.