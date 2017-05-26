
##自定义注解 使用@interface关键字定义注解

####若有成员 以无参无异常方式声明
####成员类型是受限的，合法的类型包括原始类型及String,Class,Annotation,
####如果注解只有一个成员，则成员名必须取名为value(),在使用时可以忽略成员和赋值号(=)
####注解类可以没有成员，没有成员的注解成为标识注解


## 元注解

###  @Target(ElementType.METHOD)
#### 这里的ElementType有
#### CONSTRUCTOR 构造方法申明
#### FIELD 字段申明
#### LOCAL_VARIABLE 局部变量申明
#### METHOD 方法申明
#### PACKAGE 包声明
#### PARAMETER 参数申明
#### TYPE 类接口

###  @Retention(RetentionPolicy.RUNTIME)
#### 这里的RetentionPolicy有
#### SOURCE 只有在源码显示，编译时会丢弃
#### CLASS 编译时会记录到class中，运行时忽略
#### RUNTIIME 运行时存在，可以通过反射读取

###  @Inherited 允许子类继承

###  @Documented 生成javadoc时会包含注解

###
使用自定义注解
####
@<注解名>(<成员名1>=<成员值1>,<成员名2>=<成员值2>,...)
####
eg:  
`
@Description（desc="I am eyeColor" ,author="Mooc boy",age="18"）
public String eyeColor(){
    return "red";
}`