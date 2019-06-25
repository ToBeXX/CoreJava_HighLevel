package day24;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
public class TestLamp {
	public static void main(String[] args) throws ClassNotFoundException, IOException, InstantiationException, IllegalAccessException {
		//����һ��̨�ƶ���
		Lamp lamp = new Lamp();
		//����һ�����ݶ���
		Light light = creatLight();
		//װ����
		lamp.setLight(light);
		//���ÿ��Ʒ���
		lamp.on();
	}
	//�������ݶ���
	public static Light creatLight() throws InstantiationException, IllegalAccessException, ClassNotFoundException, IOException{
		//��ȡһ������
		//ͨ���ֽ��� ��ȡ�����ļ�
		FileInputStream fis = new FileInputStream("test.txt");
		//Map���ϵ�����  Ҳ��һ������
		Properties pro = new Properties();
		pro.load(fis);		//��test�ļ��е�����  ���ص� pro������
		fis.close();
		
		String name = pro.getProperty("className");
		
		//���ݲ��� ��ʾ��������ȡһ�������
		Class c = Class.forName(name);
		//���������  ��ȡʵ������  ������
		return (Light) c.newInstance();
	}
	
}
//̨����
class Lamp{
	private Light light;
	public void setLight(Light light){
		this.light = light;
	}
	public void on(){
		light.shine();
	}
}
//���ݽӿ�
interface Light{
	void shine();
}
//ʵ����
class RedLight implements Light{
	public void shine() {
		System.out.println("�����");
	}
}
class YellowLight implements Light{
	public void shine() {
		System.out.println("���ƹ�");
	}
}
class WhiteLight implements Light{
	public void shine() {
		System.out.println("���׹�");
	}
}
