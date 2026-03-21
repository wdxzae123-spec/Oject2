public class TechGadgetsApp {
    public static void main(String[] args) {
        Product phone = new Product(101, "Смартфон XL", 50000, "Электроника");
        Product laptop = new Product(202, "Ноутбук Pro", 120000, "Электроника");
        Product headphones = new Product(303, "Наушники AirPods", 8000, "Аксессуары");
        Product phoneDuplicate = new Product(101, "Смартфон XL (дубликат)", 55000, "Электроника");

        System.out.println(" Сравнение товаров ");
        System.out.println(phone);
        System.out.println(laptop);
        System.out.println(headphones);
        System.out.println(phoneDuplicate);
        System.out.println();

        System.out.println("phone.equals(laptop): " + phone.equals(laptop));
        System.out.println("phone.equals(phoneDuplicate): " + phone.equals(phoneDuplicate));
        System.out.println("headphones.equals(laptop): " + headphones.equals(laptop));
        System.out.println();
        Product[] order1Basket = {phone, laptop};
        Product[] order2Basket = {phone, headphones};
        Product[] order3Basket = {phone, laptop};
        Order order1 = new Order("Иван Петров", order1Basket);
        Order order2 = new Order("Мария Смирнова", order2Basket);
        Order order3 = new Order("Иван Петров", order3Basket);
        Order order4 = new Order("Иван Петров", new Product[]{phone, laptop});
        System.out.println("Заказы");
        System.out.println(order1);
        System.out.println(order2);
        System.out.println(order3);
        System.out.println(order4);
        System.out.println();

        System.out.println("order1.equals(order2): " + order1.equals(order2));
        System.out.println("order1.equals(order3): " + order1.equals(order3));
        System.out.println("order1.equals(order4): " + order1.equals(order4));
        System.out.println("order2.equals(order3): " + order2.equals(order3));
    }
}