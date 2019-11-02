package distance;

import data.Waypoints;

public class DistanceCalculatorImpl implements DistanceCalculator {

  @Override
  public double distanceBetweenEndPoints(Waypoints waypoints,double startLat, double startLong, double startAlt) {
    Waypoints.Latitude latitude = waypoints.getLatitude();
    Waypoints.Longitude longitude = waypoints.getLongitude();
    Waypoints.Altitude altitude = waypoints.getAltitude();

    double lat1 = startLat;
    double lat2 = latitude.lat1;
    double lon1 = startLong;
    double lon2 = longitude.long1;
    double el1 = startAlt;
    double el2 = altitude.alt1;

    if ((lat1 == lat2) && (lon1 == lon2)) {
      return 0;
    } else {
      final int R = 6371; // Radius of the earth

      double latDistance = Math.toRadians(lat2 - lat1);
      double lonDistance = Math.toRadians(lon2 - lon1);
      double a =
          Math.sin(latDistance / 2) * Math.sin(latDistance / 2)
              + Math.cos(Math.toRadians(lat1))
                  * Math.cos(Math.toRadians(lat2))
                  * Math.sin(lonDistance / 2)
                  * Math.sin(lonDistance / 2);
      double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
      double distance = R * c * 1000; // convert to meters

      double height = el1 - el2;

      distance = Math.pow(distance, 2) + Math.pow(height, 2);

      return Math.sqrt(distance);
    }
  }
}
