
# 使用说明

## 使用技术
1. redis
2. mysql
3. springboot
4. springserucity
5. mybatis-plus
6. vue + uni-app
7. 代码生成器

```shell script
# 后台接口
http://127.0.0.1:8080
# 前台访问路径
http://127.0.0.1:80  
```

## 启动redis说明 windows版本：
1. 进入redis目录看到redis-server.exe目录
2. 在地址栏输入cmd 回车
3. 输入 `redis-server.exe redis.windows.conf` 回车
4. 看到控制台有redis的图标，即启动成功

## 目录介绍(自己动手丰衣足食)

## 数据库设计
1. 用户表
2. 商品统计表
3. 商品表
4. 菜单表（权限问题）
5. 菜单_角色__关联表
6. 角色表 （权限问题）
7. 用户_角色关联表
8. 字典表类型（作为字典数据表的分类，如 商品类型字典、用户类型字典）
9. 字典数据表（定义一些状态规则，如：1->表示下架 0->表示未删除）
10. 购物车（）
11. 订单
12. 用户详情表
13. 我的足迹（记录用户查看过哪些商品）
14. 我的收藏（收藏的商品）
15. 优惠券（自己选）
16. 轮播图（带有连接，有轮播的类型，如：首页展示、分类展示等...）
17. 公告表（推送最新消息）
18. 消息表 （用作消息中心。功能说明：如：下单成功提醒商家、评论提醒商家、回复提醒用户）
19. 商品留言表
20. 广告表
21. 等等....

## 功能说明

#### 商品模块
1. 首页热门商品推荐
2. 商品详情
3. 商品搜索
4. 首页轮播图
5. 商品分类
6. 商品列表
7. 等 ...

#### 用户模块
1. 用户注册
2. 用户登录
3. 用户认证（个人转为商家，认证需要提交文件有管理员审核）
4. 我的足迹
5. 我的购物车
6. 我的订单
7. 我的消息

#### 单家模块
1. 我的商品 ----crud 
2. 发放优惠券（自己选）

#### 后台模块
1. 用户管理
    1. 商家认证
    2. 用户列表
    3. 单家列表
    4. 重置密码
    5. 添加商家
    5. 封号
    6. 等..
2. 字典管理
    1. 字典类型
    2. 字典数据
3. 商品管理
    1. 商品列表（分页）
    2. 商品添加
    3. 商品条件查找
    4. 商品置顶
    5. 商品审核
    6. 商品修改
4. 系统管理
    1. 公告 ---发布、修改、删除、是否展示、公告列表
    2. 系统轮播图 
    


## 技术准备
#### 后台
1. 了解Java的基本使用
    1. 类
    2. 接口
    3. 面向对象
    4. 数据类型（8种数据类型）
    5. 判断语句 if else 
    6. 循环语句 for
    7. 了解Java的封装、继承

2. mysql 的使用
    1. select 
    2. delete
    3. update
    4. insert(拼错了)
    5. 多表查询 left join a表 on a.id = b.a_id

3. springmvc常用注解
    1. @RequstMapping
    2. @PostMapping
    3. @DeleteMapping
    4. @PutMapping
    5. @RestCotroller
    6. @Service
    7. @Pathvarlue

4. mvc 模式 ----> 三层架构
   浏览器发送请求（put、post、delete、get） -> 后台服务 -> controller ->service -> dao -> 操作数据库（增、删、改、查）

5. mybatis 常用注解
    1. @Parm

#### 前台
1. html
2. css
3. js
4. 前端框架 vue(推荐<数据渲染真的很方便>、有手就可以操作) layui
5. app 开发对应框架 uni-app
6. https://echarts.apache.org/examples/zh/index.html#chart-type-line

# 理清思路就发车吧！ 

## 开发流程

1. 开发用户中心（登录注册、前端页面）

2. 后台管理 ，数据字典，商家认证，菜单

   

   

