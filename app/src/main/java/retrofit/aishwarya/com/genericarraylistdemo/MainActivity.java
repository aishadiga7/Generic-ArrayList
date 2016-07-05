package retrofit.aishwarya.com.genericarraylistdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private Button mSample;
    private Button mSize;
    private EditText mNumber;
    private ArrayList<AnimalClass> mAnimalClasses = new ArrayList<AnimalClass>();
    private TextView mAnimalName;
    private TextView mRandomn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mSample = (Button) findViewById(R.id.sample);
        mSize = (Button) findViewById(R.id.arraylist_size);
        mRandomn = (TextView) findViewById(R.id.random);
        mNumber = (EditText) findViewById(R.id.number);
        mAnimalName = (TextView) findViewById(R.id.animal_name);
        mSample.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handleInput(mNumber.getText().toString());
            }
        });

        mSize.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Size:" +mAnimalClasses.size(), Toast.LENGTH_LONG).show();
            }
        });
    }

    private void handleInput(String number) {
        switch (Integer.parseInt(number)) {
            case AnimalClass.DOG:
                Dog dog = new Dog();
                mAnimalName.setText("DOG");
                mAnimalClasses.add(dog);
                mRandomn.setText(String.valueOf(dog.getItemType()));
                break;
            case AnimalClass.CAT:
                Cat cat   = new Cat();
                mAnimalName.setText("CAT");
                mAnimalClasses.add(cat);
                mRandomn.setText(String.valueOf(cat.getItemType()));
                break;
            case AnimalClass.LION:
                Lion lion  = new Lion();
                mAnimalName.setText("LION");
                mAnimalClasses.add(lion);
                mRandomn.setText(String.valueOf(lion.getItemType()));
                break;
            case AnimalClass.TIGER:
                Tiger tiger = new Tiger();
                mAnimalName.setText("TIGER");
                mAnimalClasses.add(tiger);
                mRandomn.setText(String.valueOf(tiger.getItemType()));
                break;
        }
    }
}
