import java.io.*;

class  Person implements Serializable //ֻ�б���������ڶ���ſ��Ա����л���
{
	private String name;
	private transient int age;
		
	static String con = "cn";

	Person(String name, int age)
	{
		this.name = name;
		this.age = age;
	}

	public String toString()
	{
		return	"����"+name+"...����"+age+"...����"+con;
	}
}
