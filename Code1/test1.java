import java.io.*;

/**�t�@�C�����烌�V�s�����擾���A�R���\�[���ɏo��*/

public class Test1 {
    
	public static void main(String args[]) {
        int N = args.length;
        String[] userName = new String[N/2];
        String[] fileName = new String[N/2];
        for (int i = 0; i<N/2; i++){
            userName[i] = args[i*2];
            fileName[i] = args[i*2+1];
        }
		String[] recipeList = null;
        int recipeId = -1; //���V�s��id���I������Ȃ��ꍇ��recipeId = -1
        int recipeCount = 0;
        if (N%2==1) recipeId = Integer.parseInt(args[N-1]);
        for (int i=0; i<N/2; i++){
            System.out.println("���[�U��: " + userName[i]);
            try{
                File ANSIFile = new File(fileName[i]);
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
            for (int j=0; j<recipeList.length; j++){
                recipeCount++;
                if (recipeId == -1 || recipeId == recipeCount){ //id�̑I�����s���Ă��Ȃ���, �܂��͑I������id��\���Ƃ�
                    System.out.println(recipeCount+": "+recipeList[j]); 
                }
            }
        }
    }
}
