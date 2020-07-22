package com.andra.instagram_home_layout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        try {
            this.supportActionBar?.hide()
        } catch (e: NullPointerException) {
        }

        //story
        Glide.with(this)
            .load(R.drawable.profil_img)
            .circleCrop()
            .into(profil)

        Glide.with(this)
            .load(R.drawable.img1)
            .circleCrop()
            .into(profil2)

        Glide.with(this)
            .load(R.drawable.img2)
            .circleCrop()
            .into(profil3)

        Glide.with(this)
            .load(R.drawable.img3)
            .circleCrop()
            .into(profil4)

        Glide.with(this)
            .load(R.drawable.img4)
            .circleCrop()
            .into(profil5)

        Glide.with(this)
            .load(R.drawable.img6)
            .circleCrop()
            .into(profil6)

        Glide.with(this)
            .load(R.drawable.img7)
            .circleCrop()
            .into(profil7)

        Glide.with(this)
            .load(R.drawable.img9)
            .circleCrop()
            .into(profil8)

        //feed profil
        Glide.with(this)
            .load(R.drawable.img1)
            .circleCrop()
            .into(IvUser1)

        Glide.with(this)
            .load(R.drawable.img2)
            .circleCrop()
            .into(IvUser2)

        Glide.with(this)
            .load(R.drawable.img3)
            .circleCrop()
            .into(IvUser3)

        //comment photo
        Glide.with(this)
            .load(R.drawable.img1)
            .circleCrop()
            .into(IvComment)

        Glide.with(this)
            .load(R.drawable.img2)
            .circleCrop()
            .into(IvComment2)

        Glide.with(this)
            .load(R.drawable.img3)
            .circleCrop()
            .into(IvComment3)



    }
}