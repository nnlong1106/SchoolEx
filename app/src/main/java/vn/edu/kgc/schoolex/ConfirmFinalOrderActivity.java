package vn.edu.kgc.schoolex;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ConfirmFinalOrderActivity extends AppCompatActivity {

    private EditText txtName, txtPhone, txtAddress, txtCity;
    private Button confirmOrderBtn;

    private String totalPrice;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_confirm_final_order);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        totalPrice = getIntent().getStringExtra("Total Price");
        Toast.makeText(this, "Thành tiền = " + totalPrice,Toast.LENGTH_SHORT).show();

        confirmOrderBtn = (Button) findViewById(R.id.confirm_final_order_btn);
        txtName = (EditText) findViewById(R.id.shipment_name);
        txtPhone = (EditText) findViewById(R.id.shipment_phone);
        txtAddress = (EditText) findViewById(R.id.shipment_address);
        txtCity = (EditText) findViewById(R.id.shipment_city);
    }
}