package ru.startandroid.develop.utils

import ru.startandroid.develop.javatutorial.MainActivity
import ru.startandroid.develop.javatutorial.R
import ru.startandroid.develop.javatutorial.model.Question


object Constants {
    const val SCORE = 0
    const val TOTAL_QUESTION: String = "total_question"
    const val CORRECT_ANSWER: String = "correct_answer"

    fun getQuestion(): ArrayList<Question> {
        val questionList = ArrayList<Question>()

        val que1 = Question(1, "Чувствителен ли Java к регистру", R.drawable.ic_java_test, "да", "нет", "не всегда", 1)
        questionList.add(que1)

        val que2 = Question(1, "Могут ли ключевые слова использоваться\nв качестве идентификатора?", R.drawable.ic_java_test, "да", "нет", "в некоторых случаях да", 2)
        questionList.add(que2)

        val que3 = Question(1, "зарезервировано ли cлово <abstract>", R.drawable.ic_java_test, "не всегда", "нет", "да", 3)
        questionList.add(que3)

        val que4 = Question(1, "Назовите ключевое слово для константы", R.drawable.ic_java_test, "final", "public", "abstract", 1)
        questionList.add(que4)

        val que5 = Question(1, "как написать однострочный комментарий?", R.drawable.ic_java_test, "//коммент/", "//коммент", "*коммент", 2)
        questionList.add(que5)

        val que6 = Question(1, "как написать многострочный комментарий?", R.drawable.ic_java_test, "/* коммент*/", "*/коммент**", "//коммент", 1)
        questionList.add(que6)

        val que7 = Question(1, "Имя файла должно быть идентично имени класса?", R.drawable.ic_java_test, "нет", "исходя из ситуации", "да", 3)
        questionList.add(que7)

        val que8 = Question(1, "Будет ли ошибка если\nне закончить строку точкой с запятой? ", R.drawable.ic_java_test, "да", "нет", "в разных ситуациях по разному", 1)
        questionList.add(que8)

        val que9 = Question(1, "Символ заключается в....", R.drawable.ic_java_test, "одинарные ковычки", "в двойные ковычки", "в скобки", 3)
        questionList.add(que9)

        val que10 = Question(1, "Для чего нужно ключевое слово -> new?", R.drawable.ic_java_test, "чтоб объявить переменную", "для создания обьекта", "при создание класса", 2)
        questionList.add(que10)

        return questionList
    }


    fun getQuestionTwo(): ArrayList<Question> {
        val questionList = ArrayList<Question>()

        val que1 = Question(1, "Что такое класс?", R.drawable.ic_java_test, "Это шаблон для создания объекта", "это кирпич", "это комната", 1)
        questionList.add(que1)

        val que2 = Question(1, "Какие переменные может содержать класс?", R.drawable.ic_java_test, "большие и маленькие", "локальные, переменные класса,\nпеременные экземпляра", "динамические",  2)
        questionList.add(que2)

        val que3 = Question(1, "Что такое конструктор?", R.drawable.ic_java_test, "это переменная", "это класс", "это метод для создания объекта", 3)
        questionList.add(que3)

        val que4 = Question(1, "Если забыть создать конструктор,\nбудет ли создан коструктор по умолчанию?", R.drawable.ic_java_test, "да", "нет", "в разных ситуациях по разному", 1)
        questionList.add(que4)

        val que5 = Question(1, "Имя конструктора должно быть таким же\nкак имя класса?", R.drawable.ic_java_test, "нет", "да", "смотря какой конструктор", 2)
        questionList.add(que5)

        val que6 = Question(1, "Как получить доступ к переменным\nэкземпляра и методам в java", R.drawable.ic_java_test, "через созданные объекты", "напрямую", "как хочешь", 1)
        questionList.add(que6)

        val que7 = Question(1, "Сколько публичных классов может быть\nв исходном файле?", R.drawable.ic_java_test, "5", "1", "3", 2)
        questionList.add(que7)

        val que8 = Question(1, "Для чего нужны операторы импорта?", R.drawable.ic_java_test, "для создания класса", "чтоб инициализировать переменную", "чтоб найти конкретный класс", 3)
        questionList.add(que8)

        val que9 = Question(1, "Должно ли имя класса начинаться с большой буквы? ", R.drawable.ic_java_test, "да", "нет", "как хочешь", 1)
        questionList.add(que9)

        val que10 = Question(1, "Может ли класс содержать вложенный класс?", R.drawable.ic_java_test, "нет", "да", "в разных ситуациях по разному", 2)
        questionList.add(que10)

        return questionList
    }

