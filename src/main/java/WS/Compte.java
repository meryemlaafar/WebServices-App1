package WS;

import java.util.Date;

public class Compte {
    private double code;
    private double solde;
    private Date dateCreation;

    public Date getDateCreation() {
        return dateCreation;
    }

    public double getCode() {
        return code;
    }

    public double getSolde() {
        return solde;
    }

    public Compte() {
    }


    public Compte(double code,double solde,Date dateCreation) {
        this.code = code;
        this.solde=solde;
        this.dateCreation=dateCreation;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public void setCode(double code) {
        this.code = code;
    }
}
