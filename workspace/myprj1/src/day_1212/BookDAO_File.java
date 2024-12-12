package day_1212;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class BookDAO_File {
 
	public synchronized static void save(String fileName,Object obj) {
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream(fileName);
			oos = new ObjectOutputStream(fos);
			oos.writeObject(obj);
			oos.flush();
			System.out.println(obj);
			System.out.println("저장완료");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				if(oos != null) oos.close();
				if(fos != null) fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public synchronized static Object load(String fileName)  throws FileNotFoundException{
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		Object data = null;
		
		try {
			fis = new FileInputStream(fileName);
			ois = new ObjectInputStream(fis);
			
			data = ois.readObject();
			System.out.println("#####  데이터 로드 완료... ####");
			System.out.println(data);
			System.out.println("###########################");
			
		} catch (FileNotFoundException e) {
			throw(e);
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(ois != null) ois.close();
				if(fis != null) fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		return data;
	}
}












