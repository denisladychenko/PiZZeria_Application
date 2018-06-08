package genosPizza;



import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import setUpWindowsAndMenus.CreateModifierController;
import setUpWindowsAndMenus.CreateModifierForm;
import setUpWindowsAndMenus.CreateModifiersListController;
import setUpWindowsAndMenus.CreateModifiersListForm;
import setUpWindowsAndMenus.EditModFormImageSelectorForm;
import setUpWindowsAndMenus.EditModifierForm;
import setUpWindowsAndMenus.ModifierImageSelectorForm;
import windows_and_menues.MainMenu;


public class GenosPizza {

	private static MainMenu mainMenu;         //instance of the main frame
	
	public static void main(String[] args) {
		
		 SwingUtilities.invokeLater(new Runnable() {

	            @Override
	            public void run() {
	            	//new InfoEntryWindow("Hotel Info Entry Form", "Hotel phone #", "Hotel name", "Hotel address", "Room #");
	        		//new InfoEntryWindow("Cabin Info Entry Form", "Cabin phone #", "Cabin name", "Cabin address", "Vehicle description");
	        		//mainMenu = new MainMenu("/images/gear_icon.png");
	        		//new PhoneNumberDialMenu("Enter the phone number:");
	        		//new DialMenu("Enter the amount to subtract");
	        		//new HotelOrCabinMenu();
	        		//new OrderForm();
	            	//new SetUpMainMenu();
	            	
	            	/*AddRemoveCategoryForm categoryForm = new AddRemoveCategoryForm();
	            	new AddRemoveCategoryController(categoryForm, 
	            			new AddRemoveCategoryModel(categoryForm), new AddRemoveCategoryImageSelectorForm());*/
	            	//new EditItemForm();
	            	//new AddRemoveMenuItemForm();
	            	//new AddNewItemForm();
	            	/*AddRemoveMenuItemForm addRemoveMenuItemForm = new AddRemoveMenuItemForm();
	            	new AddRemoveMenuItemController(addRemoveMenuItemForm, new EditItemForm(),
	            	new ItemImageSelectorForm(), new AddNewItemController(new AddNewItemForm(),addRemoveMenuItemForm));*/
	            	//new AddModifiersListToItemForm();
	            	
	            	
	            	new CreateModifiersListController(new CreateModifiersListForm(),
	            			new CreateModifierController(new CreateModifierForm(),
	    	            			new ModifierImageSelectorForm(),
	    	            			new EditModifierForm(),
	    	            			new EditModFormImageSelectorForm()));
	            	
	            }
	        });
		
	}
	
	/**
	 * this method returns the instance of the main frame
	 * @return mainMenu
	 * */
	public static JFrame getMainFrame(){
		return mainMenu;
	}

}
