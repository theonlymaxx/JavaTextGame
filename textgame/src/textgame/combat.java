package textgame;
import java.util.*;
import java.lang.*;
import java.io.*;
public class combat{
	    public static String customenemyname;
    public static int customenemyatk;
    public static int customenemydef;
    public static int customenemyhp;
    public static int customenemycrit;
    public static boolean randenemyselect = true;
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
		static int hp;
	static int atk;
	static int def;
	static int luck;
	static int crit;
	public static int Ability1Cooldown;
	public static int Ability2Cooldown;
	public static int Ability3Cooldown;
	public static int Ability4Cooldown;
	public static int Ability1State;
	public static int Ability2State;
	public static int Ability3State;
	public static int Ability4State;
	public static double enemynumber;
	public static Random rand = new Random(); // Create Random Object
          public static Scanner in = new Scanner(System.in); // Create Scanner Object
	
		public static String itemchoice1;
	static int path1;
	static int abilitychoice;
	static int itemchoice;
public static void Combat(int enemyset){
										// Make a copy of player variables
		 hp = charactervariables.hp;
		 atk = charactervariables.atk;
		 def = charactervariables.def;
		 luck = charactervariables.luck;
		 crit = charactervariables.crit;
								 // Make other needed variables
		int turn = 0;
    
          if(enemyset == 0){
						//Set enemy
						if(randenemyselect){
       enemynumber = rand.nextInt(4) + 1; // Randomly select an enemy
      if(enemynumber == 0){
        enemynumber++;
      }
					}
						
					}else if(enemyset != 0){
						enemynumber = enemyset;
					}
      
          //Set enemy variables according to enemynumber
      if(enemynumber == 1){
        Skeleton skeleton = new Skeleton(); // Create new Skeleton object
        skeleton.hp = rand.nextInt(100) + 1  * charactervariables.level + 100; // Set hp level
        skeleton.atk = rand.nextInt(1) * charactervariables.level + 5; // Set atk level
        skeleton.def = rand.nextInt(3) * charactervariables.level + 1; // Set def level
        skeleton.crit = rand.nextInt(1) + charactervariables.level + 0; //Set crit chance
        
				enemyname = "Skeleton";
        enemyhp = skeleton.hp;
        enemyatk = skeleton.atk;
        enemydef = skeleton.def;
        enemycrit = skeleton.crit;
        
      }else if(enemynumber == 2){
                Zombie zombie = new Zombie(); // Create new Zombie object
        zombie.hp = rand.nextInt(100) * charactervariables.level + 100; // Set hp level
        zombie.atk = rand.nextInt(1) * charactervariables.level + 5; // Set atk level
        zombie.def = rand.nextInt(3) * charactervariables.level + 1; // Set def level
        zombie.crit = rand.nextInt(1) + charactervariables.level + 0; //Set crit chance
        
				enemyname = "Zombie";
        enemyhp = zombie.hp;
        enemyatk = zombie.atk;
        enemydef = zombie.def;
        enemycrit = zombie.crit;
        
      }else if(enemynumber == 3){
                Orc orc = new Orc(); // Create new Orc object
        orc.hp = rand.nextInt(100) * charactervariables.level + 100; // Set hp level
        orc.atk = rand.nextInt(1) * charactervariables.level + 5; // Set atk level
        orc.def = rand.nextInt(3) * charactervariables.level + 1; // Set def level
        orc.crit = rand.nextInt(1) + charactervariables.level + 0; //Set crit chance
        
				enemyname = "Orc";
        enemyhp = orc.hp;
        enemyatk = orc.atk;
        enemydef = orc.def;
        enemycrit = orc.crit;
        
      }else if(enemynumber == 4){
                Spider spider = new Spider(); // Create new Spider object
        spider.hp = rand.nextInt(100) * charactervariables.level + 100; // Set hp level
        spider.atk = rand.nextInt(1) * charactervariables.level + 5; // Set atk level
        spider.def = rand.nextInt(3) * charactervariables.level + 1; // Set def level
        spider.crit = rand.nextInt(1) + charactervariables.level + 0; //Set crit chance
        
				enemyname = "Spider";
        enemyhp = spider.hp;
        enemyatk = spider.atk;
        enemydef = spider.def;
        enemycrit = spider.crit;
        
      }
      
    
		methods.WaitFor(2000);
	System.out.println("----------------------------------------------------------------------------");
			System.out.println();
		System.out.println("A "+ enemyname + " has appeared");
	System.out.println();
			System.out.println("----------------------------------------------------------------------------");
	methods.WaitFor(2000);

	System.out.println();
		
        //Start Combat Loop
		while(hp >= 0){
			
			turn++; //Set correct turn #
			System.out.println("----------------------------------------------------------------------------");
			System.out.println();
			System.out.println("Turn: " + turn); //Output turn #
			System.out.println();
			System.out.println("----------------------------------------------------------------------------");
			
						//Check for whose turn it is. If odd its players, if even enemy
			if (turn % 2 == 0){
				methods.WaitFor(2000);
        //Enemy Turn
				System.out.println();
				System.out.println("			Enemy Turn");
				System.out.println("----------------------------------------------------------------------------");
				System.out.print("	HP: " + enemyhp);
				System.out.print("	ATK: " + enemyatk);
				System.out.print("	DEF: " + enemydef);
				System.out.println(" 	CRIT " + enemycrit);
				System.out.println("----------------------------------------------------------------------------");
				System.out.println();
				int doescrit = rand.nextInt(100);
				if(doescrit <= enemycrit){
					int enemydamage1 = (enemyatk*2)-def;
					hp-= enemydamage1;
					System.out.println("Enemy made a critical strike and you took "+enemydamage1+ " damage!");
				}else{
					int enemydamage = enemyatk-def;
				hp-= enemydamage;
				System.out.println("Enemy did "+enemydamage+" damage!");
				}
				System.out.println();
				System.out.println("----------------------------------------------------------------------------");
			methods.WaitFor(2000);
    }
    else{
			System.out.println();
			System.out.println();
			
        //Player Turn
				System.out.println("			Your Turn");
        System.out.println("----------------------------------------------------------------------------");
        //Output Player Data (HP, etc.)
        System.out.print("	HP: "+hp);
				System.out.print(" 		ATK: " + atk);
				System.out.print(" 	DEF: " + def);
				System.out.print(" 		CRIT: " + crit);
			System.out.println();
      System.out.println("----------------------------------------------------------------------------");
        //Output Abilities w/ Cooldowns AND Items to use
        boolean AorI = true;
        while(AorI){
          //Choose Path
          System.out.println("Please choose one...");
          System.out.println("  1. Abilities");
          System.out.println("  2. Inventory");
          String path = in.nextLine();
					
					try{
      path1 = Integer.parseInt(path);
      }catch(NumberFormatException e){
        System.out.println("Please input a valid number.");
      }
					System.out.println();
          if(path1 == 1){
						//Reset Abilities
						if(turn == Ability1Cooldown){
							Ability1Cooldown = 0;
							Ability1State = 0;
						}
						if(turn == Ability2Cooldown){
							Ability2Cooldown = 0;
							Ability2State = 0;
						}
						if(turn == Ability3Cooldown){
							Ability3Cooldown = 0;
							Ability3State = 0;
						}
						if(turn == Ability4Cooldown){
							Ability4Cooldown = 0;
							Ability4State = 0;
						}
						boolean abilitychoice7 = true;
						while (abilitychoice7){
							System.out.println("----------------------------------------------------------------------------");
            //OUTPUT ABILITIES HERE
            System.out.println("1. "+charactervariables.AbilityName1);
						System.out.println("	-"+charactervariables.AbilityDescription1);
						String whatiseffected1 = Whatiseffected(charactervariables.AbilityEffector1);
						System.out.println("	-Effect: "+charactervariables.AbilityEffectorAmount1+ " "+whatiseffected1);
						if(Ability1State == 1){
							System.out.println("	-Cooldown? YES 	Till Turn: "+Ability1Cooldown);
						}else if(Ability1State != 1){
							System.out.println("	-Cooldown?  NO");
						}
						System.out.println();
            System.out.println("2. "+charactervariables.AbilityName2);
						System.out.println("	-"+charactervariables.AbilityDescription2);
						String whatiseffected2 = Whatiseffected(charactervariables.AbilityEffector2);
						System.out.println("	-Effect: "+charactervariables.AbilityEffectorAmount2+" "+whatiseffected2);
						if(Ability2State == 1){
							System.out.println("	-Cooldown? YES 	Till Turn: "+Ability2Cooldown);
						}else if(Ability2State != 1){
							System.out.println("	-Cooldown?  NO");
						}
						System.out.println();
						System.out.println("3. "+charactervariables.AbilityName3);
						System.out.println("	-"+charactervariables.AbilityDescription3);
						String whatiseffected3 = Whatiseffected(charactervariables.AbilityEffector3);
						System.out.println("	-Effect: "+charactervariables.AbilityEffectorAmount3+" "+whatiseffected3);
						if(Ability3State == 1){
							System.out.println("	-Cooldown? YES 	Till Turn: "+Ability3Cooldown);
						}else if(Ability3State != 1){
							System.out.println("	-Cooldown?  NO");
						}
						System.out.println();
						System.out.println("4. "+charactervariables.AbilityName4);
						System.out.println("	-"+charactervariables.AbilityDescription4);
						String whatiseffected4 = Whatiseffected(charactervariables.AbilityEffector4);
						System.out.println("	-Effect: "+charactervariables.AbilityEffectorAmount4+" "+whatiseffected4);
						if(Ability4State == 1){
							System.out.println("	-Cooldown? YES 	Till Turn: "+Ability4Cooldown);
						}else if(Ability4State != 1){
							System.out.println("	-Cooldown?  NO");
						}
						System.out.println();
            System.out.println("5. Go Back");
						System.out.println();
            // Ability Choice
							System.out.println("----------------------------------------------------------------------------");
						System.out.print("Choose An Ability: ");
            String abilitychoice1 = in.nextLine();
						
						try{
      abilitychoice = Integer.parseInt(abilitychoice1);
							break;
      }catch(NumberFormatException e){
        System.out.println("Please input a valid number.");
      }
							System.out.println();
						}
						if(abilitychoice == 1 && Ability1State == 1){
							System.out.println();
							System.out.println("Sorry, that ability is on Cooldown");
						}else if(abilitychoice == 2 && Ability2State == 1){
							System.out.println();
							System.out.println("Sorry, that ability is on Cooldown");
						}else if(abilitychoice == 3 && Ability3State == 1){
							System.out.println();
							System.out.println("Sorry, that ability is on Cooldown");
						}else if(abilitychoice == 4 && Ability4State == 1){
							System.out.println();
							System.out.println("Sorry, that ability is on Cooldown");
						}
						methods.WaitFor(2000);
							if(abilitychoice == 1 && Ability1State != 1){
              Calculations(charactervariables.AbilityEffector1,charactervariables.AbilityEffectorAmount1);
								methods.WaitFor(2000);
							Ability1Cooldown = charactervariables.AbilityCooldown1+turn;
							Ability1State = 1;
              break;
            }else if(abilitychoice == 2 && Ability2State != 1){
              Calculations(charactervariables.AbilityEffector2,charactervariables.AbilityEffectorAmount2);
								methods.WaitFor(2000);
							Ability2Cooldown = charactervariables.AbilityCooldown2+turn;
							Ability2State = 1;
              break;
            }else if(abilitychoice == 3 && Ability3State != 1){
              Calculations(charactervariables.AbilityEffector3,charactervariables.AbilityEffectorAmount3);
								methods.WaitFor(2000);
							Ability3Cooldown = charactervariables.AbilityCooldown3+turn;
							Ability3State = 1;
              break;
            }else if(abilitychoice == 4 && Ability4State != 1){
              Calculations(charactervariables.AbilityEffector4,charactervariables.AbilityEffectorAmount4);
								methods.WaitFor(2000);
							Ability4Cooldown = charactervariables.AbilityCooldown4+turn;
							Ability4State = 1;
              break;
            }else if(abilitychoice == 5){
              
            }
					System.out.println("----------------------------------------------------------------------------");
            
            
          }else if(path1 == 2){
            //OUTPUT INVENTORY HERE
						OutputInventory();
          }
        }
       
				
    }
				
					//Check for game ending output
			if(hp<=0){
				System.out.println("----------------------------------------------------------------------------");
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println("You have died");
				System.out.println();
				System.out.println();
				System.out.println("Resetting combat...");
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println("----------------------------------------------------------------------------");
				methods.WaitFor(4000);
			}else if (enemyhp <= 0){
				System.out.println("----------------------------------------------------------------------------");
				System.out.println();
				System.out.println();
				System.out.println("You have won!");
				System.out.println();
				System.out.println();
				System.out.println("----------------------------------------------------------------------------");
				charactervariables.xp += 3;
				methods.LevelUpdate();
				methods.WaitFor(4000);
				break;
			}
			System.out.println();
				System.out.println();
			System.out.println();
				System.out.println();
			System.out.println();
				System.out.println();
			System.out.println();
				System.out.println();
		}//HP>0
}


