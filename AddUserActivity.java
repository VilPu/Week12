package com.example.week12;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;

import com.google.android.material.snackbar.Snackbar;

public class AddUserActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_user);
        EditText etFirstName, etLastName, etEmail;
    }

    public void addUser(View view) {
        RadioGroup rgDegreeType = findViewById(R.id.rgDegreeType);

        EditText etFirstName = findViewById(R.id.etFirstName);
        EditText etLastName = findViewById(R.id.etLastName);
        EditText etEmail = findViewById(R.id.etEmail);

        if (etFirstName.getText().toString().isEmpty() || etLastName.getText().toString().isEmpty() || etEmail.getText().toString().isEmpty()) {
            Snackbar mySnackBar = Snackbar.make(view, "Käyttäjää ei luotu.\nTäytä kaikki kohdat ennen luomista.", 3500);
            mySnackBar.show();
            return;
        }

        if(rgDegreeType.getCheckedRadioButtonId() == -1) {
            Snackbar mySnackBar = Snackbar.make(view, "Käyttäjää ei luotu.\nValitse opetus.", 3000);
            mySnackBar.show();
            return;
        }

        switch (rgDegreeType.getCheckedRadioButtonId()) {
            case R.id.rbComputerScience:
                UserStorage.getInstance().addUser(new User(etFirstName.getText().toString(), etLastName.getText().toString(), etEmail.getText().toString(), "Tietotekniikka"));
                break;

            case R.id.rbProductionEconomy:
                UserStorage.getInstance().addUser(new User(etFirstName.getText().toString(), etLastName.getText().toString(), etEmail.getText().toString(), "Tuotantotalous"));
                break;

            case R.id.rbComputationalTechnology:
                UserStorage.getInstance().addUser(new User(etFirstName.getText().toString(), etLastName.getText().toString(), etEmail.getText().toString(),  "Laskennallinen tekniikka"));
                break;

            case R.id.rbElectricalEngineering:
                UserStorage.getInstance().addUser(new User(etFirstName.getText().toString(), etLastName.getText().toString(), etEmail.getText().toString(),  "Sähkötekniikka"));
                break;

            default:
                break;

        }

        etFirstName.setText(null);
        etLastName.setText(null);
        etEmail.setText(null);
        rgDegreeType.clearCheck();
        Snackbar mySnackBar = Snackbar.make(view, "Käyttäjä luotu.", 2500);
        mySnackBar.show();

    }

}