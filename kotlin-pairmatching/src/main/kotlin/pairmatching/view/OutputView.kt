package pairmatching.view

import pairmatching.values.*
import pairmatching.values.Function

class OutputView {

    fun printRequireFunctionOption() {
        println(REQUIRE_FUNCTION_OPTION_MESSAGE)
        println(FUNCTION_OPTION_FORMAT_MESSAGE.format(Function.FIRST.id, Function.FIRST.fName))
        println(FUNCTION_OPTION_FORMAT_MESSAGE.format(Function.SECOND.id, Function.SECOND.fName))
        println(FUNCTION_OPTION_FORMAT_MESSAGE.format(Function.THIRD.id, Function.THIRD.fName))
        println(FUNCTION_OPTION_FORMAT_MESSAGE.format(Function.QUIT.id, Function.QUIT.fName))
    }

    fun printNoticeCourse() {
        val courseOptions = listOf(Course.BACKEND.cName, Course.FRONTEND.cName, Course.MOBILE.cName)
        val levelOptions = listOf(Level.LEVEL1, Level.LEVEL2, Level.LEVEL3, Level.LEVEL4, Level.LEVEL5)

        println(DIVIDING_LINE)
        println(COURSE_OPTION_FORMAT_MESSAGE.format(courseOptions.joinToString(" | ")))
        println(NOTICE_MISSION_OPTION_MESSAGE)
        repeat(levelOptions.size) { index ->
            println(LEVEL_OPTION_FORMAT_MESSAGE.format(
                levelOptions[index].lName,
                levelOptions[index].missions.joinToString(" | ")
                )
            )
        }
        println(DIVIDING_LINE)
    }

    fun printRequireMatchingInformation() {
        println(REQUIRE_MATCHING_INFORMATION_MESSAGE)
    }

    // todo 구현 필요
    fun printMatchingInformation() {
        println(NOTICE_MATCHING_RESULT_MESSAGE)

    }

    fun printRequireRematching() {
        println(REQUIRE_REMATCHING_MESSAGE)
        println("$REMATCH_MESSAGE | $NOT_REMATCH_MESSAGE")
    }

    fun printResetMessage() {
        println(NOTICE_RESET_MESSAGE)
    }

}