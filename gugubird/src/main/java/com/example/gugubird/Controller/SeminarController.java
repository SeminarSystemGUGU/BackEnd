package com.example.gugubird.Controller;

import com.example.gugubird.Model.SeminarVO;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("seminar")
public class SeminarController {
    @RequestMapping("{seminarId}")
    public SeminarVO getSeminarMessage(@PathVariable("seminarId") String seminarId)
    {
        SeminarVO seminarVO=new SeminarVO();
        seminarVO.setSeminarId(1);
        seminarVO.setSeminarOrder(2);
        seminarVO.setStatus("课前 未报名");
        seminarVO.setReportEndTime("2018-12-29");
        seminarVO.setTime("2018-12-20 七八节课");
        seminarVO.setSeminarTopic("spring详解");
        seminarVO.setSeminarContent("详细讲解spring");
        seminarVO.setSignStartTime("2018-12-4");
        seminarVO.setSignEndTime("2018-12-20");
        seminarVO.setPptEndTime("2018-12-25");
        return seminarVO;
    }
}
