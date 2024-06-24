package fr.fdr.javawebstock.pojo;

import lombok.Data;

@Data
public class Produit {
    private Long produit_id;
    private String nom;
    private String description;
    private Float prix;
    private Integer quantite;
}
