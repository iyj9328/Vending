package presenter

import MachineController
import domain.model.Menu
import domain.GetVendingMenuListUseCase

class VendingMachine: MachineController() {

    private val menuMap: Map<Int, Map<Int, Menu>> = GetVendingMenuListUseCase().invoke()

    fun getMenuMap(idx: Int) = menuMap[idx]
    override fun choiceMenu() {

    }

    override fun choicePayment() {

    }

    fun init() {
        choiceMenu()
    }

}