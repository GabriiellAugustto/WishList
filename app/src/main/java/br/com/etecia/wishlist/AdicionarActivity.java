package br.com.etecia.wishlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AdicionarActivity extends AppCompatActivity {

    EditText editText,editText1;
    Button button;
    boolean isUpdating = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.adicionar_layout);

        editText=findViewById(R.id.edidescricao);
        editText1=findViewById(R.id.edidata);
        button=findViewById(R.id.buttonAdd);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isUpdating){updatelist();}
                else {createlist}

            }
        });
        
        public void createlist(){
            String descriçao = editText.getText().toString().trim();
            String data = editText1.getText().toString().trim();

            if (TextUtils.isEmpty(descriçao)){
                editText.setError("Erro");
                editText.requestFocus();
                return;
            }
            if (TextUtils.isEmpty(descriçao)){
                editText1.setError("Erro");
                editText1.requestFocus();
                return;
            }

            a





        }
    }
}