package FInal_assessment;

import java.util.Scanner;
import java.text.DecimalFormat;
class forMethods {
    int category, lighting, fans, comAndGad, airCon, genApp, hrs;
    int wm; //stands for Washing Machine
    double kwh, php;
    double dailyCost, weeklyCost, yearlyCost, powerConsumption;
    DecimalFormat df1 = new DecimalFormat("#.##");
    public void printTotal() {
        print("_______________________________________________________________");
        print("_______________________________________________________________");
        //for categories
        if(category==1) print("Category:\t\t" + "Washing Machine");
        else if(category==2) print("Category\t\t"+ "Lighting");
        else if(category==3) print("Category\t\t"+ "Fans");
        else if(category==4) print("Category\t\t"+ "Computer & Gadgets");
        else if(category==5) print("Category\t\t"+ "Air Conditioner");
        else if(category==6) print("Category\t\t"+ "General Appliances");
        // for Appliances (washing machine)
        if (wm==1)print("Appliance:\t\t" + "Fully Automatic-Top Load, Conventional");
        else if(wm==2) print("Appliance:\t\t" + "Automatic-Front Load, Conventional");
        else if(wm==3) print("Appliance:\t\t" + "Fully Automatic-Front Load, Conventional");
        else if(wm==4) print("Appliance:\t\t" + "Washer-Dryer, Inverter");
        else if(wm==5) print("Appliance:\t\t" + "Semi-Automatic, Twin Tub");
        // for Appliances (Lighting)
        if(lighting==1) print("Appliance:\t\t" + "3.3 W LED Bulb, Daylight");
        else if(lighting==2) print("Appliance:\t\t" + "Christmas Light, LED, White");
        else if(lighting==3) print("Appliance:\t\t" + "UVC Lamp Tube");
        else if(lighting==4) print("Appliance:\t\t" + "Rechargeable UVC Light Wand");
        // for Appliances (Fans)

        if(fans==1) print("Appliance:\t\t" + "Air Cooler");
        else if(fans==2) print("Appliance:\t\t" + "Electric Industrial");
        else if(fans==3) print("Appliance:\t\t" + "Exhaust Fan");
        else if(fans==4) print("Appliance:\t\t" + "Air Purifier");
        
        // for Appliances (Computer & Gadgets)
        if(comAndGad==1) print("Appliance:\t\t" + "Ink Tank System Printer");
        else if(comAndGad==2) print("Appliance:\t\t" + "LED Television");
        else if(comAndGad==3) print("Appliance:\t\t" + "Portable Videoke Systems");
        else if(comAndGad==4) print("Appliance:\t\t" + "All-In-One Array System ");
        
        // for Appliances (Air Conditioner)
        if(airCon==1) print("Appliance:\t\t" + "Split-Type, Inverter");
        else if(airCon==2) print("Appliance:\t\t" + "Window-Type, Inverter ");
        else if(airCon==3) print("Appliance:\t\t" + "Split-Type, Solar Hybrid");
        else if(airCon==4) print("Appliance:\t\t" + "CaWindow-Type, Conventional");
        
        
        // for Appliances (General Appliances)
        
        if(genApp==1) print("Appliance:\t" + "Flat Iron");
        else if(genApp==2) print("Appliance:\t" + "Vacuum Cleaner");
        else if(genApp==3) print("Appliance:\t" + "Steam Iron");
        else if(genApp==4) print("Appliance:\t" + "Water Dispenser");

    }
    
    public void Computation(){
        powerConsumption = kwh * hrs;       // 0.10 * 5 = 0.5
        dailyCost = powerConsumption * php; // 0.5 * 1.00 = 0.5
        weeklyCost = dailyCost * 7;         // 0.5 * 7 = 3.5
        yearlyCost = dailyCost * 365;       // 0.5 * 365 = 182.5
        
        print("");
        print("Daily Cost:\t\t\tPHP. " + df1.format(dailyCost));
        print("Weekly Cost:\t\t\tPHP. " + df1.format(weeklyCost));
        print("Yearly Cost:\t\t\tPHP. " + df1.format(yearlyCost));
    }
    public void print(String words) { // to print a String
        System.out.println(words);
    }
}

