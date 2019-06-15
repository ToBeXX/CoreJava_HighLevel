package day19;
//18题
public class TestStudent {
	public static void main(String[] args) {
		Student s = new Student("aaaaa",17,"双性",101.0,"1804");
		checkClass(s.getClassNumber());
		checkName(s.getName());
		checkAge(s.getAge(),s);
		checkScore(s.getScore());
		checkSex(s.isSex(),s);
	}
	public static void checkName(String name){
		try{
			if(name.length() > 4){
				throw new NameException("名字设置有误");
			}
		}catch(NameException e){
			String str = e.getMessage();
			System.out.println(str);
		}
	}
	public static void checkAge(int age,Student s ){
		try{
			if(age<18 || age>45){
				throw new AgeException("年龄不符合规范");
			}
		}catch(AgeException e){
			String str = e.getMessage();
			System.out.println(str);
			s.setAge(18);
			System.out.println("年龄已经设置为18");
		}
	}
	public static void checkSex(String sex,Student s){
		try{
			if(sex!="男" && sex !="女"){
				throw new SexException("性别不符合规范");
			}
		}catch(SexException e){
			String str = e.getMessage();
			System.out.println(str);
			s.setSex("男");
			System.out.println("性别设置为男");
		}
	}
	public static void checkScore(double score){
		try{
			if(score<0.0 || score>100.0){
				throw new ScoreException("分数有误");
			}
		}catch(ScoreException e){
			String str = e.getMessage();
			System.out.println(str);
		}
	}
	public static void checkClass(String classNumber){
		try{
			if(classNumber.length()!=4  || classNumber.charAt(0)!='1' || classNumber.charAt(1)!='9'){
				throw new ClassException("班级命名不符合规范");
			}
		}catch(ClassException e){
			String str = e.getMessage();
			System.out.println(str);
		}
	}
}
class Student{
	private String name;
	private int age;
	private String sex;
	private double score;
	private String classNumber;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String isSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	public String getClassNumber() {
		return classNumber;
	}
	public void setClassNumber(String classNumber) {
		this.classNumber = classNumber;
	}
	public Student() {
		super();
	}
	public Student(String name, int age, String sex, double score,
			String classNumber) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.score = score;
		this.classNumber = classNumber;
	}
	
}
class NameException extends RuntimeException{
	public NameException() {
		super();
	}
	public NameException(String message) {
		super(message);
	}
}
class AgeException extends RuntimeException{
	public AgeException() {
		super();
	}
	public AgeException(String message) {
		super(message);
	}
}
class SexException extends RuntimeException{
	public SexException() {
		super();
	}
	public SexException(String message) {
		super(message);
	}
}
class ScoreException extends RuntimeException{
	public ScoreException() {
		super();
	}
	public ScoreException(String message) {
		super(message);
	}
}
class ClassException extends Exception{
	public ClassException() {
		super();
	}
	public ClassException(String message) {
		super(message);
	}
}