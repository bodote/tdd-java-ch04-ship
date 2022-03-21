package com.packtpublishing.tddjava.ch04ship;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


@Slf4j
public class ShipSpec<max> {
    private Ship ship;
    private Location shipLocation;
    private int startX = 12;
    private int startY = 13;

    int maxX = 15;
    int maxY = 17;
    private Point maxCoord ;
    List<Point> obstacles ;


    @BeforeEach
    public void beforeTest() {
        maxCoord = new Point(maxX    , maxY);
        shipLocation = new Location(new Point(startX,startY),Direction.NORTH);

        obstacles = new ArrayList<>();
        obstacles.add(new Point(startX+1,startY));
        this.ship = new Ship(shipLocation, new Planet( maxCoord,obstacles ));

    }

    //You are given the initial starting point (x, y) of a ship and the direction (N, S, E, or W) it is facing.
    @Test
    public void whenInitializedShipHasStarpointAndDirection(){
        assertThat(ship.getLocation()).isEqualTo(shipLocation);
        log.info("++++++++ OK that was easy");
    }
    @Test public void moveShipforeward(){
        Location expectedLocation = shipLocation.copy();
        expectedLocation.forward();
        ship.moveForeward();
        assertThat(ship.getLocation()).isEqualTo(expectedLocation);
    }

    @Test public void moveShipBackwards(){
        Location expectedLocation = shipLocation.copy();
        expectedLocation.backward();
        ship.moveBackward();
        assertThat(ship.getLocation()).isEqualTo(expectedLocation);
    }

    @Test public void roteteShipLeft(){
        Location expectedLocation = shipLocation.copy();
        expectedLocation.turnLeft();
        ship.turnLeft();
        assertThat(ship.getLocation()).isEqualTo(expectedLocation);
    }
    @Test public void roteteShipRight(){
        Location expectedLocation = shipLocation.copy();
        expectedLocation.turnRight();
        ship.turnRight();
        assertThat(ship.getLocation()).as("it should not be just a reference to the exact same object").isNotSameAs(expectedLocation);
        assertThat(ship.getLocation()).as("location should be not same object but same content").isEqualTo(expectedLocation);
    }

    @Test public void whenCommandFThenMoveForeward(){
        Location expectedLocation = shipLocation.copy();
        expectedLocation.forward();
        ship.receiveCommands("f");
        assertThat(ship.getLocation()).isEqualTo(expectedLocation);
    }

    @Test public void whenCommandsThenMoveLocation(){
        Location expectedLocation = shipLocation.copy();
        expectedLocation.forward();
        expectedLocation.turnRight();
        expectedLocation.backward();
        expectedLocation.turnLeft();
        ship.receiveCommands("frbl");
        assertThat(ship.getLocation()).isEqualTo(expectedLocation);
    }

    @Test public void warpToBottomWhenUpperEdgeAndNorthForward(){
        shipLocation.getPoint().setY(1);
        ship.receiveCommands("f");
        assertThat(ship.getLocation().getY()).isEqualTo(maxY);
    }

    @Test public void warpToBottomWhenUpperEdgeAndSouthBackward(){
        shipLocation.getPoint().setY(1);
        ship.receiveCommands("rrb");
        assertThat(ship.getLocation().getY()).isEqualTo(maxY);
    }

    @Test public void warpToEastWhenWestEdgeAndHeadingWest(){
        shipLocation.getPoint().setX(1);
        ship.receiveCommands("lf");
        assertThat(ship.getLocation().getX()).isEqualTo(maxX);
    }

    @Test public void warpToEastWhenWestEdgeAndHeadingWestBackward(){
        shipLocation.getPoint().setX(1);
        ship.receiveCommands("rb");
        assertThat(ship.getLocation().getX()).isEqualTo(maxX);
    }

    @Test public void forwardAgainstObstracle(){
        Location oldLocation = ship.getLocation().copy();
        oldLocation.turnRight();
        ship.receiveCommands("rf");
        assertThat(ship.getLocation()).isEqualTo(oldLocation);
    }

    @Test public void backwardAgainstObstracle(){
        Location oldLocation = ship.getLocation().copy();
        oldLocation.turnLeft();
        ship.receiveCommands("lb");
        assertThat(ship.getLocation()).isEqualTo(oldLocation);
    }


}
