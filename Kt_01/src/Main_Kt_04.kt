fun main(args: Array<String>) {

    var myClass = MyClass()

    var strNation = myClass.nation()

    println("우리나라는 ${strNation} 입니다.")

    var myNameClass = MyKtClass()
    var strName = myNameClass.name()

    println("나의 이름은 ${strName} 이고 태어난 곳은 ${strNation} 입니다")


}