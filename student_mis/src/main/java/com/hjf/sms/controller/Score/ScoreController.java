package com.hjf.sms.controller.Score;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.hjf.sms.dto.Course;
import com.hjf.sms.dto.Score;
import com.hjf.sms.service.Score.ScoreService;
import com.hjf.sms.utils.PagingResult;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


/**
 * Description 成绩查询控制层
 **/
@ResponseBody
@RestController
@RequestMapping("/api/sms/score")
public class ScoreController {

  @Autowired
  private ScoreService scoreService;
  @GetMapping("/getCourseList")
  public PagingResult<Course> getCourseList (@RequestParam Map<String, Object> condition,
                                             @RequestParam(required = false, name = "$limit", defaultValue = "10") Integer limit,
                                             @RequestParam(required = false, name = "$offset", defaultValue = "0") Integer offset) {
    RowBounds rowBounds = new RowBounds(offset, limit);
    return scoreService.getCourseList(rowBounds, condition);
  }
  @RequestMapping
  public void addEntry(@RequestParam JSONArray UserScore) {
    List<Score> list = JSONObject.parseArray(UserScore.toJSONString(), Score.class);
    scoreService.addEntry(list);
  }
  @GetMapping("/export")
  public List<Course> getExportList (@RequestParam Map<String, Object> condition) {
    return scoreService.getExportList(condition);
  }
  @GetMapping("/getUserNum")
  public List<Map<String, Object>> getUserNum (@RequestParam Map<String, Object> condition) {
    return scoreService.getUserNum(condition);
  }

  @GetMapping("/getUserTotal")
  public Map<String, Object> getUserTotal (@RequestParam Map<String, Object> condition) {
    return scoreService.getUserTotal(condition);
  }
}
