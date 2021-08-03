package com.nana.haldemo.model;

import lombok.Data;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


    @Entity
    @Data
    public class Category {
        @Id
        @javax.persistence.Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;
        private String name;
        private String title;
        private String description;

        public Category(){}

        public void setId(Long id) {
            this.id = Math.toIntExact(id);
        }

        public int getId() {
            return id;
        }
    }

