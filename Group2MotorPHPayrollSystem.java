// package projectJAMmarlonversion;

import java.util.Scanner;
import java.util.Calendar;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Duration;


public class Group2MotorPHPayrollSystem {
		

	public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			System.out.println("            WELCOME TO MOTORPH PAYROLL SYSTEM");
			System.out.println("=========================================================");
			System.out.println("                                  ");	
							
//variable declaration
	
	double mh1,mh2,mh3,mh4,mh5 ;
	int empnum;
	String EmpName;
	double hourlyrate = 0;
	double weeklysalary; 
	double GrossPay, NetPay;
	LocalTime ST1;
	LocalTime ST2;
	
	
	System.out.printf("Enter Emp Number:");
	empnum = input.nextInt();
						
	//condition to validate emp number
	
	if (empnum == 1) { 
		EmpName = "Marlon Bautista";
		hourlyrate = 500;
		System.out.println("Emp Name: " + EmpName);
		System.out.println("Emp Hourly Rate: " + hourlyrate);
		
	}
	else if (empnum == 2) {
		EmpName = "Aljohn Liboon";
		hourlyrate = 600;
		System.out.println("Emp Name: " + EmpName);
		System.out.println("Emp Hourly Rate: " + hourlyrate);
		
	}
	else if (empnum == 3) {
		EmpName = "Juliana Dalupang";
		hourlyrate = 700;
		System.out.println("Emp Name: " + EmpName);
		System.out.println("Emp Hourly Rate: " + hourlyrate);
	}
	else {
		EmpName = "UNKNOWN EMPLOYEE. Please contact system administrator. Thank you!!!";
		System.out.println(EmpName);
		}
	
	//should have a condition not to proceed in encoding of clock details 
	
	System.out.println("=========================================================");
	System.out.println("                ENTER YOUR CLOCK DETAILS     ");
	System.out.println("                                  ");	
	System.out.println("                  Date Format:MM/DD/YR     ");
	System.out.println("                 Clock Details: HR:MM:00   ");	
	
	System.out.println("                                  ");	
	System.out.println("                                  ");	
	
	
	//clock details entry 1 
			System.out.print("Date: (MM/DD/YY): ");
			String dateString = input.next();
			System.out.print("Time In (HH:mm:ss): ");
			String timeString1 = input.next();
			System.out.print("Time Out (HH:mm:ss): ");
			String timeString2 = input.next();
	    
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
			LocalTime time1 = LocalTime.parse(timeString1, formatter);
			LocalTime time2 = LocalTime.parse(timeString2, formatter);
	        long differenceInSeconds = time2.toSecondOfDay() - time1.toSecondOfDay()-3600;
	        long hours = differenceInSeconds / 3600;
	        long minutes = (differenceInSeconds % 3600) / 60;
	        long seconds = differenceInSeconds % 60;
	        System.out.println("Total Manhour: " + hours + " hours, " + minutes + " minutes, " + seconds + " seconds");
	    
	        System.out.println("                                  ");
	    
	 //clock details entry 2
	       	System.out.print("Date (MM/DD/YY): ");
	       	String dateString2 = input.next();
	        System.out.print("Time In (HH:mm:ss): ");
	        String timeString3 = input.next();
	        System.out.print("Time Out (HH:mm:ss): ");
	        String timeString4 = input.next();
	        
	        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("HH:mm:ss");
	    	LocalTime time3 = LocalTime.parse(timeString3, formatter2);
	        LocalTime time4 = LocalTime.parse(timeString4, formatter2);
	        long differenceInSeconds2 = time4.toSecondOfDay() - time3.toSecondOfDay()-3600;
	        long hours2 = differenceInSeconds2 / 3600;
	        long minutes2 = (differenceInSeconds2 % 3600) / 60;
	        long seconds2= differenceInSeconds2 % 60;
	        System.out.println("Total Manhour: " + hours2 + " hours, " + minutes2 + " minutes, " + seconds2 + " seconds");
	        
	        System.out.println("                                  ");
	  
