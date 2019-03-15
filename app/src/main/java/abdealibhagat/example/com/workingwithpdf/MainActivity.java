package abdealibhagat.example.com.workingwithpdf;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button viewPDF;
    private Newfile nf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPDF = findViewById(R.id.viewPdf);
        viewPDF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(MainActivity.this, "Clicked", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(MainActivity.this, ViewPDFActivity.class);
                startActivity(i);
            }
        });
	System.out.println("HRISHI WAS HERE");
    }

}
