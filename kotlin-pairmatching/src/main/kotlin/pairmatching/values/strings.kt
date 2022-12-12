package pairmatching.values

// divide message
const val DIVIDING_LINE = "#############################################"

// require message
const val REQUIRE_FUNCTION_OPTION_MESSAGE = "기능을 선택하세요."
const val REQUIRE_MATCHING_INFORMATION_MESSAGE = """과정, 레벨, 미션을 선택하세요.
ex) 백엔드, 레벨1, 자동차경주
"""
const val REQUIRE_REMATCHING_MESSAGE = "매칭 정보가 있습니다. 다시 매칭하시겠습니까? "

// notice message
const val NOTICE_MATCHING_RESULT_MESSAGE = "페어 매칭 결과입니다."
const val NOTICE_RESET_MESSAGE = "초기화 되었습니다."

const val FUNCTION_OPTION_FORMAT_MESSAGE = "%s. %s"
const val COURSE_OPTION_FORMAT_MESSAGE = "과정: %s"
const val LEVEL_OPTION_FORMAT_MESSAGE = "- %s: %s"
const val NOTICE_MISSION_OPTION_MESSAGE = "미션: "

// rematch option
const val REMATCH_MESSAGE = "네"
const val NOT_REMATCH_MESSAGE = "아니오"

// input condition message
private const val REMATCH_OPTION_CONDITION_MESSAGE = "'네', '아니오' 둘 중 하나만 선택할 수 있습니다."
private const val FUNCTION_OPTION_CONDITION_MESSAGE = "'1', '2', '3', 'Q'에 해당하는 네가지 기능 중 하나만 선택할 수 있습니다."

// error message
private const val ERROR_MESSAGE = "[ERROR] "

const val REMATCH_OPTION_INPUT_ERROR_MESSAGE = ERROR_MESSAGE + REMATCH_OPTION_CONDITION_MESSAGE
const val FUNCTION_OPTION_INPUT_ERROR_MESSAGE = ERROR_MESSAGE + FUNCTION_OPTION_CONDITION_MESSAGE
