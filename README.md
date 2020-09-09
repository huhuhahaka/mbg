### 一、代码生成器
1. 修改 application.yml 中下面的配置
    ```
    mbg:
      package:
        base: 基础包路径
      module:
        name: 模块名
      table:
        names: 表名1,表名2
    ```
2. 执行下面的方法
    ```
        MbgApplicationTests.contextLoads();
    ```

### 二、Swagger 接口文档地址
* http://localhost:8080/swagger-ui.html

### 三、Druid 监控地址
* http://localhost:8080/druid/index.html