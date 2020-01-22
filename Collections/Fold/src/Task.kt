// Return the set of products that were ordered by all customers
fun Shop.getProductsOrderedByAll(): Set<Product> {
    return customers.map { it.getOrderedProducts().toSet() }.reduce {
        acc: Set<Product>, products: Set<Product> ->  acc.intersect(products)
    }
}

fun Customer.getOrderedProducts(): List<Product> =
        orders.flatMap(Order::products)