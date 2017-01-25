import java.io.*;

class  Person implements Serializable //只有标记了这个借口对象才可以被序列化。
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
		return	"姓名"+name+"...年龄"+age+"...国籍"+con;
	}
}
