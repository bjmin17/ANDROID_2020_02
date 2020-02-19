fun main() {
    /*
    java 10에서도 같은 방법으로 변수 선언 가능
     */
    var num1 = 0
    var num2 = 0

    var sum = 0

    num1 = 30
    num2 = 40

    sum = num1 + num2

    println("합계 :  ${sum}")

    var name:String = ""
    // null 값으로 변수를 초기화 할 수 없다.
    // 기어이 null값으로 변수를 초기화하고 싶을때는
    //      변수 type을 명시하고 변수 type과 함께 ? 연산자를 포함한다.
    var nation:String? = null

    // type 이 명시가 되지 않았을 때 null로 초기화가 가능
    // 
    var nation1 = null

}