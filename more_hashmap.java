package com.javarush.task.task10.task1019;

import java.io.*;
import java.util.*;

/* 
@airoo
Задача: Программа вводит с клавиатуры пары (число и строку), сохраняет их в HashMap.
Пустая строка - конец ввода данных.
Числа могу повторяться.
Строки всегда уникальны.
Введенные данные не должны потеряться!
Затем программа выводит содержание HashMap на экран.
Каждую пару с новой строки.

Пример ввода:
1
Мама
2
Рама
1
Мыла

Пример вывода:
1 Мыла
2 Рама
1 Мама

Требования:
1. Программа должна считывать данные с клавиатуры.
2. Программа должна выводить текст на экран.
3. В методе main объяви переменную коллекции HashMap и сразу проинициализируй ee.
4. Программа должна помещать в HashMap пары считанные с клавиатуры.
5. Программа должна выводить на экран содержимое HashMap согласно условию. Ключ и значение разделены пробелом. Каждое значение с новой строки.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //инициализируем
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> hashmap = new HashMap<>();
        int id = 0;
        String name = "";
        
        while (true) {
            try {
                //считываем введённые данные и заносим в HashMap
                id = Integer.parseInt(reader.readLine());
                name = reader.readLine();
                map.put(name, id);
            } catch (NumberFormatException e) {
                break; //перехват ошибки при считывании данных, выход из условия
            }
        }
        //перебор HashMap и вывод на экран согласно условию
        for (Map.Entry<String, Integer> pair : map.entrySet())
            System.out.println(pair.getValue() + " " + pair.getKey());
    }
}
