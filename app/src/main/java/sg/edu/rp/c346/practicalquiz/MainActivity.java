package sg.edu.rp.c346.practicalquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvFormula;

    ArrayList<FormulaItem> alFormula;
    CustomAdapter caFormula;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvFormula = findViewById(R.id.listViewFormula);

        alFormula = new ArrayList<>();

        FormulaItem item1 = new FormulaItem("Area of Rectangle","Length x Length","Formula type is: Area");
        FormulaItem item2 = new FormulaItem("Area of Triangle","(Length of base x Length)/2", "Formula type is: Area");
        FormulaItem item3 = new FormulaItem("Volume of cube","Length x Length x Cube", "Formula type is: Volume");

        alFormula.add(item1);
        alFormula.add(item2);
        alFormula.add(item3);

        caFormula = new CustomAdapter(this, R.layout.formula_item,alFormula);

        lvFormula.setAdapter(caFormula);

    }
}
