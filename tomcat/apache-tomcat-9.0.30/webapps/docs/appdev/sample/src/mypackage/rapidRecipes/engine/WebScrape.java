package rapidRecipes.engine;

import java.util.ArrayList;
import java.util.Scanner;

import rapidRecipes.domains.BaseRecipe;
import rapidRecipes.domains.BudgetBytes;



public class WebScrape {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		String url = "";
		ArrayList<BaseRecipe> bases = new ArrayList<BaseRecipe>();
		while(!url.equals("-1")) {
			url = scan.next();
			if(!url.equals("-1")) {
				BudgetBytes link = new BudgetBytes(url);
				bases.add(link.getBase());
			}
			else {
				break;
			}
		}
		Stacker stack = new Stacker(bases);
			
		scan.close();
		}
		
		
		

}



