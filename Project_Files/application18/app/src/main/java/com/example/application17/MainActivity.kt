package com.example.application17

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.ui.AppBarConfiguration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import android.view.Menu
import android.view.MenuItem
import android.view.View
import androidx.lifecycle.ViewModelProvider
import com.example.application17.R
import android.content.Intent
import android.util.Log
import android.widget.ImageView
import android.widget.TextView
import androidx.core.graphics.drawable.toBitmap
import com.example.application17.databinding.ActivityMainBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    private var layoutManager : RecyclerView.LayoutManager? = null
    private var adapter : RecyclerView.Adapter<RecyclerAdapter.ViewHolder>? = null
    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding

    private lateinit var viewModel : MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        //viewModel.shuffleCards()

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.addNameBtn.setOnClickListener {
            coroutineScope.launch(Dispatchers.Main) {
                randomCard()
            }
        }

        layoutManager = LinearLayoutManager(this)
        binding.recyclerView.layoutManager = layoutManager
        adapter = RecyclerAdapter(viewModel)
        binding.recyclerView.adapter = adapter
    }

    private val coroutineScope = CoroutineScope(Dispatchers.Main)

    suspend fun randomCard() {
        var launchTime = System.currentTimeMillis()
        var sleepTime = (0..10000).random().toLong()

        delay(sleepTime)
        var execTime = System.currentTimeMillis()
        var delayTime = (execTime - launchTime)

        var report = binding.enterName.text.toString()
        report = "The name is $report and the delay was $delayTime milliseconds"
        viewModel.addEntry(report)

        adapter?.notifyDataSetChanged()
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
}