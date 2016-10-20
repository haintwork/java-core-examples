package com.exam.composite;

public class MenuTestDrive {
    public static void main(String args[]) {
        MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU",
                "Breakfast");
        MenuComponent dinerMenu = new Menu("DINER MENU", "Diner");
        MenuComponent cafeMenu = new Menu("CAFE MENU", "Drinks");
        MenuComponent dessertMenu = new Menu("DESSERT MENU", "Dessert");

        MenuComponent allMenus = new Menu("ALL MENUS", "All Menus Combined");
        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);

        // add menu item
        dinerMenu.add(new MenuItem("Pasta", "Spaghetti with Marinara Sauce",
                true, 3.89));
        dinerMenu.add(dessertMenu);
        dessertMenu.add(new MenuItem("Apple Pie",
                "Apple Pie with a flakey crust", true, 1.59));

        Waitress waitress = new Waitress(allMenus);
//        waitress.printMenu();
        waitress.printVegetarianMenu();
    }
}
