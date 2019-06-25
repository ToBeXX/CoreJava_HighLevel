package day24;

import java.lang.reflect.Constructor;
/*三种
1.引用名.class
2.类名.class
3.调用Class中的静态方法  Class.forName(全限定名)*/

/*第一种：类名 引用名 = new 有参无参构造方法
第二种：Class c = Class.forName(全限定名)；
Object o = c.newInstance();
第三种：获得构造器进行创建对象
Constructor cc = c.getConstructor(String.class,int.class,double.class);
Object o1 = cc.newInstance("mgx",18,3000.0);*/