package mx.edu.utng.operation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Kast on 25/01/2017.
 */
public class Operation1 extends AppCompatActivity {

    private ImageView ivOperation;
    private EditText etX;
    private EditText etY;
    private Button btSolve;
    private TextView tvImpResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operation1);

        ivOperation = (ImageView)findViewById(R.id.iv_Operation);
        etX = (EditText)findViewById(R.id.x);
        etY = (EditText)findViewById(R.id.y);
        btSolve = (Button)findViewById(R.id.bt_solve);
        tvImpResult = (TextView)findViewById(R.id.tv_ImpResult);

        btSolve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int x = Integer.valueOf(etX.getText().toString());
                int y = Integer.valueOf(etY.getText().toString());
                int result =((6*(x*x)*(y))-(8*(x)*(y*y))/(2*(x)*(y)))+((x*x*x)+(2*(x*x)*(y*y*y))/((x*x)*(y*y)));
                tvImpResult.setText(""+result);
            }
        });

    }

}
