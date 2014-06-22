import java.io.*;

/**ファイルからレシピ情報を取得し、コンソールに出力*/
public class Test1 {
	public static void main(String args[]) {
		String fileName = "recipe-data.txt";
		String[] recipeList = null;
		try{
            File utf8File = new File(fileName);
            FileReader fileReader = new FileReader(utf8File);
            
            int ch;
            String readedRecipe = "";
            while((ch = fileReader.read()) != -1){
		        readedRecipe += (char)ch;
            }
            recipeList = readedRecipe.split("\n");
		      
            fileReader.close();
        }catch(FileNotFoundException e){
            System.out.println(e);
        }catch(IOException e){
            System.out.println(e);
        }
		for(int i=0; i<recipeList.length; i++)
		{
			System.out.println(i+1+": "+recipeList[i]);
		}
	}
}
