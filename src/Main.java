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
    Waypoints.Altitude altitude = waypoints.new Altitude(47.1, 55.3);
    waypoints.setLatitude(latitude);
    waypoints.setLongitude(longitude);
    waypoints.setAltitude(altitude);
    Track track = new MainTrack(waypoints);

    Waypoints waypoints1 = new Waypoints();
    Waypoints.Latitude latitude1 = waypoints1.new Latitude(-31.95, -31.94);
    Waypoints.Longitude longitude1 = waypoints1.new Longitude(115.77, 115.75);
    Waypoints.Altitude altitude1 = waypoints1.new Altitude(63.0, 45.3);
    waypoints1.setLatitude(latitude1);
    waypoints1.setLongitude(longitude1);
    waypoints1.setAltitude(altitude1);
    Track track1 = new MainTrack(waypoints1);

    Waypoints waypoints2 = new Waypoints();
    Waypoints.Latitude subLatitude = waypoints2.new Latitude(-31.95, -31.93);
    Waypoints.Longitude subLongitude = waypoints2.new Longitude(115.77, 115.76);
    Waypoints.Altitude subAltitude = waypoints2.new Altitude(44.8, 43.0);

    waypoints2.setLatitude(subLatitude);
    waypoints2.setLongitude(subLongitude);
    waypoints2.setAltitude(subAltitude);
    Track track2 = new SubTrack(waypoints2);

    OverallTrack overallTrack = new OverallTrack();
    overallTrack.addTrackDetails(track);
    overallTrack.addTrackDetails(track1);
    overallTrack.addTrackDetails(track2);

    List<Waypoints> waypointsList = overallTrack.getAllWaypointsDetails();

    ShortestRouteCalculation routeCalculation = new ShortestRouteCalculation();


    ArrayList<Waypoints> nearestNeighbourList =
        routeCalculation.nearestNeighbour(waypointsList, -31.94, 115.75);

    System.out.println(nearestNeighbourList.size());
    for (Waypoints way : nearestNeighbourList) {
      System.out.println("Nearest Neighbour ["+
               way.toString()+"]");
    }
  }
}
