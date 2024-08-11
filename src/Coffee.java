import menuItem.MenuItem;


public class Coffee {
    /*public Coffee createCoffee(String menuName){
        return new Coffee();
    }*/

    private String name;
    private int price;

    public Coffee(MenuItem menuItem){
       this.name = menuItem.getName();
       this.price = menuItem.cost();
    }


    // 나중에 커피를 받았는지 여부를 확인하려고 메소드
    // 를 작성하려고 하는데
    // 그러면 커스터머는 커피를 알고 있는거 아닌가? public coffeeName


}
