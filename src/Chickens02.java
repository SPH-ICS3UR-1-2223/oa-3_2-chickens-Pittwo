public class Chickens02 {
    public static void main(String[] args) {
        //Put your code here
    	double dailyAverage=0;
    	double eggCount=0;
    	double monthlyAverage=0;
    	double monthlyProfit=0;
    	//Monday
    	eggCount+=100; //collect 100 eggs
    	//Tuesday
    	eggCount+=121; //collect 121 eggs
    	//Wednesday
    	eggCount+=117; //collect 117 eggs
    	
    	//calculate daily average
    	dailyAverage = eggCount/3;
        System.out.println("Daily Average:   " +dailyAverage);
        
        //calculate the Monthly average
        monthlyAverage 
        System.out.println("Monthly Average: " +monthlyAverage);
        
        //calculate monthly profit
        
        System.out.println("Monthly Profit:  $" +monthlyProfit);
    }
    
}
