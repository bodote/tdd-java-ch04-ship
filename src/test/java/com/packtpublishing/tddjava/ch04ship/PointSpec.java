package com.packtpublishing.tddjava.ch04ship;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class PointSpec {

    private Point point;
    private final int x = 12;
    private final int y = 21;

    @BeforeEach
    public void beforeTest() {
        point = new Point(x, y);
    }

    @Test
    public void whenInstantiatedThenXIsSet() {
        assertThat(point.getX()).isEqualTo(x);
    }

    @Test public void whenInstantiatedThenYIsSet() {
        assertThat(point.getY()).isEqualTo( y);
    }

}
