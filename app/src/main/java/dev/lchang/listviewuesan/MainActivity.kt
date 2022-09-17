package dev.lchang.listviewuesan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var arrSO = arrayOf(
        "Android","iOS","Blackberry OS","Firefox OS","Amazon World","Nokia OS"
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var lsvSistemasOperativos: ListView = findViewById(R.id.lsvSO)
        val adaptador: Any? =
            ArrayAdapter<Any?>(this,android.R.layout.simple_list_item_1,arrSO)
        lsvSistemasOperativos.adapter  = adaptador as ListAdapter

        lsvSistemasOperativos.setOnItemClickListener{ parent,view,position,id ->
            Toast.makeText(applicationContext
                , "Estoy en la posición $position"
                , Toast.LENGTH_LONG).show()
        }

    }
}