    fun getQuestionThree(): ArrayList<Question> {
        val questionList = ArrayList<Question>()

        val que1 = Question(1, "Что такое переменная?", R.drawable.ic_java_test, "это ящик для хранения данных", "это имя", "это конструктор", 1)
        questionList.add(que1)

        val que2 = Question(1, "Имеет ли переменная конкретный тип?", R.drawable.ic_java_test, "нет", "да", "в разных ситуациях по разному", 2)
        questionList.add(que2)

        val que3 = Question(1, "как правильно объявить переменную?", R.drawable.ic_java_test, "a int", "int = a", "int a", 3)
        questionList.add(que3)

        val que4 = Question(1, "как правильно инициализировать переменную?  ", R.drawable.ic_java_test, "int a = 10", "a = 10", "a int = 10", 1)
        questionList.add(que4)

        val que5 = Question(1, "Где объявляются локальные переменные?", R.drawable.ic_java_test, "везде", "в классе", "методах, конструкторах", 3)
        questionList.add(que5)

        val que6 = Question(1, "Можно ли использовать модификаторы доступа\nдля локальных переменных?", R.drawable.ic_java_test, "нет", "да", "в разных ситуациях по разному", 1)
        questionList.add(que6)

        val que7 = Question(1, "Предусмотрено ли значение по умолчанию для\nлокальных переменных?",R.drawable.ic_java_test, "да", "в разных ситуациях по разному", "нет", 3)
        questionList.add(que7)

        val que8 = Question(1, "Имеют ли переменные экземпляра значения по умолчанию?", R.drawable.ic_java_test, "да", "нет", "если в методе, то да", 1)
        questionList.add(que8)

        val que9 = Question(1, "ключевое слово для переменной класса", R.drawable.ic_java_test, "public", "static", "global", 2)
        questionList.add(que9)

        val que10 = Question(1, "Какое значение будет у static int a\nпо умолчанию?", R.drawable.ic_java_test, "0", "null", "1", 1)
        questionList.add(que10)

        return questionList
    }


    fun getQuestionFour(): ArrayList<Question> {
        val questionList = ArrayList<Question>()

        val que1 = Question(1, "Какие есть модификаторы доступа?", R.drawable.ic_java_test, "int", "default,private,public,protected", "abstract, interface", 2)
        questionList.add(que1)

        val que2 = Question(1, "Если переменная без модификатора доступа,\nможно ли получить доступ с другого класса?", R.drawable.ic_java_test, "да", "нет", "в разных ситуациях по разному", 1)
        questionList.add(que2)

        val que3 = Question(1, "Если переменной присвоен модификатор private,\nвидна ли переменная другим классам?", R.drawable.ic_java_test, "да", "нет", "в разных ситуациях по разному ", 2)
        questionList.add(que3)

        val que4 = Question(1, "Может ли Класс или Интерфейс быть private?", R.drawable.ic_java_test, "только интерфейс", "да", "нет", 3)
        questionList.add(que4)

        val que5 = Question(1, "Для чего нужен модификатор доступа private?", R.drawable.ic_java_test, "для сокрытия данных", "чтоб получить доступ к переменной", "чтоб создать переменную", 1)
        questionList.add(que5)

        val que6 = Question(1, "Если переменная или метод объявлены как public,\n можно ли получить доступ с других классов?", R.drawable.ic_java_test, "да", "нет", "только методы", 1)
        questionList.add(que6)

        val que7 = Question(1, "Можно ли присвоить модификатор доступа\nprotected Классу и Интерфейсу?",R.drawable.ic_java_test, "да", "нет", "только интерфейсу", 2)
        questionList.add(que7)

        val que8 = Question(1, "Для чего используется модификатор доступа final?", R.drawable.ic_java_test, "для завершения реализации классов", "для создания конструктора", "для инициализации переменной", 1)
        questionList.add(que8)

        val que9 = Question(1, "Может ли Класс abstract создать экземпляр?", R.drawable.ic_java_test, "да", "нет", "в разных ситуациях по разному", 2)
        questionList.add(que9)

        val que10 = Question(1, "Может ли класс быть одновременно\nfinal и abstract?", R.drawable.ic_java_test, "да", "возможно", "нет", 3)
        questionList.add(que10)

        return questionList
    }

