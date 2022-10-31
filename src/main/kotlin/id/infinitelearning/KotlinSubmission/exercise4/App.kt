package id.infinitelearning.KotlinSubmission.exercise4

fun main() {

    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */

    val pembilang = 45
    val penyebut = 0
    var hasilBagi: String?

    try {
        hasilBagi = (pembilang/penyebut).toString()
    } catch (e: Exception){
        hasilBagi = "Penyebut tidak boleh bernilai 0"
    }

    println(hasilBagi)



}