package route;

import data.Waypoints;

import java.util.ArrayList;
import java.util.List;

public interface ShortestRouteCalculation {

  ArrayList<Waypoints> nearestNeighbour(
      List<Waypoints> items, double startX, double startY, double startZ);
}
