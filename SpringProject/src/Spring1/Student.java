package Spring1;
public class Student {
private int id;
private String name;
private Student address;
public Student() {
	System.out.println("definition cons");
}
public Student(int id,String name,Student address) {
	super();
	this.id=id;
	this.name=name;
	this.address=address;
}
void show() {
	System.out.println(id+" "+name);
	System.out.println(address.toString());
}

}
