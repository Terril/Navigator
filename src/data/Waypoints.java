package data;

public class Waypoints {
  private Latitude latitude;
  private Longitude longitude;
  private Altitude altitude;

  public Latitude getLatitude() {
    return latitude;
  }

  public void setLatitude(Latitude latitude) {
    this.latitude = latitude;
  }

  public Longitude getLongitude() {
    return longitude;
  }

  public void setLongitude(Longitude longitude) {
    this.longitude = longitude;
  }

  public Altitude getAltitude() {
    return altitude;
  }

  public void setAltitude(Altitude altitude) {
    this.altitude = altitude;
  }

  public class Latitude {

    public double lat1;
    public double lat2;

    public Latitude(double lat1, double lat2) {
      this.lat1 = lat1;
      this.lat2 = lat2;
    }
  }

  public class Longitude {
    public double long1;
    public double long2;

    public Longitude(double lon1, double lon2) {
      this.long1 = lon1;
      this.long2 = lon2;
    }
  }

  public class Altitude {
    public double alt1;
    public double alt2;

    public Altitude(double alt1, double alt2) {
      this.alt1 = alt1;
      this.alt2 = alt2;
    }
  }

  @Override
  public String toString() {
    super.toString();
    return latitude.lat1 + ", " + longitude.long1+ " ," +altitude.alt1;
  }
}
