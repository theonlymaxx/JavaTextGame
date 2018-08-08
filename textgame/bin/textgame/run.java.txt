package textgame;
import java.util.*;
public class run{
  public static boolean EXITCOMMAND;
  public static int choice1;
  public static boolean charactercreate;
  public static void main(String[] args){
    boolean LoginExist = true;
    boolean CorrectLogin = false;
    while(LoginExist){
      Scanner input = new Scanner(System.in);
      System.out.println("----------------------------------------------------------------------------");
			System.out.println();
      System.out.println("Do you have an account?");
      System.out.println("1. Yes         2. No");
      String choice = input.nextLine();
      System.out.println();
		System.out.println("----------------------------------------------------------------------------");
      try{
      choice1 = Integer.parseInt(choice);
      }catch(NumberFormatException e){
        System.out.println();
        System.out.println("Please input a correct number.");
        System.out.println();
      }
      if(choice1 == 1){
        charactercreate = false;
        break;
      }else if(choice1 == 2){
        charactercreate = true;
        break;
      }
    }
    while(charactercreate){
      file.CreateAccount();
      CorrectLogin = false;
      break;

    }
    while(CorrectLogin == false){
      file.Login();
      break;
    }
    
    textui.MainScreen();
    if(EXITCOMMAND){
      file.UpdateCharacterFiles();
			System.exit(0);
    }else if(EXITCOMMAND == false){
   Story.Chapter1();
    }
   
  }
}

