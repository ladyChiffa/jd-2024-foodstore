import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Product[] productList = new Product[3];
        productList[0] = new Product("Филе булгура", 4500, 0);
        productList[1] = new Product("Молоко 30%, 1,045л", 500, 0);
        productList[2] = new Product("Безлактозный хумус", 630, 0);

        System.out.println("Добро пожаловать в наш интернет-магазин!");
        System.out.println("Список возможных товаров для покупки");
        for (int i = 0; i < productList.length; i++) {
            System.out.println((i + 1) + " - " + productList[i].name + " " + productList[i].price + " руб/шт");
        }

        System.out.println("");

        while (true) {
            System.out.print("Выберите номер товара и количество (или введите `end`): ");
            String input = scanner.nextLine(); // "11 31"
            if (input.equals("end")) {
                break;
            }

            String[] parts = input.split(" "); // ["11", "31"]
            int prodIndex = Integer.parseInt(parts[0]) - 1;
            int prodQ = Integer.parseInt(parts[1]);

            productList[prodIndex].quantity += prodQ;
        }

        System.out.println("");
        System.out.println("ВАША КОРЗИНА: ");
        int total = 0;
        for (Product p : productList) {
            if (p.quantity == 0) continue;

            System.out.println(p.name + " " + p.price + " руб/шт" + " => Всего " + p.quantity + "шт, " + (p.price * p.quantity) + " руб");
            total += p.price * p.quantity;
        }

        System.out.println("ИТОГО: " + total + " руб");
        System.out.println("");
        System.out.println("Благодарим за визит!");
    }
}
