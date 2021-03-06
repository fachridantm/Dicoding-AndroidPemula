package com.dicoding.iblteams

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatDelegate
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvTeams: RecyclerView
    private var list: ArrayList<Teams> = arrayListOf()
    private var title: String = "IBL Teams"

    companion object {
        fun start(context: Context) {
            Intent(context, MainActivity::class.java).apply {
                context.startActivity(this)
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (AppCompatDelegate.getDefaultNightMode() == AppCompatDelegate.MODE_NIGHT_YES) {
            setTheme(R.style.DarkTheme)
        } else {
            setTheme(R.style.AppTheme)
        }

        supportActionBar?.title = title

        rvTeams = findViewById(R.id.rv_teams)
        rvTeams.setHasFixedSize(true)

        list.addAll(TeamsData.listData)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        rvTeams.layoutManager = LinearLayoutManager(this)
        val listTeamAdapter = ListTeamsAdapter(list)
        rvTeams.adapter = listTeamAdapter
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_about, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.about_menu -> {
                val aboutMe = Intent(this@MainActivity, AboutMe::class.java)
                startActivity(aboutMe)
            }
        }
    }
}