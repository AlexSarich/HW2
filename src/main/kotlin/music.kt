fun main() {
    val amount = 100
    val musicLover: Boolean = true
    println("Покупка на ${amount} руб.")
    val discount1 = 100
    val discount2 = amount * 0.05
    val result = if (amount in 1001..10_000) amount - discount1;
    else if (amount > 10_001) amount - discount2 else amount
    println("Цена со скидкой - ${result}")
    val discountForML = result.toInt() * 0.01
    val resultForML = if (musicLover) result.toInt() - discountForML else result
    println("Цена со скидкой для \"Меломанов\" -  ${resultForML}")
}