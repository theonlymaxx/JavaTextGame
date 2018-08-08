package textgame;
import java.util.*;
import java.lang.*;
import java.io.*;
public class abilities{
  
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
  
  //COOLDOWN ALWAYS GREATER THAN 2!!!
  // ITEMS SAME AS ABILITIES!!!!!!!!!
  
  public static void Ability1(){
    String name = "Basic Attack";
    String description = "An attack with your weapon.";
    int effector = 5;
    int effectoramount = -charactervariables.atk;
    int cooldown = 2;
    int ID = 1; //Origional ID
    if(charactervariables.AbilityName1 == null){
      charactervariables.AbilityName1 = name;
      charactervariables.AbilityDescription1 = description;
      charactervariables.AbilityEffector1 = effector;
      charactervariables.AbilityEffectorAmount1 = effectoramount;
      charactervariables.AbilityCooldown1 = cooldown;
      charactervariables.AbilityID1 = ID;
    }else if(charactervariables.AbilityName2 == null){
      charactervariables.AbilityName2 = name;
      charactervariables.AbilityDescription2 = description;
      charactervariables.AbilityEffector2 = effector;
      charactervariables.AbilityEffectorAmount2 = effectoramount;
      charactervariables.AbilityCooldown2 = cooldown;
      charactervariables.AbilityID2 = ID;
    }else if(charactervariables.AbilityName3 == null){
      charactervariables.AbilityName3 = name;
      charactervariables.AbilityDescription3 = description;
      charactervariables.AbilityEffector3 = effector;
      charactervariables.AbilityEffectorAmount3 = effectoramount;
      charactervariables.AbilityCooldown3 = cooldown;
      charactervariables.AbilityID3 = ID;
    }else if(charactervariables.AbilityName4 == null){
      charactervariables.AbilityName4 = name;
      charactervariables.AbilityDescription4 = description;
      charactervariables.AbilityEffector4 = effector;
      charactervariables.AbilityEffectorAmount4 = effectoramount;
      charactervariables.AbilityCooldown4 = cooldown;
      charactervariables.AbilityID4 = ID;
    }
  }
  
  public static void Ability2(){
    String name = "Shield";
    String description = "Gain 1 DEF for this combat";
    int effector = 3;
    int effectoramount = 1;
    int cooldown = 10;
    int ID = 2; //Origional ID
    if(charactervariables.AbilityName1 == null){
      charactervariables.AbilityName1 = name;
      charactervariables.AbilityDescription1 = description;
      charactervariables.AbilityEffector1 = effector;
      charactervariables.AbilityEffectorAmount1 = effectoramount;
      charactervariables.AbilityCooldown1 = cooldown;
      charactervariables.AbilityID1 = ID;
    }else if(charactervariables.AbilityName2 == null){
      charactervariables.AbilityName2 = name;
      charactervariables.AbilityDescription2 = description;
      charactervariables.AbilityEffector2 = effector;
      charactervariables.AbilityEffectorAmount2 = effectoramount;
      charactervariables.AbilityCooldown2 = cooldown;
      charactervariables.AbilityID2 = ID;
    }else if(charactervariables.AbilityName3 == null){
      charactervariables.AbilityName3 = name;
      charactervariables.AbilityDescription3 = description;
      charactervariables.AbilityEffector3 = effector;
      charactervariables.AbilityEffectorAmount3 = effectoramount;
      charactervariables.AbilityCooldown3 = cooldown;
      charactervariables.AbilityID3 = ID;
    }else if(charactervariables.AbilityName4 == null){
      charactervariables.AbilityName4 = name;
      charactervariables.AbilityDescription4 = description;
      charactervariables.AbilityEffector4 = effector;
      charactervariables.AbilityEffectorAmount4 = effectoramount;
      charactervariables.AbilityCooldown4 = cooldown;
      charactervariables.AbilityID4 = ID;
    }
  }
  
  public static void Ability3(){
    String name = "Heal";
    String description = "Gain a +10 health increase";
    int effector = 1;
    int effectoramount = 10;
    int cooldown = 10;
    int ID = 3; //Origional ID
    if(charactervariables.AbilityName1 == null){
      charactervariables.AbilityName1 = name;
      charactervariables.AbilityDescription1 = description;
      charactervariables.AbilityEffector1 = effector;
      charactervariables.AbilityEffectorAmount1 = effectoramount;
      charactervariables.AbilityCooldown1 = cooldown;
      charactervariables.AbilityID1 = ID;
    }else if(charactervariables.AbilityName2 == null){
      charactervariables.AbilityName2 = name;
      charactervariables.AbilityDescription2 = description;
      charactervariables.AbilityEffector2 = effector;
      charactervariables.AbilityEffectorAmount2 = effectoramount;
      charactervariables.AbilityCooldown2 = cooldown;
      charactervariables.AbilityID2 = ID;
    }else if(charactervariables.AbilityName3 == null){
      charactervariables.AbilityName3 = name;
      charactervariables.AbilityDescription3 = description;
      charactervariables.AbilityEffector3 = effector;
      charactervariables.AbilityEffectorAmount3 = effectoramount;
      charactervariables.AbilityCooldown3 = cooldown;
      charactervariables.AbilityID3 = ID;
    }else if(charactervariables.AbilityName4 == null){
      charactervariables.AbilityName4 = name;
      charactervariables.AbilityDescription4 = description;
      charactervariables.AbilityEffector4 = effector;
      charactervariables.AbilityEffectorAmount4 = effectoramount;
      charactervariables.AbilityCooldown4 = cooldown;
      charactervariables.AbilityID4 = ID;
    }
  }
  
  public static void Ability4(){
    String name = "Ultimate";
    String description = "Attack with +2 to your atk";
    int effector = 5;
    int effectoramount = -charactervariables.atk-2;
    int cooldown = 4;
    int ID = 4; //Origional ID
    if(charactervariables.AbilityName1 == null){
      charactervariables.AbilityName1 = name;
      charactervariables.AbilityDescription1 = description;
      charactervariables.AbilityEffector1 = effector;
      charactervariables.AbilityEffectorAmount1 = effectoramount;
      charactervariables.AbilityCooldown1 = cooldown;
      charactervariables.AbilityID1 = ID;
    }else if(charactervariables.AbilityName2 == null){
      charactervariables.AbilityName2 = name;
      charactervariables.AbilityDescription2 = description;
      charactervariables.AbilityEffector2 = effector;
      charactervariables.AbilityEffectorAmount2 = effectoramount;
      charactervariables.AbilityCooldown2 = cooldown;
      charactervariables.AbilityID2 = ID;
    }else if(charactervariables.AbilityName3 == null){
      charactervariables.AbilityName3 = name;
      charactervariables.AbilityDescription3 = description;
      charactervariables.AbilityEffector3 = effector;
      charactervariables.AbilityEffectorAmount3 = effectoramount;
      charactervariables.AbilityCooldown3 = cooldown;
      charactervariables.AbilityID3 = ID;
    }else if(charactervariables.AbilityName4 == null){
      charactervariables.AbilityName4 = name;
      charactervariables.AbilityDescription4 = description;
      charactervariables.AbilityEffector4 = effector;
      charactervariables.AbilityEffectorAmount4 = effectoramount;
      charactervariables.AbilityCooldown4 = cooldown;
      charactervariables.AbilityID4 = ID;
    }
  }
  
  
  
}
