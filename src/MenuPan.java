import menuItem.MenuItem;

import java.util.List;

public interface MenuPan {// 메뉴를 보여줘야할 책임이 있다.
    public void addItem(MenuItem menuItem);
    List<MenuItem> showMenuItem();
}
