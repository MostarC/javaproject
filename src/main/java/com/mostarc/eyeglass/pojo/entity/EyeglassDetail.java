package com.mostarc.eyeglass.pojo.entity;


import lombok.Data;

@Data
public class EyeglassDetail {

    private Integer id;

    private String brand;

    private String name;

    private Double refractivity;

    private Double price;

    private String imgUrl;
}
