package br.senac.pi.toolbarmenu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import br.senac.pi.R
import br.senac.pi.fragments.AlbumsFragment
import br.senac.pi.fragments.ArtistsFragment
import br.senac.pi.fragments.PlaylistFragment
import br.senac.pi.fragments.RecentsFragment

class NovoToolbarActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_novo_toolbar)
    }

    //cria o menu
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.toolbarmenu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when(item.itemId) {
            R.id.artistas -> {
                val frag = ArtistsFragment()
                supportFragmentManager.beginTransaction().replace(R.id.activitycontainer, frag).commit()
            }
            R.id.albuns -> {
                val frag = AlbumsFragment()
                supportFragmentManager.beginTransaction().replace(R.id.activitycontainer, frag).commit()
            }
            R.id.playlists -> {
                val frag = PlaylistFragment()
                supportFragmentManager.beginTransaction().replace(R.id.activitycontainer, frag).commit()
            }
            else -> {
                val frag = RecentsFragment()
                supportFragmentManager.beginTransaction().replace(R.id.activitycontainer, frag).commit()
            }
        }
        return super.onOptionsItemSelected(item)
    }
}
