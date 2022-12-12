package pairmatching.view

import pairmatching.domain.Validator
import pairmatching.values.REMATCH_MESSAGE

class InputView(
    private val validator: Validator
) {

    fun readFunctionOption(): String {
        try {
            val input = readln()
            validator.inspectFunctionOption(input)
            return input
        } catch (e: IllegalArgumentException) {
            throw e
        }
    }

    fun readRematchOption(): Boolean {
        val input = readln()
        validator.inspectRematchOption(input)
        return input == REMATCH_MESSAGE
    }

}