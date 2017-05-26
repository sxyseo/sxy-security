package pw.sxy.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pw.sxy.annotation.IgnoreAuth;
import pw.sxy.entity.UserEntity;
import pw.sxy.service.UserService;
import pw.sxy.utils.R;
import pw.sxy.validator.Assert;

/**
 * 注册
 *
 * @author sxy
 * @email admin@sxyseo.com
 * @date 2017-05-23 15:22:06
 */
@RestController
@RequestMapping("/api")
public class ApiRegisterController {
    @Autowired
    private UserService userService;

    /**
     * 注册
     */
    // 使用 IgnoreAuth注解 忽略Token验证
    @IgnoreAuth
    @PostMapping("register")
    // R 返回数据
    public R register(@RequestBody UserEntity user) {
        // Assert 数据校验 判空
        Assert.isBlank(user.getMobile(), "手机号不能为空");
        Assert.isBlank(user.getPassword(), "密码不能为空");

        userService.save(user);

        return R.ok();
    }
}
