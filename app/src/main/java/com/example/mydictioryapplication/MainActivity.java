package com.example.mydictioryapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Мои хотелки
        // 1. Хочу загрузить activity_main.xml
        setContentView(R.layout.activity_main);

        // 2. Хочу управлять кнопкой
        Button myButton = findViewById(R.id.button);

        // 3. Завладеть вьюшкой для отображения результата
        TextView result = findViewById(R.id.textResult);

        // 4. Хочу слушателя на кнопку добавить
        myButton.setOnClickListener(v -> result.setText("Сейчас будет перевод. Только допишу код"));

    }

}