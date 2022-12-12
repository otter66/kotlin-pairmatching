package pairmatching.view

import pairmatching.values.REMATCH_MESSAGE

class InputView {

    fun  readFunctionOption(): String {
        val input = readln()

        return input
    }

    fun readRematchOption(): Boolean {
        val input = readln()

        return input == REMATCH_MESSAGE
    }

}