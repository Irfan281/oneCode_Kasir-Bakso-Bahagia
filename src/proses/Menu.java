package proses;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.ArrayList;

public class Menu {
    
    private HashMap<String, Integer> menu;

    public Menu() {
        menu = new HashMap<String, Integer>();
        setMenu();
    }

    public int retHarga(String key) {
        return menu.get(key);
    }

    public void setMenu()
    {
        menu.put("Bakso Biasa", 10000);
        menu.put("Bakso Sedang", 12000);
        menu.put("Bakso Besar", 15000);
        menu.put("Bakso Monster", 21000);
        menu.put("Jus Alpukat", 14000);
        menu.put("Jus Mangga", 9000);
        menu.put("Jus Jeruk", 8000);
        menu.put("Teh Botol", 4000);
    }

    public HashMap<String, Integer> getMenu() {
        return menu;
    }

    public String namaMakanan(int noMenu) {
        int index = noMenu - 1;

        Set<String> menuSet = menu.keySet();

        ArrayList<String> listMenu = new ArrayList<String>(menuSet);

        String key = listMenu.get(index);

        return key;
    }

}
