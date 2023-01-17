package se.nishiyamastudios.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class PersonAdapter : RecyclerView.Adapter<PersonAdapter.ViewHolder>() {

    class ViewHolder(view : View) : RecyclerView.ViewHolder(view) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        // viewType: Int = kan definiera olika typer av rader, produktrad, headerrad etc..

        val view = LayoutInflater.from(parent.context).inflate(R.layout.person_item, parent, false)

        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return 5
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

    }

}