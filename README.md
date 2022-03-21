# fehlende Abdeckung

## Location:warp():
```java
public class LocationSpec {
  //....
  private int wrap(int point, int maxPoint) {
    if (maxPoint > 0) { // fehler -1 statt 0 wird nicht gefunden
      if (point > maxPoint) {// fehler maxPoint-1 oder maxPoint+1 statt ohne zusatz~~~~ wird nicht gefunden
        return 1;
      } else if (point == 0) {
        return maxPoint;
      }
    }
    return point;
  }
}

```