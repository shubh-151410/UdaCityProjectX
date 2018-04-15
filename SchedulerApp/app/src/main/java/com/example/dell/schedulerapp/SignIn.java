package com.example.dell.schedulerapp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.GoogleSignInResult;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.SignInButton;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

/**
 * Created by DELL on 07-04-2018.
 */

public class SignIn extends AppCompatActivity {

    Button b;
    EditText editText, editText1;
    FirebaseDatabase database;
    DatabaseReference reference;
    private GoogleApiClient googleApiClient;
    private GoogleSignInClient mGoogleSignInClient;
    private static final int REQ_CODE = 9001;

    SharedPreferences prefs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signin);
        prefs = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        database = FirebaseDatabase.getInstance();
        reference = database.getReference("users");
        b = (Button) findViewById(R.id.button4);
        editText = (EditText) findViewById(R.id.editText);
        editText1 = (EditText) findViewById(R.id.editText2);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String user = editText.getText().toString();
                final String passwd = editText1.getText().toString();
                if (user.isEmpty() || passwd.isEmpty()) {
                    Toast.makeText(SignIn.this, "Empty FIelds", Toast.LENGTH_SHORT).show();
                } else {
                    Query q = reference.orderByChild("username").equalTo(user); //We can order nodes by a common child key by passing that key to orderByChild(). For example, to read all dinosaurs ordered by height,
                    q.addListenerForSingleValueEvent(new ValueEventListener() {
                        @Override
                        public void onDataChange(DataSnapshot dataSnapshot) {      /*A DataSnapshot is an efficiently-generated immutable copy of the data at a Firebase*/
                            String spass = "";
                            String name = "";
                            for (DataSnapshot data : dataSnapshot.getChildren()) {
                                User usr = data.getValue(User.class);
                                spass = usr.getPassword();
                                name = usr.getName();
                            }
                            if (spass.equals(passwd)) {
                                Intent intent = new Intent(getApplicationContext(), HomePage.class);
                                intent.putExtra("USER_NAME", name);
                                startActivity(intent);
                            }
                        }
                        @Override
                        public void onCancelled(DatabaseError databaseError) {

                        }
                    });
                }
            }
        });
    }
}
