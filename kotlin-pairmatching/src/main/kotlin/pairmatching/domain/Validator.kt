package pairmatching.domain

import pairmatching.values.*
import pairmatching.values.Function

class Validator {

    fun inspectFunctionOption(functionOption: String): Boolean {
        require(functionOption == Function.FIRST.id ||
                functionOption == Function.SECOND.id ||
                functionOption == Function.THIRD.id ||
                functionOption == Function.QUIT.id
        ) {
            throw IllegalArgumentException(FUNCTION_OPTION_INPUT_ERROR_MESSAGE)
        }

        return true
    }

    fun inspectRematchOption(rematchOption: String): Boolean {
        require(rematchOption == REMATCH_MESSAGE ||
            rematchOption == NOT_REMATCH_MESSAGE
        ) {
            throw IllegalArgumentException(REMATCH_OPTION_INPUT_ERROR_MESSAGE)
        }

        return true
    }

}