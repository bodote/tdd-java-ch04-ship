# Requirement 6 – detecting obstacles We're almost done. This is the last requirement.
Even though most of the Earth is covered in water (approximately 70%), 
there are continents and islands that can be considered as obstacles for our remotely-controlled ship. 
We should have a way to detect whether our next move would hit one of those obstacles. 
If such a thing happens, the move should be aborted and the ship should stay on the current position and report the obstacle.

- **Implement** surface detection before each move to a new position. If a command encounters a surface, the ship aborts the move, 
stays on the current position, and reports the obstacle.

The specifications and the implementation of this requirement are very similar to those we did previously, 
and we'll leave that to you.

Here are a few tips that can be useful:
- The `Planet` object has the constructor that accepts a list of obstacles. Each obstacle is an instance of the `Point` class.
- The `location.foward` and `location.backward` methods have overloaded versions that accept a list of obstacles. 
They return `true` if a move was successful and false if it failed. 
Use this Boolean to construct a status report required for the `Ship.receiveCommands` method.
- The `receiveCommands` method should return a string with the status of each command. 0 can represent OK and X can 
be for a failure to move (00X0 = OK, OK, Failure, OK).

The link to the full source for this requirement can be found in the Book Test Driven Java Development , Second Edition