    fun getQuestionFive(): ArrayList<Question> {
        val questionList = ArrayList<Question>()

        val que1 = Question(1, "Для чего нужен цикл?", R.drawable.ic_java_test, "для создания класса", "для повторения действия\nвнужном количестве", "для объявления переменной", 2)
        questionList.add(que1)

        val que2 = Question(1, "Какие бывают циклы типы циклов?", R.drawable.ic_java_test, "while, for", "int, double", "while do", 1)
        questionList.add(que2)

        val que3 = Question(1, "Когда используется цикл for?", R.drawable.ic_java_test, "в разных ситуациях по разному", "всегда", "когда известно сколько раз\n" + "должно выполнитья действие", 3)
        questionList.add(que3)

        val que4 = Question(1, "Синтаксис цикла for", R.drawable.ic_java_test, "for(иниц; лог выраж; обнов){}", "for(иниц; лог выраж){}", "for(обнов;лог выраж){}", 1)
        questionList.add(que4)

        val que5 = Question(1, "Синтаксис цикла while", R.drawable.ic_java_test, "while(иниц){}", "while(лог выраж; инициализ){}", "while(лог выражение){}", 3)
        questionList.add(que5)

        val que6 = Question(1, "Синтаксис улучшенного цикла for", R.drawable.ic_java_test, "for(иниц; лог выраж; обнов){}", "for(объяв : выражение){}", "for(условие)\n{}", 2)
        questionList.add(que6)

        val que7 = Question(1, "Прервется ли цикл если перейдет к строке break?",R.drawable.ic_java_test, "да", "нет", "зависит от условия цикла", 1)
        questionList.add(que7)

        val que8 = Question(1, "Используется ли оператор <<break>> в switch", R.drawable.ic_java_test, "нет", "да", "зависит от кол-во кейсов в switch", 2)
        questionList.add(que8)

        val que9 = Question(1, "Cинтаксис оператора break", R.drawable.ic_java_test, "int break;", "double break;", "break;", 3)
        questionList.add(que9)

        val que10 = Question(1, "Для чего нужен оператор continue?", R.drawable.ic_java_test, "для перехода к следующей\nитерации", "для остановки цикла", "для прикола", 1)
        questionList.add(que10)

        return questionList
    }


    fun getQuestionSix(): ArrayList<Question> {
        val questionList = ArrayList<Question>()

        val que1 = Question(1, "Как определить длинну массива", R.drawable.ic_java_test, "myarray.size", "myarray.length()", "myarray.length", 3)
        questionList.add(que1)

        val que2 = Question(1, "Как объявить массив из int?", R.drawable.ic_java_test, "int nums[]", "[]int  nums", "nums[] int", 1)
        questionList.add(que2)

        val que3 = Question(1, "Что такое массив?", R.drawable.ic_java_test, "Структура данных\nв которой хранятся\nэлементы одного типа", "ящик", "переменная", 1)
        questionList.add(que3)

        val que4 = Question(1, "Можно ли изменить\nдлинну массива после создания", R.drawable.ic_java_test, "да", "нет", "не всегда", 2)
        questionList.add(que4)

        val que5 = Question(1, "Элменты массива нумеруются с ?", R.drawable.ic_java_test, "1", "2", "0", 3)
        questionList.add(que5)

        val que6 = Question(1, "Как объявить многомерный массив?", R.drawable.ic_java_test, "int[][] myarray = new int[8][8]", "array[] = new int[][]", "int[] = new array[][]", 1)
        questionList.add(que6)

        val que7 = Question(1, "Как объявить массив их строк?",R.drawable.ic_java_test, "[]String myarray = new String[5]", "String[] myarray = new String[5]", "myarray[]String = new String[5]", 2)
        questionList.add(que7)

        val que8 = Question(1, "Как получить доступ к ячейке массива?", R.drawable.ic_java_test, "через переменную", "через ссылку", "через индекс", 3)
        questionList.add(que8)

        val que9 = Question(1, "Дан массив\nString[] list = new String[5]\nКакой индекс у первого и последнего элемента", R.drawable.ic_java_test, "1-5", "0-4", "1-4", 2)
        questionList.add(que9)

        val que10 = Question(1, "Максимальное количество элементов у массива?", R.drawable.ic_java_test, "2 147 483 647", "2 000 000", "34 000", 1)
        questionList.add(que10)

        return questionList
    }

