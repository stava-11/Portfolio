package com.example.tic_tac_toe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button1: Button = findViewById(R.id.button)
        val button2: Button = findViewById(R.id.button2)
        val button3: Button = findViewById(R.id.button3)
        val button4: Button = findViewById(R.id.button4)
        val button5: Button = findViewById(R.id.button5)
        val button6: Button = findViewById(R.id.button6)
        val button7: Button = findViewById(R.id.button7)
        val button8: Button = findViewById(R.id.button8)
        val button9: Button = findViewById(R.id.button9)
        val buttonReset: Button = findViewById(R.id.buttonReset)

        val playerTurn = PlayerTurn()

        buttonReset.setOnClickListener {
            playerTurn.turn = true
            playerTurn.winnerP1 = false
            playerTurn.winnerP2 = false
            playerTurn.tie = false
            val resultTextView: TextView = findViewById(R.id.textView)
            resultTextView.text = getString(R.string.tic_tact_toe)
            playerTurn.b1 = 0
            playerTurn.b2 = 0
            playerTurn.b3 = 0
            playerTurn.b4 = 0
            playerTurn.b5 = 0
            playerTurn.b6 = 0
            playerTurn.b7 = 0
            playerTurn.b8 = 0
            playerTurn.b9 = 0
            button1.setBackgroundColor(ContextCompat.getColor(this, R.color.white))
            button1.isEnabled = true
            button1.isClickable = true
            button2.setBackgroundColor(ContextCompat.getColor(this, R.color.white))
            button2.isEnabled = true
            button2.isClickable = true
            button3.setBackgroundColor(ContextCompat.getColor(this, R.color.white))
            button3.isEnabled = true
            button3.isClickable = true
            button4.setBackgroundColor(ContextCompat.getColor(this, R.color.white))
            button4.isEnabled = true
            button4.isClickable = true
            button5.setBackgroundColor(ContextCompat.getColor(this, R.color.white))
            button5.isEnabled = true
            button5.isClickable = true
            button6.setBackgroundColor(ContextCompat.getColor(this, R.color.white))
            button6.isEnabled = true
            button6.isClickable = true
            button7.setBackgroundColor(ContextCompat.getColor(this, R.color.white))
            button7.isEnabled = true
            button7.isClickable = true
            button8.setBackgroundColor(ContextCompat.getColor(this, R.color.white))
            button8.isEnabled = true
            button8.isClickable = true
            button9.setBackgroundColor(ContextCompat.getColor(this, R.color.white))
            button9.isEnabled = true
            button9.isClickable = true
        }

        button1.setOnClickListener {
            playerMove(playerTurn.turn, button1)
            if(playerTurn.turn){
                playerTurn.b1 = 1
            } else {
                playerTurn.b1 = 2
            }
            playerTurn.checkWinner()
            winner(playerTurn,button1, button2, button3,
                button4, button5, button6, button7,
                button8, button9)
            playerTurn.turn = !playerTurn.turn
            button1.isEnabled = false
            button1.isClickable = false
        }
        button2.setOnClickListener {
            playerMove(playerTurn.turn, button2)
            if(playerTurn.turn){
                playerTurn.b2 = 1
            } else {
                playerTurn.b2 = 2
            }
            playerTurn.checkWinner()
            winner(playerTurn,button1, button2, button3,
                button4, button5, button6, button7,
                button8, button9)
            playerTurn.turn = !playerTurn.turn
            button2.isEnabled = false
            button2.isClickable = false
        }
        button3.setOnClickListener {
            playerMove(playerTurn.turn, button3)
            if(playerTurn.turn){
                playerTurn.b3 = 1
            } else {
                playerTurn.b3 = 2
            }
            playerTurn.checkWinner()
            winner(playerTurn,button1, button2, button3,
                button4, button5, button6, button7,
                button8, button9)
            playerTurn.turn = !playerTurn.turn
            button3.isEnabled = false
            button3.isClickable = false
        }
        button4.setOnClickListener {
            playerMove(playerTurn.turn, button4)
            if(playerTurn.turn){
                playerTurn.b4 = 1
            } else {
                playerTurn.b4 = 2
            }
            playerTurn.checkWinner()
            winner(playerTurn,button1, button2, button3,
                button4, button5, button6, button7,
                button8, button9)
            playerTurn.turn = !playerTurn.turn
            button4.isEnabled = false
            button4.isClickable = false
        }
        button5.setOnClickListener {
            playerMove(playerTurn.turn, button5)
            if(playerTurn.turn){
                playerTurn.b5 = 1
            } else {
                playerTurn.b5 = 2
            }
            playerTurn.checkWinner()
            winner(playerTurn,button1, button2, button3,
                button4, button5, button6, button7,
                button8, button9)
            playerTurn.turn = !playerTurn.turn
            button5.isEnabled = false
            button5.isClickable = false
        }
        button6.setOnClickListener {
            playerMove(playerTurn.turn, button6)
            if(playerTurn.turn){
                playerTurn.b6 = 1
            } else {
                playerTurn.b6 = 2
            }
            playerTurn.checkWinner()
            winner(playerTurn,button1, button2, button3,
                button4, button5, button6, button7,
                button8, button9)
            playerTurn.turn = !playerTurn.turn
            button6.isEnabled = false
            button6.isClickable = false
        }
        button7.setOnClickListener {
            playerMove(playerTurn.turn, button7)
            if(playerTurn.turn){
                playerTurn.b7 = 1
            } else {
                playerTurn.b7 = 2
            }
            playerTurn.checkWinner()
            winner(playerTurn,button1, button2, button3,
                button4, button5, button6, button7,
                button8, button9)
            playerTurn.turn = !playerTurn.turn
            button7.isEnabled = false
            button7.isClickable = false
        }
        button8.setOnClickListener {
            playerMove(playerTurn.turn, button8)
            if(playerTurn.turn){
                playerTurn.b8 = 1
            } else {
                playerTurn.b8 = 2
            }
            playerTurn.checkWinner()
            winner(playerTurn,button1, button2, button3,
                button4, button5, button6, button7,
                button8, button9)
            playerTurn.turn = !playerTurn.turn
            button8.isEnabled = false
            button8.isClickable = false
        }
        button9.setOnClickListener {
            playerMove(playerTurn.turn, button9)
            if(playerTurn.turn){
                playerTurn.b9 = 1
            } else {
                playerTurn.b9 = 2
            }
            playerTurn.checkWinner()
            winner(playerTurn,button1, button2, button3,
                button4, button5, button6, button7,
                button8, button9)
            playerTurn.turn = !playerTurn.turn

            button9.isEnabled = false
            button9.isClickable = false
        }

    }

    private fun winner(playerTurn: PlayerTurn, button1: Button, button2: Button, button3: Button,
                       button4: Button, button5: Button, button6: Button, button7: Button,
                       button8: Button, button9: Button) {
        if (playerTurn.winnerP1){
            val resultTextView: TextView = findViewById(R.id.textView)
            resultTextView.text = getString(R.string.player1Winner)
            button1.isEnabled = false
            button1.isClickable = false
            button2.isEnabled = false
            button2.isClickable = false
            button3.isEnabled = false
            button3.isClickable = false
            button4.isEnabled = false
            button4.isClickable = false
            button5.isEnabled = false
            button5.isClickable = false
            button6.isEnabled = false
            button6.isClickable = false
            button7.isEnabled = false
            button7.isClickable = false
            button8.isEnabled = false
            button8.isClickable = false
            button9.isEnabled = false
            button9.isClickable = false
        } else if(playerTurn.winnerP2){
            val resultTextView: TextView = findViewById(R.id.textView)
            resultTextView.text = getString(R.string.player2Winner)
            button1.isEnabled = false
            button1.isClickable = false
            button2.isEnabled = false
            button2.isClickable = false
            button3.isEnabled = false
            button3.isClickable = false
            button4.isEnabled = false
            button4.isClickable = false
            button5.isEnabled = false
            button5.isClickable = false
            button6.isEnabled = false
            button6.isClickable = false
            button7.isEnabled = false
            button7.isClickable = false
            button8.isEnabled = false
            button8.isClickable = false
            button9.isEnabled = false
            button9.isClickable = false
        } else if(playerTurn.tie){
            val resultTextView: TextView = findViewById(R.id.textView)
            resultTextView.text = getString(R.string.tie)
        }
    }

    private fun playerMove(turn: Boolean, button: Button) {
        if(turn){
            button.setBackgroundResource(R.drawable.tic_tac_toe_x)
        } else {
            button.setBackgroundResource(R.drawable.tic_tac_toe_o)
        }
    }

