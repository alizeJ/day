import java.io.*;

class  DataDemo
{
	public static void main(String[] args) throws IOException
	{
		
		
		DataOutputStream dos = new DataOutputStream(new FileOutputStream("data.txt"));

		dos.writeInt(234);
		dos.writeBoolean(true);
		dos.writeDouble(9887.543);

		dos.close();

		DataInputStream dis = new DataInputStream(new FileInputStream("data.txt"));
		sop(dis.readInt());
		sop(dis.readBoolean());
		sop(dis.readDouble());
	}
		public static void sop(Object obj)
		{
			System.out.println(obj);
		}
}
