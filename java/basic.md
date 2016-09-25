# Java基础

---
## 1. JDK各个版本特性

- jdk1.0: java虚拟机，applet，awt
- jdk1.1: JDBC,JavaBeans,RMI,内部类，反射
- jdk1.2: 技术体系拆分J2ME(桌面级平台),J2SE(移动端平台),J2EE企业级平台)，EJB
- jdk1.3: Timer api,JNDI,RMI,Java 2D api
- jdk1.4: 正则表达式，NIO,异常链，日志类
- jdk1.5: 自动装拆箱，范型,动态注解，枚举，可变参数，(foreach循环)，提供了java.util.concurrent并发包
- jdk1.6: 提供动态语言支持，提供编译api和微型http服务api,这个版本队java虚拟机做了大量改进(锁，同步，垃圾收集，类加载)
- jdk1.7: switch可以使用字符串，加入了java.util.concurrent.forkjion
- jdk1.8:一.lambda表达式和函数式接口 二.接口的变化	     1.接口可以实现static的方法，并且调用的时候是用:接口名.方法名();2.接口可以实现default的方法，调用的时候，必须用该接口的实现类的对象来调用

------

------
## 2.Java容器---List,Set,Map
```
    Collection 
        ├List 
        │  ├LinkedList 
        │  ├ArrayList 
        │  └Vector 
        │    └Stack 
        └Set 
        |  ├HashSet
        |  ├TreeSet
    Map 
        ├Hashtable 
        ├HashMap 
            ├ConcurrentHashMap
            ├WeakHashMap
            └LinkedHashMap
        ├TreeMap
```
### List
   List是有序的collection,允许重复元素,使用此接口能够精确的控制元素的插入位置.
   实现List接口的常用类有:**LinkedList,ArrayList,Vector,Stack**
   
#### LinkedList
   LinkedList是一个双链表,允许null元素,非同步.
   基于**链表的数据结构**,插入删除速度快,查找慢.
   **注意:**LinkedList没有同步方法,如果多个线程同时访问一个list,则必须自己实现同步方法,
> 一个解决办法是在创建list时构造一个同步的list:34
> List list = Collections.synchronizedList(new LinkedList(...))

#### ArrayList
   ArrayList是一个可变大小的数组,允许为null,非同步.
   基于**对象数组的数据结构**,查找快,插入删除慢.
   **注意:**默认情况下ArrayList的初始容量非常小,所以如果可以预估数据量的话,
分配一个较大的初始值属于最佳实践,这样可以减少调整大小的开销。

|         | ArrayList   |  LinkedList  |
| --------   | :-----:  | :----:  |
| get()   | o(1)  |   o(n)     |
| add()   | o(n)  |   开头/末尾:o(1),随即位置:o(n)   |
| remove()  |    o(1)    |  开头/末尾:o(1),随即位置:o(n)  |

#### Vector
   和ArrayList类似,不过它是同步的.开销比ArrayList大
   
#### Stack
   Stack继承自Vector,实现一个后进先出的堆栈,Stack提供5个额外的方法使得Vector当作堆栈来使用.
   **push,pop,peak,empty,search**
   
### Set
   Set是一个不包含重复元素,无序的Collection;

#### HashSet
   HashSet实现了Set接口
> 它不允许出现重复元素
> 不保证集合中元素的顺序
> 允许包含null值,但是最多一个null元素.

#### TreeSet
   有序的集合
   TreeSet描述的是Set的一种变体——可以实现**排序等功能**的集合，它将对象元素添加到集合中时会自动按照某种比较规则将其插入到有序的对象序列中.

### Map
   [有关的技术博客](http://tech.meituan.com/java-hashmap.html?hmsr=toutiao.io&utm_medium=toutiao.io&utm_source=toutiao.io)

------

## 3.Java引用
------

[有关技术博客](http://droidyue.com/blog/2014/10/12/understanding-weakreference-in-java/index.html)
> 强引用
> 软引用
> 弱引用
> 虚引用---和弱引用的区别在于,必须结合引用队列观察gc的活动情况

------

**推荐书籍:深入理解Java虚拟机**