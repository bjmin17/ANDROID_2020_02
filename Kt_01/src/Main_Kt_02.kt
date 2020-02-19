fun main(args: Array<String>) {

    var sum = 0
    // range 값을 사용하여 for 반복문 만들기
    // 1부터 10까지 더해라
    for(num in 1..10){
        sum += num
    }

    println("합계 : " + sum)

    println("합계는 ${sum} 입니다")

    var arrList = ArrayList<String>()
    arrList.add("대한민국")
    arrList.add("Korea")
    arrList.add("Republic of Korea")

    // for(String str : arrList) 와 같음
    for(str in arrList) {
        println(str)
    }

}