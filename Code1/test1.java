import java.io.*;

/**�t�@�C�����烌�V�s�����擾���A�R���\�[���ɏo��*/

public class Test1 {
    
	public static void main(String args[]) {
		String fileName = "recipe-data.txt";
		String[] recipeList = null;
        int recipeId = -1; //���V�s��id���I������Ȃ��ꍇ��recipeId = -1
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
            if (recipeId == -1 || recipeId == i+1){ //id�̑I�����s���Ă��Ȃ���, �܂��͑I������id��\���Ƃ�
                System.out.println(i+1+": "+recipeList[i]); 
            }
            
		}
	}
}
