public class Main {
    public static void main(String[] args) {
        String[] products = {"arroz", "feijao", "carne", "macarrao", "batata"};
        int[] quantity = {5, 20, 30, 9, 50}; 
        double[] price = {20.00, 10.99, 30.00, 15.00, 5.99};

        double totalStockValue = 0;
        
        // Novas variáveis para rastrear o produto mais caro
        double mostExpensivePrice = 0;
        String mostExpensiveProduct = "";

        for (int i = 0; i < products.length; i++) {
            double productValue = quantity[i] * price[i];
            totalStockValue += productValue;

            // Alerta de estoque crítico
            if (quantity[i] < 10) {
                System.out.println("-------- ALERTA DE ESTOQUE CRÍTICO --------");
                System.out.println("O produto: " + products[i] + " está com apenas: " + quantity[i] + " unidades.");
                System.out.println("-------------------------------------------");
            }

            // Lógica do produto mais caro: se o preço atual for maior que o recorde anterior...
            if (price[i] > mostExpensivePrice) {
                mostExpensivePrice = price[i];      // ...ele se torna o novo preço mais caro
                mostExpensiveProduct = products[i]; // ...e guardamos o nome dele
            }
        }

        // Resultados finais fora do laço
        System.out.println("\n>>> O valor total investido no estoque é: R$ " + totalStockValue);
        System.out.println(">>> O produto mais caro do estoque é: " + mostExpensiveProduct + " (R$ " + mostExpensivePrice + ")");
    }
}
