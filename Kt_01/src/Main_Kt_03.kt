import java.time.Clock

fun main() {
    // fun은 function으로 코틀린에서는 method 대신 function이라고 많이 씀
    println("나는 main fun 입니다.")
    cases(1)
    cases("Hello")
    cases(System.currentTimeMillis())
    cases("hello")
    cases(Main_01())
}

// 새로운 함수(method) 선언
// public void cases(Object obj)
fun cases(obj : Any) {

    when(obj) {

        1 -> println("숫자 1")
        "Hello" -> println("문자열 ${obj}")
        is Int -> println("정수형 숫자 ${obj}")
        is Long -> println("Long 형 숫자 ${obj}")
        !is String -> println("${obj}는 문자열이 아님")
        else -> println("기타 ${obj}")

    }

}