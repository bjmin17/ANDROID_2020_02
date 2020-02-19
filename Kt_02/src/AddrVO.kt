/*
data class
java에서 일반적으로 생성하던 VO(DTO) 클래스의
특별한 형태이다
data class를 선언하면
내부에 toString(), equal(), copy() .. 보통 기본 method가 생성된다.

또한 변수는 컴파일이 될 때, 자동으로 getter, setter 가 형성된다.
 */
data class AddrVO(val num:Int) {
    var name:String = ""
    var addr:String = ""
    var postNo : String = ""
}