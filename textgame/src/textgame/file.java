package textgame;
import java.lang.*;
import java.util.*;


import java.io.*;

public class file{
		public static String characterchosenname;
		public static int loopnumber;
		public static String username5;
		public static String password5;
		public static String inUsername;
		public static String tempusername;
    public static String NAME;
		public static int CHAPTER = 1;
		public static int CHECKPOINT = 1;
    public static int HP = 100;
    public static int ATK = 10;
    public static int DEF = 1;
    public static int LUCK = 1;
    public static int CRIT = 1;
    public static int CHARM = 1;
		public static int level = 1;
		public static int xp = 0;
		static boolean classcorrect;
		static boolean subclassloop;
    static boolean subclass;
		static boolean subrace;
		static int classchoice1;
		static int racechoice1;
		static int subracechoice11;
		static int subracechoice12;
		static int subracechoice13;
		static int subracechoice14;
		static int subclasschoice11;
		static int subclasschoice12;
		static int subclasschoice13;
		static int subclasschoice14;
		static int subracechoice15;
		static int subclasschoice15;
  
	public static String inputusername;
	
  public static int CreateAccount(String inUsername, String inPassword){
	  /*
	   * Returns:
	   * 1 = sucessful
	   * 2 = unsucessful
	   * 3 = Username Exists
	   */
File file = new File(inUsername);
        if (!file.exists()) {
            if (file.mkdir()) {
            } else {
                return 3;
            }
        }
		
    // Make file

      Writer writer = null;
 try{
			File fout = new File(inUsername + "/account.txt");
	FileOutputStream fos = new FileOutputStream(fout);
 
	BufferedWriter bs = new BufferedWriter(new OutputStreamWriter(fos));
                 
    bs.write(inPassword);
	 	bs.newLine();
	 	bs.write("1");
	 	bs.newLine();
	 	bs.write("2");
	 	bs.newLine();
	 	bs.write("3");

	bs.close();
		}catch(IOException e){
			return 2;
		}
  return 1;
}
  
   
  public static void CreateCharacter(String CharacterName, int CharacterRace, int CharacterClass){
    Scanner input = new Scanner(System.in);
    
  NAME = CharacterName;
  
  if(CharacterRace == 1){//Human
	  ATK += 2;
      DEF += 2;
      LUCK += 1;
      CHARM += 3;
  	}else if(CharacterRace == 2){//Elf
  		ATK += 3;
        DEF += 1;
        CRIT += 4;
        LUCK += 1;
        CHARM += 1;
  		}else if(CharacterRace == 3){//Dwarf
  			HP += 15;
            ATK += 2;
            DEF += 3;
  			}else if(CharacterRace == 4){//Orc
  				ATK += 4;
                DEF += 2;
  				}
       if(CharacterClass == 1){//Champion
    	   ATK += 2;
           CRIT -= 1;
       }else if(CharacterClass == 2){//Ranger
    	   DEF -= 1;
           CRIT += 2;
       }else if(CharacterClass == 3){//Mage
    	   CRIT += 2;
           ATK += 2;
           DEF -= 1;
           CHARM -= 1;
           LUCK -= 1;
       }else if(CharacterClass == 4){//Thief
    	   CHARM += 2;
           LUCK += 2;
           CRIT -= 1;
           DEF -= 1;
       }
    

			String CHAPTER1 = Integer.toString(CHAPTER);
			String CHECKPOINT1 = Integer.toString(CHECKPOINT);
			String Hp1 = Integer.toString(HP);
			String ATK1 = Integer.toString(ATK);
			String DEF1 = Integer.toString(DEF);
			String LUCK1 = Integer.toString(LUCK);
			String CRIT1 = Integer.toString(CRIT);
			String CHARM1 = Integer.toString(CHARM);
			String LEVEL1 = Integer.toString(level);
			String XP1 = Integer.toString(xp);
		
		
		

		
		username5 = accountvariables.Username;
		password5 = accountvariables.Password;
	
				BufferedWriter bufferedWriter = null;        
    try {            
        //Construct the BufferedWriter object
        bufferedWriter = new BufferedWriter(new FileWriter(username5+"/"+NAME+".txt"));            
        //Start writing to the output stream
        bufferedWriter.write(CHAPTER1);
				bufferedWriter.newLine();
				bufferedWriter.write(CHECKPOINT1);
				bufferedWriter.newLine();
			bufferedWriter.write(Hp1);
				bufferedWriter.newLine();
			bufferedWriter.write(ATK1);
				bufferedWriter.newLine();
			bufferedWriter.write(DEF1);
				bufferedWriter.newLine();
			bufferedWriter.write(LUCK1);
				bufferedWriter.newLine();
			bufferedWriter.write(CRIT1);
				bufferedWriter.newLine();
			bufferedWriter.write(CHARM1);
				bufferedWriter.newLine();
			bufferedWriter.write(LEVEL1);
				bufferedWriter.newLine();
			bufferedWriter.write(XP1);
			bufferedWriter.newLine();
			bufferedWriter.write("1");
				bufferedWriter.newLine();
			bufferedWriter.write("2");
			bufferedWriter.newLine();
			bufferedWriter.write("3");
			bufferedWriter.newLine();
			bufferedWriter.write("4");
			bufferedWriter.newLine();
			bufferedWriter.write("0");
			bufferedWriter.newLine();
			bufferedWriter.write("0");
			bufferedWriter.newLine();
			bufferedWriter.write("0");
			bufferedWriter.newLine();
			bufferedWriter.write("0");
			bufferedWriter.newLine();
			bufferedWriter.write("0");
			bufferedWriter.newLine();
			bufferedWriter.write("0");
			bufferedWriter.newLine();
			bufferedWriter.write("0");
			bufferedWriter.newLine();
			bufferedWriter.write("0");
			bufferedWriter.newLine();
			bufferedWriter.write("0");
			System.out.println();
			System.out.println("Character Created!");
			System.out.println();
			System.out.println("----------------------------------------------------------------------------");
    } catch (FileNotFoundException ex) {
        ex.printStackTrace();
    } catch (IOException ex) {
        ex.printStackTrace();
    } finally {
        //Close the BufferedWriter
        try {
            if (bufferedWriter != null) {
                bufferedWriter.flush();
                bufferedWriter.close();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
		
		//DELETE OLD FILE
		try{
		File realName = new File(username5+"/account.txt");
		realName.delete(); // remove the old file
		}catch(NullPointerException e){
			System.out.println("FILE DELETION ERROR");
		}
		
				BufferedWriter bufferedWrite = null;        
    try {            
        //Construct the BufferedWriter object
        bufferedWrite = new BufferedWriter(new FileWriter(username5+"/account.txt"));            
        //Start writing to the output stream
bufferedWrite.write(password5);
			bufferedWrite.newLine();
			String char1 = accountvariables.Character1;
			String char2 = accountvariables.Character2;
			String char3 = accountvariables.Character3;
			if(char1.equals("1")){
				bufferedWrite.write(NAME);
				bufferedWrite.newLine();
				bufferedWrite.write("2");
				bufferedWrite.newLine();
				bufferedWrite.write("3");
				loopnumber = 1;
			}else if(char2.equals("2") && !char1.equals("1")){
				bufferedWrite.write(accountvariables.Character1);
				bufferedWrite.newLine();
				bufferedWrite.write(NAME);
				bufferedWrite.newLine();
				bufferedWrite.write("3");
				loopnumber =2;
			}else if(char3.equals("3") && !char2.equals("2")){
				bufferedWrite.write(accountvariables.Character1);
				bufferedWrite.newLine();
				bufferedWrite.write(accountvariables.Character2);
				bufferedWrite.newLine();
				bufferedWrite.write(NAME);
				loopnumber =3;
			}else{
				System.out.println("Im sorry, you have reached the max number of characters");
			}
    } catch (FileNotFoundException ex) {
        ex.printStackTrace();
    } catch (IOException ex) {
        ex.printStackTrace();
    } finally {
        //Close the BufferedWrite
        try {
            if (bufferedWrite != null) {
                bufferedWrite.flush();
                bufferedWrite.close();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
		accountvariables.Username = username5;
		accountvariables.AccountRead();
 
		if(loopnumber == 1){
			charactervariables.Character1Load();
		}else if(loopnumber ==2){
			charactervariables.Character2Load();
		}else if(loopnumber ==3){
			charactervariables.Character3Load();
		}
 }
  
  
  public static String Username;
  public static String Password;
  public static String CorrectPassword;
	
  public static int Login(String inUsername,String inPassword){
	  /*
	   * Return Int:
	   * 0 = Correct
	   * 1 = Incorrect
	   * 2 = Username Not Found
	   * 
	   */
    Scanner input = new Scanner(System.in);
    boolean correctlogin = true;
    
    while(correctlogin){
	
    BufferedReader br = null;
		try{
			String sCurrentLine;
			br = new BufferedReader(new FileReader(inUsername + "/account.txt"));
			CorrectPassword = br.readLine();
			
			if(CorrectPassword.equals(inPassword)){
				accountvariables.Username = inUsername;
				accountvariables.Password = inPassword;
				System.out.println();
        
				System.out.println();
				methods.WaitFor(3000);
        break;
      }else{
        System.out.println("Password incorrect. Please try again");
        return 1;
        
      }
		} catch (IOException e) {
			return 2;
		} finally {
			try {
				if (br != null)br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
      

    }
		
    accountvariables.Username = inUsername;
	accountvariables.AccountRead();
    username5 = inUsername;
	return 0;
  }
 
	public static void UpdateCharacterFiles(){
		
		if(accountvariables.CharacterChosen == 1){
			characterchosenname = accountvariables.Character1;
			WriteCharacterFiles();
		}else if(accountvariables.CharacterChosen == 2){
			characterchosenname = accountvariables.Character2;
			WriteCharacterFiles();
		}else if(accountvariables.CharacterChosen == 3){
			characterchosenname = accountvariables.Character3;
			WriteCharacterFiles();
		}else if(accountvariables.CharacterChosen == 0){
			System.out.println("No Files To Update.... Goodbye!");
						System.out.println("----------------------------------------------------------------------------");
		}
		
	}
	
	public static void WriteCharacterFiles(){
		
				//DELETE OLD FILE
		try{
		File realName = new File(accountvariables.Username+"/"+characterchosenname+".txt");
		realName.delete(); // remove the old file
		}catch(NullPointerException e){
			System.out.println("FILE DELETION ERROR");
		}


						BufferedWriter bufferedWriter = null;        
    try {            
        //Construct the BufferedWriter object
        bufferedWriter = new BufferedWriter(new FileWriter(accountvariables.Username+"/"+characterchosenname+".txt"));            
        //Start writing to the output stream
				int characterchapter = charactervariables.chapter;
				String characterchapter1 = Integer.toString(characterchapter);
        bufferedWriter.write(characterchapter1);
				bufferedWriter.newLine();
				int charactercheckpoint = charactervariables.checkpoint;
				String charactercheckpoint1 = Integer.toString(charactercheckpoint);
				bufferedWriter.write(charactercheckpoint1);
				bufferedWriter.newLine();
				int characterhp = charactervariables.hp;
				String characterhp1 = Integer.toString(characterhp);
			bufferedWriter.write(characterhp1);
				bufferedWriter.newLine();
				int characteratk = charactervariables.atk;
				String characteratk1 = Integer.toString(characteratk);
			bufferedWriter.write(characteratk1);
				bufferedWriter.newLine();
				int characterdef = charactervariables.def;
				String characterdef1 = Integer.toString(characterdef);
			bufferedWriter.write(characterdef1);
				bufferedWriter.newLine();
				int characterluck = charactervariables.luck;
				String characterluck1 = Integer.toString(characterluck);
			bufferedWriter.write(characterluck1);
				bufferedWriter.newLine();
				int charactercrit = charactervariables.crit;
				String charactercrit1 = Integer.toString(charactercrit);
			bufferedWriter.write(charactercrit1);
				bufferedWriter.newLine();
				int charactercharm = charactervariables.charm;
				String charactercharm1 = Integer.toString(charactercharm);
			bufferedWriter.write(charactercharm1);
				bufferedWriter.newLine();
				int characterlevel = charactervariables.level;
				String characterlevel1 = Integer.toString(characterlevel);
			bufferedWriter.write(characterlevel1);
				bufferedWriter.newLine();
				int characterxp = charactervariables.xp;
				String characterxp1 = Integer.toString(characterxp);
			bufferedWriter.write(characterxp1);
			bufferedWriter.newLine();
			int characterability1 = charactervariables.AbilityID1;
			String characterability11 = Integer.toString(characterability1);
			bufferedWriter.write(characterability11);
				bufferedWriter.newLine();
			int characterability2 = charactervariables.AbilityID2;
			String characterability12 = Integer.toString(characterability2);
			bufferedWriter.write(characterability12);
			bufferedWriter.newLine();
			int characterability3 = charactervariables.AbilityID3;
			String characterability13 = Integer.toString(characterability3);
			bufferedWriter.write(characterability13);
			bufferedWriter.newLine();
			int characterability4 = charactervariables.AbilityID4;
			String characterability14 = Integer.toString(characterability4);
			bufferedWriter.write(characterability14);
			bufferedWriter.newLine();
			int characteritem1 = charactervariables.Item1ID;
			String characteritem11 = Integer.toString(characteritem1);
			bufferedWriter.write(characteritem11);
			bufferedWriter.newLine();
			int characteritem2 = charactervariables.Item2ID;
			String characteritem12 = Integer.toString(characteritem2);
			bufferedWriter.write(characteritem12);
			bufferedWriter.newLine();
			int characteritem3 = charactervariables.Item3ID;
			String characteritem13 = Integer.toString(characteritem3);
			bufferedWriter.write(characteritem13);
			bufferedWriter.newLine();
			int characteritem4 = charactervariables.Item4ID;
			String characteritem14 = Integer.toString(characteritem4);
			bufferedWriter.write(characteritem14);
			bufferedWriter.newLine();
			int characteritem5 = charactervariables.Item5ID;
			String characteritem15 = Integer.toString(characteritem5);
			bufferedWriter.write(characteritem15);
			bufferedWriter.newLine();
			int characteritem6 = charactervariables.Item6ID;
			String characteritem16 = Integer.toString(characteritem6);
			bufferedWriter.write(characteritem16);
			bufferedWriter.newLine();
			int characteritem7 = charactervariables.Item7ID;
			String characteritem17 = Integer.toString(characteritem7);
			bufferedWriter.write(characteritem17);
			bufferedWriter.newLine();
			int characteritem8 = charactervariables.Item8ID;
			String characteritem18 = Integer.toString(characteritem8);
			bufferedWriter.write(characteritem18);
			bufferedWriter.newLine();
			int characteritem9 = charactervariables.Item9ID;
			String characteritem19 = Integer.toString(characteritem9);
			bufferedWriter.write(characteritem19);
			System.out.println();
			System.out.println("Files Updated! Thank you for Playing!");
			System.out.println();
			System.out.println("----------------------------------------------------------------------------");
    } catch (FileNotFoundException ex) {
        ex.printStackTrace();
    } catch (IOException ex) {
        ex.printStackTrace();
    } finally {
        //Close the BufferedWriter
        try {
            if (bufferedWriter != null) {
                bufferedWriter.flush();
                bufferedWriter.close();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
	}
	
	
}


