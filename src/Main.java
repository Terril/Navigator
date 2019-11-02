import data.Waypoints;
import route.ShortestRouteCalculation;
import route.ShortestRouteCalculationImpl;
import track.MainTrack;
import track.OverallTrack;
import track.SubTrack;
import track.Track;

import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {

    Waypoints waypoints = new Waypoints();
    Waypoints.Latitude latitude = waypoints.new Latitude(-31.96);
    Waypoints.Longitude longitude = waypoints.new Longitude(115.80);
    Waypoints.Altitude altitude = waypoints.new Altitude(47.1);
    waypoints.setLatitude(latitude);
    waypoints.setLongitude(longitude);
    waypoints.setAltitude(altitude);
    waypoints.setDescrption("I knew");
    Track track = new MainTrack(waypoints);

    Waypoints waypointsMain = new Waypoints();
    Waypoints.Latitude latitude1 = waypointsMain.new Latitude(-31.95);
    Waypoints.Longitude longitude1 = waypointsMain.new Longitude(115.77);
    Waypoints.Altitude altitude1 = waypointsMain.new Altitude(63.0);
    waypointsMain.setLatitude(latitude1);
    waypointsMain.setLongitude(longitude1);
    waypointsMain.setAltitude(altitude1);
    waypointsMain.setDescrption("*theStroll");
    Track trackMain = new MainTrack(waypointsMain);

    Waypoints waypointsMain1 = new Waypoints();
    Waypoints.Latitude latitudeMain1 = waypointsMain1.new Latitude(-31.95);
    Waypoints.Longitude longitudeMain1 = waypointsMain1.new Longitude(115.78);
    Waypoints.Altitude altitudeMain1 = waypointsMain1.new Altitude(45.3);
    waypointsMain1.setLatitude(latitudeMain1);
    waypointsMain1.setLongitude(longitudeMain1);
    waypointsMain1.setAltitude(altitudeMain1);
    waypointsMain1.setDescrption("I'd find you");
    Track trackMain1 = new MainTrack(waypointsMain1);

    Waypoints waypointsMain2 = new Waypoints();
    Waypoints.Latitude latitudeMain2 = waypointsMain2.new Latitude(-31.95);
    Waypoints.Longitude longitudeMain2 = waypointsMain2.new Longitude(115.77);
    Waypoints.Altitude altitudeMain2 = waypointsMain2.new Altitude(44.8);
    waypointsMain2.setLatitude(latitudeMain2);
    waypointsMain2.setLongitude(longitudeMain2);
    waypointsMain2.setAltitude(altitudeMain2);
    waypointsMain2.setDescrption("But our love");
    Track trackMain2 = new MainTrack(waypointsMain2);

    Waypoints waypointsMain3 = new Waypoints();
    Waypoints.Latitude latitudeMain3 = waypointsMain3.new Latitude(-31.94);
    Waypoints.Longitude longitudeMain3 = waypointsMain3.new Longitude(115.75);
    Waypoints.Altitude altitudeMain3 = waypointsMain3.new Altitude(47.1);
    waypointsMain3.setLatitude(latitudeMain3);
    waypointsMain3.setLongitude(longitudeMain3);
    waypointsMain3.setAltitude(altitudeMain3);
    waypointsMain3.setDescrption("Was a song");
    Track trackMain3 = new MainTrack(waypointsMain3);

    Waypoints waypointsMain4 = new Waypoints();
    Waypoints.Latitude latitudeMain4 = waypointsMain4.new Latitude(-31.93);
    Waypoints.Longitude longitudeMain4 = waypointsMain4.new Longitude(115.72);
    Waypoints.Altitude altitudeMain4 = waypointsMain4.new Altitude(40.1);
    waypointsMain4.setLatitude(latitudeMain4);
    waypointsMain4.setLongitude(longitudeMain4);
    waypointsMain4.setAltitude(altitudeMain4);
    waypointsMain4.setDescrption("*theClimb");
    Track trackMain4 = new MainTrack(waypointsMain4);

    Waypoints waypointsMain5 = new Waypoints();
    Waypoints.Latitude latitudeMain5 = waypointsMain5.new Latitude(-31.94);
    Waypoints.Longitude longitudeMain5 = waypointsMain5.new Longitude(115.75);
    Waypoints.Altitude altitudeMain5 = waypointsMain5.new Altitude(47.1);
    waypointsMain5.setLatitude(latitudeMain5);
    waypointsMain5.setLongitude(longitudeMain5);
    waypointsMain5.setAltitude(altitudeMain5);
    waypointsMain5.setDescrption("Sung by a dying swan");
    Track trackMain5 = new MainTrack(waypointsMain5);

    Waypoints waypointsSub = new Waypoints();
    Waypoints.Latitude subLatitude = waypointsSub.new Latitude(-31.95);
    Waypoints.Longitude subLongitude = waypointsSub.new Longitude(115.77);
    Waypoints.Altitude subAltitude = waypointsSub.new Altitude(44.8);
    waypointsSub.setLatitude(subLatitude);
    waypointsSub.setLongitude(subLongitude);
    waypointsSub.setAltitude(subAltitude);
    waypointsSub.setDescrption("I'll stay here");
    Track subTrack = new SubTrack(waypointsSub);

    Waypoints waypointsSub1 = new Waypoints();
    Waypoints.Latitude subLatitude1 = waypointsSub1.new Latitude(-31.93);
    Waypoints.Longitude subLongitude1 = waypointsSub1.new Longitude(115.76);
    Waypoints.Altitude subAltitude1 = waypointsSub1.new Altitude(43.0);
    waypointsSub1.setLatitude(subLatitude1);
    waypointsSub1.setLongitude(subLongitude1);
    waypointsSub1.setAltitude(subAltitude1);
    waypointsSub1.setDescrption("In the shadow");
    Track subTrack1 = new SubTrack(waypointsSub1);

    Waypoints waypointsSub2 = new Waypoints();
    Waypoints.Latitude subLatitude2 = waypointsSub2.new Latitude(-31.94);
    Waypoints.Longitude subLongitude2 = waypointsSub2.new Longitude(115.75);
    Waypoints.Altitude subAltitude2 = waypointsSub2.new Altitude(47.1);
    waypointsSub2.setLatitude(subLatitude2);
    waypointsSub2.setLongitude(subLongitude2);
    waypointsSub2.setAltitude(subAltitude2);
    waypointsSub2.setDescrption("");
    Track subTrack2 = new SubTrack(waypointsSub2);

    OverallTrack overallTrack = new OverallTrack();
    overallTrack.addTrackDetails(track);
    overallTrack.addTrackDetails(trackMain);
    overallTrack.addTrackDetails(trackMain1);
    overallTrack.addTrackDetails(trackMain2);
    overallTrack.addTrackDetails(trackMain3);
    overallTrack.addTrackDetails(trackMain4);
    overallTrack.addTrackDetails(trackMain5);
    overallTrack.addTrackDetails(subTrack);
    overallTrack.addTrackDetails(subTrack1);
    overallTrack.addTrackDetails(subTrack2);

    List<Waypoints> waypointsList = overallTrack.getAllWaypointsDetails();

    ShortestRouteCalculation routeCalculation = new ShortestRouteCalculationImpl();

    ArrayList<Waypoints> nearestNeighbourList =
        routeCalculation.nearestNeighbour(waypointsList, -31.94, 115.75, 47.1);

    System.out.println(nearestNeighbourList.size());
    for (Waypoints way : nearestNeighbourList) {
      System.out.println("Nearest Neighbour [" + way.toString() + "]");
    }
  }
}
