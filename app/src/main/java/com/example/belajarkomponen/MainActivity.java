package com.example.belajarkomponen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button eventH = findViewById(R.id.Event_H);

        //bagian 1
        Spinner spinMakanan = findViewById(R.id.spin_makanan);
        Spinner spinHobi = findViewById(R.id.spin_hobi);
        TextView txtPilihanHobi = findViewById(R.id.text_spin);
        String makanan, hobi;

        List<String> listhobi = new ArrayList<String>();
        listhobi.add("Main Bola");
        listhobi.add("Menonton");
        listhobi.add("Mancing");
        listhobi.add("Makan");
        listhobi.add("Tidur");
        listhobi.add("Belajar");

//==================================================================================================

            //bagian 2
        ListView listMahasantri = findViewById(R.id.list_mahasantri);
        String[] mahasantri = new String[]{"budi","bodi","jodi","lobi","todi","rudi","yudi"};

//==================================================================================================


//--------------------------------------------------------------------------------------------------------------------------------
//bagian 1
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, listhobi);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinHobi.setAdapter(adapter);

        spinHobi.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String pilihanHobi =  spinHobi.getSelectedItem().toString();
                txtPilihanHobi.setText(pilihanHobi);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

//      -----------------------------------------------------------------------------------------------

//bagian 2
        ArrayAdapter adapterMahasantri = new ArrayAdapter(this, android.R.layout.simple_list_item_1, mahasantri);
        listMahasantri.setAdapter(adapterMahasantri);

        listMahasantri.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "ID : "+ (position + 1) + " " + mahasantri[position], Toast.LENGTH_SHORT).show();
            }
        });

//  -------------------------------------------------------------------------------------------------------------------------------------------

       eventH.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent eventH = new Intent(MainActivity.this, Event_Handlers.class );

               startActivity(eventH);
           }
       });

    }
}