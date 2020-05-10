### 组合模式
#### intent

Compose objects into **tree structures** to represent part-whole hierarchies. Composite lets clients treat individual 
objects and compositions of objects uniformly.

组合模式，将一组对象组织成树形结构，将单个对象和组合对象都看做树中的节点，以统一处理逻辑，并且它利用树形结构的特点，递归地处理每个子树，依次简化代码实现。使用组合模式的前提在于，你的业务场景必须能够表示成树形结构。

#### 应用场景

Use the Composite pattern when

 - you want to represent part-whole hierarchies of objects.
 - you want clients to be able to ignore the difference between compositions of objects and individual objects. Clients
  will treat all objects in the composite structure uniformly.
  
#### 示例
 - 图形、容器、图画
 - 组织结构、部门、员工
 - 文件系统节点、目录、文件
 