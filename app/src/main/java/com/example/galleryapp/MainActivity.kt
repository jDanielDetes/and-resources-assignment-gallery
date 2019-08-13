package com.example.galleryapp

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageViewList= mutableListOf<ImageView>()

            imageViewList.add(0, ImageView(this))
            imageViewList[0].setImageDrawable(ContextCompat.getDrawable(this,R.drawable.adventure_automobile_classic_2533092))
        imageViewList[0].contentDescription= "Classic car"

              imageViewList.add(1, ImageView(this))
            imageViewList[1].setImageDrawable(ContextCompat.getDrawable(this, R.drawable.aerial_photography_aerial_shot_aerial_view_2583847))

        imageViewList[1].contentDescription= "aerial sky view"

              imageViewList.add(2, ImageView(this))
            imageViewList[2].setImageDrawable(ContextCompat.getDrawable(this, R.drawable.alley_architecture_buildings_2526517))

        imageViewList[2].contentDescription= "alley of buildings"

              imageViewList.add(3, ImageView(this))
            imageViewList[3].setImageDrawable(ContextCompat.getDrawable(this, R.drawable.architectural_design_architecture_bridge_2540653))

        imageViewList[3].contentDescription= "large bridge"

              imageViewList.add(4, ImageView(this))
            imageViewList[4].setImageDrawable(ContextCompat.getDrawable(this,  R.drawable.beautiful_breathtaking_canada_day_2526105))

        imageViewList[4].contentDescription= "amazing view outside in canada"

              imageViewList.add(5, ImageView(this))
            imageViewList[5].setImageDrawable(ContextCompat.getDrawable(this, R.drawable.bloom_blossom_flora_2567011))

        imageViewList[5].contentDescription= "floral blossoms"

              imageViewList.add(6, ImageView(this))
            imageViewList[6].setImageDrawable(ContextCompat.getDrawable(this,  R.drawable.close_up_colorful_colors_2529148))

        imageViewList[6].contentDescription= "colorful"

              imageViewList.add(7, ImageView(this))
            imageViewList[7].setImageDrawable(ContextCompat.getDrawable(this, R.drawable.clouds_coconut_trees_daylight_2486168))

        imageViewList[7].contentDescription= "trees"

              imageViewList.add(8, ImageView(this))
            imageViewList[8].setImageDrawable(ContextCompat.getDrawable(this,R.drawable.colorful_colourful_houses_2501965))

        imageViewList[8].contentDescription= "vibrant houses"

              imageViewList.add(9, ImageView(this))
            imageViewList[9].setImageDrawable(ContextCompat.getDrawable(this, R.drawable.wallpaper_astronomy_astrophotography_2538107))

        imageViewList[9].contentDescription= "space "

        /* <style name="imgStyle">
        <item name="android:layout_height">wrap_content</item>
        <item name="android:layout_width">match_parent</item>
        <item name="android:adjustViewBounds">true</item>
                            */
        val LL_param = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.WRAP_CONTENT)

        imageViewList.forEachIndexed {
                index, imageView ->
            imageView.layoutParams =LL_param
            imageView.adjustViewBounds= true
            if (index< 4 ) {
                right_column.addView(imageView)
            } else {
                left_column.addView(imageView)
            }


        }
    }
}
