package se.nishiyamastudios.myapplication

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PersonAdapter : RecyclerView.Adapter<PersonAdapter.ViewHolder>() {

    var people = mutableListOf<String>("Arne","Bartil","Caesar")

    class ViewHolder(view : View) : RecyclerView.ViewHolder(view) {
        val personName: TextView

        init {

            personName = view.findViewById(R.id.personNameTV)

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        // viewType: Int = kan definiera olika typer av rader, produktrad, headerrad etc..

        Log.i("pia11debug","SKAPA RAD")

        val view = LayoutInflater.from(parent.context).inflate(R.layout.person_item, parent, false)

        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return people.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        Log.i("pia11debug","RITA RAD " + position.toString())

        holder.personName.text = people[position]

    }

}