	  //clock details entry 3
	        System.out.print("Date (MM/DD/YY): ");
	        String dateString3 = input.next();
	        System.out.print("Time In (HH:mm:ss): ");
	        String timeString5 = input.next();
	        System.out.print("Time Out (HH:mm:ss): ");
	        String timeString6 = input.next();
	        
	        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("HH:mm:ss");
	    	LocalTime time5 = LocalTime.parse(timeString5, formatter3);
	        LocalTime time6 = LocalTime.parse(timeString6, formatter3);
	            long differenceInSeconds3 = time6.toSecondOfDay() - time5.toSecondOfDay()-3600;
	        long hours3 = differenceInSeconds3 / 3600;
	        long minutes3 = (differenceInSeconds3 % 3600) / 60;
	        long seconds3= differenceInSeconds3 % 60;
	        System.out.println("Total Manhour: " + hours3 + " hours, " + minutes3 + " minutes, " + seconds3 + " seconds");
	        System.out.println("                                  ");
	        
	//clock details entry 4
	        System.out.print("Date (MM/DD/YY): ");
	        String dateString4 = input.next();
	        System.out.print("Time In (HH:mm:ss): ");
	        String timeString7 = input.next();
	        System.out.print("Time Out (HH:mm:ss): ");
	        String timeString8 = input.next();
	        
	        DateTimeFormatter formatter4 = DateTimeFormatter.ofPattern("HH:mm:ss");
	    	LocalTime time7 = LocalTime.parse(timeString7, formatter4);
	        LocalTime time8 = LocalTime.parse(timeString8, formatter4);
	            long differenceInSeconds4 = time8.toSecondOfDay() - time7.toSecondOfDay()-3600;
	        long hours4 = differenceInSeconds4 / 3600;
	        long minutes4 = (differenceInSeconds4 % 3600) / 60;
	        long seconds4= differenceInSeconds4 % 60;
	        System.out.println("Total Manhour: " + hours4 + " hours, " + minutes4 + " minutes, " + seconds4 + " seconds");
	        
	        System.out.println("                                  ");
	        
	//clock details entry 5
	        System.out.print("Date (MM/DD/YY): ");
	        String dateString5 = input.next();
	        System.out.print("Time In (HH:mm:ss): ");
	        String timeString9 = input.next();
	        System.out.print("Time Out (HH:mm:ss): ");
	        String timeString10 = input.next();
	              
	        DateTimeFormatter formatter5 = DateTimeFormatter.ofPattern("HH:mm:ss");
	        LocalTime time9 = LocalTime.parse(timeString9, formatter5);
	        LocalTime time10 = LocalTime.parse(timeString10, formatter5);
	        long differenceInSeconds5 = time10.toSecondOfDay() - time9.toSecondOfDay()-3600;
	        long hours5 = differenceInSeconds5 / 3600;
	        long minutes5 = (differenceInSeconds5 % 3600) / 60;
	        long seconds5= differenceInSeconds5 % 60;
	        System.out.println("Total Manhour: " + hours5 + " hours, " + minutes5 + " minutes, " + seconds5 + " seconds");

	        System.out.println("                                   ");	
	    	System.out.println("                                  ");
	    	
	    	double weeklyWH = (hours5 + hours4 +hours3 +hours2 + hours );
	    	double weeklyMin =(minutes5 + minutes4 + minutes3 + minutes2 + minutes )/ 60;
	    	double totalWH = (weeklyWH + weeklyMin);
	    		    	
	    	System.out.printf("Total Weekly Worked Hour: " + totalWH); 
	    	
