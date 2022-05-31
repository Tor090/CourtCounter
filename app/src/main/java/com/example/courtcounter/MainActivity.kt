package com.example.courtcounter

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    var teamAPoints = 0
    var teamBPoints = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun addOneForTeamA(v: View?) {
        teamAPoints += 1
        displayForTeamA()
    }


    fun addTwoForTeamA(v: View?) {
        teamAPoints += 2
        displayForTeamA()
    }


    fun addThreeForTeamA(v: View?) {
        teamAPoints += 3
        displayForTeamA()
    }


    fun displayForTeamA() {
        val scoreView = findViewById<TextView>(R.id.team_a_score)
        scoreView.text = teamAPoints.toString()
    }

    fun addOneForTeamB(v: View?) {
        teamBPoints +=1
        displayForTeamB()
    }


    fun addTwoForTeamB(v: View?) {
        teamBPoints +=2
        displayForTeamB()
    }


    fun addThreeForTeamB(v: View?) {
        teamBPoints +=3
        displayForTeamB()
    }


    fun displayForTeamB() {
        val scoreView = findViewById<TextView>(R.id.team_b_score)
        scoreView.text = teamBPoints.toString()
    }

    fun resetScore(v: View) {
        teamAPoints = 0
        teamBPoints = 0
        displayForTeamA()
        displayForTeamB()
    }
}