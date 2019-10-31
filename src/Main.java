import data.Waypoints;
import route.ShortestRouteCalculation;
import track.MainTrack;
import track.OverallTrack;
import track.SubTrack;
import track.Track;

import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    Waypoints waypoints = new Waypoints();
    Waypoints.Latitude latitude = waypoints.new Latitude(-31.96, -31.95);
    Waypoints.Longitude longitude = waypoints.new Longitude(115.80, 115.78);
    waypoints.setLatitude(latitude);
    waypoints.setLongitude(longitude);
    Track track = new MainTrack(waypoints);

    Waypoints.Latitude latitude1 = waypoints.new Latitude(-31.95, -31.94);
    Waypoints.Longitude longitude1 = waypoints.new Longitude(115.77, 115.75);
    waypoints.setLatitude(latitude1);
    waypoints.setLongitude(longitude1);
    Track track1 = new MainTrack(waypoints);

    Waypoints.Latitude subLatitude = waypoints.new Latitude(-31.95, -31.93);
    Waypoints.Longitude subLongitude = waypoints.new Longitude(115.77, 115.76);
    waypoints.setLatitude(subLatitude);
    waypoints.setLongitude(subLongitude);
    Track track2 = new SubTrack(waypoints);

    OverallTrack overallTrack = new OverallTrack();
    overallTrack.addTrackDetails(track);
    overallTrack.addTrackDetails(track1);
    overallTrack.addTrackDetails(track2);

    List<Waypoints> waypointsList = overallTrack.getTrackDetails();

    ShortestRouteCalculation routeCalculation = new ShortestRouteCalculation();
    ArrayList<Waypoints> nearestNeighbour =
        routeCalculation.nearestNeighbour(waypointsList, -31.94, 115.75);

    System.out.println(nearestNeighbour.size());
    for (Waypoints way : nearestNeighbour) {
      System.out.println(
          "Hello World!" + way.getLatitude().lat1 + " : " + way.getLongitude().long1);
    }
  }
}
