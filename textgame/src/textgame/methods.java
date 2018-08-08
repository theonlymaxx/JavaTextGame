package textgame;
import java.util.*;
import java.lang.*;
import java.io.*;
public class methods{
		public static int xp;
		public static int currentLevel;
		public static int playerLevel;
		public static int maxxp;
    public static int tries = 1;
  	public static String enemyname;
		public static int enemyhp;
	  public static int enemyatk;
    public static int enemydef;
    public static double enemycrit;
  //Custom Enemy Combat Variables
    public static String customenemyname;
    public static int customenemyatk;
    public static int customenemydef;
    public static int customenemyhp;
    public static int customenemycrit;
    
  
  public static void WelcomeScreen(){
    System.out.println("--------------------------------------------------------------------------------------------------------------------------------");
    System.out.println();
    System.out.println("Welcome!!");
    System.out.println();
    System.out.println("This is a open world based text game, that embarks upon the adventure known as life......");
    System.out.println();
    System.out.print("Its time to begin ");
    try {
    Thread.sleep(1500);
} catch(InterruptedException ex) {
    Thread.currentThread().interrupt();
}
    System.out.print(". ");
    try {
    Thread.sleep(1500);
} catch(InterruptedException ex) {
    Thread.currentThread().interrupt();
}
    System.out.print(". ");
    try {
    Thread.sleep(1500);
} catch(InterruptedException ex) {
    Thread.currentThread().interrupt();
}
    System.out.print(". ");
    
          try {
    Thread.sleep(1500);
} catch(InterruptedException ex) {
    Thread.currentThread().interrupt();
}
    System.out.print(". ");
    
    try {
    Thread.sleep(1500);
} catch(InterruptedException ex) {
    Thread.currentThread().interrupt();
}
    System.out.print(". ");
        try {
    Thread.sleep(1500);
} catch(InterruptedException ex) {
    Thread.currentThread().interrupt();
}
    System.out.print(". ");
        try {
    Thread.sleep(1500);
} catch(InterruptedException ex) {
    Thread.currentThread().interrupt();
}
    System.out.print(". ");
        try {
    Thread.sleep(1500);
} catch(InterruptedException ex) {
    Thread.currentThread().interrupt();
}
    System.out.println(". ");
    System.out.println("--------------------------------------------------------------------------------------------------------------------------------");
  }
  
  public static void PleaseWait(){
    System.out.println();
    System.out.print("Please Wait ");
    try {
    Thread.sleep(1500);
} catch(InterruptedException ex) {
    Thread.currentThread().interrupt();
}
    System.out.print(". ");
    try {
    Thread.sleep(1500);
} catch(InterruptedException ex) {
    Thread.currentThread().interrupt();
}
    System.out.print(". ");
    try {
    Thread.sleep(1500);
} catch(InterruptedException ex) {
    Thread.currentThread().interrupt();
}
    System.out.print(". ");
    
          try {
    Thread.sleep(1500);
} catch(InterruptedException ex) {
    Thread.currentThread().interrupt();
}
    System.out.print(". ");
    
    try {
    Thread.sleep(1500);
} catch(InterruptedException ex) {
    Thread.currentThread().interrupt();
}
    System.out.print(". ");
        try {
    Thread.sleep(1500);
} catch(InterruptedException ex) {
    Thread.currentThread().interrupt();
}
    System.out.print(". ");
        try {
    Thread.sleep(1500);
} catch(InterruptedException ex) {
    Thread.currentThread().interrupt();
}
    System.out.print(". ");
        try {
    Thread.sleep(1500);
} catch(InterruptedException ex) {
    Thread.currentThread().interrupt();
}
    System.out.println(". ");
    System.out.println();
  }
  
  public static void SkipLines(){
    System.out.println();System.out.println();System.out.println();System.out.println();System.out.println();System.out.println();System.out.println();System.out.println();System.out.println();System.out.println();System.out.println();
    System.out.println();System.out.println();System.out.println();System.out.println();System.out.println();System.out.println();System.out.println();System.out.println();System.out.println();System.out.println();System.out.println();
    System.out.println();System.out.println();System.out.println();System.out.println();System.out.println();System.out.println();System.out.println();System.out.println();System.out.println();System.out.println();System.out.println();
    System.out.println();System.out.println();System.out.println();System.out.println();System.out.println();System.out.println();System.out.println();System.out.println();System.out.println();System.out.println();System.out.println();
    System.out.println();System.out.println();System.out.println();System.out.println();System.out.println();System.out.println();System.out.println();System.out.println();System.out.println();System.out.println();System.out.println();
    System.out.println();System.out.println();System.out.println();System.out.println();System.out.println();System.out.println();System.out.println();System.out.println();System.out.println();System.out.println();System.out.println();
  }

