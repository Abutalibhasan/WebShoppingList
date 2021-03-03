import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import controller.ListDetailsHelper;
import controller.ShopperHelper;
import model.ListDetails;
import model.ListItem;
import model.Shopper;

/**
 * Abutalib Hasan - amhasan 202101 CIS171 12928 Feb 28, 2021
 */
public class ShoppingTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Shopper susan = new Shopper("Susan");
		ListDetailsHelper ldh = new ListDetailsHelper();
		ListItem shampoo = new ListItem("Target", "Shampoo");
		ListItem brush = new ListItem("Target", "Brush");
		List<ListItem> susansItems = new ArrayList<ListItem>();
		susansItems.add(shampoo);
		susansItems.add(brush);
		ListDetails susansList = new ListDetails("Susan's ShoppingList", LocalDate.now(), susan);
		susansList.setListOfItems(susansItems);
		ldh.insertNewListDetails(susansList);
		List<ListDetails> allLists = ldh.getLists();
		for (ListDetails a : allLists) {
			System.out.println(a.toString());
		}

	}

}
