# 项目说明

## 目的
直接访问聚合数据的api，每天的次数是有限的，重复访问相同的数据会浪费api次数，所以由springboot结合redis实现缓存处理

## 使用方法

1. 启动本项目前，请先启动自己的redis，并修改配置文件中redis的主机和端口
   - ![image-20220612215611426](http://tuchuang.wenhe9.cn/image-20220612215611426.png)
2. 打开使用聚合数据的项目，修改访问聚合数据的地址为本项目的地址，注意，如果使用的是安卓项目，注意不要使用127.0.0.1或者lcoalhost，要使用实际的本机ip



## 注意&拓展

- 在本项目中，只使用了三个聚合数据的接口
  - 防疫政策
  - 星座
  - 天气
- 如果要使用新的接口的话，有以下流程
  1. ·打开聚合的网站，找到对应的地址存放到本项目的common类中
     - ![image-20220612220456272](http://tuchuang.wenhe9.cn/image-20220612220456272.png)
  2. 在刚刚的网页找到JSON返回示例
     - ![image-20220612220036511](http://tuchuang.wenhe9.cn/image-20220612220036511.png)
  3. 复制以下内容，打开json转java的网站，进行转换
     - 比如 https://www.bejson.com/json2javapojo/new/
  4. 将得到的实体类放到本项目的domain文件夹下，并建立对应的文件夹
     - ![image-20220612220301230](http://tuchuang.wenhe9.cn/image-20220612220301230.png)
  5. 建立controller、service等，使用RestTemplate发送网络请求并将数据放到缓存中，具体参考已经提供的代码
