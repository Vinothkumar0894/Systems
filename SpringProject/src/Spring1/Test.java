package Spring1;
import javax.annotation.Resource;
import javax.swing.plaf.basic.BasicIconFactory;
public class Test {
	public static void main(String[] args) {
		Resource r=new ClassPathResource("web.xml");
        BeanFactory factory=new XmlBeanFactory(r);  
		Student s=(Student)factory.getBean("e");
		s.show();
	}

}
