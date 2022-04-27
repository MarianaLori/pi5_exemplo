package br.senac.pi.bottomnavigation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.senac.pi.R
import br.senac.pi.databinding.ActivityBottomNavigationBinding
import br.senac.pi.fragments.AlbumsFragment
import br.senac.pi.fragments.ArtistsFragment
import br.senac.pi.fragments.PlaylistFragment
import br.senac.pi.fragments.RecentsFragment

class BottomNavigationActivity : AppCompatActivity() {

    lateinit var binding: ActivityBottomNavigationBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBottomNavigationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bottomNavigation.setOnItemSelectedListener {
            when(it.itemId) {
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

            true
        }
    }

}