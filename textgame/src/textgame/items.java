package textgame;
import java.util.*;
import java.lang.*;
import java.io.*;
public class items{
  //MEANINGS OF EFFECTORS 
  /*
      SELF
  1 = HP
  2 = ATK
  3 = DEF
  4 = CRIT
  
      ENEMIES
  5 = HP
  6 = ATK
  7 = DEF
  8 = CRIT
  */
  
  //MEANINGS OF CLASSES
  /*
  1 = Champion
  2 = Ranger
  3 = Mage
  4 = Thief
  5 = All
  */
  public static void Item0(){
    String name = "Empty Slot";
    String description = "";
    int effector = 1;
    int effectoramount = 1;
    int ID = 0; //Origional ID
    int Stackable = 1;
    int Class = 5;
    ItemInInventory(name, description, effector, effectoramount, ID, Stackable, Class);
  }
  
  public static void Item1(){
    String name = "Damaged Sword";
    String description = "Basic Weapon. +2 ATK";
    int effector = 2;
    int effectoramount = 1;
    int ID = 1; //Origional ID
    int Stackable = 0;
    int Class = 5;
    ItemInInventory(name, description, effector, effectoramount, ID, Stackable, Class);
  }
  
  public static void Item2(){
    String name = "";
    String description = "";
    int effector = 2;
    int effectoramount = 1;
    int ID = 2; //Origional ID
    int Stackable = 0;
    int Class = 5;
    ItemInInventory(name, description, effector, effectoramount, ID, Stackable, Class);
  }
  
