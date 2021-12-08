package com.example.myappnewyear

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class InfoFragment : Fragment() {

    lateinit var newyearRecyclerView: RecyclerView
    lateinit var showWebSiteButton: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_info, container, false)

        val newyearInfo: List<String> = listOf("С новым годом!2022!!!!", "Голубой(черный) водяной тигр", "Символы:энергия «Ян» и дерево","2 стихии: земля и вода", "Время перемен", "Удача сулит тем, кто не отступает от цели",)
        showWebSiteButton=view.findViewById(R.id.show_web_site_button)
        newyearRecyclerView = view.findViewById(R.id.newyear_recycler_view)
        newyearRecyclerView.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        newyearRecyclerView.adapter = NewyearAdapter(newyearInfo)

        showWebSiteButton.setOnClickListener {
            val link = Uri.parse("https://google.com/")
            val intent = Intent(Intent.ACTION_VIEW, link)
            context?.startActivity(intent)
        }
        return view
    }
}