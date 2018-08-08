package textgame;
import java.lang.*;
import java.io.*;
import java.util.*;
public class charactervariables{
  public static String charactername; // Characters Name
  public static int chapter; // Last known chapter
  public static int checkpoint; // Last known checkpoint in chapter
  public static int hp; // Players health
  public static int atk; // Players Attack
  public static int def; // Players Defense
  public static int luck; // Players Better Loot Chance
  public static int crit; // Critical Hit Damage Chance Modifier
  public static int charm; // Better Barter, Convince People
	public static int level;
	public static int xp;
	
	//ABILITIES
	
	public static String AbilityName1;
	public static String AbilityDescription1;
	public static int AbilityEffector1;
	public static int AbilityEffectorAmount1;
	public static int AbilityCooldown1;
	public static int AbilityID1;
	public static String AbilityName2;
	public static String AbilityDescription2;
	public static int AbilityEffector2;
	public static int AbilityEffectorAmount2;
	public static int AbilityCooldown2;
	public static int AbilityID2;
	public static String AbilityName3;
	public static int AbilityEffector3;
	public static String AbilityDescription3;
	public static int AbilityEffectorAmount3;
	public static int AbilityCooldown3;
	public static int AbilityID3;
	public static String AbilityName4;
	public static String AbilityDescription4;
	public static int AbilityEffector4;
	public static int AbilityEffectorAmount4;
	public static int AbilityCooldown4;
	public static int AbilityID4;
	public static int Ability1;
	public static int Ability2;
	public static int Ability3;
	public static int Ability4;
	
	//INVENTORY
	public static String Item1Name;
	public static String Item1Description;
	public static int Item1Effector;
	public static int Item1EffectorAmount;
	public static int Item1ID;
	public static int Item1Stackable;
	public static int Item1Quantity;
	public static int Item1Class;
	public static String Item2Name;
	public static String Item2Description;
	public static int Item2Effector;
	public static int Item2EffectorAmount;
	public static int Item2ID;
	public static int Item2Stackable;
	public static int Item2Quantity;
	public static int Item2Class;
	public static String Item3Name;
	public static String Item3Description;
	public static int Item3Effector;
	public static int Item3EffectorAmount;
	public static int Item3ID;
	public static int Item3Stackable;
	public static int Item3Quantity;
	public static int Item3Class;
	public static String Item4Name;
	public static String Item4Description;
	public static int Item4Effector;
	public static int Item4EffectorAmount;
	public static int Item4ID;
	public static int Item4Stackable;
	public static int Item4Quantity;
	public static int Item4Class;
	public static String Item5Name;
	public static String Item5Description;
	public static int Item5Effector;
	public static int Item5EffectorAmount;
	public static int Item5ID;
	public static int Item5Stackable;
	public static int Item5Quantity;
	public static int Item5Class;
	public static String Item6Name;
	public static String Item6Description;
	public static int Item6Effector;
	public static int Item6EffectorAmount;
	public static int Item6ID;
	public static int Item6Stackable;
	public static int Item6Quantity;
	public static int Item6Class;
	public static String Item7Name;
	public static String Item7Description;
	public static int Item7Effector;
	public static int Item7EffectorAmount;
	public static int Item7ID;
	public static int Item7Stackable;
	public static int Item7Quantity;
	public static int Item7Class;
	public static String Item8Name;
	public static String Item8Description;
	public static int Item8Effector;
	public static int Item8EffectorAmount;
	public static int Item8ID;
	public static int Item8Stackable;
	public static int Item8Quantity;
	public static int Item8Class;
	public static String Item9Name;
	public static String Item9Description;
	public static int Item9Effector;
	public static int Item9EffectorAmount;
	public static int Item9ID;
	public static int Item9Stackable;
	public static int Item9Quantity;
	public static int Item9Class;
	public static int Item1;
	public static int Item2;
	public static int Item3;
	public static int Item4;
	public static int Item5;
	public static int Item6;
	public static int Item7;
	public static int Item8;
	public static int Item9;
  