//
}

class PlayerTurn {
    var turn: Boolean = true
        get() = field                     // getter
        set(value) { field = value }      // setter

    var b1: Int = 0
        get() = field                     // getter
        set(value) { field = value }      // setter

    var b2: Int = 0
        get() = field                     // getter
        set(value) { field = value }      // setter

    var b3: Int = 0
        get() = field                     // getter
        set(value) { field = value }      // setter

    var b4: Int = 0
        get() = field                     // getter
        set(value) { field = value }      // setter

    var b5: Int = 0
        get() = field                     // getter
        set(value) { field = value }      // setter

    var b6: Int = 0
        get() = field                     // getter
        set(value) { field = value }      // setter

    var b7: Int = 0
        get() = field                     // getter
        set(value) { field = value }      // setter

    var b8: Int = 0
        get() = field                     // getter
        set(value) { field = value }      // setter

    var b9: Int = 0
        get() = field                     // getter
        set(value) { field = value }      // setter

    var winnerP1: Boolean = false
        get() = field                     // getter
        set(value) { field = value }      // setter

    var winnerP2: Boolean = false
        get() = field                     // getter
        set(value) { field = value }      // setter

    var tie: Boolean = false
        get() = field                     // getter
        set(value) { field = value }      // setter


    private fun horWin(b1: Int, b2: Int, b3: Int, b4: Int, b5: Int, b6: Int,
                       b7: Int, b8: Int, b9: Int) {
        if((b1 == 2 && b2 == 2 && b3 == 2) || (b4 == 2 && b5 == 2 && b6 == 2) || (b7 == 2 && b8 == 2 && b9 == 2)){
            this.winnerP2 = true
        } else if((b1 == 1 && b2 == 1 && b3 == 1) || (b4 == 1 && b5 == 1 && b6 == 1) || (b7 == 1 && b8 == 1 && b9 == 1)) {
            this.winnerP1 = true
        }
    }

