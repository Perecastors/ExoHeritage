package com.formation;

import com.sun.org.apache.xpath.internal.SourceTree;

import javax.swing.*;
import java.time.*;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import java.util.Date;

/**
 * Created by Formation on 05/10/2016.
 */
public class Personne {
    private String nom;
    private String prenom;
    private LocalDate dateDeNaissance;

    public Personne(String nom,String prenom,int jourDeNaissance,int moisDeNaissance,int anneeDeNaissance){
        LocalDate localdate = LocalDate.of(anneeDeNaissance,moisDeNaissance,jourDeNaissance);
        this.nom = nom;
        this.prenom = prenom;
        this.dateDeNaissance = localdate ;
    }

    public Personne(String nom,String prenom){
        LocalDate localdate = LocalDate.of(1970,1,1);
        this.nom = nom;
        this.prenom = prenom;
        this.dateDeNaissance = localdate ;
    }

    public void calculerAge(){
        Long age = this.dateDeNaissance.until(LocalDate.now(),ChronoUnit.YEARS);
        System.out.println(this.prenom + " " +this.nom +   " a :"+ age + " ans");
    }
}
