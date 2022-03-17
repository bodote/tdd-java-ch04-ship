package com.packtpublishing.tddjava.ch04ship;

import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

@Test
@Slf4j
public class ShipSpec {
    private Ship ship;
    private Location initialLocation;
    private int startX = 12;
    private int startY = 13;

    @BeforeMethod
    public void beforeTest() {
        initialLocation = new Location(new Point(startX,startY),Direction.NORTH);
        this.ship = new Ship(initialLocation);
    }

    //You are given the initial starting point (x, y) of a ship and the direction (N, S, E, or W) it is facing.
    public void whenInitializedShipHasStarpointAndDirection(){
        assertThat(ship.getLocation()).isEqualTo(initialLocation);
        log.info("++++++++ OK that was easy");
    }
    public void moveShipforeward(){
        Location expectedLocation = initialLocation.copy();
        expectedLocation.forward();
        ship.moveForeward();
        assertThat(ship.getLocation()).isEqualTo(expectedLocation);

    }


    public void moveShipBackwards(){
        Location expectedLocation = initialLocation.copy();
        expectedLocation.backward();
        ship.moveBackward();
        assertThat(ship.getLocation()).isEqualTo(expectedLocation);

    }

    public void roteteShipLeft(){
        Location expectedLocation = initialLocation.copy();
        expectedLocation.turnLeft();
        ship.turnLeft();
        assertThat(ship.getLocation()).isEqualTo(expectedLocation);

    }
    public void roteteShipRight(){
        Location expectedLocation = initialLocation.copy();
        expectedLocation.turnRight();
        ship.turnRight();
        assertThat(ship.getLocation()).as("it should not be just a reference to the exact same object").isNotSameAs(expectedLocation);
        assertThat(ship.getLocation()).as("location should be not same object but same content").isEqualTo(expectedLocation);

    }


}
