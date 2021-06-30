package com.example.mytiket;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TicketCheckoutActivity extends AppCompatActivity {
     Button btn_buy_ticket;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ticket_checkout);

        btn_buy_ticket = findViewById(R.id.btn_buy_ticket);
        btn_buy_ticket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotosuccesticket = new Intent(TicketCheckoutActivity.this,SuccesBuyTicketActivity.class);
                startActivity(gotosuccesticket);
            }
        });
    }
}