import menuItem.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class Menu implements MenuPan{
    private List<MenuItem> items;

    public Menu(){
        this.items = new ArrayList<>() ;
    }


    public void addItem(MenuItem menuItem){
        items.add(menuItem);
    }
    public List<MenuItem> showMenuItem(){
        return items;
    }
}
