package com.mostarc.eyeglass.controller;


import com.mostarc.eyeglass.pojo.dto.EyeglassById;
import com.mostarc.eyeglass.pojo.dto.EyeglassList;
import com.mostarc.eyeglass.service.EyeglassService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EyeglassController {

    @Autowired
    private EyeglassService eyeglassService;

    // 搜索
    @GetMapping("/search")
    public List<EyeglassList> search(@RequestParam(name = "myopia", required = false) Integer myopia,
                                     @RequestParam(name = "brand", required = false) String brand,
                                     @RequestParam(name = "lowPrice", required = false) Double lowPrice,
                                     @RequestParam(name = "highPrice", required = false) Double highPrice) {
        return eyeglassService.search(myopia, brand, lowPrice, highPrice);
    }

    // 根据id查询眼镜详细信息
    @GetMapping("/project")
    public List<EyeglassById> getEyeglassById(@RequestParam("id") Integer id) {
        return eyeglassService.getEyeglassById(id);
    }

    // 提交评价
    @PostMapping("/submitassess")
    public Boolean submitassess(@RequestParam("eyeglassId") Integer eyeglassId,
                                @RequestParam("content") String content) {
        int submitassess = eyeglassService.submitassess(eyeglassId, content);
        if (submitassess == 0) {
            return false;
        }
        return true;
    }


}
