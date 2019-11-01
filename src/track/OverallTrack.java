package track;

import data.Waypoints;

import java.util.ArrayList;
import java.util.List;

public class OverallTrack implements Track {

  private List<Track> trackList = new ArrayList<>();
  private List<Waypoints>  waypointsList = new ArrayList<>();

  @Override
  public Waypoints getTrackDetails() {
    for (Track track : trackList) {
     return track.getTrackDetails();
    }
    return null;
  }

  public List<Waypoints> getAllWaypointsDetails() {
    return waypointsList;
  }

  public void addTrackDetails(Track track) {
    waypointsList.add(track.getTrackDetails());
    trackList.add(track);
  }

  public void removeTrackDetails(Track track) {
    trackList.remove(track);
  }
}
