# springboot  
#### 项目结构  
###### 代码层的结构  

根目录：com.example.springboot  
1. 工程启动类(ApplicationServer.java)置于com.example.demo.java.build包下  
2. 实体类(domain)置于com.example.demo.java.domain  
3. 数据访问层(Dao)置于com.example.demo.java.repository  
4. 数据服务层(Service)置于com.example.demo.java.service,数据服务的实现接口(serviceImpl)至于com.example.demo.java.service.impl  
5. 前端控制器(Controller)置于com.example.demo.java.controller  
6. 工具类(utils)置于com.example.demo.java.utils  
7. 常量接口类(constant)置于com.example.demo.java.constant  
8. 配置信息类(config)置于com.example.demo.java.config  
9. 数据传输类(vo)置于com.example.demo.java.vo    

资源文件的结构  
根目录:src/main/resources  
1. 配置文件(.properties/.json等)置于config文件夹下  
2. 国际化(i18n))置于i18n文件夹下  
3. spring.xml置于META-INF/spring文件夹下  
4. 页面以及js/css/image等置于static文件夹下的各自文件下  


<!-- [基于SpringBoot开发一套完整的项目](https://blog.csdn.net/xwd718/article/details/80640357)   -->
<!-- [基于SpringBoot开发一个Restful服务，实现增删改查功能](http://www.cnblogs.com/xuwujing/p/8260935.html%20)   -->
