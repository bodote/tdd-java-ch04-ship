# Requirement 1 – starting point and orientation
We need to know what the current location of the ship is in order to be able to move it. 
Moreover, we should also know which direction it is facing: north, south, east, or west. 
In other words: the ship should remember where it's current location is. 

Therefore, the first requirement is the following:
- You are given the initial starting point (x, y) of a ship and the direction (N, S, E, or W) it is facing.

Before we start working on this requirement, let's go through the helper classes that can be used. 
The Point class holds the x and y coordinates. It has the following constructor:
```java
public Point(int x, int y) {
  this.x = x;
  this.y = y;
}
```
Similarly, we have the Direction enum class with the following values:
```java
public enum Direction {
  NORTH(0, 'N),
  EAST(1, 'E'),
  SOUTH(2, 'S'),
  WEST(3, 'W'),
  NONE(4, 'X');
}
```
Finally, there is the Location class that requires both of those classes to be passed as
constructor arguments:
```java
public Location(Point point, Direction direction) {
  this.point = point;
  this.direction = direction;
}
```
Knowing this, it should be fairly easy to write a test for this first requirement. We should work in the same way as we 
did in the previous chapter, Chapter 3, Red-Green-Refactor – From Failure Through Success until Perfection.

Try to write specs by yourself. When done, compare them with the solution in this book. 
Repeat the same process with the code that implements specs. Try to write it by yourself and, once done, 
compare it with the solution we're proposing.

The link to the full source for this requirement can be found in the Book Test Driven Java Development , Second Edition