fun main() {
    val amount = 1115400
    val minComm = 3500
    val comm = amount * (0.75 / 100)
    if (comm < minComm) {
       println(minComm)
    } else {
        println(comm.toInt())
    }
}