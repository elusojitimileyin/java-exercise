import java.util.Scanner;

public class App{

public static void main(String[]args){

Scanner scanner =new Scanner(System.in);

System.out.println("input numbers from 1 to 13:");
int userinput = scanner.nextInt();

if (userinput>=1 && userinput<=13){

	if (userinput == 1){
	System.out.println("1. Phonebook" );
	
System.out.println("input numbers from 1 to 10:");
int phoneBook = scanner.nextInt();

if (phoneBook>=1 && phoneBook<=10){
	if (phoneBook == 1 ){
	System.out.println("1. Search");
	}
	if (phoneBook == 2 ){
	System.out.println("2.Service Nos.");
	}

	if (phoneBook == 3 ){
	System.out.println("3. Add name");
	}

	if (phoneBook == 4 ){
	System.out.println("4. Erase");
	}
	if (phoneBook == 5 ){
	System.out.println("5. Edit");
	}
	if (phoneBook == 6 ){
	System.out.println("6. Assign tone");
	}
	if (phoneBook == 7 ){
	System.out.println("7. Send b'card");
	}
	if (phoneBook == 8 ){
	System.out.println("8. Options");
		System.out.println("input numbers from 1 to 2:");
		int Options = scanner.nextInt();

		if (Options>=1 && Options<=2)
			if (Options == 1 ){
			System.out.println("1. Type of view");
			}
			if (Options == 2 ){
			System.out.println("2. Memory status");
			}

			
	}
	if (phoneBook == 9 ){
	System.out.println("9. Speed dials");
	}
	if (phoneBook == 10 ){
	System.out.println("10. Voice tags");
	}

}
}


if (userinput>=1 && userinput<=13){


if (userinput == 2){
System.out.println("2. Messages");

	System.out.println("input numbers from 1 to 10:");
	int Message = scanner.nextInt();

	if (Message>=1 && Message<=10){
		if (Message == 1  ){
		System.out.println("1. Write messages");
		}
		if (Message == 2 ){
		System.out.println("2. Inbox ");
		}
		if (Message == 3  ){
		System.out.println("3. Outbox ");
		}
		if (Message == 4  ){
		System.out.println("4. Picture messages ");
		}
		if (Message == 5  ){
		System.out.println("5. Templates ");
		}
		if (Message == 6  ){
		System.out.println("6. Smileys ");
		}
		if (Message == 7 ){
		System.out.println("7. Message settings ");

		System.out.println("input numbers from 1 to 2:");
		int Messagesettings = scanner.nextInt();
			if (Messagesettings >=1 &&  Messagesettings<=2){

				if (Messagesettings == 1 ){
				System.out.println("1. Set1");
					System.out.println("input numbers from 1 to 3:");
					int Set1 = scanner.nextInt();
					if (Set1>=1 && Set1 <=3){
						if (Set1 == 1 ){
						System.out.println("1. Message centre number");
						}
						if (Set1 == 2 ){
						System.out.println("2. Message sent as");
						}
						if (Set1 == 3 ){
						System.out.println("3. Message validity");
						}
					}
				}
				
				if (Messagesettings == 2 ){
				System.out.println("2. Set2");
					System.out.println("input numbers from 1 to 3:");
					int Set2 = scanner.nextInt();
					if (Set2>=1 && Set2 <=3){
						if (Set2 == 1 ){
						System.out.println("1. Delivery reports");
						}
						if (Set2 == 2 ){
						System.out.println("2. Reply via same center ");
						}
						if (Set2 == 3 ){
						System.out.println("3. Character support");
						}
					}
				}

		}
			

	}


	if (Message == 8 ){
	System.out.println("8. Info service");
	}
	if (Message == 9 ){
	System.out.println("9. Voice mailbox number");
	}
	if (Message ==  10 ){
	System.out.println("10. Service command editor ");
	}

}

}



if (userinput>=1 && userinput<=13){

	if (userinput == 3 ){
	System.out.println("3. Chat");
	}

}


if (userinput>=1 && userinput<=13){	
	 if (userinput == 4 ){
	System.out.println("4. Call Register");
		

	System.out.println("input numbers from 1 to 8:");
	int callRegister = scanner.nextInt();

	if (callRegister>=1 && callRegister<=8){
		if (callRegister == 1  ){
		System.out.println("1. Missed calls");
		}
		if (callRegister == 2 ){
		System.out.println("2. Received calls ");
		}
		if (callRegister == 3  ){
		System.out.println("3. Dailled numbers");
		}
		if (callRegister == 4  ){
		System.out.println("4. Erase recent call lists ");
		}
		if (callRegister == 5  ){
		System.out.println("5. Show call duration");
	

		
		System.out.println("input numbers from 1 to 5:");
		int Showcallduration = scanner.nextInt();

		if (Showcallduration>=1 && Showcallduration<=5){
			if (Showcallduration == 1  ){
			System.out.println("1. Last call duration");
			}
			if (Showcallduration == 2 ){
			System.out.println("2. All calls' duration ");
			}
			if (Showcallduration == 3  ){
			System.out.println("3. Received calls' duration");
			}
			if (Showcallduration == 4  ){
			System.out.println("4. Dailled calls' duration ");
			}
			if (Showcallduration == 5  ){
			System.out.println("5. Clear timers");
			}
		}
	}


	if (callRegister == 6  ){
	System.out.println("6. Show call costs");
		System.out.println("input numbers from 1 to 3:");
		int Showcallcost = scanner.nextInt();

		if (Showcallcost>=1 && Showcallcost<=3){
			if (Showcallcost == 1  ){
			System.out.println("1. Last call cost");
			}
			if (Showcallcost == 2 ){
			System.out.println("2. All calls' cost");
			}
			if (Showcallcost== 3  ){
			System.out.println("3. Clear counter3");
			}
		}
	}

	if (callRegister == 7  ){
	System.out.println("7. Call cost settings ");
		System.out.println("input numbers from 1 to 2:");
		int Callcostsettings  = scanner.nextInt();

		if (Callcostsettings>=1 && Callcostsettings<=2){
			if (Callcostsettings == 1  ){
			System.out.println("1. Call cost limit");
			}
			if (Callcostsettings == 2 ){
			System.out.println("2. Show costs in");
			}
		}

	}
	if (callRegister == 8  ){
	System.out.println("8. Prepaid credit");
	}

}
}

}
	
if (userinput>=1 && userinput<=13){

	 if (userinput == 5 ){
	System.out.println("5. Tones");

			
	System.out.println("input numbers from 1 to 9:");
	int tones = scanner.nextInt();
	
	if (tones>=1 && tones<=9){
		if (tones == 1  ){
		System.out.println("1. Ringing tone");
		}
		if (tones == 2 ){
		System.out.println("2. Ringing volume");
		}
		if (tones == 3  ){
		System.out.println("3. Incoming call alert ");
		}
		if (tones== 4  ){
		System.out.println("4. Composer ");
		}
		if (tones == 5  ){
		System.out.println("5. Message alert tones ");
		}
		if (tones == 6  ){
		System.out.println("6. Keypad tones ");
		}
		if (tones == 7  ){
		System.out.println("7. Warning and game tones");
		}
		if (tones == 8 ){
		System.out.println("8. Vibrating alert ");
		}
		if (tones == 9  ){
		System.out.println("9. Screen saver ");
		}
	
	}


}
}

if (userinput>=1 && userinput<=13){
	if (userinput == 6 ){
	System.out.println("6. Settings");

	System.out.println("input numbers from 1 to 4:");
	int  Settings= scanner.nextInt();

	if (Settings>=1 && Settings<=4){
		if (Settings== 1  ){
		System.out.println("1. Call settings");
		
			System.out.println("input numbers from 1 to 6:");
			int  callSettings = scanner.nextInt();

			if (callSettings>=1 && callSettings<=6){
				if (callSettings == 1  ){
				System.out.println("1. Automatic redial ");
				}
				if (callSettings == 2 ){
				System.out.println("2. Speed dailing");
				}
				if (callSettings== 3  ){
				System.out.println("3. Call waiting options ");
				}
				if (callSettings == 4  ){
				System.out.println("4. Own number sending ");
				}
				if (callSettings == 5 ){
				System.out.println("5. Phone line in use ");
				}
				if ( callSettings == 6 ){
				System.out.println("6. Automatic answer ");
				}
			}
		}
		if (Settings == 2 ){
		System.out.println("2. Phone settings");
			System.out.println("input numbers from 1 to 6:");
			int   phoneSettings = scanner.nextInt();

			if (phoneSettings>=1 && phoneSettings<=6){
				if ( phoneSettings== 1  ){
				System.out.println("1. Language");
				}
				if ( phoneSettings == 2 ){
				System.out.println("2. Cell info display ");
				}
				if ( phoneSettings == 3  ){
				System.out.println("3. Welcome ");
				}
				if ( phoneSettings == 4  ){
				System.out.println("4. Network selection ");
				}
				if ( phoneSettings== 5 ){
				System.out.println("5. Lights ");
				}
				if ( phoneSettings == 6 ){
				System.out.println("6. Confirm SIM service actions ");
				}
			}
		}
		if (Settings == 3  ){
		System.out.println("3. Security settings");
			System.out.println("input numbers from 1 to 6:");
			int  securitySettings = scanner.nextInt();

			if (securitySettings>=1 && securitySettings<=6){
				if ( securitySettings == 1  ){
				System.out.println("1. PIN code request ");
				}
				if ( securitySettings == 2 ){
				System.out.println("2. Call barring service ");
				}
				if ( securitySettings== 3  ){
				System.out.println("3. Fixed dailing ");
				}
				if ( securitySettings == 4  ){
				System.out.println("4. Closed user group");
				}
				if ( securitySettings == 5 ){
				System.out.println("5. Phone security ");
				}
				if ( securitySettings == 6 ){
				System.out.println("6. Change access codes");
				}

			}
		}
		if (Settings == 4  ){
		System.out.println("4. Restore factory settings");
		}


}

}
}

if (userinput>=1 && userinput<=13){

	if (userinput == 7){
	System.out.println("7. Call Divert");
	}
}

if (userinput>=1 && userinput<=13){
	 if (userinput == 8 ){
	System.out.println("8. Games");
	}
}

if (userinput>=1 && userinput<=13){

	if (userinput == 9){
	System.out.println("9. Calculator");
	}
}
if (userinput>=1 && userinput<=13){

	if (userinput == 10){
	System.out.println("10. Reminders");
	}
}

if (userinput>=1 && userinput<=13){

	if (userinput == 11 ){
	System.out.println("11. Clock");

	System.out.println("input numbers from 1 to 6:");
	int clock = scanner.nextInt();

		if ( clock >=1 && clock <=6){
			if (clock  == 1  ){
			System.out.println("1. Alarm clock");
			}
			if ( clock  == 2 ){
			System.out.println("2. Clock settings");
			}
			if ( clock == 3  ){
			System.out.println("3. Date setting ");
			}
			if ( clock  == 4  ){
			System.out.println("4. Stopwatch");
			}
			if ( clock  == 5 ){
			System.out.println("5. Countdown timer ");
			}
			if ( clock  == 6 ){
			System.out.println("6. Auto update of date and time");
			}

		}
	

}	
}

if (userinput>=1 && userinput<=13){

	if (userinput == 12 ){
	System.out.println("12. Profiles");
	}
}

if (userinput>=1 && userinput<=13){
	if (userinput == 13 ){
	System.out.println("13. SIM services");
	}
}

}

}
}
}