			public static String Whatiseffected(int effector){
		String effected = null;
		if(effector == 1){
			effected = "Player HP";
		}else if(effector == 2){
			effected = "Player ATK";
		}else if(effector == 3){
			effected = "Player DEF";
		}
		else if(effector == 4){
			effected = "Player CRIT";
		}
		else if(effector == 5){
			effected = "Enemy HP";
		}
		else if(effector == 6){
			effected = "Enemy ATK";
		}
		else if(effector == 7){
			effected = "Enemy DEF";
		}
		else if(effector == 8){
			effected = "Enemy CRIT";
		}
		return effected;
	}
  
  public static void Calculations(int effector, int effectoramount){
    if(effector == 1){
      hp+= effectoramount;
    }else if(effector == 2){
      atk+= effectoramount;
    }else if(effector == 3){
      def+= effectoramount;
    }else if(effector == 4){
      crit+= effectoramount;
    }else if(effector == 5){
			int doescrit = rand.nextInt(100);
				if(doescrit <= enemycrit){
					enemyhp+= (effectoramount*2)-enemydef;
					int damage = (effectoramount*2)-enemydef;
					System.out.println("----------------------------------------------------------------------------");
					System.out.println();
					System.out.println("You made a critical strike and did "+damage+" damage!");
					System.out.println();
					System.out.println("----------------------------------------------------------------------------");
				}else{
					enemyhp+= effectoramount-enemydef;
					int damage = effectoramount-enemydef;
					System.out.println("----------------------------------------------------------------------------");
					System.out.println();
					System.out.println("You did "+damage+" damage!");
					System.out.println();
					System.out.println("----------------------------------------------------------------------------");
				}
      
    }else if(effector == 6){
      enemyatk+= effectoramount;
    }else if(effector == 7){
      enemydef+= effectoramount;
    }else if(effector == 8){
      enemycrit+= effectoramount;
    }
  }
	
