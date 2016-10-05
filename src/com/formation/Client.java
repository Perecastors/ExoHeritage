package com.formation;

/**
 * Created by Formation on 05/10/2016.
 */
public class Client extends Personne {

    private String idClient;

    public Client(String nom, String prenom,int jourDeNaissance,int moisDeNaissance,int anneeDeNaissance) {
        super(nom, prenom,1970,1,1);
    }
}
