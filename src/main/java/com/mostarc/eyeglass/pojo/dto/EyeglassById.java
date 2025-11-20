package com.mostarc.eyeglass.pojo.dto;

import com.mostarc.eyeglass.pojo.entity.Comment;
import lombok.Data;

import java.util.List;

@Data
public class EyeglassById {

    private int id;

    private String imgUrl;

    private Double price;

    private String brand;

    private String name;

    private Double refractivity;

    private List<Comment> comment;
}
