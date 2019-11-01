package track;

import data.Waypoints;

public class MainTrack implements Track {

  private Waypoints waypoints;

  public MainTrack(Waypoints waypoints) {
    this.waypoints = waypoints;
  }

  @Override
  public Waypoints getTrackDetails() {

    return waypoints;
  }
}
