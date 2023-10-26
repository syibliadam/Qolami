package com.example.qolami

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.qolami.databinding.ActivityMainBinding
import com.example.qolami.databinding.ActivityPracticeBinding

class PracticeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPracticeBinding
    private val list = ArrayList<Practice>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPracticeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rvPractice.setHasFixedSize(true)

        list.addAll(getList())
        showRecyclerList()
    }

    private fun getList(): ArrayList<Practice> {
        val dataName = resources.getStringArray(R.array.data_nama_pelajaran)
        val dataDescription = resources.getStringArray(R.array.data_deskripsi_pelajaran)
        val listTeam = ArrayList<Practice>()
        for (i in dataName.indices) {
            val practice = Practice(dataName[i], dataDescription[i])
            listTeam.add(practice)
        }
        return listTeam
    }

    private fun showRecyclerList(){
        binding.rvPractice.layoutManager = LinearLayoutManager(this)
        val listTeamAdapter = PracticeAdapter(list)
        binding.rvPractice.adapter = listTeamAdapter

        listTeamAdapter.setOnItemClickCallback(object : PracticeAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Practice) {
//                val intentToDetail = Intent(this@MainActivity, DetailActivity::class.java)
//                intentToDetail.putExtra("DATA", data)
//                startActivity(intentToDetail)
            }
        })
    }
}