package com.wethio.wethio.models;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

@Entity
@Table(name = "utilisateur")
public class Utilisateur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long iduser;
    @Column
    private String prenom;
    @Column
    private  String nom;
    @Column
    private String telephone;
    @ManyToOne(fetch = FetchType.LAZY, optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "operateurid", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    //@JsonIgnore
    private Operateur operateur;

    public Utilisateur(String prenom, String nom, String telephone) {
        this.prenom = prenom;
        this.nom = nom;
        this.telephone = telephone;
    }

    public Long getIduser() {
        return iduser;
    }

    public void setIduser(Long iduser) {
        this.iduser = iduser;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Operateur getOperateur() {
        return operateur;
    }

    public void setOperateur(Operateur operateur) {
        this.operateur = operateur;
    }
}
