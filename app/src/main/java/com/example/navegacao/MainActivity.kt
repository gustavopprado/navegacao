package com.example.navegacao

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    private lateinit var emailEditText: EditText
    private lateinit var passwordEditText: EditText
    private lateinit var loginButton: Button

    // Senha padrão
    private val senhaPadrao = "1234"

    //Função que lê os dados inseridos
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        emailEditText = findViewById(R.id.editTextTextEmailAddress)
        passwordEditText = findViewById(R.id.editTextNumberPassword)
        loginButton = findViewById(R.id.button)

        loginButton.setOnClickListener {
            irParaSegundaTela()
        }
    }

    //Função para ir para a outra tela quando clica no botão (caso a senha esteja correta)
    fun irParaSegundaTela() {
        if (passwordEditText.text.toString() == senhaPadrao) {
            // Senha correta, navega para a segunda tela
            val intent = Intent(this, telaDois::class.java)
            startActivity(intent)
        }
    }

    override fun onResume() {
        super.onResume()
        limparCampos()
    }

    private fun limparCampos() {
        emailEditText.text.clear()
        passwordEditText.text.clear()
    }
}
