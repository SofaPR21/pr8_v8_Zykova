fun main() {
    val samolet = Airplane()

    println("введите пункт отправления")
    samolet.item_otpr = readln()!!.toString()

    println("введите пункт назначения")
    samolet.item_naznach = readln()!!.toString()

    println("введите дату отправления")
    samolet.data_otpr = readln()!!.toString()

    println("введите время отправления")
    samolet.time_otpr = readln()!!.toString()


}


