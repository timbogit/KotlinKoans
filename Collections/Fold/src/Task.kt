// Return the set of products that were ordered by all customers
fun Shop.getProductsOrderedByAll(): Set<Product> {
    return customers.map(Customer::getOrderedProducts).map(List<Product>::toSet).reduce {
        orderedByAll, products ->  orderedByAll.intersect(products)
    }
}

fun Customer.getOrderedProducts(): List<Product> =
        orders.flatMap(Order::products)