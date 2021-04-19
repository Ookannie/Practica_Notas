package gamez.ana.misnotas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var notas = ArrayList<Nota>()
    lateinit var adaptador: AdaptadorNotas


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var listview: ListView = this.findViewById(R.id.listview)
        var fab: com.google.android.material.floatingactionbutton.FloatingActionButton = this.findViewById(R.id.fab)

        fab.setOnClickListener {
            var intent = Intent(this, AgregarNotaActivity::class.java)
            startActivityForResult(intent, 123)
        }

        adaptador = AdaptadorNotas(this, notas)
        listview.adapter = adaptador

    }


    fun notasPrueba(){
        notas.add(Nota("Prueba 01", "Contenido de la nota 01"))
        notas.add(Nota("Prueba 02", "Contenido de la nota 02"))
        notas.add(Nota("Prueba 03", "Contenido de la nota 03"))

    }
}