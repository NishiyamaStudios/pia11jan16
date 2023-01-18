package se.nishiyamastudios.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    var personadapter = PersonAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        personadapter.people.add("Xerxes")
        personadapter.people.add("Banan")

        val personRecview = findViewById<RecyclerView>(R.id.personsRV)

        personRecview.adapter = personadapter
        personRecview.layoutManager = LinearLayoutManager(this)

        //personRecview.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false)
        //personRecview.layoutManager = GridLayoutManager(this,2)

        findViewById<Button>(R.id.addPersonButton).setOnClickListener() {

            var addname = findViewById<EditText>(R.id.addPersonET).text.toString()

            personadapter.people.add(addname)

        }

    }
}