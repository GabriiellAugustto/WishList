package br.com.etecia.wishlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;

import java.util.HashMap;
import java.util.List;

public class AdicionarActivity extends AppCompatActivity {

    private static final int CODE_POST_REQUEST = 1025;
    private static final int CODE_GET_REQUEST = 1024;

    EditText editText, editText1;
    Button button;
    boolean isUpdating = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.adicionar_layout);

        editText = findViewById(R.id.edidescricao);
        editText1 = findViewById(R.id.edidata);
        button = findViewById(R.id.buttonAdd);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isUpdating) {
                    updatelist();
                } else {
                    createlist();
                }
            }
        });
        readlist();
    }

    private void createlist() {
        String descricao = editText.getText().toString().trim();
        String data = editText1.getText().toString().trim();

        if (TextUtils.isEmpty(descricao)) {
            editText.setError("erro");
            editText.requestFocus();
            return;
        }
        if (TextUtils.isEmpty(data)) {
            editText1.setError("erro");
            editText1.requestFocus();
            return;
        }

        HashMap<String, String> params = new HashMap<>();
        params.put("descricao ", descricao);
        params.put("data", data);

        PerformNetworkRequest request = new PerformNetworkRequest(Api.URL_CREATE_LIST, params, CODE_POST_REQUEST);
        request.execute();
    }

    private void readlist() {
        PerformNetworkRequest request = new PerformNetworkRequest(Api.URL_READ_LIST, null, CODE_GET_REQUEST);
        request.execute();
    }

    private void updatelist() {
        String descricao = editText.getText().toString().trim();
        String data = editText1.getText().toString().trim();

        if (TextUtils.isEmpty(descricao)) {
            editText.setError("error");
            editText.requestFocus();
            return;
        }
        if (TextUtils.isEmpty(data)) {
            editText1.setError("error");
            editText1.requestFocus();
            return;
        }

        HashMap<String, String> params = new HashMap<>();
        params.put("descricao", descricao);
        params.put("data", data);

        PerformNetworkRequest request = new PerformNetworkRequest(Api.URL_UPDATE_LIST, params, CODE_POST_REQUEST);

        button.setText("Adicionar");

        editText.setText("");
        editText1.setText("");

        isUpdating = false;

    }

    private void delete(int id) {
        PerformNetworkRequest request = new PerformNetworkRequest(Api.URL_DELETE_LIST + id, null, CODE_GET_REQUEST);
        request.execute();
    }

    private class PerformNetworkRequest extends AsyncTask<Void, Void, String> {

        public PerformNetworkRequest(String urlUpdateList, HashMap<String, String> params, int codePostRequest) {

        }

        @Override
        protected String doInBackground(Void... voids) {
            return null;
        }
    }
}