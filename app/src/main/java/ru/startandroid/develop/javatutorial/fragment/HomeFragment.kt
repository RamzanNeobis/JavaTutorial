package ru.startandroid.develop.javatutorial.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_home.*
import ru.startandroid.develop.javatutorial.R
import ru.startandroid.develop.javatutorial.adapter.ChapterAdapter
import ru.startandroid.develop.javatutorial.model.Chapter


class HomeFragment : Fragment(), ChapterAdapter.OnChapterClickListener {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.fragment_home, container, false)



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        val chapters = mutableListOf<Chapter>()
        chapters.add(Chapter(1,"Обзор языка", R.drawable.ne))
        chapters.add(Chapter(2,"Синтаксис", R.drawable.dva))
        chapters.add(Chapter(3,"Классы и объекты", R.drawable.three))
        chapters.add(Chapter(4,"Типы переменных", R.drawable.four))
        chapters.add(Chapter(5,"Модификаторы доступа", R.drawable.five))
        chapters.add(Chapter(6,"Циклы", R.drawable.six))
        chapters.add(Chapter(7,"Массивы", R.drawable.seven))
        chapters.add(Chapter(8,"Методы", R.drawable.eight))
        chapters.add(Chapter(9,"Вложенные классы", R.drawable.nine))
        chapters.add(Chapter(10,"Наследование", R.drawable.ten))
        chapters.add(Chapter(11,"Переопределение", R.drawable.eleven))
        chapters.add(Chapter(12,"Полиморфизм", R.drawable.dvenad))
        chapters.add(Chapter(13,"Абстракция", R.drawable.trinad))
        chapters.add(Chapter(14,"Инкапсуляция", R.drawable.chetir))
        chapters.add(Chapter(15,"Интерфейсы", R.drawable.pyatnadcat))
        chapters.add(Chapter(16,"Коллекции", R.drawable.shestnad))
        chapters.add(Chapter(17,"Дженерики", R.drawable.semnadca))
        chapters.add(Chapter(18,"Примитивные типы данных", R.drawable.vosemnad))
        chapters.add(Chapter(19,"Основные операторы", R.drawable.devyatnadcat))





        recycler_view.apply {
            layoutManager = LinearLayoutManager(requireContext())
            adapter = ChapterAdapter(chapters, this@HomeFragment)
        }
    }

    override fun onItemClick(chapter: Chapter, position: Int) {
        if(chapter.id == 1 ) {
            chapter.let{
                val directions = HomeFragmentDirections.actionHomeFragmentToChapterFragment(chapter.id)
                findNavController().navigate(directions)
            }

        }
        else if(chapter.id == 2){
            val directions = HomeFragmentDirections.actionHomeFragmentToChapterFragment(chapter.id)
            findNavController().navigate(directions)
        }
        else if(chapter.id == 3){
            val directions = HomeFragmentDirections.actionHomeFragmentToChapterFragment(chapter.id)
            findNavController().navigate(directions)
        }
        else if(chapter.id == 4){
            val directions = HomeFragmentDirections.actionHomeFragmentToChapterFragment(chapter.id)
            findNavController().navigate(directions)
        }
        else if(chapter.id == 5){
            val directions = HomeFragmentDirections.actionHomeFragmentToChapterFragment(chapter.id)
            findNavController().navigate(directions)
        }
        else if(chapter.id == 6){
            val directions = HomeFragmentDirections.actionHomeFragmentToChapterFragment(chapter.id)
            findNavController().navigate(directions)
        }
        else if(chapter.id == 7){
            val directions = HomeFragmentDirections.actionHomeFragmentToChapterFragment(chapter.id)
            findNavController().navigate(directions)
        }
        else if(chapter.id == 8){
            val directions = HomeFragmentDirections.actionHomeFragmentToChapterFragment(chapter.id)
            findNavController().navigate(directions)
        }
        else if(chapter.id == 9){
            val directions = HomeFragmentDirections.actionHomeFragmentToChapterFragment(chapter.id)
            findNavController().navigate(directions)
        }
        else if(chapter.id == 10){
            val directions = HomeFragmentDirections.actionHomeFragmentToChapterFragment(chapter.id)
            findNavController().navigate(directions)
        }
        else if(chapter.id == 11){
            val directions = HomeFragmentDirections.actionHomeFragmentToChapterFragment(chapter.id)
            findNavController().navigate(directions)
        }
        else if(chapter.id == 12){
            val directions = HomeFragmentDirections.actionHomeFragmentToChapterFragment(chapter.id)
            findNavController().navigate(directions)
        }
        else if(chapter.id == 13){
            val directions = HomeFragmentDirections.actionHomeFragmentToChapterFragment(chapter.id)
            findNavController().navigate(directions)
        }
        else if(chapter.id == 14){
            val directions = HomeFragmentDirections.actionHomeFragmentToChapterFragment(chapter.id)
            findNavController().navigate(directions)
        }
        else if(chapter.id == 15){
            val directions = HomeFragmentDirections.actionHomeFragmentToChapterFragment(chapter.id)
            findNavController().navigate(directions)
        }
        else if(chapter.id == 16){
            val directions = HomeFragmentDirections.actionHomeFragmentToChapterFragment(chapter.id)
            findNavController().navigate(directions)
        }
        else if(chapter.id == 17){
            val directions = HomeFragmentDirections.actionHomeFragmentToChapterFragment(chapter.id)
            findNavController().navigate(directions)
        }
        else if(chapter.id == 18){
            val directions = HomeFragmentDirections.actionHomeFragmentToChapterFragment(chapter.id)
            findNavController().navigate(directions)
        }
        else if(chapter.id == 19){
            val directions = HomeFragmentDirections.actionHomeFragmentToChapterFragment(chapter.id)
            findNavController().navigate(directions)
        }
    }


}