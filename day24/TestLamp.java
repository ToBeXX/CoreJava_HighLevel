package day24;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
public class TestLamp {
	public static void main(String[] args) throws ClassNotFoundException, IOException, InstantiationException, IllegalAccessException {
		//创建一个台灯对象
		Lamp lamp = new Lamp();
		//创建一个灯泡对象
		Light light = creatLight();
		//装灯泡
		lamp.setLight(light);
		//调用开灯方法
		lamp.on();
	}
	//创建灯泡对象
	public static Light creatLight() throws InstantiationException, IllegalAccessException, ClassNotFoundException, IOException{
		//读取一个类名
		//通过字节流 读取配置文件
		FileInputStream fis = new FileInputStream("test.txt");
		//Map集合的子类  也是一个集合
		Properties pro = new Properties();
		pro.load(fis);		//将test文件中的内容  加载到 pro集合中
		fis.close();
		
		String name = pro.getProperty("className");
		
		//根据参数 表示的类名获取一个类对象
		Class c = Class.forName(name);
		//根据类对象  获取实例对象  并返回
		return (Light) c.newInstance();
	}
	
}
//台灯类
class Lamp{
	private Light light;
	public void setLight(Light light){
		this.light = light;
	}
	public void on(){
		light.shine();
	}
}
//灯泡接口
interface Light{
	void shine();
}
//实现类
class RedLight implements Light{
	public void shine() {
		System.out.println("发红光");
	}
}
class YellowLight implements Light{
	public void shine() {
		System.out.println("发黄光");
	}
}
class WhiteLight implements Light{
	public void shine() {
		System.out.println("发白光");
	}
}