              //THE FOLLOWING IS COMMAND LINE METHODS
  public static String command;
  public static boolean CommandLineLoop = true;
  
  public static void CommandLineRead(){
      while(CommandLineLoop == true){
    System.out.println("Enter Command: ");
    Scanner input = new Scanner (System.in);
    command = input.nextLine();
    final String CommandHelpSyntax = "/help";
    final String CommandInventorySyntax = "/inventory";
    final String CommandInventoryCmdSyntax = "/inv";
    final String CommandSkillsSyntax = "/skills";
    final String CommandGearSyntax = "/gear";
    final String CommandStoreSyntax = "/store";
    if(command.toLowerCase().contains(CommandHelpSyntax)){
      CommandHelp();
    }else if (command.toLowerCase().contains(CommandSkillsSyntax)){
      
    }else if (command.toLowerCase().contains(CommandGearSyntax)){
      
    }else if (command.toLowerCase().contains(CommandStoreSyntax)){
     
    }else if (command.toLowerCase().contains("/close")){
      break;
    }
  }
	}
  
  public static void CommandHelp(){
    System.out.println("Command List: ");
    System.out.println("  Help - /help");
    System.out.println("  Inventory - /inventory");
    System.out.println("  Skills - /skills");
    System.out.println("  Gear - /gear");
    System.out.println("  Store - /store");
  }

	
							//IN GAME MECHANICS
	public static void LevelUpdate(){
xp = charactervariables.xp;
	currentLevel = charactervariables.level;
		if(xp <= 5){
			playerLevel = 1;
			maxxp = 5;
			}else if(xp >= 6 && xp <= 16){
				playerLevel =2;
			maxxp = 16;
			}else if(xp >=17 && xp <=32){
				playerLevel = 3;
			maxxp = 32;
			}else if(xp >=33 & xp <=53){
				playerLevel =4;
			maxxp = 53;
			}else if(xp >=54 & xp <=79){
				playerLevel =5;
			maxxp = 79;
			}else if(xp >=80 & xp <=110){
				playerLevel =6;
			maxxp = 110;
			}else if(xp >=111 & xp <=146){
				playerLevel =7;
			maxxp = 146;
			}else if(xp >=147 & xp <=187){
				playerLevel =8;
			maxxp = 187;
			}else if(xp >=188 & xp <=233){
				playerLevel =9;
			maxxp = 233;
			}else if(xp >=234 & xp <=284){
				playerLevel =10;
			maxxp = 284;
			}else if(xp >=285 & xp <=340){
				playerLevel =11;
			maxxp = 340;
			}else if(xp >=341 & xp <=401){
				playerLevel =12;
			maxxp = 401;
			}else if(xp >=402 & xp <=467){
				playerLevel =13;
			maxxp = 467;
			}else if(xp >=468 & xp <=538){
				playerLevel=14;
			maxxp = 538;
			}else if(xp >=539 & xp <=614){
				playerLevel =15;
			maxxp = 614;
			}else if(xp >=615 & xp <=695){
				playerLevel =16;
			maxxp = 695;
			}else if(xp >=696 & xp <=781){
				playerLevel =17;
			maxxp = 781;
			}else if(xp >=782 & xp <=872){
				playerLevel =18;
			maxxp = 872;
			}else if(xp >=873 & xp <=968){
				playerLevel =19;
			maxxp = 968;
			}else if(xp >=969 & xp <=1069){
				playerLevel =20;
			maxxp = 1069;
			}else if(xp >=1070 & xp <=1175){
				playerLevel =21;
			maxxp = 1175;
			}else if(xp >=1176 & xp <=1286){
				playerLevel =22;
			maxxp = 1286;
			}else if(xp >=1287 & xp <=1402){
				playerLevel =23;
			maxxp = 1402;
			}else if(xp >=1403 & xp <=1532){
				playerLevel =24;
			maxxp = 1532;
			}else if(xp >=1524 & xp <=1649){
				playerLevel =25;
			maxxp = 1649;
			}else if(xp >=1650 & xp <=1780){
				playerLevel =26;
			maxxp = 1780;
			}else if(xp >=1781 & xp <=1916){
				playerLevel =27;
			maxxp = 1916;
			}else if(xp >=1917 & xp <=2057){
				playerLevel =28;
			maxxp = 2057;
			}else if(xp >=2058 & xp <=2203){
				playerLevel =29;
			maxxp = 2203;
			}else if(xp >=2204 & xp <=2354){
				playerLevel =30;
			maxxp = 2354;
			}else if(xp >=2355 & xp <=2510){
				playerLevel =31;
			maxxp = 2510;
			}else if(xp >=2511 & xp <=2671){
				playerLevel =32;
			maxxp = 2671;
			}else if(xp >=2672 & xp <=2837){
				playerLevel =33;
			maxxp = 2837;
			}else if(xp >=2838 & xp <=3008){
				playerLevel =34;
			maxxp = 3008;
			}else if(xp >=3009 & xp <=3184){
				playerLevel =35;
			maxxp = 3184;
			}else if(xp >=3185 & xp <=3365){
				playerLevel =36;
			maxxp = 3365;
			}else if(xp >=3366 & xp <=3551){
				playerLevel =37;
			maxxp = 3551;
			}else if(xp >=3552 & xp <=3742){
				playerLevel =38;
			maxxp = 3742;
			}else if(xp >=3743 & xp <=3938){
				playerLevel =39;
			maxxp = 3938;
			}else if(xp >=3939 & xp <=4139){
				playerLevel =40;
			maxxp = 4139;
			}else if(xp >=4140 & xp <=4345){
				playerLevel =41;
			maxxp = 4345;
			}else if(xp >=4346 & xp <=4556){
				playerLevel =42;
			maxxp = 4556;
			}else if(xp >=4557 & xp <=4772){
				playerLevel =43;
			maxxp = 4772;
			}else if(xp >=4773 & xp <=4993){
				playerLevel =44;
			maxxp = 4993;
			}else if(xp >=4994 & xp <=5219){
				playerLevel =45;
			maxxp = 5219;
			}else if(xp >=5220 & xp <=5450){
				playerLevel =46;
			maxxp = 5450;
			}else if(xp >=5451 & xp <=5686){
				playerLevel =47;
			maxxp = 5686;
			}else if(xp >=5687 & xp <=5927){
				playerLevel =48;
			maxxp = 5927;
			}else if(xp >=5928 & xp <=6173){
				playerLevel =49;
			maxxp = 6173;
			}else if(xp >=6174 & xp <=6424){
				playerLevel =50;
			maxxp = 6424;
			}else if(xp >=6425 & xp <=6680){
				playerLevel =51;
			maxxp = 6680;
			}else if(xp >=6681 & xp <=6941){
				playerLevel =52;
			maxxp = 6941;
			}else if(xp >=6942 & xp <=7207){
				playerLevel =53;
			maxxp = 7207;
			}else if(xp >=7208 & xp <=7478){
				playerLevel =54;
			maxxp = 7478;
			}else if(xp >=7479 & xp <=7754){
				playerLevel =55;
			maxxp = 7754;
			}else if(xp >=7755 & xp <=8035){
				playerLevel =56;
			maxxp = 8035;
			}else if(xp >=8036 & xp <=8321){
				playerLevel =57;
			maxxp = 8321;
			}else if(xp >=8322 & xp <=8612){
				playerLevel =58;
			maxxp = 8612;
			}else if(xp >=8613 & xp <=8908){
				playerLevel =59;
			maxxp = 8908;
			}else if(xp >=8613 & xp <=9209){
				playerLevel =60;
			maxxp = 9209;
			}else if(xp >=9209){
				playerLevel = 60;
			}
		
		if(playerLevel != currentLevel){
			charactervariables.level = playerLevel;
			currentLevel = playerLevel;
			int neededxp = maxxp - xp;
			System.out.println("You have ranked up!!!");
			System.out.println("You need " + neededxp + " xp to rank up.");
		}
		
	}
	
	public static void WaitFor(int WaitTime){
		try {
    Thread.sleep(WaitTime);
} catch(InterruptedException ex) {
    Thread.currentThread().interrupt();
}
	}
	
	public static void SkipABunchOfLines(int NumberOfLines){
		for(int line = 1; NumberOfLines == line; line++){
			System.out.println();
		}
	}
	
	
	
}