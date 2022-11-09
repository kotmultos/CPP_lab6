import manager.DataManager;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.start();
    }
}
/*
                        Завдання
    Створити класи для сутностей, описаних в завданні.
    Наповнити колекції даних з текстових файлів.
    Для виконання завдань розробити меню.
    Для реалізації використовувати технологію потоків Stream.API.
    Cеріалізувати колекції.

                    Індивідуальне завдання - Варіант 2 - Створити класи для роботи піцерії.
    Клас Піца повинен містити інформацію про назву, вагу, вартість та список складників.

    Клас Відвідувач піцерії знатиме номер, адресу доставки,
                також список замовлень та бажаний час доставки для кожного замовлення.

    Клас Піцерія містить колекцію всіх піц та колекцію всіх користувачів,
                а також методи, які з цими колекціями можна здійснювати.
Завдання
    1.	Відсортувати всі замовлення за часом доставки.
    2.	Створити список адресів для користувачів, що замовили більше ніж 2 піци.
    3.	Перевірити, скільки користувачів замовили піцу з заданою назвою.
    4.	Знайти найбільшу кількість піц, замовлених користувачем серед запропонованого переліку піц.
    5.	Створити колекцію з переліком піц та списками їх замовників.
    6.	Створити список не виконаних замовлень на біжучий час, та вказати час перетермінування.





 */