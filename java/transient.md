# transient介绍

------

> transient修饰的成员变量不参与序列化过程。

相关技术博客:
    http://www.cnblogs.com/lanxuezaipiao/p/3369962.html

> * 一旦变量被transient修饰，变量将不再是对象持久化的一部分，该变量内容在序列化后无法获得访问。
> * transient关键字只能修饰变量，而不能修饰方法和类。注意，本地变量是不能被transient关键字修饰的。变量如果是用户自定义类变量，则该类需要实现Serializable接口。
> * 被transient关键字修饰的变量不再能被序列化，一个静态变量不管是否被transient修饰，均不能被序列化。


##特殊情况
> 如果实现了Externalizable,则需要在writeExternal方法中进行手工指定所要序列化的变量,这与是否被transient修饰无关

------



