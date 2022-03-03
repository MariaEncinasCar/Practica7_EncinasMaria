package encinas.maria.peliculas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    var peliculas: ArrayList<Pelicula> = ArrayList()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        llenar_peliculas()
        var adapter = AdaptadorMovies(this,peliculas)
        var listView:ListView=findViewById(R.id.listv)
        listView.adapter=adapter

    }

    fun llenar_peliculas(){
        peliculas.add(Pelicula(1, getString(R.string.pelicula1), getString(R.string.pelicula1_desc), 120, R.drawable.toystory))
        peliculas.add(Pelicula(2, getString(R.string.pelicula2), getString(R.string.pelicula2_desc), 120, R.drawable.leapyear))
        peliculas.add(Pelicula(3, getString(R.string.pelicula3), getString(R.string.pelicula3_desc), 120, R.drawable.bighero6))
        peliculas.add(Pelicula(4, getString(R.string.pelicula4), getString(R.string.pelicula4_desc), 120, R.drawable.mil))
        peliculas.add(Pelicula(5, getString(R.string.pelicula5), getString(R.string.pelicula5_desc), 120, R.drawable.mib))
    }
}