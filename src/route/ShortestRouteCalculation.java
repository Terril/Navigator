package route;

import data.Waypoints;
import distance.DistanceCalculator;
import distance.DistanceCalculatorImpl;

import java.util.ArrayList;
import java.util.List;

public class ShortestRouteCalculation {
  //
  //  private int numberOfNodes;
  //  private Stack<Integer> stack;
  //
  //  public ShortestRouteCalculation() {
  //    stack = new Stack<Integer>();
  //  }
  //
  //  public void tsp(int adjacencyMatrix[][]) {
  //    numberOfNodes = adjacencyMatrix[1].length - 1;
  //    int[] visited = new int[numberOfNodes + 1];
  //    visited[1] = 1;
  //    stack.push(1);
  //    int element, dst = 0, i;
  //    int min = Integer.MAX_VALUE;
  //    boolean minFlag = false;
  //    System.out.print(1 + "\t");
  //
  //    while (!stack.isEmpty()) {
  //      element = stack.peek();
  //      i = 1;
  //      min = Integer.MAX_VALUE;
  //      while (i <= numberOfNodes) {
  //        if (adjacencyMatrix[element][i] > 1 && visited[i] == 0) {
  //          if (min > adjacencyMatrix[element][i]) {
  //            min = adjacencyMatrix[element][i];
  //            dst = i;
  //            minFlag = true;
  //          }
  //        }
  //        i++;
  //      }
  //      if (minFlag) {
  //        visited[dst] = 1;
  //        stack.push(dst);
  //        System.out.print(dst + "\t");
  //        minFlag = false;
  //        continue;
  //      }
  //      stack.pop();
  //    }
  //  }

  public ArrayList<Waypoints> nearestNeighbour(
      List<Waypoints> items, double startX, double startY) {
    ArrayList<Waypoints> remainingItems = new ArrayList<>(items);
    ArrayList<Waypoints> orderedItems = new ArrayList<>();

    while (remainingItems.size() > 1) {
      double x = startX, y = startY;
      if (orderedItems.size() > 0) {
        Waypoints comparedItem = orderedItems.get(orderedItems.size() - 1);
        x = comparedItem.getLatitude().lat1;
        y = comparedItem.getLongitude().long1;
      }

      double distance, curMin = Double.POSITIVE_INFINITY;
      Waypoints bestGuess = null;
      DistanceCalculator calculator = new DistanceCalculatorImpl();
      for (Waypoints item : remainingItems) {
        distance = calculator.distanceBetweenEndPoints(item);
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
    }

    orderedItems.add(remainingItems.get(0));

    return orderedItems;
  }
}
