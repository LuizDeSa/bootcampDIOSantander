package com.project.bootcamp.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "tb_stock")
public class Stock {//reflexo do banco de dados

    @Id//indica que é a chave primaria
    @GeneratedValue(strategy = GenerationType.AUTO)//caso o banco não realize o auto incrmento, java iria fazer;
    //@GeneratedValue(strategy = GenerationType.IDENTITY)//caso o banco realize o auto incrmento;
    @Column(name = "id")//igual ao banco de dados;
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private Double price;

    @Column(name = "variation")
    private Double variation;

    @Column(name = "date")
    private LocalDate date;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getVariation() {
        return variation;
    }

    public void setVariation(Double variation) {
        this.variation = variation;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
