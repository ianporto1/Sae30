package br.com.saecatalao.sae30;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class perfil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);

        Button voltarHome = findViewById(R.id.perfil_button_voltar);

        voltarHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        Button abrirPerfil = findViewById(R.id.perfil_button_dados);

        abrirPerfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent perfil = new Intent(perfil.this, Dados.class);
                startActivity(perfil);
            }
        });

        Button abrirQuitadas = findViewById(R.id.perfil_button_fatura);

        abrirQuitadas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent quitadas = new Intent(perfil.this, faturas_quitadas.class);
                startActivity(quitadas);
            }
        });

        Button abrirCertidao = findViewById(R.id.perfil_button_certidao);

        abrirCertidao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent certidao = new Intent(perfil.this, CertidaoPositiva.class);
                startActivity(certidao);
            }
        });

        Button abrirParcelamento = findViewById(R.id.perfil_button_parcelamento);

        abrirParcelamento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent parcelamento = new Intent(perfil.this, Parcelamento.class);
                startActivity(parcelamento);
            }
        });
    }


}
