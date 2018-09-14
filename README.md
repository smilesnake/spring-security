#spring-security
本项目使用spring boot +ssm +spring security 的实例
完成了ssm与spring security的基本配置
使用的是thymeleaf模板

目录说明：
java:
  
  /com/smilesnake/config    前缀包名
     
     /config                配置文件
      
     /controller            controller层
     
     /domain/mapper         mapper接口
     
     /model                 model实体
     
     /service               @service层    使用了@service的注解类都存放在此
     
     /utils                 工具类
     
     Application            启动类
     
resources:

  /mapper      mybatis的xml文件所存放的位置
  
  /static      存放静态文件的位置
  
  /static/css       存放css文件的位置
    
  /templates  存放的是html文件
  
  相关配置都有注释
