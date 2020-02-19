fun main() {

    // val로 시작되는 변수선언 final 변수와 같다.(상수 선언)
    val name = "홍길동"
    // val로 선언된 변수는 상수가 되어 최초 한번만
    // 값을 할당할 수 있고 이후에는 값을 변경할 수 없다.
    // name = "이몽룡"

    // 1부터 10까지 반복하라
    for(num in 1..10) {

    }

    for(num in 0..9) {

    }

    for(num in 0..(10-1)) {
        println("for loop -1 ${num}")
    }

    // 0 부터 10-1까지(최대값-1 까지 반복하고자 할때
    // .. 대신 until 키워드를 추가하면 된다.
    for(num in 0 until 10) {
        println("until ${num}")
    }

    var start = 0
    var end = 10
    var sum = 0
    for(num in start..end) {
        sum += num
    }

    println("${start} 부터 ${end}까지의 덧셈 : ${sum}")

    // 0부터 100까지의 숫자 중 짝수만 덧셈을 하고 싶다.
    end = 100
    sum = 0
    for(num in start..end) {
        if(num % 2 == 0) {
            sum += num
        }
    }
    println("${start} 부터 ${end}까지의 짝수의 덧셈 : ${sum}")

    // i += 2
    sum = 0
    for(num in start..end step 2) {
        sum += num
    }
    println("값 : ${sum}")

    sum = 0
    for(num in end downTo start) {
        println("값 : ${num}")
    }

//    for(int i = end ; i >= start ; i --) {
//        System.out.println("값 : " + i);
//    }

}