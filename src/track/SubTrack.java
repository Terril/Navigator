package track;

import data.Waypoints;

import java.util.ArrayList;
import java.util.List;

public class SubTrack implements Track {

  private Waypoints waypoints;

  public SubTrack(Waypoints waypoints) {
    this.waypoints = waypoints;
  }

    @Override
    public List<Waypoints> getTrackDetails() {
        List<Waypoints> point = new ArrayList<>();
        point.add(waypoints);
        return point;
    }
}
