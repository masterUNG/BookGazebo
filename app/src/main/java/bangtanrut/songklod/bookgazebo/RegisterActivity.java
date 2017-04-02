package bangtanrut.songklod.bookgazebo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText nameEditTex, surnameEditTex, idCradEditTex, addressEditTex, phoneEditTex, userEditTex, passwordEditTex;
    private Button button;
    private String nameString, surnameString, idCardString, addressString, phoneString, userString,
            passwordString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        //Initial View
        initialView();

        //button Controller
        button.setOnClickListener(RegisterActivity.this);

    }   // Main Method

    private void initialView() {
        nameEditTex = (EditText) findViewById(R.id.edtName);
        surnameEditTex = (EditText) findViewById(R.id.edtSurname);
        idCradEditTex = (EditText) findViewById(R.id.edtCard);
        addressEditTex = (EditText) findViewById(R.id.edtAddress);
        phoneEditTex = (EditText) findViewById(R.id.edtPhone);
        userEditTex = (EditText) findViewById(R.id.edtUser);
        passwordEditTex = (EditText) findViewById(R.id.edtPassword);
        button = (Button) findViewById(R.id.btnSave);

    }

    @Override
    public void onClick(View v) {

        MyAlert myAlert = new MyAlert(RegisterActivity.this);

        if (v == button) {
            //get value from Edit Text
            nameString = nameEditTex.getText().toString().trim();
            surnameString = surnameEditTex.getText().toString().trim();
            idCardString = idCradEditTex.getText().toString().trim();
            addressString = addressEditTex.getText().toString().trim();
            phoneString = phoneEditTex.getText().toString().trim();
            userString = userEditTex.getText().toString().trim();
            passwordString = passwordEditTex.getText().toString().trim();

            Log.d("2AprilV1", "idcard=" + idCardString);
            Log.d("2AprilV1", "length=" + idCardString.length());

            //check space
            if (nameString.equals("") ||
                    surnameString.equals("") ||
                    idCardString.equals("") ||
                    addressString.equals("") ||
                    phoneString.equals("") ||
                    userString.equals("") ||
                    passwordString.equals("")) {
                //Have space
                myAlert.myDialog(getResources().getString(R.string.title_HaveSpace),
                        getResources().getString(R.string.message_HaveSpace));

            } else if (idCardString.length() != 13) {
                //ID Card false
                myAlert.myDialog(getResources().getString(R.string.title_FalseIDcard),
                        getResources().getString(R.string.messge_FalseIDcard));
            } else {
                //Every Thing OK
                uploadValueToServer();


            }

        }

    }//onclick

    private void uploadValueToServer() {

        String tag = "2AprilV1";

        Log.d(tag, "Name ==>" + nameString);
        Log.d(tag, "Surname ==>" + surnameString);
        Log.d(tag, "idCard ==>" + idCardString);
        Log.d(tag, "Address ==>" + addressString);
        Log.d(tag, "Phone ==>" + phoneString);
        Log.d(tag, "User ==>" + userString);
        Log.d(tag, "Password ==>" + passwordString);

    }//upload
}   // Main Class
