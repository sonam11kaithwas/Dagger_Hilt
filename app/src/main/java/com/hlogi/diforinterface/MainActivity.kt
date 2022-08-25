package com.hlogi.diforinterface

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.hlogi.diforinterface.dagger_pkg.repositry_pkg.MyPostViewModel
import dagger.hilt.android.AndroidEntryPoint
import androidx.lifecycle.Observer

/*https://www.youtube.com/watch?v=zmgmvZqQcx0&list=PL4EnMCc01RC3i81My4kM2Cf9MZOMwOueo&index=11*/
@AndroidEntryPoint//Access all dependency
class MainActivity : AppCompatActivity() {
//    @Inject
private val myPostViewModel: MyPostViewModel by viewModels()
    //    lateinit var myMainClass:
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myPostViewModel.responce.observe(this, Observer {
            resources->
            Log.e("My Reponce----","$resources")
            var txt:TextView=findViewById(R.id.txt);
            txt.text="$resources"
            Toast.makeText(this,"$resources",Toast.LENGTH_SHORT).show()
        })

    }
}