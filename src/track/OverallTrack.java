package track;

import data.Waypoints;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OverallTrack implements Track {

  private List<Track> trackList = new ArrayList<Track>();

  @Override
  public List<Waypoints> getTrackDetails() {
    for (Track track : trackList) {
      return track.getTrackDetails();
    }
    return Collections.emptyList();
  }

  public void addTrackDetails(Track track) {
    trackList.add(track);
  }

  public void removeTrackDetails(Track track) {
    trackList.remove(track);
  }
}
