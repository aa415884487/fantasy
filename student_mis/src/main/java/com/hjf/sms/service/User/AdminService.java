package com.hjf.sms.service.User;

import com.hjf.sms.dto.User;
import com.hjf.sms.utils.PagingResult;
import org.apache.ibatis.session.RowBounds;

import java.util.List;
import java.util.Map;

/**
 * Description 管理员Service层
 **/
public interface AdminService {
  /**
   * description: 新增学生账号
   * @param user
   * @return void
   */
  void add(User user);

  /**
   * description: 删除学生账号
   *
   * @param ids
   * @return void
   */
  void delete(List<Integer> ids);

  /**
   * description: 修改学生账号
   *
   * @param user
   * @return void
   */
  void update(User user);

  PagingResult<User> getAdminList(RowBounds rowBounds, Map<String, Object> condition);
}
