package day24;

import java.lang.reflect.Constructor;
/*����
1.������.class
2.����.class
3.����Class�еľ�̬����  Class.forName(ȫ�޶���)*/

/*��һ�֣����� ������ = new �в��޲ι��췽��
�ڶ��֣�Class c = Class.forName(ȫ�޶���)��
Object o = c.newInstance();
�����֣���ù��������д�������
Constructor cc = c.getConstructor(String.class,int.class,double.class);
Object o1 = cc.newInstance("mgx",18,3000.0);*/