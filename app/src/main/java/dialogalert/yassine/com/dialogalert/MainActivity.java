package dialogalert.yassine.com.dialogalert;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button mButton;
    private AlertDialog.Builder mDialog;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButton = (Button) findViewById(R.id.buttonID);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mDialog = new AlertDialog.Builder(MainActivity.this);

                mDialog.setTitle(getResources().getString(R.string.dialog_title));

                mDialog.setMessage(R.string.dialog_message);

                mDialog.setCancelable(false);

                mDialog.setIcon(android.R.drawable.btn_dialog);

                mDialog.setPositiveButton((R.string.positive_button),

                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                                MainActivity.this.finish();

                            }
                        });

                mDialog.setNegativeButton((R.string.negative_button),

                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                                mDialog.setCancelable(true);

                            }
                        });

                mDialog.create();

                mDialog.show();
            }
        });
    }
}
