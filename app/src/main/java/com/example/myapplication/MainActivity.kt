package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.graphics.Color
import com.example.myapplication.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        val view = binding.root
        setContentView(view)


        val btnCalcular = binding.button
        val resultado = binding.result

        btnCalcular.setOnClickListener {
            val nota1:Int = Integer.parseInt(binding.nota1.text.toString())
            val nota2:Int = Integer.parseInt(binding.nota2.text.toString())

            val media:Int = (nota1 + nota2)/2
            val faltas:Int = Integer.parseInt(binding.faltas.text.toString())

            if(media >= 7 && faltas <= 15){
                resultado.setText("O Aluno(a) foi aprovado(a) com $media de media e $faltas faltas")
                resultado.setTextColor(Color.GREEN)
            }else{
                resultado.setText("O aluno foi reprovado com $media de media e $faltas faltas")
                resultado.setTextColor(Color.RED)
            }
        }

        }
    }





