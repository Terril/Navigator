package track;

import data.Waypoints;

public class SubTrack implements Track {

  private Waypoints waypoints;

  public SubTrack(Waypoints waypoints) {
    this.waypoints = waypoints;
  }

    @Override
    public Waypoints getTrackDetails() {

        return waypoints;
    }
}
