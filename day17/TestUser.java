package day17;

import java.util.ArrayList;
import java.util.List;

public class TestUser {
	public static void main(String[] args) {
		List<User> list = new ArrayList<>();
		list.add(new User("haha","12345",true));
		list.add(new User("xixi","34512",false));
		list.add(new User("papa","34235",true));
		list.add(new User("xiaxia","12535",false));
		list.add(new User("yaya","123635",true));
		int count = 0;
		/*for(User user : list){
			if(user.isOnline() == true){
				count++;
			}
		}*/
		for(int i = 0;i<list.size();i++){
			if(list.get(i).isOnline() == true){
				count ++;
			} 
		}
		System.out.println("在线人数为："+count);
	}
}
class User{
	private String name;
	private String passWord;
	private boolean isOnline;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public boolean isOnline() {
		return isOnline;
	}
	public void setOnline(boolean isOnline) {
		this.isOnline = isOnline;
	}
	public User() {
		super();
	}
	public User(String name, String passWord, boolean isOnline) {
		super();
		this.name = name;
		this.passWord = passWord;
		this.isOnline = isOnline;
	}
}