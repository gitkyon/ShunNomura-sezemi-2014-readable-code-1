import java.io.*;

/**ファイルからレシピ情報を取得し、コンソールに出力*/

public class Test1 {
    
	public static void main(String args[]) {
		String fileName = "recipe-data.txt";
		String[] recipeList = null;
        int recipeId = -1; //レシピのidが選択されない場合はrecipeId = -1
        if (args.length > 0) recipeId = Integer.parseInt(args[0]);
		try{
            File ANSIFile = new File(fileName);
            FileReader fileReader = new FileReader(ANSIFile);
            
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
            if (recipeId == -1 || recipeId == i+1){ //idの選択が行われていないか, または選択したidを表すとき
                System.out.println(i+1+": "+recipeList[i]); 
            }
            
		}
	}
}
