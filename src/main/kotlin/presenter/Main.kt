package presenter

import MachineController
import java.util.*

fun main() {
    println("1번은 키오스크, 2번은 자판기")

    val sc = Scanner(System.`in`)
    val whichMachine = sc.nextInt()

    val machineController: MachineController

    when (whichMachine) {
        MachineName.KIOSK_MACHINE -> {
            KioskMachineModule().init()
        }
        MachineName.VENDING_MACHINE -> {
            machineController = VendingMachine()
            machineController.init()
        }
    }
}
object MachineName {
    const val KIOSK_MACHINE = 1
    const val VENDING_MACHINE = 2
}