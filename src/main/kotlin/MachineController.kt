abstract class MachineController {
    init {
        println("음료를 선택해주세요.")
    }

    abstract fun choiceMenu()
    abstract fun choicePayment()
}