    fun getQuestionSeven(): ArrayList<Question> {
        val questionList = ArrayList<Question>()

        val que1 = Question(1, "Что такое метод в java", R.drawable.ic_java_test, "это законченная последовательность действий", "это набор данных одного типа", "это фунция для создания объекта", 1)
        questionList.add(que1)

        val que2 = Question(1, "Cинтаксис создания метода", R.drawable.ic_java_test, "public static int methodName(int a){}", "methodName static(int a){}", "(int a) methodName{}", 1)
        questionList.add(que2)

        val que3 = Question(1, "Всегда ли метод должен возвращать данные?", R.drawable.ic_java_test, "да", "нет", "зависит от типа метода", 3)
        questionList.add(que3)

        val que4 = Question(1, "Ключевое слово void", R.drawable.ic_java_test, "для публичного доступа", "для создания метода, не производящий возврат", "для инициализации метода", 2)
        questionList.add(que4)

        val que5 = Question(1, "Что такое перегрузка методов?", R.drawable.ic_java_test, "запуск метода", "остановка метода", "это наличие более 1 метода с одинаковым названием, но различ параметрами", 3)
        questionList.add(que5)

        val que6 = Question(1, "Для чего нужен конструктор?", R.drawable.ic_java_test, "для создания объектов", "для создания методов", "для создания переменной", 1)
        questionList.add(que6)

        val que7 = Question(1, "Ключевое слово this",R.drawable.ic_java_test, "использ при создании объекта", "использ для ссылки на текущий класс", "нужен для создания класса", 2)
        questionList.add(que7)

        val que8 = Question(1, "Можно ли вызывать один и тот же метод в разных частях кода?", R.drawable.ic_java_test, "нет", "зависит от условий", "да", 3)
        questionList.add(que8)

        val que9 = Question(1, "Может ли метод принимать разное кол-во параметров?", R.drawable.ic_java_test, "да", "нет", "зависит от типа метода", 1)
        questionList.add(que9)

        val que10 = Question(1, "Синтаксис метода не возвращающего значение", R.drawable.ic_java_test, "public int method(int b){}", "public void method(int b)", "method void(int b)", 2)
        questionList.add(que10)

        return questionList
    }

    fun getQuestionEight(): ArrayList<Question> {
        val questionList = ArrayList<Question>()
        val que1 = Question(1, "Ключевое слово для наследования?", R.drawable.ic_java_test, "extends", "private", "static", 1)
        questionList.add(que1)

        val que2 = Question(1, "Синтаксис наследования", R.drawable.ic_java_test, "class Sub extend Super{}", "extend Super{}", "class Sub extends Super{}", 3)
        questionList.add(que2)

        val que3 = Question(1, "Наследует ли подкласс поля и методы?", R.drawable.ic_java_test, "наследует", "не наследует", "зависит от условий", 1)
        questionList.add(que3)

        val que4 = Question(1, "Для чего нужно ключевое слово super? ", R.drawable.ic_java_test, "для наследования", "для дифференциации членов суперкласса", "для вызова метода", 2)
        questionList.add(que4)

        val que5 = Question(1, "Можно ли переопределять методы унаследованного класса?", R.drawable.ic_java_test, "нет", "да", "зависит от условий", 2)
        questionList.add(que5)

        val que6 = Question(1, "Зачем использовать ключевое слово final при создании анонимных классов?", R.drawable.ic_java_test, "при использовании объектов", "для создания переменных","для создания конструктора", 1)
        questionList.add(que6)

        val que7 = Question(1, "Какая нужна аннотация перед переопределением метода?",R.drawable.ic_java_test, "@Override", "@Entity", "@Super", 1)
        questionList.add(que7)

        val que8 = Question(1, "Какое ключевое слово нужно использовать для запрета наследования?", R.drawable.ic_java_test, "protected", "static", "final", 3)
        questionList.add(que8)

        val que9 = Question(1, "Для чего нужно наследование?", R.drawable.ic_java_test, "Для получения данных", "Для того чтоб создавать классы на основе другого класса", "для получения функции с другого класса", 2)
        questionList.add(que9)

        val que10 = Question(1, "Поддерживает ли Java множественное наследование?", R.drawable.ic_java_test, "нет", "да", "зависит от условий", 1)
        questionList.add(que10)


        return questionList
    }

