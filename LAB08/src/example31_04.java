class example31_04 { // КЛАСС – СТРУКТУРА ЭЛЕМЕНТА СПИСКА
    public int value; // значение
    public example31_04 next; // поле – ссылка (указатель) на следующий узел
    example31_04(int value, example31_04 next) { // конструктор класса
        this.value = value;
        this.next = next;
    }}
class example { // ГЛАВНЫЙ КЛАСС
    public static void main(String[] args) {
// создание несвязанных узлов с помощью конструктора
        example31_04 node0 = new example31_04(0, null); // 0-й узел – будет головой в списке
        example31_04 node1 = new example31_04(1, null);
        example31_04 node2 = new example31_04(2, null);
        example31_04 node3 = new example31_04(3, null); // последний узел – будет хвостом в списке
// связывание узлов в список с помощью ссылок
        node0.next = node1;
        node1.next = node2;
        node2.next = node3;
// вывод списка с использованием вспомогательной переменной ref,
// соответствующей текущему значению ссылки при прохождении по списку
        example31_04 ref = node0; // для перемещения по списку достаточно помнить голову
        while (ref != null) {
            System.out.print(" " + ref.value);
            ref = ref.next;
        } }}
