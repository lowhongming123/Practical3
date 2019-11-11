package com.example.practical3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), AdapterView.OnItemClickListener {
    override fun onItemClick(parent: AdapterView<*>?,
                             view: View?,
                             position: Int,
                             id: Long) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        spinnerAge.setOnItemClickListener(this)

        buttonCalculate.setOnClickListener{
            calculatePremium()
        }
    }

    private fun calculatePremium() {
        val position=spinnerAge.selectedItemPosition
        val gender=RadioGroupGender.checkedRadioButtonId

        var premium:Int

        if(position==1){
            premium=60
        }else if(position==2){
            premium=70
        }else if(position==3){
            premium=90
        }else if(position==4){
            premium=120
        }else if(position==5){
            premium=150
        }else if(position==6){
            premium=150
        }

        if(gender == R.id.radioButtonMale){

        }

        if(checkBoxSmoker.isChecked){

        }
    }
}