    fun getQuestionNine(): ArrayList<Question> {
        val questionList = ArrayList<Question>()

        val que1 = Question(1, "Что такое полиморфизм?", R.drawable.ic_java_test, "способность принимать много форм", "способность принимать две формы", "это тип метода", 1)
        questionList.add(que1)

        val que2 = Question(1, "Cчитается ли объект полиморфным, если прошел более одного теста IS-A? ", R.drawable.ic_java_test, "нет", "да", "зависит от типа теста", 2)
        questionList.add(que2)

        val que3 = Question(1, "Становится ли код гибким благодаря полиморфизму?", R.drawable.ic_java_test, "нет", "не всегда", "да", 3)
        questionList.add(que3)

        val que4 = Question(1, "Относится ли полиморфизм к ОПП", R.drawable.ic_java_test, "нет", "да", "это отдельное понятие", 2)
        questionList.add(que4)

        val que5 = Question(1, "Если будет два метода с одинаковыми наз-ми, но разными параметрами, будет ли ошибка?", R.drawable.ic_java_test, "нет", "да", "зависит от типа метода", 1)
        questionList.add(que5)

        val que6 = Question(1, "Если одно название, но разные параметры у метода, это?", R.drawable.ic_java_test, "изменение", "сокрытие","перегрузка методов", 3)
        questionList.add(que6)

        val que7 = Question(1, "Можно ли изменять поведение методов родит класса",R.drawable.ic_java_test, "нет", "да", "зависит от типа метода", 2)
        questionList.add(que7)

        val que8 = Question(1, "Можно ли изменить количество аргументов?", R.drawable.ic_java_test, "да", "зависит от типа метода", "нет, это перегрузка метода", 3)
        questionList.add(que8)

        val que9 = Question(1, "Для чего нужно наследование?", R.drawable.ic_java_test, "Для получения данных", "Для того чтоб создавать классы на основе другого класса", "для получения функции с другого класса", 2)
        questionList.add(que9)

        val que10 = Question(1, "Поддерживает ли Java множественное наследование?", R.drawable.ic_java_test, "нет", "да", "зависит от условий", 1)
        questionList.add(que10)

        return questionList
    }

    fun getQuestionTen(): ArrayList<Question> {
        val questionList = ArrayList<Question>()

        val que1 = Question(1, "Ключевое слово для объявления абстрактного класса?", R.drawable.ic_java_test, "abstract", "abstracts", "super", 1)
        questionList.add(que1)

        val que2 = Question(1, "Могут ли абстрактные классы содержать абстр методы?", R.drawable.ic_java_test, "могут", "не могут", "могут содержать, могут не содержать", 3)
        questionList.add(que2)

        val que3 = Question(1, "Если в классе есть один абстрк метод, должен ли класс быть абстрактным?", R.drawable.ic_java_test, "обязательно должен", "нет, не должен", "зависит от типа метода", 1)
        questionList.add(que3)

        val que4 = Question(1, "Если класс объявлен абстрактным, можно его реализовать?", R.drawable.ic_java_test, "да", "зависит от типа реализации", "нет, нельзя", 3)
        questionList.add(que4)

        val que5 = Question(1, "Как использовать абстрактный класс?", R.drawable.ic_java_test, "переопределить", "наследоваться", "сделать перегрузку", 2)
        questionList.add(que5)

        val que6 = Question(1, "При наследовании абстрак класса, нужно ли реализовывать все его методы?", R.drawable.ic_java_test, "да", "нет","нужно только два метода", 3)
        questionList.add(que6)

        val que7 = Question(1, "где используется ключево слово abstract?",R.drawable.ic_java_test, "для класса или метода", "для типа метода", "для модификатора доступа", 1)
        questionList.add(que7)

        val que8 = Question(1, "При объявлении абстрактного метода, где должно стоять слово abstract?", R.drawable.ic_java_test, "в самом начале", "перед именем метода", "в конце объявлении метода", 2)
        questionList.add(que8)

        val que9 = Question(1, "Содержит ли абстрактный метод тело ?", R.drawable.ic_java_test, "только сигнатуру", "да, содержит", "нет", 1)
        questionList.add(que9)

        val que10 = Question(1, "Что вместо фигурных скобок стоит у абстр метода?", R.drawable.ic_java_test, ";", "!", "=!", 1)
        questionList.add(que10)

        return questionList
    }

