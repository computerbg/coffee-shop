import menuItem.MenuItem;

import java.util.List;
import java.util.Random;

public class CustomerV1 implements Customer {
    private Coffee coffee;
    private boolean haveCoffee;
    @Override
    public void executeOrder(Barista barista, MenuPan menuPan) {
        /**
         * 메시지를 던져야 한다.
         * 1. 메뉴 항목을 찾아라
         * 2. 커피를 제조하라
         */
        List<MenuItem> items = menuPan.showMenuItem();
        Random random = new Random();

        MenuItem item = items.get(random.nextInt(items.size()));

        coffee = barista.makeCoffee(item);
        if(coffee != null){
            haveCoffee = true;
        }

         

    }

    public boolean hasCoffee(){
        return haveCoffee;
    }
}
