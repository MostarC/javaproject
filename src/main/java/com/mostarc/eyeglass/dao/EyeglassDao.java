package com.mostarc.eyeglass.dao;

import com.mostarc.eyeglass.pojo.dto.EyeglassById;
import com.mostarc.eyeglass.pojo.dto.EyeglassList;
import com.mostarc.eyeglass.pojo.entity.EyeglassDetail;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface EyeglassDao {

    List<EyeglassList> search(@Param("refractivity")Double[] refractivity, @Param("brand") String brand, @Param("lowPrice")Double lowPrice,@Param("highPrice") Double highPrice);

    List<EyeglassById> getEyeglassById(Integer id);

    int submitassess(@Param("eyeglassId") Integer eyeglassId,@Param("content") String content);
}
