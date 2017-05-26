package pw.sxy.dao;

import pw.sxy.entity.TokenEntity;

/**
 * 用户Token
 *
 * @author sxy
 * @email admin@sxyseo.com
 * @date 2017-05-23 15:22:07
 */
public interface TokenDao extends BaseDao<TokenEntity> {

    // 获取token信息通过用户ID
    TokenEntity queryByUserId(Long userId);

    // 获取token信息通过用户token值
    TokenEntity queryByToken(String token);

}
