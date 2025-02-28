class Airplane {
    var model: String = "Суперджет"  //заполняем поля значениями
    var item_otpr: String = "Екатеринбург"
    var item_naznach: String = "Санкт-Петербург"
    var data_otpr: String = "14.06.2025"
    var time_otpr: String = "00:12"
    var time_travel: String = "2ч 57м"

    //вывод информации о самолете
    fun infoSamolet() {
        println("Модель: $model, Пункт отправления: $item_otpr, Пункт назначения: $item_naznach")
    }

    //функция для изменения пункта назначения
    fun izmeneniePunkta(newPunkt: String)
    {
        item_naznach = newPunkt
        println("пункт назначения был изменен на $item_naznach")
    }
}