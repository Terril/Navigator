package track;

import data.Waypoints;

import java.util.ArrayList;
import java.util.List;

public class MainTrack implements Track {

  private Waypoints waypoints;

  public MainTrack(Waypoints waypoints) {
    this.waypoints = waypoints;
  }

  @Override
  public List<Waypoints> getTrackDetails() {
    List<Waypoints> point = new ArrayList<>();
    point.add(waypoints);
    return point;
  }
}