  public static void Character1Load(){
    BufferedReader br = null;
		try{
			
			br = new BufferedReader(new FileReader(file.username5+"/"+accountvariables.Character1 + ".txt"));
      String chapter1 = br.readLine();
			chapter = Integer.parseInt(chapter1);
      String checkpoint1 = br.readLine();
			checkpoint = Integer.parseInt(checkpoint1);
      String hp1 = br.readLine();
			hp = Integer.parseInt(hp1);
      String atk1 = br.readLine();
			atk = Integer.parseInt(atk1);
      String def1 = br.readLine();
			def = Integer.parseInt(def1);
      String luck1 = br.readLine();
			luck = Integer.parseInt(luck1);
      String crit1 = br.readLine();
			crit = Integer.parseInt(crit1);
      String charm1 = br.readLine();
			charm = Integer.parseInt(charm1);
			String level1 = br.readLine();
			level = Integer.parseInt(level1);
			String xp1 = br.readLine();
			xp = Integer.parseInt(xp1);
			String Ability11 = br.readLine();
			 Ability1 = Integer.parseInt(Ability11);
			String Ability12 = br.readLine();
			 Ability2 = Integer.parseInt(Ability12);
			String Ability13 = br.readLine();
			 Ability3 = Integer.parseInt(Ability13);
			String Ability14 = br.readLine();
			 Ability4 = Integer.parseInt(Ability14);
			Abilities();
			String Item11 = br.readLine();
			 Item1 = Integer.parseInt(Item11);
			String Item12 = br.readLine();
			 Item2 = Integer.parseInt(Item12);
			String Item13 = br.readLine();
			 Item3 = Integer.parseInt(Item13);
			String Item14 = br.readLine();
			 Item4 = Integer.parseInt(Item14);
			String Item15 = br.readLine();
			 Item5 = Integer.parseInt(Item15);
			String Item16 = br.readLine();
			 Item6 = Integer.parseInt(Item16);
			String Item17 = br.readLine();
			 Item7 = Integer.parseInt(Item17);
			String Item18 = br.readLine();
			 Item8 = Integer.parseInt(Item18);
			String Item19 = br.readLine();
			 Item9 = Integer.parseInt(Item19);
			accountvariables.CharacterChosen = 1;
			Items();
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
  
  public static void Character2Load(){
     BufferedReader br = null;
		try{
			String name2 = accountvariables.Character2;
			br = new BufferedReader(new FileReader(file.username5+"/"+accountvariables.Character2 + ".txt"));
      String chapter2 = br.readLine();
			chapter = Integer.parseInt(chapter2);
      String checkpoint2 = br.readLine();
			checkpoint = Integer.parseInt(checkpoint2);
      String hp2 = br.readLine();
			hp = Integer.parseInt(hp2);
      String atk2 = br.readLine();
			atk = Integer.parseInt(atk2);
      String def2 = br.readLine();
			def = Integer.parseInt(def2);
      String luck2 = br.readLine();
			luck = Integer.parseInt(luck2);
      String crit2 = br.readLine();
			crit = Integer.parseInt(crit2);
      String charm2 = br.readLine();
			charm = Integer.parseInt(charm2);
			String level2 = br.readLine();
			level = Integer.parseInt(level2);
			String xp2 = br.readLine();
			xp = Integer.parseInt(xp2);
			String Ability21 = br.readLine();
			 Ability1 = Integer.parseInt(Ability21);
			String Ability22 = br.readLine();
			 Ability2 = Integer.parseInt(Ability22);
			String Ability23 = br.readLine();
			 Ability3 = Integer.parseInt(Ability23);
			String Ability24 = br.readLine();
			 Ability4 = Integer.parseInt(Ability24);
			Abilities();
			String Item21 = br.readLine();
			 Item1 = Integer.parseInt(Item21);
			String Item22 = br.readLine();
			 Item2 = Integer.parseInt(Item22);
			String Item23 = br.readLine();
			 Item3 = Integer.parseInt(Item23);
			String Item24 = br.readLine();
			 Item4 = Integer.parseInt(Item24);
			String Item25 = br.readLine();
			 Item5 = Integer.parseInt(Item25);
			String Item26 = br.readLine();
			 Item6 = Integer.parseInt(Item26);
			String Item27 = br.readLine();
			 Item7 = Integer.parseInt(Item27);
			String Item28 = br.readLine();
			 Item8 = Integer.parseInt(Item28);
			String Item29 = br.readLine();
			 Item9 = Integer.parseInt(Item29);
			accountvariables.CharacterChosen = 2;
			Items();
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
  
  public static void Character3Load(){
    BufferedReader br = null;
		try{
			String name3 = accountvariables.Character1;
			br = new BufferedReader(new FileReader(file.username5+"/"+accountvariables.Character3 + ".txt"));
      String chapter3 = br.readLine();
			chapter = Integer.parseInt(chapter3);
      String checkpoint3 = br.readLine();
			checkpoint = Integer.parseInt(checkpoint3);
      String hp3 = br.readLine();
			hp = Integer.parseInt(hp3);
      String atk3 = br.readLine();
			atk = Integer.parseInt(atk3);
      String def3 = br.readLine();
			def = Integer.parseInt(def3);
      String luck3 = br.readLine();
			luck = Integer.parseInt(luck3);
      String crit3 = br.readLine();
			crit = Integer.parseInt(crit3);
      String charm3 = br.readLine();
			charm = Integer.parseInt(charm3);
			String level3 = br.readLine();
			level = Integer.parseInt(level3);
			String xp3 = br.readLine();
			xp = Integer.parseInt(xp3);
			String Ability31 = br.readLine();
			 Ability1 = Integer.parseInt(Ability31);
			String Ability32 = br.readLine();
			 Ability2 = Integer.parseInt(Ability32);
			String Ability33 = br.readLine();
			 Ability3 = Integer.parseInt(Ability33);
			String Ability34 = br.readLine();
			 Ability4 = Integer.parseInt(Ability34);
			Abilities();
			String Item31 = br.readLine();
			 Item1 = Integer.parseInt(Item31);
			String Item32 = br.readLine();
			 Item2 = Integer.parseInt(Item32);
			String Item33 = br.readLine();
			 Item3 = Integer.parseInt(Item33);
			String Item34 = br.readLine();
			 Item4 = Integer.parseInt(Item34);
			String Item35 = br.readLine();
			 Item5 = Integer.parseInt(Item35);
			String Item36 = br.readLine();
			 Item6 = Integer.parseInt(Item36);
			String Item37 = br.readLine();
			 Item7 = Integer.parseInt(Item37);
			String Item38 = br.readLine();
			 Item8 = Integer.parseInt(Item38);
			String Item39 = br.readLine();
			 Item9 = Integer.parseInt(Item39);
			accountvariables.CharacterChosen = 3;
			Items();
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
	//Set Abilites to Charactervariables
	public static void Abilities(){
		if(Ability1 == 1){
			abilities.Ability1();
		}else if(Ability1 == 2){
			abilities.Ability2();
		}else if(Ability1 == 3){
			abilities.Ability3();
		}else if(Ability1 == 4){
			abilities.Ability4();
		}
		
		
		if(Ability2 == 1){
			abilities.Ability1();
		}else if(Ability2 == 2){
			abilities.Ability2();
		}else if(Ability2 == 3){
			abilities.Ability3();
		}else if(Ability2 == 4){
			abilities.Ability4();
		}
		
		
		if(Ability3 == 1){
			abilities.Ability1();
		}else if(Ability3 == 2){
			abilities.Ability2();
		}else if(Ability3 == 3){
			abilities.Ability3();
		}else if(Ability1 == 2){
			abilities.Ability4();
		}
		
		
		if(Ability4 == 1){
			abilities.Ability1();
		}else if(Ability4 == 2){
			abilities.Ability2();
		}else if(Ability4 == 3){
			abilities.Ability3();
		}else if(Ability4 == 4){
			abilities.Ability4();
		}
		
		
		
	}
	
	public static void Items(){
		if(Item1 == 1){
			items.Item1();
		}
		
		if(Item2 == 1){
			items.Item1();
		}
		
		if(Item3 == 1){
			items.Item1();
		}
		
		if(Item4 == 1){
			items.Item1();
		}
		
		if(Item5 == 1){
			items.Item1();
		}
		
		if(Item6 == 1){
			items.Item1();
		}
		
		if(Item7 == 1){
			items.Item1();
		}
		
		if(Item8 == 1){
			items.Item1();
		}
		
		if(Item9 == 1){
			items.Item1();
		}
	}
				
}//Class