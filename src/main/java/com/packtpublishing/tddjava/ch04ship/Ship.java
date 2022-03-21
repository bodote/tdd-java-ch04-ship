package com.packtpublishing.tddjava.ch04ship;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@AllArgsConstructor
@Data
public class Ship {
  private Location location;
  private Planet planet;

  public void moveForeward() {
    location.forward( planet.getMax());
  }

  public void moveBackward() {
    location.backward(planet.getMax());
  }

  public void turnLeft() {
    location.turnLeft();
  }

  public void turnRight() {
    location.turnRight();
  }

  public void receiveCommands(String commands) {
    char aCommand;
    for (char command : commands.toCharArray()) {
      switch (command) {
        case 'f':
          location.forward(planet.getMax(),planet.getObstacles());
          break;
        case 'b':
          location.backward(planet.getMax(),planet.getObstacles());
          break;
        case 'r':
          location.turnRight();
          break;
        case 'l':
          location.turnLeft();
          break;
        default:
          throw new RuntimeException("unrecognized command:"+command);
      }
    }

  }
}
