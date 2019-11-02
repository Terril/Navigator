package data;

public class Waypoints {
  private Latitude latitude;
  private Longitude longitude;
  private Altitude altitude;
  private String description;

  public String getDescrption() {
    return description;
  }

  public void setDescrption(String description) {
    this.description = description;
  }

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

    public Latitude(double lat1) {
      this.lat1 = lat1;
    }
  }

  public class Longitude {
    public double long1;

    public Longitude(double lon1) {
      this.long1 = lon1;
    }
  }

  public class Altitude {
    public double alt1;

    public Altitude(double alt1) {
      this.alt1 = alt1;
    }
  }

  @Override
  public String toString() {
    super.toString();
    return latitude.lat1 + ", " + longitude.long1 + ", " + altitude.alt1 + ", " + description;
  }
}
