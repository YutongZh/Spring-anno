1.@con  
2.@scope

2.Bean的生命周期
3.BeanPostProcessor
a.注解autowired --> 起作用的是AutoWireAnnotationBeanPostProcessor
处理器也是一个bean，控制我们的业务bean，也会注册到IOC容器
applyBeanPostProcessorsBeforeInitialization(wrappedBean, beanName);
for(将spring的所有的processor进行遍历){
    AutoWireAnnotationBeanPostProcessor
}
bean在运行的时候才能找到他的类型
@Async 可以异步执行方法

1.ApplicationContextAware实现分析  可以直接拿到applicationContext处理
2.BeanValidationPostProcessor实现分析  数据校验和过滤
3.InitDestroyAnnotationBeanPostProcessor实现分析  @PreDestory实现此处理器

每个注解都对应相应的后置处理器。
Spring底层对BeanPostProcessor的使用，完成对bean的赋值，注入其他组件，生命周期注解功能

@Autowired @Service @inject

@Value
beans.xml -->location ="classPath:/*.properties"
properties 与 yml
mysql.info.url = 127.0.0.1
mysql
  info
    url:127.0.0.1
    
    
demo9 
@autowire 优先级高于@bean
@qualifier（"testDao"） 指定到容器中  多处都需要qualifier 则可以考虑Primary来指定优先
@Primary 指定优先级  spring进行自动装配的时候默认首选的bean 有指定qualifier则按照指定的来
@resource （name="testDao2"）JSR250  JDK  效果是一样的 1.不支持Primary功能 2.不支持autowired false 如果找不到会报错
@Inject JSR330 可以完成我们的bean装配 不依赖spring 需要POM引入包 inject 和autowired功能差不多，支持Primary 只是没有autowired 为false的功能 如果找不到会报错
1.bean组件加载优先级？
@autowire 优先级高于 @bean
如果有多个容器中有多个相同的bean，则使用@qualifier（"testDao"）指定
2.如果容器中存在两个相同的beanid，会加载哪个bean？
不会存在两个相同的beanid，单例缓存

demo10
复习：容器启动加载配置类-->refresh()-->finishBeanFactoryInitalization()-->
getBean --> doCreateBean() --> 封装为beanWrapper(对象的创建) --> 
populated(属性的赋值) --> inializate() --> processors -->aware
IOC bean 初始化丢到容器
IOC bean 放到MAP

AutoWired  1.方法加载  2.方法内部的使用参数加载  3.构造方法加载

自动装配：spring组件
使用了spring Aware 你的bean将会和spring框架耦合，
aware 的目的是为了让bean获取spring容器的服务：

//总结：
把Spring底层的组件可以注入到自定义的bean中，ApplicationContextAware是利用ApplicationContextAwareProcessor来处理的，
其他类似XXXAware，都有相关的Processor来处理，XXXAware-->功能使用了XXXProcessor来处理的；

demo10 AOP
环绕通知比前置通知执行还要早
执行顺序：
        环绕通知运行目标方法之前
        除法运行之前----参数列表：{}
        -------
        环绕通知运行目标方法之后
        除法运行结束....
        除法正常返回----运行结果是：{}
        
AOP源码解析：
AnnotationAwareAspectAutoProxyCreator为核心类
AnnotationAwareAspectAutoProxyCreator前置处理逻辑(基本返回为null)： 
refresh() -->
优先处理PriorityOrdered,其次处理实现ordered接口（aop的核心类createor） 
 --> 进入getBean()  -->resolveBeforeInstiation()-->
 applyBeanPostProcessorsBeforeInstantiation() (createror真正的前置) 
 --> ibd.postProcessBeforeInstantiation()
 
 AnnotationAwareAspectAutoProxyCreator后置处理逻辑：
 initialization() 方法中 --> postProcessAfterInitalization
 -->wrapIfNecessary()-->拿到所有增强方法 -->创建增强的动态代理对象
 
 增强排序？ 方法排序 倒序异常 返回  
 
 获取拦截链 = MethodInterceptor
 链式待用通知方法
 
 AOP 注解下的拦截方法都有相应的处理类 

 


