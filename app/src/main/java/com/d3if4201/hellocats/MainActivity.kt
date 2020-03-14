package com.d3if4201.hellocats

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var nextCats = 0;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonNext: Button = findViewById(R.id.button_next)
        buttonNext.setOnClickListener {
            nextImage()
        }
    }

    private fun nextImage() {
        nextCats = (nextCats+1)%6
        val cats : ImageView = findViewById(R.id.image_view)

        var next = when(nextCats) {
            0 -> R.drawable.chinchilla
            1 -> R.drawable.burmese
            2 -> R.drawable.mainecoon
            3 -> R.drawable.african
            4 -> R.drawable.tortoiseshell
            else -> R.drawable.calico
        }
        cats.setImageResource(next)

        val namaKucing: TextView = findViewById(R.id.cats)
        var nama = when (nextCats) {
            0 -> R.string.cats1
            1 -> R.string.cats2
            2 -> R.string.cats3
            3 -> R.string.cats4
            4 -> R.string.cats5
            else -> R.string.cats6
        }
        namaKucing.setText(nama)
    }
}
