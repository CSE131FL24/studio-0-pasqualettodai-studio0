package studio0;

public class BurritoBudget {

		public static void main(String args[]) {
		int burritosEatenWeek1 = 7;
		int burritosEatenWeek2 = 4;
		int burritosEatenWeek3 = 19; //don't judge me
		int burritosEatenWeek4 = 1;
		
		double burritoPrice = 7.50;
		double totalBurritosPrice=(burritosEatenWeek1 + burritosEatenWeek2 + burritosEatenWeek3 + burritosEatenWeek4)*burritoPrice;
		double averageWeeklyPrice = totalBurritosPrice/4;
		
		System.out.println("You have spent an average of $" + averageWeeklyPrice + " per week on burritos.");
	
	}
}
