package textgame;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Story{
  public static boolean StoryLoop;
  public static int ChapterOrCheckpoint;
 
  public static void Story(){
    StoryLoop = true;
    while(StoryLoop){
    switch (charactervariables.chapter){
      case 1: 
           Chapter1();
        break;
      case 2:
        break;
      case 3:
        break;
    }//Switch
   }//StoryLoop
  }//StoryMethod
  
  
  public static void Chapter1(){
    if(charactervariables.chapter == 1){
          //Tutorial/Prologue

    if(charactervariables.checkpoint == 1){
      System.out.println("----------------------------------------------------------------------------");
      System.out.println();
      System.out.println("You open your eyes to a bright light in your face.");
      System.out.println();
      methods.WaitFor(5000);
      System.out.println("You realize its the sun shining down upon you.");
      System.out.println();
      methods.WaitFor(5000);
      System.out.println("You also realize you are in a field.");
      System.out.println();
      methods.WaitFor(5000);
      System.out.println("And you cant remember anything before today.....");
      System.out.println();
      methods.WaitFor(5000);
      System.out.println();
      System.out.println("----------------------------------------------------------------------------");
      
      methods.SkipLines();
      
      System.out.println("  'That Nerd Maxx Productions'  ");
      System.out.println();
      System.out.println();
      System.out.println();
      System.out.println();
      methods.WaitFor(4000);
      methods.SkipLines();
      System.out.println(" 'In Association with The Memers Johann and Steve Association' ");
      System.out.println();
      System.out.println();
      System.out.println();
      System.out.println();
      methods.WaitFor(4000);
      methods.SkipLines();
      System.out.println("              Presents...");
      System.out.println();
      System.out.println();
      System.out.println();
      System.out.println();
      methods.WaitFor(4000);
      methods.SkipLines();
      
      System.out.println("                       ########################");
      System.out.println("        #########################################################");
      System.out.println("##############################################################################");
      System.out.println();
      System.out.println();
      System.out.println("                           Why Do We Fall? ");
      System.out.println();
      System.out.println();
      System.out.println("##############################################################################");
      System.out.println("        #########################################################");
      System.out.println("                       ########################");
      System.out.println();
      System.out.println();
      System.out.println();
      System.out.println();
      
      methods.WaitFor(10000);
      methods.SkipLines();
      
      combat.Combat(1);
      
      //END CHECKPOINT 1
      //Grants Character Ability to Go to Next Checkpoint
      charactervariables.checkpoint++;
      ChapterOrCheckpoint = 2;
      textui.BetweenChapterMenu();
    }//Checkpoint 1 IF
    
    
    //Grants Character Ability to Go to Next Chapter
    charactervariables.chapter++;
     ChapterOrCheckpoint = 1;
      textui.BetweenChapterMenu();
    }//Chapter IF
  }// Method Chapter1
  
  
  
  
  
}//Story Class