import domain.GameController
import view.InputView
import view.OutputView

fun main() {
    GameController(InputView(), OutputView()).run()
}