	public static void OutputInventory(){
		boolean inventory = true;
		InventoryPage1();
		int pagenumber = 1;
		while(inventory){
			itemchoice1 = in.nextLine();
			
			try{
      itemchoice = Integer.parseInt(itemchoice1);
							break;
      }catch(NumberFormatException e){
        System.out.println("Please input a valid number.");
      }
			if(itemchoice == 1){
				if(pagenumber == 1){
					InventoryPage1();
					pagenumber = 1;
				}else if(pagenumber == 2){
					InventoryPage1();
					pagenumber = 1;
				}else if(pagenumber ==3){
					InventoryPage2();
					pagenumber = 2;
				}
			}else if(itemchoice == 2){
				break;
			}else if(itemchoice == 3){
				break;
			}else if(itemchoice ==4){
				break;
			}else if(itemchoice ==5){
				if(pagenumber == 1){
					InventoryPage2();
					pagenumber = 2;
				}else if(pagenumber == 2){
					InventoryPage3();
					pagenumber = 3;
				}else if(pagenumber ==3){
					InventoryPage3();
					pagenumber = 3;
				}
			}else if(itemchoice == 6){
				break;
			}
		}
	}
	
	public static void InventoryPage1(){
		System.out.println("1. Go Back A Page");
		System.out.println();
		System.out.println("2. "+charactervariables.Item1Name);
		System.out.println("	-"+charactervariables.Item1Description);
		System.out.println("	-Amount: "+charactervariables.Item1Quantity);
		System.out.println();
		System.out.println("3. "+charactervariables.Item2Name);
		System.out.println("	-"+charactervariables.Item2Description);
		System.out.println("	-Amount: "+charactervariables.Item2Quantity);
		System.out.println();
		System.out.println("4. "+charactervariables.Item3Name);
		System.out.println("	-"+charactervariables.Item3Description);
		System.out.println("	-Amount: "+charactervariables.Item3Quantity);
		System.out.println();
		System.out.println("5. Go Foreward A Page");
		System.out.println();
		System.out.println("6. Go Back");
	}
	
