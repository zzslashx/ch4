public static void printAmerican(String day, int date, String month, int year){
	
	System.out.println(day+", " + month + " " + date + ", " +year);
	
}
public static void printEuropean(String day, int date, String month, int year){
	
	 System.out.println(day + ", " + date + " " + month + " " + year);
	
}


public static void main(String[] args){
	
	printAmerican("Thursday",12,"August",2012);
	printEuropean("Thursday",12,"August",2012);
	
}
