package com.hojihoji.software.hellosample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class HelloSampleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_sample);
        //表示ボタンであるButtonオブジェクトを取得
        Button btClick = findViewById(R.id.btClick);
        //削除ボタンであるButtonオブジェクトを取得
        Button btClear = findViewById(R.id.btClear);
        //リスナクラスのインスタンスを作成
        HelloListener hl = new HelloListener();
        //表示ボタンにリスナを設定
        btClick.setOnClickListener(hl);
        btClear.setOnClickListener(hl);

    }

    private class HelloListener implements View.OnClickListener{
        @Override
        public void onClick(View view){
            int id = view.getId();
            //名前入力欄であるEditTextを取得
            EditText input = findViewById(R.id.edName);
            //メッセージを表示するTextViewオブジェクトを取得
            TextView output= findViewById(R.id.tvOutput);
            switch (id){
                case R.id.btClick:
                    //入力された名前文字列を取得
                    String inputStr = input.getText().toString();
                    //メッセージを表示
                    output.setText(inputStr+"さん、こんにちは！");
                    break;
                case R.id.btClear:
                    output.setText("");
                    break;
            }


        }
    }
}
