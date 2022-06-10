package com.example.coretanapps;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button onLampu = (Button) findViewById(R.id.onLampu);
        final Button offLampu = (Button) findViewById(R.id.offLampu);

        final Button onAc = (Button) findViewById(R.id.onAc);
        final Button offAc = (Button) findViewById(R.id.offAc);

        final Button onDestop = (Button) findViewById(R.id.onDestop);
        final Button offDestop = (Button) findViewById(R.id.offDestop);

        final Button onKomputer = (Button) findViewById(R.id.onKomputer);
        final Button offKomputer = (Button) findViewById(R.id.offKomputer);

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference refLampu = database.getReference("STATUS_LAMPU");
        DatabaseReference refAc = database.getReference("STATUS_AC");
        DatabaseReference refDestop = database.getReference("STATUS_DESTOP");
        DatabaseReference refKomputer = database.getReference("STATUS_KOMPUTER");

        refLampu.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if(dataSnapshot.exists()){
                    final long message = dataSnapshot.getValue(Long.class);

                    if(message==0){
                        offLampu.setVisibility(View.GONE);
                        onLampu.setVisibility(View.VISIBLE);
                    }else if(message==1){
                        onLampu.setVisibility(View.GONE);
                        offLampu.setVisibility(View.VISIBLE);
                    }
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });


        refAc.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if(dataSnapshot.exists()){
                    final long message = dataSnapshot.getValue(Long.class);

                    if(message==0){
                        offAc.setVisibility(View.GONE);
                        onAc.setVisibility(View.VISIBLE);
                    }else if(message==1){
                        onAc.setVisibility(View.GONE);
                        offAc.setVisibility(View.VISIBLE);
                    }
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });


        refDestop.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if(dataSnapshot.exists()){
                    final long message = dataSnapshot.getValue(Long.class);

                    if(message==0){
                        offDestop.setVisibility(View.GONE);
                        onDestop.setVisibility(View.VISIBLE);
                    }else if(message==1){
                        onDestop.setVisibility(View.GONE);
                        offDestop.setVisibility(View.VISIBLE);
                    }
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        refKomputer.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if(dataSnapshot.exists()){
                    final long message = dataSnapshot.getValue(Long.class);

                    if(message==0){
                        offKomputer.setVisibility(View.GONE);
                        onKomputer.setVisibility(View.VISIBLE);
                    }else if(message==1){
                        onKomputer.setVisibility(View.GONE);
                        offKomputer.setVisibility(View.VISIBLE);
                    }
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        onLampu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myref = database.getReference("STATUS_LAMPU");

                myref.setValue(1);
            }
        });

        offLampu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myref = database.getReference("STATUS_LAMPU");

                myref.setValue(0);
            }
        });

        onAc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myref = database.getReference("STATUS_AC");

                myref.setValue(1);
            }
        });

        offAc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myref = database.getReference("STATUS_AC");

                myref.setValue(0);
            }
        });

        onDestop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myref = database.getReference("STATUS_DESTOP");

                myref.setValue(1);
            }
        });

        offDestop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myref = database.getReference("STATUS_DESTOP");

                myref.setValue(0);
            }
        });


        onKomputer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myref = database.getReference("STATUS_KOMPUTER");

                myref.setValue(1);
            }
        });

        offKomputer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myref = database.getReference("STATUS_KOMPUTER");

                myref.setValue(0);
            }
        });

    }
}