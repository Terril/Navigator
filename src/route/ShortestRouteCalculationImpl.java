package route;

import data.Waypoints;
import distance.DistanceCalculator;
import distance.DistanceCalculatorImpl;

import java.util.ArrayList;
import java.util.List;

public class ShortestRouteCalculationImpl implements ShortestRouteCalculation {

  public ArrayList<Waypoints> nearestNeighbour(
      List<Waypoints> items, double startX, double startY, double startZ) {
    ArrayList<Waypoints> remainingItems = new ArrayList<>(items);
    ArrayList<Waypoints> orderedItems = new ArrayList<>();
    while (remainingItems.size() > 1) {
      double x = startX, y = startY, z = startZ;
      if (orderedItems.size() > 0) {
        Waypoints comparedItem = orderedItems.get(orderedItems.size() - 1);
        x = comparedItem.getLatitude().lat1;
        y = comparedItem.getLongitude().long1;
        z = comparedItem.getAltitude().alt1;
      }

      double distance, curMin = Double.POSITIVE_INFINITY;
      Waypoints bestGuess = null;
      DistanceCalculator calculator = new DistanceCalculatorImpl();
      for (Waypoints item : remainingItems) {
        distance = calculator.distanceBetweenEndPoints(item, x, y, z);
        if (distance < curMin) {
          bestGuess = item;
          curMin = distance;
        }
      }

      if (bestGuess == null) {
        break;
      } else {
        orderedItems.add(bestGuess);
        remainingItems.remove(bestGuess);
      }

      if (remainingItems.size() == 0) {
        break;
      } else {
        nearestNeighbour(
            remainingItems,
            bestGuess.getLatitude().lat1,
            bestGuess.getLongitude().long1,
            bestGuess.getAltitude().alt1);
      }
    }

    orderedItems.addAll(remainingItems);

    return orderedItems;
  }
}
