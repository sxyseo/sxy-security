package pw.sxy.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pw.sxy.entity.SysUserEntity;
import pw.sxy.utils.ShiroUtils;

/**
 * Controller公共组件
 *
 * @author sxy
 * @email admin@sxyseo.com
 * @date 2017-05-23 15:22:06
 */
public abstract class AbstractController {
    protected Logger logger = LoggerFactory.getLogger(getClass());

    protected SysUserEntity getUser() {
        return ShiroUtils.getUserEntity();
    }

    protected Long getUserId() {
        return getUser().getUserId();
    }
}
