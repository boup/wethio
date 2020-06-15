package com.wethio.wethio.models;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;


import javax.persistence.*;

@Entity
@Table(name = "transaction")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String telephonecible;
    @Column
    private Long montant;

    @ManyToOne(fetch = FetchType.LAZY, optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "iduse", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    //@JsonIgnore
    private Utilisateur utilisateur;
    @ManyToOne(fetch = FetchType.LAZY, optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "idnature", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    //@JsonIgnore
    private NatureTransaction nature;
    @ManyToOne(fetch = FetchType.LAZY, optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "idetat", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    //@JsonIgnore
    private Etat etat;

    public Transaction() {
    }

    public Transaction(String telephonecible, Long montant) {
        this.telephonecible = telephonecible;
        this.montant = montant;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTelephonecible() {
        return telephonecible;
    }

    public void setTelephonecible(String telephonecible) {
        this.telephonecible = telephonecible;
    }

    public Long getMontant() {
        return montant;
    }

    public void setMontant(Long montant) {
        this.montant = montant;
    }


    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

    public NatureTransaction getNature() {
        return nature;
    }

    public void setNature(NatureTransaction nature) {
        this.nature = nature;
    }

    public Etat getEtat() {
        return etat;
    }

    public void setEtat(Etat etat) {
        this.etat = etat;
    }
}
