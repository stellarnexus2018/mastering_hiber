package Entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class studentAddress {


  @Column(name = "city")
  private String city;
  @Column(name = "country")
  private String country;
  @Column(name = "address")
  private String address;

  @Override
  public String toString() {
    return "studentAddress{" +
        "city='" + city + '\'' +
        ", country='" + country + '\'' +
        ", address='" + address + '\'' +
        '}';
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }
}
