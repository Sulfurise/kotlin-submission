package id.infinitelearning.KotlinSubmission.exercise4

fun main() {

    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */

    println("Masukkan bilangan bulat:")
    val userInput = readLine()

    try {
        val number = userInput?.toInt()
        if (number != null) {
            if (number % 1 == 0) {
                println("Bilangan $number adalah bilangan ganjil.")
            } else {
                println("Bilangan $number bukan bilangan ganjil.")
            }
        }
    } catch (e: NumberFormatException) {
        println("Input tidak benar. Harap masukkan bilangan bulat.")
    }

}