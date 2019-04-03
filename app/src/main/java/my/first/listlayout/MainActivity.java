package my.first.listlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView simpleListView;
    String countryNameList[] = {"Bangladesh", "Japan", "China", "Italy", "France"};
//    private ListView simpleListview;
//    private String nameList[] = {"Anik", "Akib", "Delwar", "Aleya", "Anisha", "Tasnim","Anik", "Akib", "Delwar", "Aleya", "Anisha", "Tasnim","Anik", "Akib", "Delwar", "Aleya", "Anisha", "Tasnim"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        simpleListView = findViewById(R.id.simpleListView);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.listview, R.id.textView, countryNameList);
        simpleListView.setAdapter(arrayAdapter);
//        simpleListview = findViewById(R.id.simpleListView);
//        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.listview, R.id.textView, nameList);
//        simpleListview.setAdapter(arrayAdapter);
    }
}