  public static void ItemInInventory(String name, String description, int effector, int effectoramount, int ID, int Stackable, int Class){
    if(name == charactervariables.Item1Name || charactervariables.Item1Name ==null){
      if(name == charactervariables.Item1Name){
        if(charactervariables.Item1Stackable == 1){
          charactervariables.Item1Quantity++;
        }else if(charactervariables.Item1Stackable == 0){
          System.out.println("Error: Item Not Stackable");
        }
      }else if(charactervariables.Item1Name ==null){
        charactervariables.Item1Name = name;
        charactervariables.Item1Description = description;
        charactervariables.Item1Effector = effector;
        charactervariables.Item1EffectorAmount = effectoramount;
        charactervariables.Item1ID = ID;
        charactervariables.Item1Stackable = Stackable;
        charactervariables.Item1Quantity = 1;
      }
    }else if(name == charactervariables.Item2Name || charactervariables.Item2Name ==null){
      if(name == charactervariables.Item2Name){
        if(charactervariables.Item2Stackable == 1){
          charactervariables.Item2Quantity++;
        }else if(charactervariables.Item2Stackable == 0){
          System.out.println("Error: Item Not Stackable");
        }
      }else if(charactervariables.Item2Name ==null){
        charactervariables.Item2Name = name;
        charactervariables.Item2Description = description;
        charactervariables.Item2Effector = effector;
        charactervariables.Item2EffectorAmount = effectoramount;
        charactervariables.Item2ID = ID;
        charactervariables.Item2Stackable = Stackable;
        charactervariables.Item2Quantity = 1;
      }
    }
     else if(name == charactervariables.Item3Name || charactervariables.Item3Name ==null){
      if(name == charactervariables.Item3Name){
        if(charactervariables.Item3Stackable == 1){
          charactervariables.Item3Quantity++;
        }else if(charactervariables.Item3Stackable == 0){
          System.out.println("Error: Item Not Stackable");
        }
      }else if(charactervariables.Item3Name ==null){
        charactervariables.Item3Name = name;
        charactervariables.Item3Description = description;
        charactervariables.Item3Effector = effector;
        charactervariables.Item3EffectorAmount = effectoramount;
        charactervariables.Item3ID = ID;
        charactervariables.Item3Stackable = Stackable;
        charactervariables.Item3Quantity = 1;
      }
    }
    else if(name == charactervariables.Item4Name || charactervariables.Item4Name ==null){
      if(name == charactervariables.Item4Name){
        if(charactervariables.Item4Stackable == 1){
          charactervariables.Item4Quantity++;
        }else if(charactervariables.Item4Stackable == 0){
          System.out.println("Error: Item Not Stackable");
        }
      }else if(charactervariables.Item1Name ==null){
        charactervariables.Item4Name = name;
        charactervariables.Item4Description = description;
        charactervariables.Item4Effector = effector;
        charactervariables.Item4EffectorAmount = effectoramount;
        charactervariables.Item4ID = ID;
        charactervariables.Item4Stackable = Stackable;
        charactervariables.Item4Quantity = 1;
      }
    }
    else if(name == charactervariables.Item5Name || charactervariables.Item5Name ==null){
      if(name == charactervariables.Item5Name){
        if(charactervariables.Item5Stackable == 1){
          charactervariables.Item5Quantity++;
        }else if(charactervariables.Item5Stackable == 0){
          System.out.println("Error: Item Not Stackable");
        }
      }else if(charactervariables.Item5Name ==null){
        charactervariables.Item5Name = name;
        charactervariables.Item5Description = description;
        charactervariables.Item5Effector = effector;
        charactervariables.Item5EffectorAmount = effectoramount;
        charactervariables.Item5ID = ID;
        charactervariables.Item5Stackable = Stackable;
        charactervariables.Item5Quantity = 1;
      }
    }
    else if(name == charactervariables.Item6Name || charactervariables.Item6Name ==null){
      if(name == charactervariables.Item6Name){
        if(charactervariables.Item6Stackable == 1){
          charactervariables.Item6Quantity++;
        }else if(charactervariables.Item6Stackable == 0){
          System.out.println("Error: Item Not Stackable");
        }
      }else if(charactervariables.Item6Name ==null){
        charactervariables.Item6Name = name;
        charactervariables.Item6Description = description;
        charactervariables.Item6Effector = effector;
        charactervariables.Item6EffectorAmount = effectoramount;
        charactervariables.Item6ID = ID;
        charactervariables.Item6Stackable = Stackable;
        charactervariables.Item6Quantity = 1;
      }
    }
    else if(name == charactervariables.Item7Name || charactervariables.Item7Name ==null){
      if(name == charactervariables.Item7Name){
        if(charactervariables.Item7Stackable == 1){
          charactervariables.Item7Quantity++;
        }else if(charactervariables.Item7Stackable == 0){
          System.out.println("Error: Item Not Stackable");
        }
      }else if(charactervariables.Item7Name ==null){
        charactervariables.Item7Name = name;
        charactervariables.Item7Description = description;
        charactervariables.Item7Effector = effector;
        charactervariables.Item7EffectorAmount = effectoramount;
        charactervariables.Item7ID = ID;
        charactervariables.Item7Stackable = Stackable;
        charactervariables.Item7Quantity = 1;
      }
    }
    else if(name == charactervariables.Item8Name || charactervariables.Item8Name ==null){
      if(name == charactervariables.Item8Name){
        if(charactervariables.Item8Stackable == 1){
          charactervariables.Item8Quantity++;
        }else if(charactervariables.Item8Stackable == 0){
          System.out.println("Error: Item Not Stackable");
        }
      }else if(charactervariables.Item8Name ==null){
        charactervariables.Item8Name = name;
        charactervariables.Item8Description = description;
        charactervariables.Item8Effector = effector;
        charactervariables.Item8EffectorAmount = effectoramount;
        charactervariables.Item8ID = ID;
        charactervariables.Item8Stackable = Stackable;
        charactervariables.Item8Quantity = 1;
      }
    }
    else if(name == charactervariables.Item9Name || charactervariables.Item9Name ==null){
      if(name == charactervariables.Item9Name){
        if(charactervariables.Item9Stackable == 1){
          charactervariables.Item9Quantity++;
        }else if(charactervariables.Item9Stackable == 0){
          System.out.println("Error: Item Not Stackable");
        }
      }else if(charactervariables.Item9Name ==null){
        charactervariables.Item9Name = name;
        charactervariables.Item9Description = description;
        charactervariables.Item9Effector = effector;
        charactervariables.Item9EffectorAmount = effectoramount;
        charactervariables.Item9ID = ID;
        charactervariables.Item9Stackable = Stackable;
        charactervariables.Item9Quantity = 1;
      }
    }
  }
}