public class javaProject {
    
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in); // for input
	    forMethods obj = new forMethods(); // to access first class
	    boolean error = true;
	    boolean again = true;
	    int x = 0;
	    
	    do{
	        try{
	    
	    print("[1] Washing Machine\t\t[4] Computer & Gadgets");
	    print("[2] Lighting\t\t\t[5] Air Conditioner");
	    print("[3] Fans\t\t\t[6] General Appliiances");
	    System.out.print("Select Category:     ");
	    
	    do{
	        try{
	            
	            obj.category = in.nextInt();
	            error = false;
	            
	            if(obj.category == 1){
	                print("________________________________________________________");
	                print("[1]Fully Automatic-Top Load, Conventional");
                    print("[2]Automatic-Front Load, Conventional");
                    print("[3]Fully Automatic-Front Load, Conventional");
                    print("[4]Washer-Dryer, Inverter");
                    print("[5]Semi-Automatic, Twin Tub");
	                System.out.print("Select Appliance:     ");
	                
	                boolean Cerror = true;
	                do{
	                    try{
	                        obj.wm = in.nextInt();
	                        
	                        Cerror = false;
	                        
	                        if(obj.wm == 1){
	                            boolean kwhError = false;
	                            print("________________________________________________________");
	                            print("Appliance:\t" + "Fully Automatic-Top Load, Conventional");
	                            print("Average Kilowatt:    0.10 Kwh");
	                            System.out.print("Enter kilowatt per hour:      ");
	                            
	                            do{
	                                try{
	                                    obj.kwh = in.nextDouble();
	                                    kwhError = false;
	                                }catch(Exception e){
	                                    in.next();
	                                }
	                            }while(kwhError);
	                            
	                            boolean hrsError = true;
	                            print("________________________________________________________");
	                            System.out.print("Hour of use per day:      ");
	                            
	                            do{
	                                try{
	                                    obj.hrs = in.nextInt();
	                                    
	                                    hrsError = false;
	                                    if(obj.hrs <= 24){
	                                        print("________________________________________________________");
	                                    } else {
	                                        hrsError = true;
	                                    }
	                                }catch(Exception e) {
	                                    in.next();
	                                }
	                            }while(hrsError);
	                            
	                            boolean phpError = true;
	                            print("Avarage Cost per hour:  PHP 1.00");
	                            System.out.print("hourly cost of Appliance:     ");
	                            do{
	                                try{
	                                    obj.php = in.nextDouble();
	                                    print("________________________________________________________");
	                                    phpError = false;
	                                    
	                                }catch(Exception e) {
	                                    in.next();
	                                }
	                            }while(phpError);
	                            
	                        } else if(obj.wm == 2){
	                            boolean kwhError = true;
	                            print("________________________________________________________");
	                            print("Appliance:\t" + "Automatic-Front Load, Conventional");
	                            print("Average Kilowatt:    0.90 Kwh");
	                            System.out.print("Enter kilowatt per hour:      ");
	                            
	                            do{
	                                try{
	                                    obj.kwh = in.nextDouble();
	                                    kwhError = false;
	                                }catch(Exception e){
	                                    in.next();
	                                }
	                            }while(kwhError);
	                            
	                            boolean hrsError = true;
	                            print("________________________________________________________");
	                            System.out.print("Hour of use per day:      ");
	                            
	                            do{
	                                try{
	                                    obj.hrs = in.nextInt();
	                                    
	                                    hrsError = false;
	                                    if(obj.hrs <= 24){
	                                        print("________________________________________________________");
	                                    } else {
	                                        hrsError = true;
	                                    }
	                                }catch(Exception e) {
	                                    in.next();
	                                }
	                            }while(hrsError);
	                            
	                            boolean phpError = true;
	                            print("Avarage Cost per hour:  PHP 9.00");
	                            System.out.print("hourly cost of Appliance:     ");
	                            do{
	                                try{
	                                    obj.php = in.nextDouble();
	                                    print("________________________________________________________");
	                                    phpError = false;
	                                    
	                                }catch(Exception e) {
	                                    in.next();
	                                }
	                            }while(phpError);
	                            
	                        } else if(obj.wm == 3){
	                            boolean kwhError = true;
	                            print("________________________________________________________");
	                            print("Appliance:\t" + "Fully Automatic-Front Load, Conventional");
	                            print("Average Kilowatt:    1.50 Kwh");
	                            System.out.print("Enter kilowatt per hour:      ");
	                            
	                            do{
	                                try{
	                                    obj.kwh = in.nextDouble();
	                                    kwhError = false;
	                                }catch(Exception e){
	                                    in.next();
	                                }
	                            }while(kwhError);
	                            
	                            boolean hrsError = true;
	                            print("________________________________________________________");
	                            System.out.print("Hour of use per day:      ");
	                            
	                            do{
	                                try{
	                                    obj.hrs = in.nextInt();
	                                    
	                                    hrsError = false;
	                                    if(obj.hrs <= 24){
	                                        print("________________________________________________________");
	                                    } else {
	                                        hrsError = true;
	                                    }
	                                }catch(Exception e) {
	                                    in.next();
	                                }
	                            }while(hrsError);
	                            
	                            boolean phpError = true;
	                            print("Avarage Cost per hour:  PHP 14.33");
	                            System.out.print("hourly cost of Appliance:     ");
	                            do{
	                                try{
	                                    obj.php = in.nextDouble();
	                                    print("________________________________________________________");
	                                    phpError = false;
	                                    
	                                }catch(Exception e) {
	                                    in.next();
	                                }
	                            }while(phpError);
	                            
	                        } else if(obj.wm == 4){
	                            boolean kwhError = true;
	                            print("________________________________________________________");
	                            print("Appliance:\t" + "Washer-Dryer, Inverter");
	                            print("Average Kilowatt:    0.06 Kwh");
	                            System.out.print("Enter kilowatt per hour:      ");
	                            
	                            do{
	                                try{
	                                    obj.kwh = in.nextDouble();
	                                    kwhError = false;
	                                }catch(Exception e){
	                                    in.next();
	                                }
	                            }while(kwhError);
	                            
	                            boolean hrsError = true;
	                            print("________________________________________________________");
	                            System.out.print("Hour of use per day:      ");
	                            
	                            do{
	                                try{
	                                    obj.hrs = in.nextInt();
	                                    
	                                    hrsError = false;
	                                    if(obj.hrs <= 24){
	                                        print("________________________________________________________");
	                                    } else {
	                                        hrsError = true;
	                                    }
	                                }catch(Exception e) {
	                                    in.next();
	                                }
	                            }while(hrsError);
	                            
	                            boolean phpError = true;
	                            print("Avarage Cost per hour:  PHP 0.63");
	                            System.out.print("hourly cost of Appliance:     ");
	                            do{
	                                try{
	                                    obj.php = in.nextDouble();
	                                    print("________________________________________________________");
	                                    phpError = false;
	                                    
	                                }catch(Exception e) {
	                                    in.next();
	                                }
	                            }while(phpError);
	                            
	                        } else if(obj.wm == 5){
	                            boolean kwhError = true;
	                            print("________________________________________________________");
	                            print("Appliance:\t" + "Semi-Automatic, Twin Tub");
	                            print("Average Kilowatt:    4.50 Kwh");
	                            System.out.print("Enter kilowatt per hour:      ");
	                            
	                            do{
	                                try{
	                                    obj.kwh = in.nextDouble();
	                                    kwhError = false;
	                                }catch(Exception e){
	                                    in.next();
	                                }
	                            }while(kwhError);
	                            
	                            boolean hrsError = true;
	                            print("________________________________________________________");
	                            System.out.print("Hour of use per day:      ");
	                            
	                            do{
	                                try{
	                                    obj.hrs = in.nextInt();
	                                    
	                                    hrsError = false;
	                                    if(obj.hrs <= 24){
	                                        print("________________________________________________________");
	                                    } else {
	                                        hrsError = true;
	                                    }
	                                }catch(Exception e) {
	                                    in.next();
	                                }
	                            }while(hrsError);
	                            
	                            boolean phpError = true;
	                            print("Avarage Cost per hour:  PHP 43.36");
	                            System.out.print("hourly cost of Appliance:     ");
	                            do{
	                                try{
	                                    obj.php = in.nextDouble();
	                                    print("________________________________________________________");
	                                    phpError = false;
	                                    
	                                }catch(Exception e) {
	                                    in.next();
	                                }
	                            }while(phpError);
	                            
	                        }    else in.next();
	                        
	                    }catch(Exception e){
	                        in.next();
	                    } 
	                }while(Cerror);
	                
	                
	            } else if(obj.category == 2){
	                print("________________________________________________________");
	                print("[1] 3.3 W LED Bulb, Daylight");
                    print("[2] Christmas Light, LED, White");
                    print("[3] UVC Lamp Tube");
                    print("[4] Rechargeable UVC Light Wand");
	                
	                boolean Cerror = true;
	                do{
	                    try{
	                        obj.lighting = in.nextInt();
	                        
	                        Cerror = false;
	                        
	                        if(obj.lighting == 1){
	                            boolean kwhError = true;
	                            print("________________________________________________________");
	                            print("Appliance:\t" + "3.3 W LED Bulb, Daylight");
	                            print("Average Kilowatt:    0.003 Kwh");
	                            System.out.print("Enter kilowatt per hour:      ");
	                            
	                            do{
	                                try{
	                                    obj.kwh = in.nextDouble();
	                                    kwhError = false;
	                                }catch(Exception e){
	                                    in.next();
	                                }
	                            }while(kwhError);
	                            
	                            boolean hrsError = true;
	                            print("________________________________________________________");
	                            System.out.print("Hour of use per day:      ");
	                            
	                            do{
	                                try{
	                                    obj.hrs = in.nextInt();
	                                    
	                                    hrsError = false;
	                                    if(obj.hrs <= 24){
	                                        print("________________________________________________________");
	                                    } else {
	                                        hrsError = true;
	                                    }
	                                }catch(Exception e) {
	                                    in.next();
	                                }
	                            }while(hrsError);
	                            
	                            boolean phpError = true;
	                            print("Avarage Cost per hour:  PHP 0.03");
	                            System.out.print("hourly cost of Appliance:     ");
	                            do{
	                                try{
	                                    obj.php = in.nextDouble();
	                                    print("________________________________________________________");
	                                    phpError = false;
	                                    
	                                }catch(Exception e) {
	                                    in.next();
	                                }
	                            }while(phpError);
	                            
	                        } else if(obj.lighting == 2){
	                            boolean kwhError = true;
	                            print("________________________________________________________");
	                            print("Appliance:\t" + "Christmas Light, LED, White");
	                            print("Average Kilowatt:    0.006 Kwh");
	                            System.out.print("Enter kilowatt per hour:      ");
	                            
	                            do{
	                                try{
	                                    obj.kwh = in.nextDouble();
	                                    kwhError = false;
	                                }catch(Exception e){
	                                    in.next();
	                                }
	                            }while(kwhError);
	                            
	                            boolean hrsError = true;
	                            print("________________________________________________________");
	                            System.out.print("Hour of use per day:      ");
	                            
	                            do{
	                                try{
	                                    obj.hrs = in.nextInt();
	                                    
	                                    hrsError = false;
	                                    if(obj.hrs <= 24){
	                                        print("________________________________________________________");
	                                    } else {
	                                        hrsError = true;
	                                    }
	                                }catch(Exception e) {
	                                    in.next();
	                                }
	                            }while(hrsError);
	                            
	                            boolean phpError = true;
	                            print("Avarage Cost per hour:  PHP 0.06");
	                            System.out.print("hourly cost of Appliance:     ");
	                            do{
	                                try{
	                                    obj.php = in.nextDouble();
	                                    print("________________________________________________________");
	                                    phpError = false;
	                                    
	                                }catch(Exception e) {
	                                    in.next();
	                                }
	                            }while(phpError);
	                            
	                        } else if(obj.lighting == 3){
	                            boolean kwhError = true;
	                            print("________________________________________________________");
	                            print("Appliance:\t" + "UVC Lamp Tube");
	                            print("Average Kilowatt:    0.03 Kwh");
	                            System.out.print("Enter kilowatt per hour:      ");
	                            
	                            do{
	                                try{
	                                    obj.kwh = in.nextDouble();
	                                    kwhError = false;
	                                }catch(Exception e){
	                                    in.next();
	                                }
	                            }while(kwhError);
	                            
	                            boolean hrsError = true;
	                            print("________________________________________________________");
	                            System.out.print("Hour of use per day:      ");
	                            
	                            do{
	                                try{
	                                    obj.hrs = in.nextInt();
	                                    
	                                    hrsError = false;
	                                    if(obj.hrs <= 24){
	                                        print("________________________________________________________");
	                                    } else {
	                                        hrsError = true;
	                                    }
	                                }catch(Exception e) {
	                                    in.next();
	                                }
	                            }while(hrsError);
	                            
	                            boolean phpError = true;
	                            print("Avarage Cost per hour:  PHP 0.30");
	                            System.out.print("hourly cost of Appliance:     ");
	                            do{
	                                try{
	                                    obj.php = in.nextDouble();
	                                    print("________________________________________________________");
	                                    phpError = false;
	                                    
	                                }catch(Exception e) {
	                                    in.next();
	                                }
	                            }while(phpError);
	                            
	                        } else if(obj.lighting == 4){
	                            boolean kwhError = true;
	                            print("________________________________________________________");
	                            print("Appliance:\t" + "Rechargeable UVC Light Wand");
	                            print("Average Kilowatt:    0.001 Kwh");
	                            System.out.print("Enter kilowatt per hour:      ");
	                            
	                            do{
	                                try{
	                                    obj.kwh = in.nextDouble();
	                                    kwhError = false;
	                                }catch(Exception e){
	                                    in.next();
	                                }
	                            }while(kwhError);
	                            
	                            boolean hrsError = true;
	                            print("________________________________________________________");
	                            System.out.print("Hour of use per day:      ");
	                            
	                            do{
	                                try{
	                                    obj.hrs = in.nextInt();
	                                    
	                                    hrsError = false;
	                                    if(obj.hrs <= 24){
	                                        print("________________________________________________________");
	                                    } else {
	                                        hrsError = true;
	                                    }
	                                }catch(Exception e) {
	                                    in.next();
	                                }
	                            }while(hrsError);
	                            
	                            boolean phpError = true;
	                            print("Avarage Cost per hour:  PHP 0.02");
	                            System.out.print("hourly cost of Appliance:     ");
	                            do{
	                                try{
	                                    obj.php = in.nextDouble();
	                                    print("________________________________________________________");
	                                    phpError = false;
	                                    
	                                }catch(Exception e) {
	                                    in.next();
	                                }
	                            }while(phpError);
	                            
	                        } else Cerror = true;//this will be an else if part
	                        
	                    }catch(Exception e){
	                        in.next();
	                    } 
	                }while(Cerror);
	            
	            } else if(obj.category == 3){
	                print("________________________________________________________");
	                print("[1] Air Cooler");
                    print("[2] Electric I");
                    print("[3] Exhaust Fa");
                    print("[4] Air Purifi");
	                
	                boolean Cerror = true;
	                do{
	                    try{
	                        obj.fans = in.nextInt();
	                        
	                        Cerror = false;
	                        
	                        if(obj.fans == 1){
	                            boolean kwhError = true;
	                            print("________________________________________________________");
	                            print("Appliance:\t" + "Air Cooler");
	                            print("Average Kilowatt:    0.10 Kwh");
	                            System.out.print("Enter kilowatt per hour:      ");
	                            
	                            do{
	                                try{
	                                    obj.kwh = in.nextDouble();
	                                    kwhError = false;
	                                }catch(Exception e){
	                                    in.next();
	                                }
	                            }while(kwhError);
	                            
	                            boolean hrsError = true;
	                            print("________________________________________________________");
	                            System.out.print("Hour of use per day:      ");
	                            
	                            do{
	                                try{
	                                    obj.hrs = in.nextInt();
	                                    
	                                    hrsError = false;
	                                    if(obj.hrs <= 24){
	                                        print("________________________________________________________");
	                                    } else {
	                                        hrsError = true;
	                                    }
	                                }catch(Exception e) {
	                                    in.next();
	                                }
	                            }while(hrsError);
	                            
	                            boolean phpError = true;
	                            print("Avarage Cost per hour:  PHP 0.96");
	                            System.out.print("hourly cost of Appliance:     ");
	                            do{
	                                try{
	                                    obj.php = in.nextDouble();
	                                    print("________________________________________________________");
	                                    phpError = false;
	                                    
	                                }catch(Exception e) {
	                                    in.next();
	                                }
	                            }while(phpError);
	                            
	                        } else if(obj.fans == 2){
	                            boolean kwhError = true;
	                            print("________________________________________________________");
	                            print("Appliance:\t" + "Electric Industrial");
	                            print("Average Kilowatt:    0.11 Kwh");
	                            System.out.print("Enter kilowatt per hour:      ");
	                            
	                            do{
	                                try{
	                                    obj.kwh = in.nextDouble();
	                                    kwhError = false;
	                                }catch(Exception e){
	                                    in.next();
	                                }
	                            }while(kwhError);
	                            
	                            boolean hrsError = true;
	                            print("________________________________________________________");
	                            System.out.print("Hour of use per day:      ");
	                            
	                            do{
	                                try{
	                                    obj.hrs = in.nextInt();
	                                    
	                                    hrsError = false;
	                                    if(obj.hrs <= 24){
	                                        print("________________________________________________________");
	                                    } else {
	                                        hrsError = true;
	                                    }
	                                }catch(Exception e) {
	                                    in.next();
	                                }
	                            }while(hrsError);
	                            
	                            boolean phpError = true;
	                            print("Avarage Cost per hour:  PHP 1,00");
	                            System.out.print("hourly cost of Appliance:     ");
	                            do{
	                                try{
	                                    obj.php = in.nextDouble();
	                                    print("________________________________________________________");
	                                    phpError = false;
	                                    
	                                }catch(Exception e) {
	                                    in.next();
	                                }
	                            }while(phpError);
	                            
	                        } else if(obj.fans == 3){
	                            boolean kwhError = true;
	                            print("________________________________________________________");
	                            print("Appliance:\t" + "Exhaust Fan");
	                            print("Average Kilowatt:    0.03 Kwh");
	                            System.out.print("Enter kilowatt per hour:      ");
	                            
	                            do{
	                                try{
	                                    obj.kwh = in.nextDouble();
	                                    kwhError = false;
	                                }catch(Exception e){
	                                    in.next();
	                                }
	                            }while(kwhError);
	                            
	                            boolean hrsError = true;
	                            print("________________________________________________________");
	                            System.out.print("Hour of use per day:      ");
	                            
	                            do{
	                                try{
	                                    obj.hrs = in.nextInt();
	                                    
	                                    hrsError = false;
	                                    if(obj.hrs <= 24){
	                                        print("________________________________________________________");
	                                    } else {
	                                        hrsError = true;
	                                    }
	                                }catch(Exception e) {
	                                    in.next();
	                                }
	                            }while(hrsError);
	                            
	                            boolean phpError = true;
	                            print("Avarage Cost per hour:  PHP 0.27");
	                            System.out.print("hourly cost of Appliance:     ");
	                            do{
	                                try{
	                                    obj.php = in.nextDouble();
	                                    print("________________________________________________________");
	                                    phpError = false;
	                                    
	                                }catch(Exception e) {
	                                    in.next();
	                                }
	                            }while(phpError);
	                            
	                        } else if(obj.fans == 4){
	                            boolean kwhError = true;
	                            print("________________________________________________________");
	                            print("Appliance:\t" + "Air Purifier");
	                            print("Average Kilowatt:    0.02 Kwh");
	                            System.out.print("Enter kilowatt per hour:      ");
	                            
	                            do{
	                                try{
	                                    obj.kwh = in.nextDouble();
	                                    kwhError = false;
	                                }catch(Exception e){
	                                    in.next();
	                                }
	                            }while(kwhError);
	                            
	                            boolean hrsError = true;
	                            print("________________________________________________________");
	                            System.out.print("Hour of use per day:      ");
	                            
	                            do{
	                                try{
	                                    obj.hrs = in.nextInt();
	                                    
	                                    hrsError = false;
	                                    if(obj.hrs <= 24){
	                                        print("________________________________________________________");
	                                    } else {
	                                        hrsError = true;
	                                    }
	                                }catch(Exception e) {
	                                    in.next();
	                                }
	                            }while(hrsError);
	                            
	                            boolean phpError = true;
	                            print("Avarage Cost per hour:  PHP 0.17");
	                            System.out.print("hourly cost of Appliance:     ");
	                            do{
	                                try{
	                                    obj.php = in.nextDouble();
	                                    print("________________________________________________________");
	                                    phpError = false;
	                                    
	                                }catch(Exception e) {
	                                    in.next();
	                                }
	                            }while(phpError);
	                            
	                        } else Cerror = true;//this will be an else if part
	                        
	                    }catch(Exception e){
	                        in.next();
	                    } 
	                }while(Cerror);
	            
	            } else if(obj.category == 4){
	                print("________________________________________________________");
	                print("[1] Ink Tank System Printer");
                    print("[2] LED Television");
                    print("[3] Portable Videoke Systems");
                    print("[4] All-In-One Array System ");
	                
	                boolean Cerror = true;
	                do{
	                    try{
	                        obj.comAndGad = in.nextInt();
	                        
	                        Cerror = false;
	                        
	                        if(obj.comAndGad == 1){
	                            boolean kwhError = true;
	                            print("________________________________________________________");
	                            print("Appliance:\t" + "Ink Tank System Printer");
	                            print("Average Kilowatt:    0.010 Kwh");
	                            System.out.print("Enter kilowatt per hour:      ");
	                            
	                            do{
	                                try{
	                                    obj.kwh = in.nextDouble();
	                                    kwhError = false;
	                                }catch(Exception e){
	                                    in.next();
	                                }
	                            }while(kwhError);
	                            
	                            boolean hrsError = true;
	                            print("________________________________________________________");
	                            System.out.print("Hour of use per day:      ");
	                            
	                            do{
	                                try{
	                                    obj.hrs = in.nextInt();
	                                    
	                                    hrsError = false;
	                                    if(obj.hrs <= 24){
	                                        print("________________________________________________________");
	                                    } else {
	                                        hrsError = true;
	                                    }
	                                }catch(Exception e) {
	                                    in.next();
	                                }
	                            }while(hrsError);
	                            
	                            boolean phpError = true;
	                            print("Avarage Cost per hour:  PHP 0.10");
	                            System.out.print("hourly cost of Appliance:     ");
	                            do{
	                                try{
	                                    obj.php = in.nextDouble();
	                                    print("________________________________________________________");
	                                    phpError = false;
	                                    
	                                }catch(Exception e) {
	                                    in.next();
	                                }
	                            }while(phpError);
	                            
	                        } else if(obj.comAndGad == 2){
	                            boolean kwhError = true;
	                            print("________________________________________________________");
	                            print("Appliance:\t" + "LED Television");
	                            print("Average Kilowatt:    0.06 Kwh");
	                            System.out.print("Enter kilowatt per hour:      ");
	                            
	                            do{
	                                try{
	                                    obj.kwh = in.nextDouble();
	                                    kwhError = false;
	                                }catch(Exception e){
	                                    in.next();
	                                }
	                            }while(kwhError);
	                            
	                            boolean hrsError = true;
	                            print("________________________________________________________");
	                            System.out.print("Hour of use per day:      ");
	                            
	                            do{
	                                try{
	                                    obj.hrs = in.nextInt();
	                                    
	                                    hrsError = false;
	                                    if(obj.hrs <= 24){
	                                        print("________________________________________________________");
	                                    } else {
	                                        hrsError = true;
	                                    }
	                                }catch(Exception e) {
	                                    in.next();
	                                }
	                            }while(hrsError);
	                            
	                            boolean phpError = true;
	                            print("Avarage Cost per hour:  PHP 0.62");
	                            System.out.print("hourly cost of Appliance:     ");
	                            do{
	                                try{
	                                    obj.php = in.nextDouble();
	                                    print("________________________________________________________");
	                                    phpError = false;
	                                    
	                                }catch(Exception e) {
	                                    in.next();
	                                }
	                            }while(phpError);
	                            
	                        } else if(obj.comAndGad == 3){
	                            boolean kwhError = true;
	                            print("________________________________________________________");
	                            print("Appliance:\t" + "Portable Videoke Systems");
	                            print("Average Kilowatt:    0.08 Kwh");
	                            System.out.print("Enter kilowatt per hour:      ");
	                            
	                            do{
	                                try{
	                                    obj.kwh = in.nextDouble();
	                                    kwhError = false;
	                                }catch(Exception e){
	                                    in.next();
	                                }
	                            }while(kwhError);
	                            
	                            boolean hrsError = true;
	                            print("________________________________________________________");
	                            System.out.print("Hour of use per day:      ");
	                            
	                            do{
	                                try{
	                                    obj.hrs = in.nextInt();
	                                    
	                                    hrsError = false;
	                                    if(obj.hrs <= 24){
	                                        print("________________________________________________________");
	                                    } else {
	                                        hrsError = true;
	                                    }
	                                }catch(Exception e) {
	                                    in.next();
	                                }
	                            }while(hrsError);
	                            
	                            boolean phpError = true;
	                            print("Avarage Cost per hour:  PHP 0.08");
	                            System.out.print("hourly cost of Appliance:     ");
	                            do{
	                                try{
	                                    obj.php = in.nextDouble();
	                                    print("________________________________________________________");
	                                    phpError = false;
	                                    
	                                }catch(Exception e) {
	                                    in.next();
	                                }
	                            }while(phpError);
	                            
	                        } else if(obj.comAndGad == 4){
	                            boolean kwhError = true;
	                            print("________________________________________________________");
	                            print("Appliance:\t" + "All-In-One Array System");
	                            print("Average Kilowatt:    0.03 Kwh");
	                            System.out.print("Enter kilowatt per hour:      ");
	                            
	                            do{
	                                try{
	                                    obj.kwh = in.nextDouble();
	                                    kwhError = false;
	                                }catch(Exception e){
	                                    in.next();
	                                }
	                            }while(kwhError);
	                            
	                            boolean hrsError = true;
	                            print("________________________________________________________");
	                            System.out.print("Hour of use per day:      ");
	                            
	                            do{
	                                try{
	                                    obj.hrs = in.nextInt();
	                                    
	                                    hrsError = false;
	                                    if(obj.hrs <= 24){
	                                        print("________________________________________________________");
	                                    } else {
	                                        hrsError = true;
	                                    }
	                                }catch(Exception e) {
	                                    in.next();
	                                }
	                            }while(hrsError);
	                            
	                            boolean phpError = true;
	                            print("Avarage Cost per hour:  PHP 0.29");
	                            System.out.print("hourly cost of Appliance:     ");
	                            do{
	                                try{
	                                    obj.php = in.nextDouble();
	                                    print("________________________________________________________");
	                                    phpError = false;
	                                    
	                                }catch(Exception e) {
	                                    in.next();
	                                }
	                            }while(phpError);
	                            
	                        } else Cerror = true;//this will be an else if part
	                        
	                    }catch(Exception e){
	                        in.next();
	                    } 
	                }while(Cerror);
	            
	            }
	            
	            else if(obj.category == 5){
	                print("________________________________________________________");
	                print("[1] Split-Type, Inverter");
                    print("[2] Window-Type, Inverter ");
                    print("[3] Split-Type, Solar Hybrid");
                    print("[4] CaWindow-Type, Conventional");
	                boolean Cerror = true;
	                do{
	                    try{
	                        obj.airCon = in.nextInt();
	                        
	                        Cerror = false;
	                        
	                        if(obj.airCon == 1){
	                            boolean kwhError = true;
	                            print("________________________________________________________");
	                            print("Appliance:\t" + "Split-Type, Inverter");
	                            print("Average Kilowatt:    0.32 Kwh");
	                            System.out.print("Enter kilowatt per hour:      ");
	                            
	                            do{
	                                try{
	                                    obj.kwh = in.nextDouble();
	                                    kwhError = false;
	                                }catch(Exception e){
	                                    in.next();
	                                }
	                            }while(kwhError);
	                            
	                            boolean hrsError = true;
	                            print("________________________________________________________");
	                            System.out.print("Hour of use per day:      ");
	                            
	                            do{
	                                try{
	                                    obj.hrs = in.nextInt();
	                                    
	                                    hrsError = false;
	                                    if(obj.hrs <= 24){
	                                        print("________________________________________________________");
	                                    } else {
	                                        hrsError = true;
	                                    }
	                                }catch(Exception e) {
	                                    in.next();
	                                }
	                            }while(hrsError);
	                            
	                            boolean phpError = true;
	                            print("Avarage Cost per hour:  PHP 3.17");
	                            System.out.print("hourly cost of Appliance:     ");
	                            do{
	                                try{
	                                    obj.php = in.nextDouble();
	                                    print("________________________________________________________");
	                                    phpError = false;
	                                    
	                                }catch(Exception e) {
	                                    in.next();
	                                }
	                            }while(phpError);
	                            
	                        } else if(obj.airCon == 2){
	                            boolean kwhError = true;
	                            print("________________________________________________________");
	                            print("Appliance:\t" + "Window-Type, Inverter");
	                            print("Average Kilowatt:    0.24 Kwh");
	                            System.out.print("Enter kilowatt per hour:      ");
	                            
	                            do{
	                                try{
	                                    obj.kwh = in.nextDouble();
	                                    kwhError = false;
	                                }catch(Exception e){
	                                    in.next();
	                                }
	                            }while(kwhError);
	                            
	                            boolean hrsError = true;
	                            print("________________________________________________________");
	                            System.out.print("Hour of use per day:      ");
	                            
	                            do{
	                                try{
	                                    obj.hrs = in.nextInt();
	                                    
	                                    hrsError = false;
	                                    if(obj.hrs <= 24){
	                                        print("________________________________________________________");
	                                    } else {
	                                        hrsError = true;
	                                    }
	                                }catch(Exception e) {
	                                    in.next();
	                                }
	                            }while(hrsError);
	                            
	                            boolean phpError = true;
	                            print("Avarage Cost per hour:  PHP 2.33");
	                            System.out.print("hourly cost of Appliance:     ");
	                            do{
	                                try{
	                                    obj.php = in.nextDouble();
	                                    print("________________________________________________________");
	                                    phpError = false;
	                                    
	                                }catch(Exception e) {
	                                    in.next();
	                                }
	                            }while(phpError);
	                            
	                        } else if(obj.airCon == 3){
	                            boolean kwhError = true;
	                            print("________________________________________________________");
	                            print("Appliance:\t" + "Split-Type, Solar Hybrid");
	                            print("Average Kilowatt:    0.21 Kwh");
	                            System.out.print("Enter kilowatt per hour:      ");
	                            
	                            do{
	                                try{
	                                    obj.kwh = in.nextDouble();
	                                    kwhError = false;
	                                }catch(Exception e){
	                                    in.next();
	                                }
	                            }while(kwhError);
	                            
	                            boolean hrsError = true;
	                            print("________________________________________________________");
	                            System.out.print("Hour of use per day:      ");
	                            
	                            do{
	                                try{
	                                    obj.hrs = in.nextInt();
	                                    
	                                    hrsError = false;
	                                    if(obj.hrs <= 24){
	                                        print("________________________________________________________");
	                                    } else {
	                                        hrsError = true;
	                                    }
	                                }catch(Exception e) {
	                                    in.next();
	                                }
	                            }while(hrsError);
	                            
	                            boolean phpError = true;
	                            print("Avarage Cost per hour:  PHP 2.05");
	                            System.out.print("hourly cost of Appliance:     ");
	                            do{
	                                try{
	                                    obj.php = in.nextDouble();
	                                    print("________________________________________________________");
	                                    phpError = false;
	                                    
	                                }catch(Exception e) {
	                                    in.next();
	                                }
	                            }while(phpError);
	                            
	                        } else if(obj.airCon == 4){
	                            boolean kwhError = true;
	                            print("________________________________________________________");
	                            print("Appliance:\t" + "CaWindow-Type, Conventional");
	                            print("Average Kilowatt:    0.45 Kwh");
	                            System.out.print("Enter kilowatt per hour:      ");
	                            
	                            do{
	                                try{
	                                    obj.kwh = in.nextDouble();
	                                    kwhError = false;
	                                }catch(Exception e){
	                                    in.next();
	                                }
	                            }while(kwhError);
	                            
	                            boolean hrsError = true;
	                            print("________________________________________________________");
	                            System.out.print("Hour of use per day:      ");
	                            
	                            do{
	                                try{
	                                    obj.hrs = in.nextInt();
	                                    
	                                    hrsError = false;
	                                    if(obj.hrs <= 24){
	                                        print("________________________________________________________");
	                                    } else {
	                                        hrsError = true;
	                                    }
	                                }catch(Exception e) {
	                                    in.next();
	                                }
	                            }while(hrsError);
	                            
	                            boolean phpError = true;
	                            print("Avarage Cost per hour:  PHP 4.40");
	                            System.out.print("hourly cost of Appliance:     ");
	                            do{
	                                try{
	                                    obj.php = in.nextDouble();
	                                    print("________________________________________________________");
	                                    phpError = false;
	                                    
	                                }catch(Exception e) {
	                                    in.next();
	                                }
	                            }while(phpError);
	                            
	                        } else Cerror = true;//this will be an else if part
	                        
	                    }catch(Exception e){
	                        in.next();
	                    } 
	                }while(Cerror);
	            
	            } else if(obj.category == 6){
	                print("________________________________________________________");
	                print("[1] Flat Iron");
                    print("[2] Vacuum Cleaner");
                    print("[3] Steam Iron");
                    print("[4] Water Dispenser");

	                boolean Cerror = true;
	                do{
	                    try{
	                        obj.genApp = in.nextInt();
	                        
	                        Cerror = false;
	                        
	                        if(obj.genApp == 1){
	                            boolean kwhError = true;
	                            print("________________________________________________________");
	                            print("Appliance:\t" + "Flat Iron");
	                            print("Average Kilowatt:    0.26 Kwh");
	                            System.out.print("Enter kilowatt per hour:      ");
	                            
	                            do{
	                                try{
	                                    obj.kwh = in.nextDouble();
	                                    kwhError = false;
	                                }catch(Exception e){
	                                    in.next();
	                                }
	                            }while(kwhError);
	                            
	                            boolean hrsError = true;
	                            print("________________________________________________________");
	                            System.out.print("Hour of use per day:      ");
	                            
	                            do{
	                                try{
	                                    obj.hrs = in.nextInt();
	                                    
	                                    hrsError = false;
	                                    if(obj.hrs <= 24){
	                                        print("________________________________________________________");
	                                    } else {
	                                        hrsError = true;
	                                    }
	                                }catch(Exception e) {
	                                    in.next();
	                                }
	                            }while(hrsError);
	                            
	                            boolean phpError = true;
	                            print("Avarage Cost per hour:  PHP 2.61");
	                            System.out.print("hourly cost of Appliance:     ");
	                            do{
	                                try{
	                                    obj.php = in.nextDouble();
	                                    print("________________________________________________________");
	                                    phpError = false;
	                                    
	                                }catch(Exception e) {
	                                    in.next();
	                                }
	                            }while(phpError);
	                            
	                        } else if(obj.genApp == 2){
	                            boolean kwhError = true;
	                            print("________________________________________________________");
	                            print("Appliance:\t" + "Vacuum Cleaner");
    	                            print("Average Kilowatt:    1.15 Kwh");
	                            System.out.print("Enter kilowatt per hour:      ");
	                            
	                            do{
	                                try{
	                                    obj.kwh = in.nextDouble();
	                                    kwhError = false;
	                                }catch(Exception e){
	                                    in.next();
	                                }
	                            }while(kwhError);
	                            
	                            boolean hrsError = true;
	                            print("________________________________________________________");
	                            System.out.print("Hour of use per day:      ");
	                            
	                            do{
	                                try{
	                                    obj.hrs = in.nextInt();
	                                    
	                                    hrsError = false;
	                                    if(obj.hrs <= 24){
	                                        print("________________________________________________________");
	                                    } else {
	                                        hrsError = true;
	                                    }
	                                }catch(Exception e) {
	                                    in.next();
	                                }
	                            }while(hrsError);
	                            
	                            boolean phpError = true;
	                            print("Avarage Cost per hour:  PHP 11.21");
	                            System.out.print("hourly cost of Appliance:     ");
	                            do{
	                                try{
	                                    obj.php = in.nextDouble();
	                                    print("________________________________________________________");
	                                    phpError = false;
	                                    
	                                }catch(Exception e) {
	                                    in.next();
	                                }
	                            }while(phpError);
	                            
	                        } else if(obj.genApp == 3){
	                            boolean kwhError = true;
	                            print("________________________________________________________");
	                            print("Appliance:\t" + "Steam Iron");
	                            print("Average Kilowatt:    0.51 Kwh");
	                            System.out.print("Enter kilowatt per hour:      ");
	                            
	                            do{
	                                try{
	                                    obj.kwh = in.nextDouble();
	                                    kwhError = false;
	                                }catch(Exception e){
	                                    in.next();
	                                }
	                            }while(kwhError);
	                            
	                            boolean hrsError = true;
	                            print("________________________________________________________");
	                            System.out.print("Hour of use per day:      ");
	                            
	                            do{
	                                try{
	                                    obj.hrs = in.nextInt();
	                                    
	                                    hrsError = false;
	                                    if(obj.hrs <= 24){
	                                        print("________________________________________________________");
	                                    } else {
	                                        hrsError = true;
	                                    }
	                                }catch(Exception e) {
	                                    in.next();
	                                }
	                            }while(hrsError);
	                            
	                            boolean phpError = true;
	                            print("Avarage Cost per hour:  PHP 4.97");
	                            System.out.print("hourly cost of Appliance:     ");
	                            do{
	                                try{
	                                    obj.php = in.nextDouble();
	                                    print("________________________________________________________");
	                                    phpError = false;
	                                    
	                                }catch(Exception e) {
	                                    in.next();
	                                }
	                            }while(phpError);
	                            
	                        } else if(obj.genApp == 4){
	                            boolean kwhError = true;
	                            print("________________________________________________________");
	                            print("Appliance:\t" + "Water Dispenser");
	                            print("Average Kilowatt:    0.17 Kwh");
	                            System.out.print("Enter kilowatt per hour:      ");
	                            
	                            do{
	                                try{
	                                    obj.kwh = in.nextDouble();
	                                    kwhError = false;
	                                }catch(Exception e){
	                                    in.next();
	                                }
	                            }while(kwhError);
	                            
	                            boolean hrsError = true;
	                            print("________________________________________________________");
	                            System.out.print("Hour of use per day:      ");
	                            
	                            do{
	                                try{
	                                    obj.hrs = in.nextInt();
	                                    
	                                    hrsError = false;
	                                    if(obj.hrs <= 24){
	                                        print("________________________________________________________");
	                                    } else {
	                                        hrsError = true;
	                                    }
	                                }catch(Exception e) {
	                                    in.next();
	                                }
	                            }while(hrsError);
	                            
	                            boolean phpError = true;
	                            print("Avarage Cost per hour:  PHP 1.62");
	                            System.out.print("hourly cost of Appliance:     ");
	                            do{
	                                try{
	                                    obj.php = in.nextDouble();
	                                    print("________________________________________________________");
	                                    phpError = false;
	                                    
	                                }catch(Exception e) {
	                                    in.next();
	                                }
	                            }while(phpError);
	                            
	                        } else Cerror = true;//this will be an else if part
	                        
	                    }catch(Exception e){
	                        in.next();
	                    } 
	                }while(Cerror);
	            
	            }
	            
	              else {
	                error = true;
	                
	            }
	            
	            
	        }catch(Exception e){
	            
	            in.next();
	        }
	    }while(error);

	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	    obj.printTotal(); // selected applianecs
	    obj.Computation(); // for final total
	    print("________________________________________________________");
	    print("do you want to calculate again?\n[Type anything] Yes [0] No");
	    x = in.nextInt();
	    if(x == 0) System.exit(0);
	    }catch (Exception e){
	        in.next();
	    }
	    }while(true);
	}
	
	
	public static void print(String word){
	    System.out.println(word);
	}
	
	
}

