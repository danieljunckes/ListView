package br.ifsc.edu.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.list_view);

        final ArrayList<String> lista_frutinhas = new ArrayList<>();
        lista_frutinhas.add("maça");
        lista_frutinhas.add("goiaba");
        lista_frutinhas.add("melancia");
        lista_frutinhas.add("uva");
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                lista_frutinhas
        );

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(MainActivity.this,lista_frutinhas.get(position), Toast.LENGTH_LONG).show();

                Intent intent = new Intent(MainActivity.this, ComponenteView.class);
                startActivity(intent);
            }
        });
    }
}
