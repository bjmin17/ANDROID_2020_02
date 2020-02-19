fun main() {
    var member = MemberVO("홍길동","010","서울시",29)

    println("이름 : ${member.name}")
    println("전화 : ${member.tel}")
    println("주소 : ${member.addr}")
    println("나이 : ${member.age}")

    var addr = AddrVO(1)
    addr.name = "이몽룡"
    addr.postNo = "61161"
    addr.addr = "광주광역시"
}