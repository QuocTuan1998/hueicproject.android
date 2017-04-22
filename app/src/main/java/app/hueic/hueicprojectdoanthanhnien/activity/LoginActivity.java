package app.hueic.hueicprojectdoanthanhnien.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import app.hueic.hueicprojectdoanthanhnien.R;

public class LoginActivity extends AppCompatActivity {
    //Khai báo EditText
    private EditText edUserName, edPassWord;
    //Khai báo CheckBox
    private CheckBox chkSaveInfor;
    //Khai báo Button
    private Button btnLogin, btnRegistry;
    //Khai báo TextView
    private TextView tvForgotPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        //findViewById
        addControls();
        //handleEvent
        addEvents();
    }

    private void addEvents() {
        //xu ly su kien
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, ActionActivity.class);
                startActivity(intent);
            }
        });
        btnRegistry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, ScannerActivity.class);
                startActivity(intent);
            }
        });
    }

    private void addControls() {
        //EditText
        edUserName = (EditText) this.findViewById(R.id.edTaiKhoan);
        edPassWord = (EditText) this.findViewById(R.id.edMatKhau);
        //CheckBox
        chkSaveInfor = (CheckBox) this.findViewById(R.id.chkGhiNho);
        //Button
        btnLogin = (Button) this.findViewById(R.id.btnDangNhap);
        btnRegistry = (Button) this.findViewById(R.id.btnDangKy);
        //TextView
        tvForgotPassword = (TextView) this.findViewById(R.id.tvQuenMatKhau);
    }
}
