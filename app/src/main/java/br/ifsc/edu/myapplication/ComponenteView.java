package br.ifsc.edu.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Layout;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.view.View;
public class ComponenteView extends AppCompatActivity {
    TextView codigo;
    TextView explicacao;
    LinearLayout layout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_componente_view);

        Bundle bundle = getIntent().getExtras();
        String componente = bundle.getString("componente");

        layout = findViewById(R.id.layout_componente);
        codigo = findViewById(R.id.txtCodigo);
        explicacao = findViewById(R.id.txtExplicacao);

        if(componente.equals("botao")){
            Button botao = new Button(this);
            botao.setText("Botao");
            layout.addView(botao);
            explicacao.setText("O botão é um componente criado no xml da classe no qual pode" +
                    "ser instanciado na classe criando um componente button e pegando o valor do" +
                    "botão pelo findViewById(R.id.idDoBotao)");
            codigo.setText("Segue abaixo os componentes iniciais de um button:" +
                    " <Button\n" +
                    "            android:id=\"@+id/button\"\n" +
                    "            android:layout_width=\"wrap_content\"\n" +
                    "            android:layout_height=\"wrap_content\"\n" +
                    "            android:layout_weight=\"1\"\n" +
                    "            android:text=\"Button\" />");
        }
    }
}
