package ru.startandroid.develop.javatutorial.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_chapter.*
import ru.startandroid.develop.javatutorial.bd.MyViewModel
import ru.startandroid.develop.javatutorial.R
import ru.startandroid.develop.javatutorial.bd.DatabaseNew
import ru.startandroid.develop.javatutorial.bd.DatabaseRepository
import ru.startandroid.develop.javatutorial.bd.MyViewModelFactory
import ru.startandroid.develop.javatutorial.model.Chapter


class ChapterFragment : Fragment() {

    lateinit var viewModel: MyViewModel
    private val nameChapterOne = "Структура программы"
    private val nameChapterTwo = "Переменные и константы"

    private val args: ChapterFragmentArgs by navArgs()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.fragment_chapter, container, false)


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        val repository = DatabaseRepository(DatabaseNew(requireContext()))
        val viewModelFactory = MyViewModelFactory(repository)
        viewModel = ViewModelProvider(requireActivity(), viewModelFactory).get(MyViewModel::class.java)
        val id = args.chapterId
        if(id== 1) {
            pdfView.fromAsset("обзор языка.pdf")
                .load()
            add_bookmark.setOnClickListener {
                val chapter = Chapter(id, "Обзор языка",R.drawable.ne)
                viewModel.saveChapter(chapter)
                Toast.makeText(requireContext(), "Закладка добавлена", Toast.LENGTH_SHORT).show()
            }
            go_test.setOnClickListener {
//                val directions = ChapterFragmentDirections.actionChapterFragmentToTakeTheTestFragment(id,"Обзор языка")
//                findNavController().navigate(directions)
                Toast.makeText(requireContext(),"Этот тема не имеет теста",Toast.LENGTH_SHORT).show()
            }
        }
        else if (id == 2){
            pdfView.fromAsset("синтаксис.pdf")
                .load()
            add_bookmark.setOnClickListener {
                val chapter = Chapter(id, "Синтаксис",R.drawable.dva )
                viewModel.saveChapter(chapter)
                Toast.makeText(requireContext(), "Закладка добавлена", Toast.LENGTH_SHORT).show()
            }
            go_test.setOnClickListener {
                val directions = ChapterFragmentDirections.actionChapterFragmentToTakeTheTestFragment(id -1,"Синтаксис")
                findNavController().navigate(directions)
            }
        }
        else if (id == 3){
            pdfView.fromAsset("классы и обьекты.pdf")
                .load()
            add_bookmark.setOnClickListener {
                val chapter = Chapter(id, "Классы и объекты",R.drawable.tri)
                viewModel.saveChapter(chapter)
                Toast.makeText(requireContext(), "Закладка добавлена", Toast.LENGTH_SHORT).show()
            }
            go_test.setOnClickListener {
                val directions = ChapterFragmentDirections.actionChapterFragmentToTakeTheTestFragment(id - 1,"Классы и объекты")
                findNavController().navigate(directions)
            }
        }
        else if (id == 4){
            pdfView.fromAsset("типы переменных.pdf")
                .load()
            add_bookmark.setOnClickListener {
                val chapter = Chapter(id, "Типы данных",R.drawable.four)
                viewModel.saveChapter(chapter)
                Toast.makeText(requireContext(), "Закладка добавлена", Toast.LENGTH_SHORT).show()
            }
            go_test.setOnClickListener {
                val directions = ChapterFragmentDirections.actionChapterFragmentToTakeTheTestFragment(id - 1,"Типы данных")
                findNavController().navigate(directions)
            }
        }
        else if (id == 5){
            pdfView.fromAsset("модификаторы доступа.pdf")
                .load()
            add_bookmark.setOnClickListener {
                val chapter = Chapter(id, "Модификаторы доступа",R.drawable.five)
                viewModel.saveChapter(chapter)
                Toast.makeText(requireContext(), "Закладка добавлена", Toast.LENGTH_SHORT).show()
            }
            go_test.setOnClickListener {
                val directions = ChapterFragmentDirections.actionChapterFragmentToTakeTheTestFragment(id - 1,"Модификаторы доступа")
                findNavController().navigate(directions)
            }
        }
        else if (id == 6){
            pdfView.fromAsset("циклы.pdf")
                .load()
            add_bookmark.setOnClickListener {
                val chapter = Chapter(id, "Циклы",R.drawable.six)
                viewModel.saveChapter(chapter)
                Toast.makeText(requireContext(), "Закладка добавлена", Toast.LENGTH_SHORT).show()
            }
            go_test.setOnClickListener {
                val directions = ChapterFragmentDirections.actionChapterFragmentToTakeTheTestFragment(id -1,"Циклы")
                findNavController().navigate(directions)
            }

        }
        else if (id == 7){
            pdfView.fromAsset("массивы.pdf")
                .load()
            add_bookmark.setOnClickListener {
                val chapter = Chapter(id, "Массивы",R.drawable.seven)
                viewModel.saveChapter(chapter)
                Toast.makeText(requireContext(), "Закладка добавлена", Toast.LENGTH_SHORT).show()
            }
            go_test.setOnClickListener {
                val directions = ChapterFragmentDirections.actionChapterFragmentToTakeTheTestFragment(id - 1,"Массивы")
                findNavController().navigate(directions)
            }
        }
        else if (id == 8){
            pdfView.fromAsset("методы.pdf")
                .load()
            add_bookmark.setOnClickListener {
                val chapter = Chapter(id, "Методы",R.drawable.eight)
                viewModel.saveChapter(chapter)
                Toast.makeText(requireContext(), "Закладка добавлена", Toast.LENGTH_SHORT).show()
            }
            go_test.setOnClickListener {
                val directions = ChapterFragmentDirections.actionChapterFragmentToTakeTheTestFragment(id -1,"Методы")
                findNavController().navigate(directions)
            }
        }
        else if (id == 9){
            pdfView.fromAsset("вложенные классы.pdf")
                .load()
            add_bookmark.setOnClickListener {
                val chapter = Chapter(id, "Вложенные классы",R.drawable.nine)
                viewModel.saveChapter(chapter)
                Toast.makeText(requireContext(), "Закладка добавлена", Toast.LENGTH_SHORT).show()
            }
            go_test.setOnClickListener {
                val directions = ChapterFragmentDirections.actionChapterFragmentToTakeTheTestFragment(id + 3,"Вложенные классы")
                findNavController().navigate(directions)
            }

        }
        else if (id == 10){
            pdfView.fromAsset("Наследование.pdf")
                .load()
            add_bookmark.setOnClickListener {
                val chapter = Chapter(id, "Наследование",R.drawable.ten)
                viewModel.saveChapter(chapter)
                Toast.makeText(requireContext(), "Закладка добавлена", Toast.LENGTH_SHORT).show()
            }
            go_test.setOnClickListener {
                val directions = ChapterFragmentDirections.actionChapterFragmentToTakeTheTestFragment(id -2,"Наследование")
                findNavController().navigate(directions)
            }
        }
        else if (id == 11){
            pdfView.fromAsset("переопределение.pdf")
                .load()
            add_bookmark.setOnClickListener {
                val chapter = Chapter(id, "Переопределение",R.drawable.eleven)
                viewModel.saveChapter(chapter)
                Toast.makeText(requireContext(), "Закладка добавлена", Toast.LENGTH_SHORT).show()
            }
            go_test.setOnClickListener {
                Toast.makeText(requireContext(),"Этот тема не имеет теста",Toast.LENGTH_SHORT).show()
            }
        }
        else if (id == 12){
            pdfView.fromAsset("полиморфизм.pdf")
                .load()
            add_bookmark.setOnClickListener {
                val chapter = Chapter(id, "Полиморфизм",R.drawable.dvenad)
                viewModel.saveChapter(chapter)
                Toast.makeText(requireContext(), "Закладка добавлена", Toast.LENGTH_SHORT).show()
            }
            go_test.setOnClickListener {
                val directions = ChapterFragmentDirections.actionChapterFragmentToTakeTheTestFragment(id - 3,"Полиморфизм")
                findNavController().navigate(directions)
            }
        }
        else if (id == 13){
            pdfView.fromAsset("абстракция.pdf")
                .load()
            add_bookmark.setOnClickListener {
                val chapter = Chapter(id, "Абстракция",R.drawable.trinad)
                viewModel.saveChapter(chapter)
                Toast.makeText(requireContext(), "Закладка добавлена", Toast.LENGTH_SHORT).show()
            }
            go_test.setOnClickListener {
                val directions = ChapterFragmentDirections.actionChapterFragmentToTakeTheTestFragment(id - 3,"Абстракция")
                findNavController().navigate(directions)
            }
        }
        else if (id == 14){
            pdfView.fromAsset("инкапсуляция.pdf")
                .load()
            add_bookmark.setOnClickListener {
                val chapter = Chapter(id, "Инкапсуляция",R.drawable.chetir)
                viewModel.saveChapter(chapter)
                Toast.makeText(requireContext(), "Параметры методов", Toast.LENGTH_SHORT).show()
            }
            go_test.setOnClickListener {
                Toast.makeText(requireContext(),"Этот тема не имеет теста",Toast.LENGTH_SHORT).show()
            }
        }
        else if (id == 15){
            pdfView.fromAsset("интерфейсы.pdf")
                .load()
            add_bookmark.setOnClickListener {
                val chapter = Chapter(id, "Интерфейсы",R.drawable.pyatnadcat)
                viewModel.saveChapter(chapter)
                Toast.makeText(requireContext(), "Параметры методов", Toast.LENGTH_SHORT).show()
            }
            go_test.setOnClickListener {
                val directions = ChapterFragmentDirections.actionChapterFragmentToTakeTheTestFragment(id - 4,"Интерфейсы")
                findNavController().navigate(directions)
            }
        }
        else if (id == 16){
            pdfView.fromAsset("коллекции.pdf")
                .load()
            add_bookmark.setOnClickListener {
                val chapter = Chapter(id, "Коллекции",R.drawable.shestnad)
                viewModel.saveChapter(chapter)
                Toast.makeText(requireContext(), "Параметры методов", Toast.LENGTH_SHORT).show()
            }
            go_test.setOnClickListener {
                Toast.makeText(requireContext(),"Этот тема не имеет теста",Toast.LENGTH_SHORT).show()
            }
        }
        else if (id == 17){
            pdfView.fromAsset("дженерики.pdf")
                .load()
            add_bookmark.setOnClickListener {
                val chapter = Chapter(id, "Дженерики",R.drawable.semnadca)
                viewModel.saveChapter(chapter)
                Toast.makeText(requireContext(), "Параметры методов", Toast.LENGTH_SHORT).show()
            }
            go_test.setOnClickListener {
                Toast.makeText(requireContext(),"Этот тема не имеет теста",Toast.LENGTH_SHORT).show()
            }
        }
        else if (id == 18){
            pdfView.fromAsset("примитивные и ссылочные типы данных.pdf")
                .load()
            add_bookmark.setOnClickListener {
                val chapter = Chapter(id, "Примитивные типы данных",R.drawable.vosemnad)
                viewModel.saveChapter(chapter)
                Toast.makeText(requireContext(), "Параметры методов", Toast.LENGTH_SHORT).show()
            }
            go_test.setOnClickListener {
                Toast.makeText(requireContext(),"Этот тема не имеет теста",Toast.LENGTH_SHORT).show()
            }
        }
        else if (id == 19){
            pdfView.fromAsset("основные операторы.pdf")
                .load()
            add_bookmark.setOnClickListener {
                val chapter = Chapter(id, "Основные операторы",R.drawable.devyatnadcat)
                viewModel.saveChapter(chapter)
                Toast.makeText(requireContext(), "Параметры методов", Toast.LENGTH_SHORT).show()
            }
            go_test.setOnClickListener {
                val directions = ChapterFragmentDirections.actionChapterFragmentToTakeTheTestFragment(id - 6,"Основные операторы")
                findNavController().navigate(directions)
            }
        }
    }
}