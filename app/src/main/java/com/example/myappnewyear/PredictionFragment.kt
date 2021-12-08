package com.example.myappnewyear


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView

class PredictionFragment : Fragment() {
    lateinit var predictionTextView: TextView
    lateinit var predictionButton: Button

    private val predictionList: List<String> = listOf(
        "Год для вас будет активным. Быть в тонусе вам нравится.",
        "Год для вас будет наполнен добротой.",
        "Счастье уже стоит за дверью.",
        "Будьте внимательны к своему здоровью.",
        "Год для вас будет благополучным. Все поводы волноваться останутся в прошлом.",
        "Прислушайтесь к советам интуиции.",
        "Люди, что сейчас рядом, будут помогать весь год.",
        "Нужная встреча произойдет совсем скоро.",
        "Любовь улыбается и ждет своего часа.",
        "Везение в денежных вопросах.",
        "Удача в любом начинании.",
        "Счастье где-то рядом, обернитесь вокруг.",
        "Год слёз, но только от радости.",
        "Год для вас будет необычным. Вы откроете в себе скрытые резервы, что позволит решиться на самые безумные поступки.",
        "Вас ожидает поездка в новую страну.",
        "Этот год кардинально изменит Вашу жизнь.",
        "Карьерный рост будет стремителен и успешен.",
        "Мир и покой в семье весь год.",
        "Романтическое свидание поможет найти взаимные чувства.",
        "Любое дело обречено на успех.",
        "Путешествие для души подарит необходимый отдых и новые впечатления.",
        "Откройте сердце любви в этом году.",
        "Семья подарит настоящую поддержку.",
        "В этом году ожидается множество новых знакомств.",
        "Пора отдохнуть и заняться хобби.",
        "В этом году Вас ждет море счастья.",
        "Фортуна ответит да на любой вопрос.",
        "Рискуйте и обязательно выиграете.",
        "Этот год принесет повышение на работе.",
        "Желаемое осуществится в середине года.",
        "Этот год принесет только счастье и успех.",
        "Oчень удачный год для начала собственного бизнеса.",
    )


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_prediction, container, false)

        predictionTextView = view.findViewById(R.id.prediction_text_view)
        predictionButton = view.findViewById(R.id.prediction_button)


        predictionButton.setOnClickListener {
            predictionTextView.setText(predictionList.random())
        }

        return view
    }
}

}
