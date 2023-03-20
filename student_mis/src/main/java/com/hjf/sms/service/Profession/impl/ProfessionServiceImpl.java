package com.hjf.sms.service.Profession.impl;

import com.hjf.sms.service.Profession.ProfessionService;
import com.hjf.sms.dao.Profession.ProfessionMapper;
import com.hjf.sms.domain.Profession;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Description
 **/
@Service
public class ProfessionServiceImpl implements ProfessionService {
  @Resource
  private ProfessionMapper professionMapper;

  @Override
  public List<Profession> getProfessionList() {
    return professionMapper.getProfessionList();
  }
}
