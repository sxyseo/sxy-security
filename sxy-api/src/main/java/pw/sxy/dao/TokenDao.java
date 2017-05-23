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

    TokenEntity queryByUserId(Long userId);

    TokenEntity queryByToken(String token);

}
