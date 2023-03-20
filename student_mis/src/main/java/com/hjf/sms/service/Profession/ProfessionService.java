package com.hjf.sms.service.Profession;

import com.hjf.sms.domain.Profession;

import java.util.List;

/**
 * Description 专业信息Service层
 **/
public interface ProfessionService {
/**
* description: 获取专业
*/
  List<Profession> getProfessionList();
}
