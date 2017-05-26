package pw.sxy.service;

import pw.sxy.entity.UserEntity;

import java.util.List;
import java.util.Map;

/**
 * 用户
 *
 * @author sxy
 * @email admin@sxyseo.com
 * @date 2017-05-23 15:22:06
 */
public interface UserService {

    UserEntity queryObject(Long userId);

    List<UserEntity> queryList(Map<String, Object> map);

    int queryTotal(Map<String, Object> map);

    // 新增
    void save(UserEntity user);

    // 更新
    void update(UserEntity user);

    // 删除
    void delete(Long userId);

    void deleteBatch(Long[] userIds);

    UserEntity queryByMobile(String mobile);

    /**
     * 用户登录
     *
     * @param mobile   手机号
     * @param password 密码
     * @return 返回用户ID
     */
    long login(String mobile, String password);
}
