import java.util.Arrays;

public class EcommerceMain {
    public static void main(String[] args) {
        Product[] unsortedProducts = {
            new Product(105, "Headphones", "Electronics"),
            new Product(101, "Shoes", "Fashion"),
            new Product(108, "Keyboard", "Electronics"),
            new Product(103, "Book", "Education")
        };

        int linearIndex = SearchUtil.linearSearch(unsortedProducts, 103);
        System.out.println("Linear Search - Found at index: " + linearIndex);

        Product[] sortedProducts = Arrays.copyOf(unsortedProducts, unsortedProducts.length);
        Arrays.sort(sortedProducts, (a, b) -> Integer.compare(a.productId, b.productId));

        int binaryIndex = SearchUtil.binarySearch(sortedProducts, 103);
        System.out.println("Binary Search - Found at index: " + binaryIndex);
    }
}
