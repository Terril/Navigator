package distance;

import data.Waypoints;

public interface DistanceCalculator {
    double distanceBetweenEndPoints(Waypoints waypoints);
}
