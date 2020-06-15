package com.wethio.wethio.models;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

@Entity
@Table(name="naturetransaction")
public class NatureTransaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idnature;
    @Column
    private String nature;
    @Column
    private Long tauxchange;
    @ManyToOne(fetch = FetchType.LAZY, optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "idsource", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    //@JsonIgnore
    private Operateur source;
    @ManyToOne(fetch = FetchType.LAZY, optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "idcible", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    //@JsonIgnore
    private Operateur cible;

    public NatureTransaction() {
    }

    public NatureTransaction(String nature, Long tauxchange) {
        this.nature = nature;
        this.tauxchange = tauxchange;
    }

    public Long getIdnature() {
        return idnature;
    }

    public void setIdnature(Long idnature) {
        this.idnature = idnature;
    }

    public String getNature() {
        return nature;
    }

    public void setNature(String nature) {
        this.nature = nature;
    }

    public Long getTauxchange() {
        return tauxchange;
    }

    public void setTauxchange(Long tauxchange) {
        this.tauxchange = tauxchange;
    }

    public Operateur getSource() {
        return source;
    }

    public void setSource(Operateur source) {
        this.source = source;
    }

    public Operateur getCible() {
        return cible;
    }

    public void setCible(Operateur cible) {
        this.cible = cible;
    }
}
