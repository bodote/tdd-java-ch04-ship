Remote Controlled Ship Kata
===========================
(modified from the Book Test Driven Java Development , Second Edition)
Develop an program that moves a ship around Earth seas.
Earth is represented as a 2-dimensional grid. The x-axis run from 1..xmax , y-axis from 1..ymax including.
Some [helper classes](helper-classes.md) are already provided.

## Following requirements should be fulfilled one at a time using TDD approach.

[Req. 01](Req1.md): You are given the initial starting point (x, y) of a ship and the direction (n, s, e, w) it is facing.

[Req. 02](Req2.md): Implement commands that move the ship forward and backward (f, b).

[Req. 03](Req3.md): Implement commands that turn the ship left and right (l, r).

[Req. 04](Req4.md): The ship can receive a string with commands ("lrfb" is equivalent to left, right, forward, backwards).

[Req. 05](Req5.md): Earth, as any other planet is a sphere. Implement wrapping from one edge of the grid to another.

[Req. 06](Req6.md): Not the whole planet consists of seas. Roughly 30% is surface are islands and continents. Implement surface detection before each move to a new position. If a command encounters surface, the ship aborts the move, stays on the current position and reports the obstacle.