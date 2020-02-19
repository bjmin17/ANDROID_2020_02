fun main() {

    sub("홍길동", "010-222-2222")
    sub("이몽룡")


}

/*
sub 함수를 선언하면서
2개의 매개변수를 선언

default 매개변수 선언
    매개변수에 값을 미리 할당하면
    함수를 호출할 때, 그 변수에 값을 주입하지 않아도
    함수를 호출, 사용할 수 있다.

tel 처럼 뒤에 값이 설정되어있는 변수를 default 변수라고 한다.
 */
fun sub(name:String, tel:String = "0") {

    if(tel.equals("0")) {
        println("이름만 주입됨 : ${name}")
    } else {
        println("이름 : ${name}, 전화번호 : ${tel}")
    }

}