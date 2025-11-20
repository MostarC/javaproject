package com.mostarc.eyeglass.service.impl;

import com.mostarc.eyeglass.dao.EyeglassDao;
import com.mostarc.eyeglass.pojo.dto.EyeglassById;
import com.mostarc.eyeglass.pojo.dto.EyeglassList;
import com.mostarc.eyeglass.service.EyeglassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class EyeglassServiceImpl implements EyeglassService {
    @Autowired
    private EyeglassDao eyeglassDao;
    @Override
    public List<EyeglassList> search(Integer myopia, String brand, Double lowPrice, Double highPrice) {
        Double[] refractivity = {0d,0d};
        if (myopia >=0&& myopia<=300){
            refractivity[0]=0d;
            refractivity[1]=1.60;
        }else if (myopia>300&&myopia<=600){
            refractivity[0]=1.60;
            refractivity[1]=1.70;
        }else if (myopia>600){
            refractivity[0]=1.70;
            refractivity[1]=2d;
        }
        return eyeglassDao.search(refractivity,brand,lowPrice,highPrice);
    }

    @Override
    public List<EyeglassById> getEyeglassById(Integer id) {
        return eyeglassDao.getEyeglassById(id);
    }

    @Override
    public int submitassess(Integer eyeglassId,String content) {
        return eyeglassDao.submitassess(eyeglassId,content);
    }
}
