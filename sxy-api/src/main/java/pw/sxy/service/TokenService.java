package pw.sxy.service;

import pw.sxy.entity.TokenEntity;

import java.util.Map;

/**
 * 用户Token
 *
 * @author sxy
 * @email admin@sxyseo.com
 * @date 2017-05-23 15:22:07
 */
public interface TokenService {

    TokenEntity queryByUserId(Long userId);

    TokenEntity queryByToken(String token);

    void save(TokenEntity token);

    void update(TokenEntity token);

    /**
     * 生成token
     *
     * @param userId 用户ID
     * @return 返回token相关信息
     */
    Map<String, Object> createToken(long userId);

}
