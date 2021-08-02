package entities;

import javax.persistence.*;
import java.sql.Date;
@Entity
@Table(name = "contracts")
public class Contract {
    @Id
    @Column (name = "number_contract")
    private Integer numberContract;

    @Column (name = "date_of_conclusion")
    private Date dateOfConclusion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_client")
    private Client client;

    public Contract() {
    }

    public Contract(Integer numberContract, Date dateOfConclusion) {
        this.numberContract = numberContract;
        this.dateOfConclusion = dateOfConclusion;
    }

    public Integer getNumberContract() {
        return numberContract;
    }

    public void setNumberContract(Integer numberContract) {
        this.numberContract = numberContract;
    }

    public Date getDateOfConclusion() {
        return dateOfConclusion;
    }

    public void setDateOfConclusion(Date dateOfConclusion) {
        this.dateOfConclusion = dateOfConclusion;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
