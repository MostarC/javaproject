package com.mostarc.eyeglass.service;

import com.mostarc.eyeglass.pojo.dto.EyeglassById;
import com.mostarc.eyeglass.pojo.dto.EyeglassList;

import java.util.List;

public interface EyeglassService {
    List<EyeglassList> search(Integer myopia, String brand, Double lowPrice, Double highPrice);

    List<EyeglassById> getEyeglassById(Integer id);

    int submitassess(Integer eyeglassId,String content);
}
