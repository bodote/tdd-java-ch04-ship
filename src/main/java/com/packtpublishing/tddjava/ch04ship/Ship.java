package com.packtpublishing.tddjava.ch04ship;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Ship {
        private  Location location;

        public void moveForeward() {
                location.forward();
        }

        public void moveBackward() {
                location.backward();
        }

        public void turnLeft() {
                location.turnLeft();
        }

        public void turnRight() {
                location.turnRight();
        }
}
