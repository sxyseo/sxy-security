package pw.sxy.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pw.sxy.annotation.IgnoreAuth;
import pw.sxy.annotation.LoginUser;
import pw.sxy.entity.UserEntity;
import pw.sxy.utils.R;

/**
 * API测试接口
 *
 * @author sxy
 * @email admin@sxyseo.com
 * @date 2017-05-23 15:22:06
 */
@RestController
@RequestMapping("/api")
public class ApiTestController {

    /**
     * 获取用户信息
     */
    @GetMapping("userInfo")
    public R userInfo(@LoginUser UserEntity user) {

        return R.ok().put("user", user);
    }

    /**
     * 忽略Token验证测试
     */
    // 使用 IgnoreAuth注解 忽略Token验证
    @IgnoreAuth
    @GetMapping("notToken")
    public R notToken() {
        // 忽略Token验证访问
        return R.ok().put("message", "无需token也能访问。。。");
    }
}
