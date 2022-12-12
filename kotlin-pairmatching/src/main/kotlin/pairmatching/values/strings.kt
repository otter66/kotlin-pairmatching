package pairmatching.values

// require message
const val REQUIRE_FUNCTION_OPTION_MESSAGE = """기능을 선택하세요.   
1. 페어 매칭   
2. 페어 조회   
3. 페어 초기화   
Q. 종료   
"""
const val REQUIRE_MATCHING_INFORMATION_MESSAGE = """과정, 레벨, 미션을 선택하세요.
ex) 백엔드, 레벨1, 자동차경주
"""
const val REQUIRE_REMATCHING_MESSAGE = "매칭 정보가 있습니다. 다시 매칭하시겠습니까? "

// notice message
const val NOTICE_COURSE_INFORMATION_MESSAGE = """#############################################   
과정: 백엔드 | 프론트엔드 | 모바일  
미션:   
- 레벨1: 자동차경주 | 로또 | 숫자야구게임   
- 레벨2: 장바구니 | 결제 | 지하철노선도   
- 레벨3:   
- 레벨4: 성능개선 | 배포   
- 레벨5:   
############################################   
"""
const val NOTICE_MATCHING_RESULT_MESSAGE = "페어 매칭 결과입니다."
const val NOTICE_INITIALIZATION_MESSAGE = "초기화 되었습니다."