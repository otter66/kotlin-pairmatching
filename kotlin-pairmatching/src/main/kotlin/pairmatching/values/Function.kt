package pairmatching.values

enum class Function(
    val id: String,
    val fName: String
) {
    FIRST("1", "페어 매칭"),
    SECOND("2", "페어 조회"),
    THIRD("3", "페어 초기화"),
    QUIT("Q", "종료")
}