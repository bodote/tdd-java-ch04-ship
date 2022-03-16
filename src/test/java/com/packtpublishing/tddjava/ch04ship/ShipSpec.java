package com.packtpublishing.tddjava.ch04ship;

import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.*;

import static org.testng.Assert.*;
import static org.assertj.core.api.Assertions.*;

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

}
