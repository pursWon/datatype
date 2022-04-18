fun main() {

    var username: String = "Kildong" // val은 불변형, 자료형을 추론하여 String으로 결정
    var username2: String
    username2 = "Test"
    var count: Int = 3 // number 변수는 Int 형으로 추론할 수 있다
    username = "Dooly" // var은 바뀔 수 있다. 자료형을 지정하지 않으면 변수는 사용 불가능

    println("username: $username, count : $count")
}