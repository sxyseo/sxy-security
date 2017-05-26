package pw.sxy.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 自定义注解 使用@interface关键字定义注解
 * 登录用户信息
 *
 * @author sxy
 * @email admin@sxyseo.com
 * @date 2017-05-23 15:22:06
 */
@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
public @interface LoginUser {
    // 若有成员 以无参无异常方式声明
    // 成员类型是受限的，合法的类型包括原始类型及String,Class,Annotation,
    // 如果注解只有一个成员，则成员名必须取名为value(),在使用时可以忽略成员和赋值号(=)
    // 注解类可以没有成员，没有成员的注解成为标识注解
}
