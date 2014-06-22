import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**ファイルからレシピ情報を取得し、コンソールに出力*/
public class test1 {
	public static void main(String args[]) {
		String fileName = "recipe-data.txt";
		try{
		      File file = new File(fileName);
		      FileReader fileReader = new FileReader(file);

		      int ch;
		      while((ch = fileReader.read()) != -1){
		        System.out.print((char)ch);
		      }

		      fileReader.close();
		    }catch(FileNotFoundException e){
		      System.out.println(e);
		    }catch(IOException e){
		      System.out.println(e);
		    }
	}
}
