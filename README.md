# Drools in Spring boot

  Drools 是用 Java 语言编写的开放源码规则引擎，使用 Rete 算法（参阅 [参考资料](https://www.ibm.com/developerworks/cn/java/j-drools/index.html#artrelatedtopics)）对所编写的规则求值；

  Drools 允许使用声明方式表达业务逻辑，使用非 XML 的本地语言编写规则，从而便于学习和理解。并且，还可以将 Java 代码直接嵌入到规则文件中，这令 Drools 的学习更加吸引人。

Drools 还具有其他优点：
  - 非常活跃的社区支持
  - 易用
  - 快速的执行速度
  - 在 Java 开发人员中流行
  - 与 Java Rule Engine API（JSR 94）兼容（参阅 [参考资料](https://www.ibm.com/developerworks/cn/java/j-drools/index.html#artrelatedtopics)）
  - 免费

## Feature
- Spring boot load `/META-INF/kmodule.xml` support
- Multiple KieSession support in java config

## Refer
- [Drools Documentation Version 7.3.0.Final](https://docs.jboss.org/drools/release/7.3.0.Final/drools-docs/html_single/index.html)
- [Drools规则引擎](http://blog.csdn.net/column/details/16183.html)
- [[Drools]JAVA规则引擎 -- Drools](http://blog.csdn.net/quzishen/article/details/6163012)
- [使用 Drools 规则引擎实现业务逻辑](https://www.ibm.com/developerworks/cn/java/j-drools/index.html)
