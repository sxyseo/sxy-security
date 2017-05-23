package pw.sxy.annotation;

import java.lang.annotation.*;

/**
 * 忽略Token验证
 *
 * @author sxy
 * @email admin@sxyseo.com
 * @date 2017-05-23 15:15:15
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface IgnoreAuth {

}
