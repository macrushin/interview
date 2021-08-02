package entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "addresses")
public class Address {
    @Id
    @Column(name = "id_contract")
    private Integer idContract;
    private String state;
    private Integer index;
    private String region;
    private String area;
    private String city;
    private String street;
    private Integer house;
    private Integer korpus;
    private Integer stroinie;
    private Integer apartment;

    public Address() {
    }

    public Address(Integer idContract, String state, Integer index, String region, String area, String city, String street, Integer house, Integer korpus, Integer stroinie, Integer apartment) {
        this.idContract = idContract;
        this.state = state;
        this.index = index;
        this.region = region;
        this.area = area;
        this.city = city;
        this.street = street;
        this.house = house;
        this.korpus = korpus;
        this.stroinie = stroinie;
        this.apartment = apartment;
    }

    public Integer getIdContract() {
        return idContract;
    }

    public void setIdContract(Integer idContract) {
        this.idContract = idContract;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Integer getHouse() {
        return house;
    }

    public void setHouse(Integer house) {
        this.house = house;
    }

    public Integer getKorpus() {
        return korpus;
    }

    public void setKorpus(Integer korpus) {
        this.korpus = korpus;
    }

    public Integer getStroinie() {
        return stroinie;
    }

    public void setStroinie(Integer stroinie) {
        this.stroinie = stroinie;
    }

    public Integer getApartment() {
        return apartment;
    }

    public void setApartment(Integer apartment) {
        this.apartment = apartment;
    }
}
