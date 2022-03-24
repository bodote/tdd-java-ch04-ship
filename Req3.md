# Requirement 3 – rotating the ship
Moving the ship only back and forth won't get us far. We should be able to change the
direction by rotating the ship to the left or right as well.

- Implement commands that turn the ship left and right (l and r).

After implementing the previous requirement, this one should be very easy since it can follow the same logic. 
The `Location` helper class already contains the `turnLeft` and `turnRight` methods that perform exactly what is required 
by this requirement. All we need to do is integrate them into the `Ship` class.

The link to the full source for this requirement can be found in the Book Test Driven Java Development , Second Edition