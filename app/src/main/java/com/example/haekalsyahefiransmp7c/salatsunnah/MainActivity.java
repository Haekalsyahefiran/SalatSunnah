package com.example.haekalsyahefiransmp7c.salatsunnah;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView tahajjud,witir,rawatib,dhuha,istikhoroh,tahiyyatul_masjid,syuruq;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tahajjud = findViewById(R.id.tahajjjud);
        witir= findViewById(R.id.witir);
        rawatib = findViewById(R.id.rawatib);
        dhuha = findViewById(R.id.dhuha);
        istikhoroh = findViewById(R.id.istikhorah);
        tahiyyatul_masjid = findViewById(R.id.tahiyyatul_masjid);
        syuruq = findViewById(R.id.syuruk);

        tahajjud.setOnClickListener(this);
        witir.setOnClickListener(this);
        rawatib.setOnClickListener(this);
        dhuha.setOnClickListener(this);
        istikhoroh.setOnClickListener(this);
        tahiyyatul_masjid.setOnClickListener(this);
        syuruq.setOnClickListener(this);






    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.tahajjjud:
                Intent tahajjud = new Intent(MainActivity.this, Deskripsi.class);
                tahajjud.putExtra("sunnah", "https://wisatanabawi.com/sholat-tahajud/");
                startActivity(tahajjud);
                break;
            case R.id.witir:
                Intent witir = new Intent(MainActivity.this, Deskripsi.class);
                witir.putExtra("sunnah", "https://id.wikipedia.org/wiki/Salat_Witir");
                startActivity(witir);
                break;
            case R.id.rawatib:
                Intent rawatib = new Intent(MainActivity.this, Deskripsi.class);
                rawatib.putExtra("sunnah", "https://id.wikipedia.org/wiki/Salat_Rawatib");
                startActivity(rawatib);
                break;
            case R.id.dhuha:
                Intent dhuha = new Intent(MainActivity.this, Deskripsi.class);
                dhuha.putExtra("sunnah", "https://id.wikipedia.org/wiki/Salat_Dhuha");
                startActivity(dhuha);
                break;
            case R.id.istikhorah:
                Intent istikhoroh = new Intent(MainActivity.this, Deskripsi.class);
                istikhoroh.putExtra("sunnah", "https://id.wikipedia.org/wiki/Salat_Tahajud");
                startActivity(istikhoroh);
                break;
            case R.id.tahiyyatul_masjid:
                Intent tahiyyatulmasjid = new Intent(MainActivity.this, Deskripsi.class);
                tahiyyatulmasjid.putExtra("sunnah", "https://muslim.or.id/18829-shalat-tahiyatul-masjid.html");
                startActivity(tahiyyatulmasjid);
                break;
            case R.id.syuruk:
                Intent syuruk = new Intent(MainActivity.this, Deskripsi.class);
                syuruk.putExtra("sunnah", "https://aitarus.com/sholat-syuruq-isyraq/");
                startActivity(syuruk);
                break;

        }

    }
}
