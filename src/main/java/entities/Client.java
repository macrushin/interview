package entities;

import javax.persistence.*;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "clients")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String surname;

    private String father;

    @Column(name = "data_born")
    private Date dateBorn;

    @OneToMany(mappedBy = "client", cascade = CascadeType.REMOVE, orphanRemoval = true)
    private List<Contract> contracts = new ArrayList<>();

    @Column(name = "passport_series")
    private Integer passportSeries;

    @Column(name = "passport_number")
    private Integer passportNumber;

    public Client() {
    }

    public Client(String name, String surname, String father, Date dateBorn, Integer passportSeries, Integer passportNumber) {
        this.name = name;
        this.surname = surname;
        this.father = father;
        this.dateBorn = dateBorn;
        this.passportSeries = passportSeries;
        this.passportNumber = passportNumber;
    }

    public Integer getId() {
        return id;
    }
    public void addContract(Contract contract)
    {
        contract.setClient(this);
        contracts.add(contract);
    }
    public void removeContract(Contract contract)
    {
        contracts.remove(contract);
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Contract> getContracts() {
        return contracts;
    }

    public void setContracts(List<Contract> contracts) {
        this.contracts = contracts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFather() {
        return father;
    }

    public void setFather(String father) {
        this.father = father;
    }

    public Date getDateBorn() {
        return dateBorn;
    }

    public void setDateBorn(Date dateBorn) {
        this.dateBorn = dateBorn;
    }

    public Integer getPassportSeries() {
        return passportSeries;
    }

    public void setPassportSeries(Integer passportSeries) {
        this.passportSeries = passportSeries;
    }

    public Integer getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(Integer passportNumber) {
        this.passportNumber = passportNumber;
    }
}
