fun main() {
    val x = X()
    a(x)
    b(x)
    println(x)
    println("Изменения перед fork-ом")
    //Изменения, сделанные после fork
    println("Я что-то поменяю в проекте, пока Максим меняет что-то в своей версии")
    println("Ставь палец вверх, подписывайся на канал!")
}