public class Time{
	public static void main(String[] args){
		
		int hour = 13 ;
		int minute = 18 ;
		int seconds = 34 ;
		
		System.out.println ("Number of seconds since midnight: "+ (hour * 60 * 60 + minute * 60 + seconds)) ;
		
		System.out.println ("Number of seconds remaining in the day: "+ (24 * 60 * 60 - hour * 60 * 60 - minute * 60 - seconds)) ;
		
		System.out.println ("Percentage of day that has passed: "+ ((hour * 60 * 60 + minute * 60 + seconds) * 100 / (24 * 60 * 60)) + "%") ; 
		
		
		
		
	}
}
