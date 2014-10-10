package zo.zookeeper.demo;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectTools {
	public static byte[] getByteData(Object obj){
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		ObjectOutputStream oo = null;
		try {
			oo = new ObjectOutputStream(out);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			oo.writeObject(obj);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		byte[] bt = out.toByteArray();
		return bt;
	}
	
	@SuppressWarnings("unchecked")
	public static <T> T getByteData(byte[] bt){
		ByteArrayInputStream bi = new ByteArrayInputStream(bt);
		ObjectInputStream oi=null;
		try {
			oi = new ObjectInputStream(bi);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Object obj = null;
		try {
			obj = oi.readObject();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return (T) obj;
	}
	
	
	
	
}