    fun getQuestionEleven(): ArrayList<Question> {
        val questionList = ArrayList<Question>()
        val que1 = Question(1, "Интерфейс это?", R.drawable.ic_java_test, "ссылочный тип", "класс", "объект", 1)
        questionList.add(que1)

        val que2 = Question(1, "Может ли интерфейс содержать константы?", R.drawable.ic_java_test, "нет", "только одну", "да", 3)
        questionList.add(que2)

        val que3 = Question(1, "Может ли интерфейс содержать статические методы?", R.drawable.ic_java_test, "да", "нет", "только один", 1)
        questionList.add(que3)

        val que4 = Question(1, "Что содержит интерфейс?", R.drawable.ic_java_test, "классы", "поля", "поведения ", 3)
        questionList.add(que4)

        val que5 = Question(1, "Может ли интерфейс содержать любое кол-во методов?", R.drawable.ic_java_test, "да", "нет", "только 5", 1)
        questionList.add(que5)

        val que6 = Question(1, "Чем отличается интерфейс от класса?", R.drawable.ic_java_test, "в интерфейсе не содержатся конструкторы", "ничем","только названием", 1)
        questionList.add(que6)

        val que7 = Question(1, "Ключевое слово для объявления интерфейса?",R.drawable.ic_java_test, "inter", "interface", "interfac", 2)
        questionList.add(que7)

        val que8 = Question(1, "Нужно ли использовать ключевое слово abstract в интерфейсе?", R.drawable.ic_java_test, "нет", "нужно", "только для полей", 1)
        questionList.add(que8)

        val que9 = Question(1, "Можно ли реализовать множество интерфейсов?", R.drawable.ic_java_test, "да", "нельзя", "только внутри метода", 1)
        questionList.add(que9)

        val que10 = Question(1, "ключевое слово для расширения интерфейса?", R.drawable.ic_java_test, "final", "static", "extends", 3)
        questionList.add(que10)



        return questionList
    }

    fun getQuestionTwelve(): ArrayList<Question> {
        val questionList = ArrayList<Question>()
        val que1 = Question(1, "На сколько типов делятся внутренние классы?", R.drawable.ic_java_test, "3", "5", "4", 1)
        questionList.add(que1)

        val que2 = Question(1, "Можем ли мы написать класс внутри метода?", R.drawable.ic_java_test, "нет", "в зависимости от типа метода", "да", 3)
        questionList.add(que2)

       val que3 = Question(1, "Что такое анонимный внутренний класс?", R.drawable.ic_java_test, "это внутренний класс без имени", "закрытый класс", "класс внутри метода", 1)
        questionList.add(que3)

       val que4 = Question(1, "Что такое статический внутренний класс?", R.drawable.ic_java_test, "это общедоступный класс", "это скрытый класс", "это вложенный класс, который яв-ся статич членом внеш класса ", 3)
        questionList.add(que4)

        val que5 = Question(1, "Во что компилируется анонимный внутренний класс?", R.drawable.ic_java_test, "Во внутренний не статический класс", "в метод", "в конструктор", 1)
        questionList.add(que5)

        val que6 = Question(1, "Зачем использовать ключевое слово final при создании анонимных классов?", R.drawable.ic_java_test, "при использовании объектов", "для создания переменных","для создания конструктора", 1)
        questionList.add(que6)

        val que7 = Question(1, "Как правильно создать объект внутреннего класса?",R.drawable.ic_java_test, "Outer outer = new Outer();", "Outer outer = new Outer();\n" + "Innter inner = outer.new Inner();", "Innter inner = outer.new Inner();", 2)
        questionList.add(que7)

        val que8 = Question(1, "Можно ли создавать статические методы?", R.drawable.ic_java_test, "нельзя", "можно", "зависит от типа вложенного класса", 3)
        questionList.add(que8)

        val que9 = Question(1, "Можно ли создать анонимный статический вложенный класс?", R.drawable.ic_java_test, "да", "нельзя", "внутри метода можно", 2)
        questionList.add(que9)

        val que10 = Question(1, "Чем отличаются анонимные классы, созданные на основе интерфейса и на основе класса?", R.drawable.ic_java_test, "ничем", "При инициализации не будет создан новый объект", "При объявлении класса будет создан новый класс", 2)
        questionList.add(que10)



        return questionList
    }



