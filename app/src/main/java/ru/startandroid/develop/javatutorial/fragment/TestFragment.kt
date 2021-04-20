package ru.startandroid.develop.javatutorial.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_test.*
import ru.startandroid.develop.javatutorial.R
import ru.startandroid.develop.javatutorial.adapter.TestAdapter
import ru.startandroid.develop.javatutorial.model.Chapter
import ru.startandroid.develop.javatutorial.model.Test


class TestFragment : Fragment(), TestAdapter.OnTestClickListener {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.fragment_test, container, false)


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        val test = mutableListOf<Test>()
        //test.add(Test(1,"  Пройти тест по теме:\n \"Обзор языка\"" ))
        test.add(Test(1,"  Пройти тест по теме:\n \"Синтаксис\""))
        test.add(Test(2,"  Пройти тест по теме:\n \"Классы и объекты\""))
        test.add(Test(3,"  Пройти тест по теме:\n \"Типы переменных\""))
        test.add(Test(4,"  Пройти тест по теме:\n \"Модификаторы доступа\""))
        test.add(Test(5,"  Пройти тест по теме:\n \"Циклы\""))
        test.add(Test(6,"  Пройти тест по теме:\n \"Массивы\""))
        test.add(Test(7,"  Пройти тест по теме:\n \"Методы\""))
        test.add(Test(8,"  Пройти тест по теме:\n \"Наследование\""))
        test.add(Test(9,"  Пройти тест по теме:\n \"Полиморфизм\""))
        test.add(Test(10,"  Пройти тест по теме:\n \"Абстракция\""))
        test.add(Test(11,"  Пройти тест по теме:\n \"Интерфейсы\""))
        test.add(Test(12,"  Пройти тест по теме:\n \"Вложенные классы\""))
        test.add(Test(13,"  Пройти тест по теме:\n \"Основные операторы\""))



        recycler_test.apply {
            layoutManager = LinearLayoutManager(activity)
            adapter = TestAdapter(test, this@TestFragment)
        }
    }

    override fun onItemClick(test: Test, position: Int) {
//        if(test.id == 1){
//            val directions = TestFragmentDirections.actionTestFragmentToTakeTheTestFragment(test.id, "Обзор языка")
//            findNavController().navigate(directions)
//        }
        if(test.id == 1){
            val directions = TestFragmentDirections.actionTestFragmentToTakeTheTestFragment(test.id, "Синтаксис")
            findNavController().navigate(directions)
        }
        else if(test.id == 2){
            val directions = TestFragmentDirections.actionTestFragmentToTakeTheTestFragment(test.id, "Классы и объекты")
            findNavController().navigate(directions)
        }
        else if(test.id == 3){
            val directions = TestFragmentDirections.actionTestFragmentToTakeTheTestFragment(test.id, "Типы Переменных")
            findNavController().navigate(directions)
        }
        else if(test.id == 4){
            val directions = TestFragmentDirections.actionTestFragmentToTakeTheTestFragment(test.id, "Модификаторы доступа")
            findNavController().navigate(directions)
        }
        else if(test.id == 5){
            val directions = TestFragmentDirections.actionTestFragmentToTakeTheTestFragment(test.id, "Циклы")
            findNavController().navigate(directions)
        }
        else if(test.id == 6){
            val directions = TestFragmentDirections.actionTestFragmentToTakeTheTestFragment(test.id, "Массивы")
            findNavController().navigate(directions)
        }
        else if(test.id == 7){
            val directions = TestFragmentDirections.actionTestFragmentToTakeTheTestFragment(test.id, "Методы")
            findNavController().navigate(directions)
        }
        else if(test.id == 8){
            val directions = TestFragmentDirections.actionTestFragmentToTakeTheTestFragment(test.id, "Наследование")
            findNavController().navigate(directions)
        }
        else if(test.id == 9){
            val directions = TestFragmentDirections.actionTestFragmentToTakeTheTestFragment(test.id, "Полиморфизм")
            findNavController().navigate(directions)
        }
        else if(test.id == 10){
            val directions = TestFragmentDirections.actionTestFragmentToTakeTheTestFragment(test.id, "Абстракция")
            findNavController().navigate(directions)
        }
        else if(test.id == 11){
            val directions = TestFragmentDirections.actionTestFragmentToTakeTheTestFragment(test.id, "Интерфейсы")
            findNavController().navigate(directions)
        }
        else if(test.id == 12){
            val directions = TestFragmentDirections.actionTestFragmentToTakeTheTestFragment(test.id, "Вложенные классы")
            findNavController().navigate(directions)
        }
        else if(test.id == 13){
            val directions = TestFragmentDirections.actionTestFragmentToTakeTheTestFragment(test.id, "Основные операторы")
            findNavController().navigate(directions)
        }
    }
}