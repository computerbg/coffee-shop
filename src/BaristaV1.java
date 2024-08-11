import menuItem.MenuItem;

import java.util.List;
public class BaristaV1 implements Barista{
    private List<MenuItem> items;
    private MenuPan menuPan;
    public BaristaV1(MenuPan menuPan){
        this.menuPan = menuPan;
    }
    public void makeMenu(){
        MenuItem menuItem1 = new MenuItem("아메리카노",4000);
        MenuItem menuItem2 = new MenuItem("카푸치노",5000);
        MenuItem menuItem3 = new MenuItem("에스프레소",5000);
        //MenuPan menuPan = new Menu();
        this.menuPan.addItem(menuItem1);
        this.menuPan.addItem(menuItem2);
        this.menuPan.addItem(menuItem3);
    }
    public Coffee makeCoffee(MenuItem menuItem){
        Coffee coffee = new Coffee(menuItem);
        return coffee;
    }

}
