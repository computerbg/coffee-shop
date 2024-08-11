
//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        /**
         * 만들어라 메뉴룰
         *  주문해라 커피를
         */

        MenuPan menuPan = new Menu();
        Barista barista = new BaristaV1(menuPan);
        barista.makeMenu();
        // 객체 -객체 를 알아야되는데. 방법 3가지. 적절하게 잘해서 구현해봐.
        //MenuItems menuItems = new MenuItems();
        //Barista barista = new BaristaImpl();
        //barista.makeCoffee(new menuItems.MenuItems());
        Customer customer = new CustomerV1();

        // 리팩토링하다보면


        customer.executeOrder(barista,menuPan);

        // 이게 실행 되야해.

        // 진수요구사항. 손님이 주문을 해서 커피를 받았는지 알기 위해서, 손님은 BOOLEAN타입으로 커피수령 여부를 가지고있어야해.속성으로
        boolean hasCoffee = customer.hasCoffee();
        System.out.println(hasCoffee); //이게 true

    }
}