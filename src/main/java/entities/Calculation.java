package entities;

import enums.PostgreSQLEnumType;
import enums.TypeOfProperty;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

import javax.persistence.*;
import java.sql.Date;

import static constants.ConclusionConstants.*;

@Entity
@Table(name = "calculations")
@TypeDef(name = "type", typeClass = PostgreSQLEnumType.class)
public class Calculation {
    @Id
    @Column (name = "number_contract")
    private Integer numberContract;
    private Integer sum;
    @Column(name = "term_from")
    private Date termFrom;
    @Column(name = "term_to")
    private Date termTo;
    private Double square;
    @Column(name = "year_of_construction")
    private Integer yearOfConstruction;

    @Enumerated(EnumType.STRING)
    @Type(type = "type")
    private TypeOfProperty immovables;

    public Calculation() {
    }

    public Calculation(Integer numberContract, Integer sum, Date termFrom, Date termTo, Double square, Integer yearOfConstruction, TypeOfProperty immovables) {
        this.numberContract = numberContract;
        this.sum = sum;
        this.termFrom = termFrom;
        this.termTo = termTo;
        this.square = square;
        this.yearOfConstruction = yearOfConstruction;
        this.immovables = immovables;
    }

    public Double getConclusion() {
        Double yearOfConstructionCoefficient =
                yearOfConstruction > 2000 ?
                        (yearOfConstruction < 2014 ? BETWEEN_2000_AND_2014 : YEAR_2015)
                        : BEFORE_2000_YEAR;
        Double squareCoefficient =
                square > 50 ? (square < 100 ? SQUARE_BETWEEN_50_AND_100 : SQUARE_MORE_100) : SQUARE_LESS_50;
        Double propertyCoefficient;
        switch (immovables) {
            case apartment:
                propertyCoefficient = APARTMENT_COEFFICIENT;
                break;
            case house:
                propertyCoefficient = HOUSE_COEFFICIENT;
                break;
            case room:
                propertyCoefficient = ROOM_COEFFICIENT;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + immovables);
        }
        return (double) sum / (Math.
                round((termTo.getTime() - termFrom.getTime()) / (double) 86400000)) * propertyCoefficient * squareCoefficient * yearOfConstructionCoefficient;
    }

    public Integer getSum() {
        return sum;
    }

    public void setSum(Integer sum) {
        this.sum = sum;
    }

    public Integer getYearOfConstruction() {
        return yearOfConstruction;
    }

    public void setYearOfConstruction(Integer yearOfConstruction) {
        this.yearOfConstruction = yearOfConstruction;
    }

    public Integer getNumberContract() {
        return numberContract;
    }

    public void setNumberContract(Integer numberContract) {
        this.numberContract = numberContract;
    }

    public Date getTermFrom() {
        return termFrom;
    }

    public void setTermFrom(Date termFrom) {
        this.termFrom = termFrom;
    }

    public Date getTermTo() {
        return termTo;
    }

    public void setTermTo(Date termTo) {
        this.termTo = termTo;
    }

    public Double getSquare() {
        return square;
    }

    public void setSquare(Double square) {
        this.square = square;
    }

    public TypeOfProperty getImmovables() {
        return immovables;
    }

    public void setImmovables(TypeOfProperty immovables) {
        this.immovables = immovables;
    }
}
