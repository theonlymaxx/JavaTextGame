package textgame;
import java.lang.*;
import java.io.*;
import java.util.*;
public class accountvariables{
  public static String Username;
  public static String Password;
  public static String Character1;
  public static String Character2;
  public static String Character3;
	public static int CharacterChosen;
  

  public static void AccountRead(){
    
    BufferedReader br = null;
		try{
			br = new BufferedReader(new FileReader(Username + "/account.txt"));
			Password = br.readLine();
      Character1 = br.readLine();
      Character2 = br.readLine();
      Character3 = br.readLine();
		} catch (IOException e) {
			System.out.println("Username Not Found");
		} finally {
			try {
				if (br != null)br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
  }
  
}