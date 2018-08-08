
package textgame;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;
import textgame.accountvariables;
import textgame.charactervariables;
import textgame.file;
import textgame.main.PrimaryRun;

public class textui {
	public static String betweenchoice;
	public static int betweenchoice1;
	public static boolean BetweenLoop;
    static Scanner input = new Scanner(System.in);
public static int n1;
  public static int n2;
    public static void MainScreen() {
      boolean mainscreen = true;
      while(mainscreen){
        System.out.println("----------------------------------------------------------------------------");
			  System.out.println();
        System.out.println("Game Name");
        System.out.println("1) Play");
        System.out.println("2) Options");
        System.out.println("3) Exit");
        String n = input.nextLine();
        System.out.println();
		    System.out.println("----------------------------------------------------------------------------");
      try{
       n1 = Integer.parseInt(n);
      }catch(NumberFormatException e){
        System.out.println();
        System.out.println("Please input a correct number.");
        System.out.println();
      }
        if (n1 == 1) {
            textui.Play();
          mainscreen = false;
        } else if (n1 == 2) {
            textui.Options();
          mainscreen = false;
        } else if (n1 == 3) {
            textui.Exit();
          mainscreen = false;
        }
    }
    }

    public static void Play() {
       textui.CharacterChoice();
    }

    public static void CharacterChoice() {
      boolean characterchoice = true;
      while(characterchoice){
        System.out.println();
        System.out.println("Please Choose Your Desired Character");
        System.out.println("1) " + accountvariables.Character1);
        System.out.println("2) " + accountvariables.Character2);
        System.out.println("3) " + accountvariables.Character3);
        System.out.println("4) New Character (If above are all numbers or you just want a new character)");
        String n = input.nextLine();
        System.out.println();
		    System.out.println("----------------------------------------------------------------------------");
      try{
       n2 = Integer.parseInt(n);
      }catch(NumberFormatException e){
        System.out.println();
        System.out.println("Please input a correct number.");
        System.out.println();
      }
        if (n2 == 1) {
					String character1 = accountvariables.Character1;
					String answer = "1";
					if(character1.equals(answer)){
						
					}else {
						charactervariables.Character1Load();
						characterchoice = false;
					}
          
        } else if (n2 == 2) {
					String character2 = accountvariables.Character2;
					String answer = "2";
					if(character2.equals(answer)){
						
					}else{
						charactervariables.Character2Load();
						characterchoice = false;
					}
          
        } else if (n2 == 3) {
					String character3 = accountvariables.Character3;
					String answer = "3";
					if(character3.equals(answer)){
						
					}else{
						charactervariables.Character3Load();
						characterchoice = false;
					}
				}
         else if (n2 == 4) {
            file.CreateCharacter();
          characterchoice = false;
        }
        textui.GAME();
    }
   }

    public static void GAME() {
        if (charactervariables.chapter == 1) {
            if (charactervariables.checkpoint == 1) {
            } else if (charactervariables.checkpoint == 2) {
                // empty if block
            }
        }
    }

    public static void Options() {
    }

    public static void Exit() {
      PrimaryRun.EXITCOMMAND = true;
			System.out.println("----------------------------------------------------------------------------");
		System.out.println();
			System.out.println("Thank You For Playing!");
			System.out.println();
		System.out.println("----------------------------------------------------------------------------");
			System.exit(0);
    }
	
	public static void PauseMenu(){
		
	}
	
	public static void BetweenChapterMenu(){
		if(Story.ChapterOrCheckpoint == 1){
		System.out.println("----------------------------------------------------------------------------");
		System.out.println();
		System.out.println("Congrats Your Completed the Chapter!");
		System.out.println();
		System.out.println("----------------------------------------------------------------------------");
		}else if(Story.ChapterOrCheckpoint == 2){
		System.out.println("----------------------------------------------------------------------------");
		System.out.println();
		System.out.println("Congrats You Reached a Checkpoint!");
		System.out.println();
		System.out.println("----------------------------------------------------------------------------");
		}
		BetweenLoop = true;
		while(BetweenLoop){
			System.out.println();
			System.out.println("What do you want to do?");
			System.out.println("	1. Continue Story");
			System.out.println("	2. Go Back to Main Menu");
			betweenchoice = input.nextLine();
			try{
       betweenchoice1 = Integer.parseInt(betweenchoice);
      }catch(NumberFormatException e){
							System.out.println();
        System.out.println("Please input a valid number.");
							System.out.println();
      }
			
			if(betweenchoice1 == 1){
				
				break;
			}else if(betweenchoice1 == 2){
				file.UpdateCharacterFiles();
				MainScreen();
			}
		}//BetweenLoop
		
	}//BetweenChapterMenu
	
}