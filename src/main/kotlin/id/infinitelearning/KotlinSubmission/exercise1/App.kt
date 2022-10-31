package id.infinitelearning.KotlinSubmission.exercise1

/**
Latihan 1
Lengkapi fungsi myProfile di bawah ini dengan membuat variabel dengan ketentuan dibawah ini:
- Variable bertipe data string yang menyimpan nilai nama depan Anda.
- Variable bertipe data string yang menyimpan nilai nama belakang Anda.
- Variable bertipe data number yang menyimpan nilai umur Anda.
- Variable bertipe data boolean yang menyimpan nilai status Anda (single atau tidak)
Dan cetak setiap variabel ke layar saat variable myProfile di panggil
 */
fun myProfile() {
    val namaDepan = "Daniel Celo"
    val namaBelakang = "Onibala"
    val umur: Byte = 22
    val status = false //kalau true -> single, false -> taken

    println("Profil Saya\n" +
            "Nama Depan: $namaDepan\n" +
            "Nama Belakang: $namaBelakang\n" +
            "Umur: $umur tahun\n" +
            "Status: ${ if(status) "Single" else "Taken" } ")
}


/**
 *  Latihan 2
 *  Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
 */
fun groupDetail(groupId: Int, groupMember: List<Any>, session: String): Any {
    println("------------------------------\n" +
            "Nilai dari Parameter\n" +
            "groupId = $groupId\n" +
            "groupMember = $groupMember\n" +
            "session = $session")

    return arrayOf(groupId, groupMember, session)
}

/**
 * Latihan 3
 * Buat variable yang berisi daftar anggota group kamu,
 * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myName ini
 *
 */
fun myName(): String {

    val anggotaGroup = arrayOf("Farhan Ahmad Pangestu", "Daniel Celo Onibala", "Azriel", "Ella Awwalia", "Fariski Saputra")

    return anggotaGroup[2]
}

/**
 * Latihan 4
 * Ubah nilai kembalian untuk fungsi totalMember ini dengan rumus:
 *
 *      total mentor + jumlah anggota group
 *
 */
fun totalMember(): Int {
    val mentor = arrayOf("Jessica", "Marsani", "Hasan", "Capt")
    val countOfGroup = 5

    val totalMember = mentor.count() + countOfGroup

    return totalMember

}

fun main() {
    println("------------------------------")
    myProfile()

    println("------------------------------")
    val myName = myName()
    println("My Name is: $myName")

    println("------------------------------")
    val totalMember = totalMember()
    println("Total Member group + Mentor: $totalMember")

    /**
     *  Latihan 5
     *  Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data group kamu
     *
     */
    groupDetail(5, listOf("Farhan Ahmad Pangestu", "Daniel Celo Onibala", "Azriel", "Ella Awwalia", "Fariski Saputra"), "Morning")

}