    private fun verWin(b1: Int, b2: Int, b3: Int, b4: Int, b5: Int, b6: Int,
                       b7: Int, b8: Int, b9: Int) {
        if((b1 == 2 && b4 == 2 && b7 == 2) || (b2 == 2 && b5 == 2 && b8 == 2) || (b3 == 2 && b6 == 2 && b9 == 2)){
            this.winnerP2 = true
        } else if((b1 == 1 && b4 == 1 && b7 == 1) || (b2 == 1 && b5 == 1 && b8 == 1) || (b3 == 1 && b6 == 1 && b9 == 1)) {
            this.winnerP1 = true
        }
    }

    private fun diaWin(b1: Int, b2: Int, b3: Int, b4: Int, b5: Int, b6: Int,
                       b7: Int, b8: Int, b9: Int) {
        if((b1 == 2 && b5 == 2 && b9 == 2) || (b3 == 2 && b5 == 2 && b7 == 2)){
            this.winnerP2 = true
        } else if((b1 == 1 && b5 == 1 && b9 == 1) || (b3 == 1 && b5 == 1 && b7 == 1)) {
            this.winnerP1 = true
        }
    }

    private fun tieWin(b1: Int, b2: Int, b3: Int, b4: Int, b5: Int, b6: Int,
                       b7: Int, b8: Int, b9: Int) {
        if(b1>0 && b2>0 && b3>0 && b4>0 && b5>0 && b6>0 && b7>0 && b8>0 && b9>0
            && this.winnerP1 == false && this.winnerP2 == false){
            this.tie = true
        }
    }

    fun checkWinner() {
        this.horWin(this.b1, this.b2, this.b3, this.b4, this.b5, this.b6, this.b7, this.b8, this.b9)
        this.verWin(this.b1, this.b2, this.b3, this.b4, this.b5, this.b6, this.b7, this.b8, this.b9)
        this.diaWin(this.b1, this.b2, this.b3, this.b4, this.b5, this.b6, this.b7, this.b8, this.b9)
        this.tieWin(this.b1, this.b2, this.b3, this.b4, this.b5, this.b6, this.b7, this.b8, this.b9)
    }


}

