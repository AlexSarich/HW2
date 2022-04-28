fun main() {
    val likes = 106
    when {
        likes % 10 == 1 -> println("${likes} лайк")
        likes % 10 == 2 || likes % 10 == 3 || likes % 10 == 4 -> println("${likes} лайка")
        else -> println("${likes} лайков")
    }
}