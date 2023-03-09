package domain

import data.Beverage
import data.repository.BeverageListRepo
import data.repository.CoffeeListRepo
import data.repository.DessertListRepo
import data.repository.TeaListRepo
import domain.model.Menu

class GetKioskMenuListUseCase {
    operator fun invoke(): Map<Int, Map<Int, Menu>> = mapOf(
        1 to setSomething(BeverageListRepo().beverageMap),
//        2 to CoffeeListRepo().coffeeMap.toCoffeeMenuItem(),
//        3 to DessertListRepo().dessertMap.toDessertMenuItem(),
//        4 to TeaListRepo().teaMap.toTeaMenuItem()
    )

    fun setSomething(list: List<Beverage>): Map<Int, Menu.MenuBeverage>{
        val menuBeverageMap = mutableMapOf<Int, Menu.MenuBeverage>()
        for(b: Beverage in list) {
            menuBeverageMap[b.idx] = Menu.MenuBeverage(b.name, b.price)
        }
        return menuBeverageMap
    }
}