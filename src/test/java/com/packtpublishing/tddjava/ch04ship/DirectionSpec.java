package com.packtpublishing.tddjava.ch04ship;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DirectionSpec {

    @Test
    public void whenGetFromShortNameNThenReturnDirectionN() {
        Direction direction = Direction.getFromShortName('N');
        assertEquals(direction, Direction.NORTH);
    }

    @Test public void whenGetFromShortNameWThenReturnDirectionW() {
        Direction direction = Direction.getFromShortName('W');
        assertEquals(direction, Direction.WEST);
    }

    @Test public void whenGetFromShortNameBThenReturnNone() {
        Direction direction = Direction.getFromShortName('B');
        assertEquals(direction, Direction.NONE);
    }

    @Test public void givenSWhenLeftThenE() {
        assertEquals(Direction.SOUTH.turnLeft(), Direction.EAST);
    }

    @Test public void givenNWhenLeftThenW() {
        assertEquals(Direction.NORTH.turnLeft(), Direction.WEST);
    }

    @Test public void givenSWhenRightThenW() {
        assertEquals(Direction.SOUTH.turnRight(), Direction.WEST);
    }

    @Test public void givenWWhenRightThenN() {
        assertEquals(Direction.WEST.turnRight(), Direction.NORTH);
    }
    private void assertEquals(Object a, Object b){
        assertThat(a).isEqualTo(b);

    }
}
