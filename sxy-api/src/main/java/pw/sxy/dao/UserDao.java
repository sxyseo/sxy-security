package pw.sxy.dao;

import pw.sxy.entity.UserEntity;

/**
 * 用户
 *
 * @author sxy
 * @email admin@sxyseo.com
 * @date 2017-05-23 15:22:06
 */
public interface UserDao extends BaseDao<UserEntity> {

    // 获取用户信息通过用户手机号
    UserEntity queryByMobile(String mobile);
}
