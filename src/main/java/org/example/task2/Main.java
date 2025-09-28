package org.example.task2;

public class Main {
    public static void main(String[] args) {

        Box box = new Box(3,4,5);
        System.out.println("Surface area: " + box.getSurfaceArea());
        System.out.println("Lateral surface area: " + box.getLateralSurfaceArea());
        System.out.println("Volume: " + box.getVolume());

        Cart cart = new Cart(new Item[10]);
        cart.add(new Item(1, "Samsung Galaxy S23", 27999));
        cart.add(new Item(2, "Lenovo IdeaPad 3", 19499));
        cart.add(new Item(3, "LG 55\" 4K Smart TV", 15999));
        cart.add(new Item(4, "Bosch Serie 6 Пральна машина", 14799));
        cart.add(new Item(5, "Samsung RB34 Холодильник", 22399));
        cart.add(new Item(6, "De'Longhi Magnifica S Кавоварка", 10599));
        cart.add(new Item(7, "Gorenje Електрична плита", 9999));
        cart.add(new Item(8, "Dyson V11 Пилосос", 16499));
        cart.add(new Item(9, "Samsung ME83K Мікрохвильова піч", 3199));
        cart.add(new Item(10, "Philips DryCare Фен", 1499));

        System.out.println(cart);

        cart.removeById(9);

        System.out.println(cart);

        Order order = new Order(1L, "John");
        String bill = order.formOrderBill(cart);
        System.out.println(bill);

        int[] test = new int[5];
        System.out.println(test.length);

//        IntStack stack = new IntStack();
//        stack.isEmpty();

//
//        IntStack stack = new IntStack();
//        stack.push(1);
//        stack.push(2);
//        stack.push(3);
//        stack.push(4);
//        stack.push(5);
//        stack.push(6);
//        stack.push(7);
//        stack.push(8);
//        stack.push(9);
//        stack.push(10);
//        stack.push(11);
//        System.out.println(stack.peek());
//        System.out.println("Довжина -> " + stack.size());
//        System.out.println(stack.pop());
//        System.out.println("Довжина -> " + stack.size());
//        System.out.println(stack.peek());
//        System.out.println(stack.pop());
//        System.out.println(stack.peek());
//        stack.push(2);
//        System.out.println(stack.peek());
//        System.out.println("Довжина -> " + stack.size());
//        stack.clear();
//        System.out.println("Довжина -> " + stack.size());
    }
}