	    	System.out.println("                                  ");	
	    	System.out.println("                                  ");
	
{	
// PAYROLL COMPUTATION
	    	System.out.println("=========================================================");
	    	System.out.println("                EMPLOYEE PAYSLIP                         ");
	    	System.out.println("                                  ");	
	    		    	
	    	System.out.println("Employee Number:" + empnum);
	    	System.out.println("Employee Name:" + EmpName);
	    	System.out.println("Regular Worked Hours:" + totalWH);
	    	double grosspay = totalWH * hourlyrate;
	    	System.out.println("Gross Pay:" + grosspay);
	    	
	    	System.out.println("                                  ");
	    	
	    	System.out.println("Deductions");
	    	//Philhealth
	    	double philhealth = grosspay * .015;
	    	System.out.println("Philhealth Premium:" + philhealth);
	    	
	    	//Pagibig
	    	double pagibig = 0;  
	    	if(grosspay == 0) {
                   pagibig = 0;
               }else if (grosspay > 1000 && grosspay < 1500) {
                   pagibig = (grosspay - 1000)*0.01;
               }else if (grosspay > 1500) {
                   pagibig = (grosspay - 1500)*0.02;
                   System.out.println("HDMF Premium:" + pagibig);
                              }
	    	
	    	//SSS
	    	double sss = 0;
	    	if(grosspay <= 3250) {
				sss = 135;
				
				
			}else if(grosspay > 3250 && grosspay < 3750) {
				sss = 175.50;
				System.out.println("SSS Premium:" + sss);
			}else if(grosspay > 3750 && grosspay < 4250) {
				sss = 180.00;
				System.out.println("SSS Premium:" + sss);
			}else if(grosspay > 4250 && grosspay < 4750) {
				sss = 202.50;
				System.out.println("SSS Premium:" + sss);
			}else if(grosspay > 4750 && grosspay < 5250) {
				sss = 225.00;
				System.out.println("SSS Premium:" + sss);
			}else if(grosspay > 5250 && grosspay < 5750) {
				sss = 247.50;
				System.out.println("SSS Premium:" + sss);
			}else if(grosspay > 5750 && grosspay < 6250) {
				sss = 270.00;
				System.out.println("SSS Premium:" + sss);
			}else if(grosspay > 6250 && grosspay < 6750) {
				sss = 292.50;
				System.out.println("SSS Premium:" + sss);
			}else if(grosspay > 6750 && grosspay < 7250) {
				sss = 315.00;
				System.out.println("SSS Premium:" + sss);
			}else if(grosspay > 7250 && grosspay < 7750) {
				sss = 337.50;
				System.out.println("SSS Premium:" + sss);
			}else if(grosspay > 7750 && grosspay < 8250) {
				sss = 360.00;
				System.out.println("SSS Premium:" + sss);
			}else if(grosspay > 8250 && grosspay < 8750) {
				sss = 382.50;
				System.out.println("SSS Premium:" + sss);
			}else if(grosspay > 8750 && grosspay < 9250) {
				sss = 405.00;
				System.out.println("SSS Premium:" + sss);
			}else if(grosspay > 9250 && grosspay < 9750) {
				sss = 427.50;
				System.out.println("SSS Premium:" + sss);
			}else if(grosspay > 9750 && grosspay < 10250) {
				sss = 450.00;
				System.out.println("SSS Premium:" + sss);
			}else if(grosspay > 10250 && grosspay < 10750) {
				sss = 427.50;
				System.out.println("SSS Premium:" + sss);
			}else if(grosspay > 10750 && grosspay < 11250) {
				sss = 495.00;
				System.out.println("SSS Premium:" + sss);
								
			}else if(grosspay > 11250 && grosspay < 11750) {
				sss = 517.50;
				System.out.println("SSS Premium:" + sss);
			}else if(grosspay > 11750 && grosspay < 12250) {
				sss = 540.00;
				System.out.println("SSS Premium:" + sss);
			}else if(grosspay > 12250 && grosspay < 12750) {
				sss = 562.50;
				System.out.println("SSS Premium:" + sss);
			}else if(grosspay > 12250 && grosspay < 13250) {
				sss = 585.00;
				System.out.println("SSS Premium:" + sss);
			}else if(grosspay > 13250 && grosspay < 13750) {
				sss = 607.50;
				System.out.println("SSS Premium:" + sss);
			}else if(grosspay > 13750 && grosspay < 14250) {
				sss = 630.00;
				System.out.println("SSS Premium:" + sss);
			}else if(grosspay > 14250 && grosspay < 14750) {
				sss = 652.50;
				System.out.println("SSS Premium:" + sss);
			}else if(grosspay > 14750 && grosspay < 15250) {
				sss = 675.00;
				System.out.println("SSS Premium:" + sss);
			}else if(grosspay > 15250 && grosspay < 15750) {
				sss = 697.50;
				System.out.println("SSS Premium:" + sss);
			}else if(grosspay > 15750 && grosspay < 16250) {
				sss = 720.00;
				System.out.println("SSS Premium:" + sss);
			}else if(grosspay > 16250 && grosspay < 16750) {
				sss = 7742.50;
				System.out.println("SSS Premium:" + sss);
			}else if(grosspay > 16750 && grosspay < 17250) {
				sss = 765.00;
				System.out.println("SSS Premium:" + sss);
			}else if(grosspay > 17250 && grosspay < 17750) {
				sss = 787.50;
				System.out.println("SSS Premium:" + sss);
			}else if(grosspay > 17750 && grosspay < 18250) {
				sss = 810.00;
				System.out.println("SSS Premium:" + sss);
			}else if(grosspay > 18250 && grosspay < 18750) {
				sss = 832.50;
				System.out.println("SSS Premium:" + sss);
			}else if(grosspay > 18750 && grosspay < 19250) {
				sss = 855.00;
				System.out.println("SSS Premium:" + sss);
			}else if(grosspay > 19250 && grosspay < 19750) {
				sss = 877.50;
				System.out.println("SSS Premium:" + sss);
			}else if(grosspay > 19750 && grosspay < 20250) {
				sss = 900.00;
				System.out.println("SSS Premium:" + sss);
			}else if(grosspay > 20250 && grosspay < 20750) {
				sss = 922.50;
				System.out.println("SSS Premium:" + sss);
			}else if(grosspay > 20750 && grosspay < 21250) {
				sss = 945.00;
				System.out.println("SSS Premium:" + sss);
			}else if(grosspay > 21250 && grosspay < 21750) {
				sss = 967.50;
				System.out.println("SSS Premium:" + sss);
			}else if(grosspay > 21750 && grosspay < 22250) {
				sss = 990.00;
				System.out.println("SSS Premium:" + sss);
			}else if(grosspay > 22250 && grosspay < 22750) {
				sss = 1012.50;
				System.out.println("SSS Premium:" + sss);
			}else if(grosspay > 22750 && grosspay < 23250) {
				sss = 1035.00;
				System.out.println("SSS Premium:" + sss);
			}else if(grosspay > 23250 && grosspay < 23750) {
				sss = 1057.00;
				System.out.println("SSS Premium:" + sss);
			}else if(grosspay > 23750 && grosspay < 24250) {
				sss = 1080.00;
				System.out.println("SSS Premium:" + sss);
			}else if(grosspay > 24250 && grosspay < 24750) {
				sss = 1102.50;
				System.out.println("SSS Premium:" + sss);
			}else if(grosspay > 24750) {
				sss = 1125;
				System.out.println("SSS Premium:" + sss);
				  
				  
			}
	    	
	    //Witholding Tax
	    	double tax = 0;
	    	double beforetax = grosspay - pagibig - sss - philhealth;
	    		 if(beforetax <= 20832) {
                 tax = beforetax - beforetax;
                 System.out.println("Tax Witheld:" + tax);
             }else if(beforetax > 20833 && beforetax < 33333) {
                 tax = (beforetax - 20833)*0.2;
                 System.out.println("Tax Witheld:" + tax);
             }else if(beforetax > 33333 && beforetax < 66667) {
                 tax = 2500 + (beforetax - 33333)*0.25;
                 System.out.println("Tax Witheld:" + tax);
             }else if(beforetax > 66667 && beforetax < 1666677) {
                 tax = 10833 + (beforetax - 66667)*0.3;
                 System.out.println("Tax Witheld:" + tax);
             }else if(beforetax > 166667 && beforetax < 666667) {
                 tax = 40833.33 + (beforetax - 166667)*0.32;
                 System.out.println("Tax Witheld:" + tax);
             }else if(beforetax > 666667) {
                 tax = 200833.33 + (beforetax - 666667)*0.32; 
                 System.out.println("Tax Witheld:" + tax);
             }
	    	
	  	//netpay
	    	double totaldeduct = philhealth + pagibig + sss + tax;
	    	System.out.println("Total Deduction:" + totaldeduct);
	    	
	    	double netpay = grosspay - totaldeduct;
	    	System.out.println("Net Pay:" + netpay);
	    	
	    }	
      
	    	
	    	
	} 	
	    	
	    	
}
	    		    	
