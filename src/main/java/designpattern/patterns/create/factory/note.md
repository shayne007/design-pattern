### 工厂模式

## simple factory demo
工厂类：
*Factory
DateFormat.getInstance()、Calendar.getInstance()、String.valueOf()

RuleConfigSource.java根据不同配置文件的后缀判断使用不同的parser


工作模式的作用
- 封装变化：创建逻辑有可能变化，封装成工厂类之后，创建逻辑的变更对调用者透明。
- 代码复用：创建代码抽离到独立的工厂类之后可以复用。
- 隔离复杂性：封装复杂的创建逻辑，调用者无需了解如何创建对象。
- 控制复杂度：将创建代码抽离出来，让原本的函数或类职责更单一，代码更简洁



工厂模式的应用：DI容器

- 配置解析
- 对象创建
- 对象生命周期管理