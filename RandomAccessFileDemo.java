import java.io.*;


class  RandomAccessFileDemo
{
	public static void main(String[] args) throws IOException
	{
		
		writeFile_2();
		read();
	}

	public static void read() throws IOException
	{
		RandomAccessFile re =new RandomAccessFile("random.txt","r");
		re.seek(8*12);
		byte[] buf = new byte[16];
		re.read(buf);
		String s = new String(buf);
		System.out.println(s);
		re.close();
	}

	public static void writeFile_2() throws IOException
	{
		RandomAccessFile raf = new RandomAccessFile("random.txt","rw");
		raf.seek(8*12);
		raf.write("kjfkss".getBytes());
		raf.writeInt(252);
		raf.close();
	}

	public static void writeFile() throws IOException
	{
		RandomAccessFile raf = new RandomAccessFile("random.txt","rw");
		raf.write("ÕÅÈý".getBytes());
		raf.writeInt(97);
		raf.close();
	}
}
