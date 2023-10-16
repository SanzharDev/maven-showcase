package hello;

public class Store {
  private Long id;
  private String name;
  private String address;

  public Store() {

  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  @java.lang.Override
  public java.lang.String toString() {
    return "Store{" +
      "id=" + id +
      ", name='" + name + '\'' +
      ", address='" + address + '\'' +
      '}';
  }
}