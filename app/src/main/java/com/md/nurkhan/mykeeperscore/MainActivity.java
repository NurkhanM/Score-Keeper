package com.md.nurkhan.mykeeperscore;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText edtname;
    CheckBox checkBox1, checkBox2;
    TextView shetchik, nameShow, nachinkaShow, txtvybrano, kremShow, shokoShow, txtSum,
            txtPrice, txtPriceShet, som, kolShow, komentShow;
    int sh = 0;
    int many = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtname = (EditText) findViewById(R.id.edtName);
        checkBox1 = (CheckBox) findViewById(R.id.checkboxKrem);
        checkBox2 = (CheckBox) findViewById(R.id.checkboxShokolad);
        shetchik = (TextView) findViewById(R.id.txtShet);
        nameShow = (TextView) findViewById(R.id.txtNameShow);
        nachinkaShow = (TextView) findViewById(R.id.txtShow1);
        txtvybrano = (TextView) findViewById(R.id.txtShow2);
        txtSum = (TextView) findViewById(R.id.txtSum);
        kremShow = (TextView) findViewById(R.id.txtKremShow);
        shokoShow = (TextView) findViewById(R.id.txtShokoShow);
        txtPrice = (TextView) findViewById(R.id.txtPrice);
        txtPriceShet = (TextView) findViewById(R.id.txtPriceShet);
        som = (TextView) findViewById(R.id.som);
        kolShow = (TextView) findViewById(R.id.txtKolShow);
        komentShow = (TextView) findViewById(R.id.txtKomentShow);

        nameShow.setVisibility(View.INVISIBLE);
        nachinkaShow.setVisibility(View.INVISIBLE);
        kremShow.setVisibility(View.INVISIBLE);
        shokoShow.setVisibility(View.INVISIBLE);
        txtvybrano.setVisibility(View.INVISIBLE);
        txtPrice.setVisibility(View.INVISIBLE);
        txtPriceShet.setVisibility(View.INVISIBLE);
        som.setVisibility(View.INVISIBLE);
        kolShow.setVisibility(View.INVISIBLE);
        komentShow.setVisibility(View.INVISIBLE);
    }

    public void onClickShow(View view) {
        nameShow.setVisibility(View.VISIBLE);
        nachinkaShow.setVisibility(View.VISIBLE);
        kremShow.setVisibility(View.GONE);
        shokoShow.setVisibility(View.GONE);
        txtvybrano.setVisibility(View.VISIBLE);
        txtPrice.setVisibility(View.VISIBLE);
        txtPriceShet.setVisibility(View.VISIBLE);
        som.setVisibility(View.VISIBLE);
        kolShow.setVisibility(View.VISIBLE);
        komentShow.setVisibility(View.VISIBLE);


        String name = "" + edtname.getText();
        nameShow.setText(name);
        if (checkBox1.isChecked()) {
            kremShow.setText("Взбитый кремом");
            kremShow.setVisibility(View.VISIBLE);
        }
        if (checkBox2.isChecked()) {
            shokoShow.setText("Шоколадный");
            shokoShow.setVisibility(View.VISIBLE);
        }
        if (!checkBox1.isChecked() && !checkBox2.isChecked()) {
            kremShow.setText("Вы не выбрали начинку");
            kremShow.setVisibility(View.VISIBLE);
        }
//        else {
//            shokoShow.setVisibility(View.VISIBLE);
//            kremShow.setVisibility(View.VISIBLE);
//        }

        kolShow.setText(sh + "");
        txtPriceShet.setText(many + "");


    }

    @SuppressLint("SetTextI18n")
    public void onClickMinus(View view) {
        if (sh == 0) {
            Button btn = (Button) findViewById(R.id.btnMinus);
            btn.isEnabled();
        }
        if (sh > 0) {
            Button btn = (Button) findViewById(R.id.btnMinus);
            sh = sh - 1;
            shetchik.setText("" + sh);
            many = sh * 15;
            txtSum.setText("" + many);
        }


    }

    @SuppressLint("SetTextI18n")
    public void onClickPlus(View view) {
        sh = sh + 1;
        shetchik.setText("" + sh);
        many = sh * 15;
        txtSum.setText("" + many);
    }
}