	public static void InventoryPage2(){
		System.out.println("1. Go Back A Page");
		System.out.println();
		System.out.println("2. "+charactervariables.Item4Name);
		System.out.println("	-"+charactervariables.Item4Description);
		System.out.println("	-Amount: "+charactervariables.Item4Quantity);
		System.out.println();
		System.out.println("3. "+charactervariables.Item5Name);
		System.out.println("	-"+charactervariables.Item5Description);
		System.out.println("	-Amount: "+charactervariables.Item5Quantity);
		System.out.println();
		System.out.println("4. "+charactervariables.Item6Name);
		System.out.println("	-"+charactervariables.Item6Description);
		System.out.println("	-Amount: "+charactervariables.Item6Quantity);
		System.out.println();
		System.out.println("5. Go Foreward A Page");
		System.out.println();
		System.out.println("6. Go Back");
	}
	
	public static void InventoryPage3(){
		System.out.println("1. Go Back A Page");
		System.out.println();
		System.out.println("2. "+charactervariables.Item7Name);
		System.out.println("	-"+charactervariables.Item7Description);
		System.out.println("	-Amount: "+charactervariables.Item7Quantity);
		System.out.println();
		System.out.println("3. "+charactervariables.Item8Name);
		System.out.println("	-"+charactervariables.Item8Description);
		System.out.println("	-Amount: "+charactervariables.Item8Quantity);
		System.out.println();
		System.out.println("4. "+charactervariables.Item9Name);
		System.out.println("	-"+charactervariables.Item9Description);
		System.out.println("	-Amount: "+charactervariables.Item9Quantity);
		System.out.println();
		System.out.println("5. Go Foreward A Page");
		System.out.println();
		System.out.println("6. Go Back");
	}
}
	
	


