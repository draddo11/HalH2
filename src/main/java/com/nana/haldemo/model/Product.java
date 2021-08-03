package com.nana.haldemo.model;

import lombok.Data;
import org.springframework.data.annotation.Id;

import javax.persistence.*;


    @Entity
    @Data
    public class Product {
        @javax.persistence.Id
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;
        private String name;
        private String code;
        private String title;
        private String description;
        private String imgUrl;
        private double price;

        @Id
        @ManyToOne
        @JoinColumn(name = "CATEGORY_ID")
        private Category category;

        public Product(){}

        public void setId(Long id) {
            this.id = Math.toIntExact(id);
        }

        public int getId() {
            return id;
        }
    }

