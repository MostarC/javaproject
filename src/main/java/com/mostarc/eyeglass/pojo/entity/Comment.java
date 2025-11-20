package com.mostarc.eyeglass.pojo.entity;

import lombok.Data;

@Data
public class Comment {

    private int id;

    private String content;

    private int eyeglassId;
}
