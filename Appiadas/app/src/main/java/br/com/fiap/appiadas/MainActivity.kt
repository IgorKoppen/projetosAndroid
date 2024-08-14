package br.com.fiap.appiadas

import android.media.MediaPlayer
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.fiap.appiadas.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView( binding.root)
        binding.btTellJoker.setOnClickListener {
            showJoker()
            playSong()
        }
    }
    fun showJoker() {
        val jokers = resources.getStringArray( R.array.jokers)
        val numberJoker = Random.nextInt( jokers.size)
        val joker = jokers[numberJoker ]
        binding.tvJoker.text = joker
    }

    private  fun playSong(){
        val mediaPlayer = MediaPlayer.create(this,R.raw.badumtss)
        mediaPlayer.start()
    }
}