    fun getQuestionThirteen(): ArrayList<Question> {
        val questionList = ArrayList<Question>()

        val que1 = Question(1, "Какие бывают операторы?", R.drawable.ic_java_test, "арифметические, операторы сравнения, логические", "примитивные", "прочие", 1)
        questionList.add(que1)

        val que2 = Question(1, "Арифметические оператор инкремента?", R.drawable.ic_java_test, "+-", "!+", "++", 3)
        questionList.add(que2)

        val que3 = Question(1, "Оператор сравнения неравенства?", R.drawable.ic_java_test, "!=", "!==", "==", 1)
        questionList.add(que3)

        val que4 = Question(1, "Оператор сравнения равенства", R.drawable.ic_java_test, "=!", "==", "+=", 2)
        questionList.add(que4)

        val que5 = Question(1, "Логический оператор - И ", R.drawable.ic_java_test, "&&", "&&&", "!&", 1)
        questionList.add(que5)

        val que6 = Question(1, "Логический оператор - ИЛИ", R.drawable.ic_java_test, "|||", "|!","||", 3)
        questionList.add(que6)

        val que7 = Question(1, "Логический оператор - НЕ",R.drawable.ic_java_test, "!", "!!", "!/", 1)
        questionList.add(que7)

        val que8 = Question(1, "Оператор присваивания", R.drawable.ic_java_test, "=+", "=", "==", 2)
        questionList.add(que8)

        val que9 = Question(1, "Оператор присваивания - Добавление", R.drawable.ic_java_test, "+=", "++=", "=+", 1)
        questionList.add(que9)

        val que10 = Question(1, "Оператор присваивания - Вычитание", R.drawable.ic_java_test, "== -", "!-", "-=", 3)
        questionList.add(que10)

        return questionList
    }



//    fun getQuestionTwelve(): ArrayList<Question> {
//        val questionList = ArrayList<Question>()
//
//        val que1 = Question(1, "Можно ли изменить список аргументов для переопр метода?", R.drawable.ic_java_test, "да", "можно только увеличить", "должен быть таким же", 3)
//        questionList.add(que1)
//
//        val que2 = Question(1, "Какой должен быть возвращаемый тип переопр метода?", R.drawable.ic_java_test, "точно таким же", "любым", "измененным", 1)
//        questionList.add(que2)
//
//        val que3 = Question(1, "Можно ли переоперделить final методы?", R.drawable.ic_java_test, "да", "нет", "зависит от типа метода", 2)
//        questionList.add(que3)
//
//        val que4 = Question(1, "Можно ли переопределять конструкторы?", R.drawable.ic_java_test, "нелья", "можно", "", 1)
//        questionList.add(que4)
//
//        val que5 = Question(1, "Можно ли переопределять методы унаследованного класса?", R.drawable.ic_java_test, "нет", "да", "зависит от типа метода", 2)
//        questionList.add(que5)
//
//        val que6 = Question(1, "Можно ли изменить модификатор доступа при переопределении?", R.drawable.ic_java_test, "в любых условиях да", "да, если расширять package > protected","нет", 2)
//        questionList.add(que6)
//
//        val que7 = Question(1, "Можно ли изменять имя аргументов?",R.drawable.ic_java_test, "да", "нет", "только если 1 аргумент", 1)
//        questionList.add(que7)
//
//        val que8 = Question(1, "Можно ли изменить количество аргументов?", R.drawable.ic_java_test, "да", "зависит от типа метода", "нет, это перегрузка метода", 3)
//        questionList.add(que8)
//
//        val que9 = Question(1, "Для чего нужно наследование?", R.drawable.ic_java_test, "Для получения данных", "Для того чтоб создавать классы на основе другого класса", "для получения функции с другого класса", 2)
//        questionList.add(que9)
//
//        val que10 = Question(1, "Поддерживает ли Java множественное наследование?", R.drawable.ic_java_test, "нет", "да", "зависит от условий", 1)
//        questionList.add(que10)
//
//        return questionList
//    }
//
//
//
//    fun getQuestionThirteen(): ArrayList<Question> {
//        val questionList = ArrayList<Question>()
//
//        val que1 = Question(1, "Инкапсуляция это?", R.drawable.ic_java_test, "это доступ к данным", "это сокрытие данных", "это метод", 2)
//        questionList.add(que1)
//
//        val que2 = Question(1, "Как достичь инкапсуляции", R.drawable.ic_java_test, "объявить поля как public", "объявить поля как final", "объявить поля как protected", 2)
//        questionList.add(que2)
//
//        val que3 = Question(1, "Если в классе есть один абстрк метод, должен ли класс быть абстрактным?", R.drawable.ic_java_test, "обязательно должен", "нет, не должен", "зависит от типа метода", 1)
//        questionList.add(que3)
//
//        val que4 = Question(1, "Если класс объявлен абстрактным, можно его реализовать?", R.drawable.ic_java_test, "да", "зависит от типа реализации", "нет, нельзя", 3)
//        questionList.add(que4)
//
//        val que5 = Question(1, "Как использовать абстрактный класс?", R.drawable.ic_java_test, "переопределить", "наследоваться", "сделать перегрузку", 2)
//        questionList.add(que5)
//
//        val que6 = Question(1, "При наследовании абстрак класса, нужно ли реализовывать все его методы?", R.drawable.ic_java_test, "да", "нет","нужно только два метода", 3)
//        questionList.add(que6)
//
//        val que7 = Question(1, "где используется ключево слово abstract?",R.drawable.ic_java_test, "для класса или метода", "для типа метода", "для модификатора доступа", 1)
//        questionList.add(que7)
//
//        val que8 = Question(1, "При объявлении абстрактного метода, где должно стоять слово abstract?", R.drawable.ic_java_test, "в самом начале", "перед именем метода", "в конце объявлении метода", 2)
//        questionList.add(que8)
//
//        val que9 = Question(1, "Содержит ли абстрактный метод тело ?", R.drawable.ic_java_test, "только сигнатуру", "да, содержит", "нет", 1)
//        questionList.add(que9)
//
//        val que10 = Question(1, "Что вместо фигурных скобок стоит у абстр метода?", R.drawable.ic_java_test, ";", "!", "=!", 1)
//        questionList.add(que10)
//
//        return questionList
//    }


//    fun getQuestionEleven(): ArrayList<Question> {
//        val questionList = ArrayList<Question>()
//        val que1 = Question(1, "На сколько типов делятся внутренние классы?", R.drawable.ic_java_test, "3", "5", "4", 1)
//        questionList.add(que1)
//
//        val que2 = Question(1, "Можем ли мы написать класс внутри метода?", R.drawable.ic_java_test, "нет", "в зависимости от типа метода", "да", 3)
//        questionList.add(que2)
//
//        val que3 = Question(1, "Что такое анонимный внутренний класс?", R.drawable.ic_java_test, "это внутренний класс без имени", "закрытый класс", "класс внутри метода", 1)
//        questionList.add(que3)
//
//        val que4 = Question(1, "Что такое статический внутренний класс?", R.drawable.ic_java_test, "это общедоступный класс", "это скрытый класс", "это вложенный класс, который яв-ся статич членом внеш класса ", 3)
//        questionList.add(que4)
//
//        val que5 = Question(1, "Во что компилируется анонимный внутренний класс?", R.drawable.ic_java_test, "Во внутренний не статический класс", "в метод", "в конструктор", 1)
//        questionList.add(que5)
//
//        val que6 = Question(1, "Зачем использовать ключевое слово final при создании анонимных классов?", R.drawable.ic_java_test, "при использовании объектов", "для создания переменных","для создания конструктора", 1)
//        questionList.add(que6)
//
//        val que7 = Question(1, "Как правильно создать объект внутреннего класса?",R.drawable.ic_java_test, "Outer outer = new Outer();", "Outer outer = new Outer();\n" + "Innter inner = outer.new Inner();", "Innter inner = outer.new Inner();", 2)
//        questionList.add(que7)
//
//        val que8 = Question(1, "Можно ли создавать статические методы?", R.drawable.ic_java_test, "нельзя", "можно", "зависит от типа вложенного класса", 3)
//        questionList.add(que8)
//
//        val que9 = Question(1, "Можно ли создать анонимный статический вложенный класс?", R.drawable.ic_java_test, "да", "нельзя", "внутри метода можно", 2)
//        questionList.add(que9)
//
//        val que10 = Question(1, "Чем отличаются анонимные классы, созданные на основе интерфейса и на основе класса?", R.drawable.ic_java_test, "ничем", "При инициализации не будет создан новый объект", "При объявлении класса будет создан новый класс", 2)
//        questionList.add(que10)
//
//
//
//        return questionList
//    }


}