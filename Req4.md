# Requirement 4 – commands
Everything we have done so far was fairly easy since there were helper classes that provided all the functionality. 
This exercise was to learn how to stop attempting to test the end outcome and focus on a unit we're working on. 
We are building trust; we had to trust the code done by others (the helper classes).

Starting from this requirement, you'll have to trust the code you wrote by yourself.
We'll continue in the same fashion. We'll write specifications, run tests, and see them fail; 
we'll write implementations, run tests, and see them succeed; finally, we'll refactor if we think the code can be improved. 
Continue thinking how to test a unit (method) without going deeper into methods or classes that the unit will be invoking.
Now that we have individual commands (forwards, backwards, left, and right) implemented, it's time to tie it all together. 
We should create a method that will allow us to pass any number of commands as a single string. 
Each command should be a character with f meaning forwards, b being backwards, l for turning left, and r for turning right.
- The ship can receive a string with commands (lrfb, which are equivalent to left, right, forwards, and backwards).

The link to the full source for this requirement can be found in the Book Test Driven Java Development , Second Edition