package sg.edu.rp.c346.practicalquiz;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 16043921 on 16/7/2018.
 */

public class CustomAdapter extends ArrayAdapter{

    Context parent_context;
    int layout_id;
    ArrayList<FormulaItem> formulaList;

    public CustomAdapter(@NonNull Context context, int resource, @NonNull  ArrayList<FormulaItem> objects) {
        super(context, resource, objects);
        parent_context = context;
        layout_id = resource;
        formulaList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        if(convertView == null) {
            LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(layout_id, parent, false);

        }

        TextView tvDescription = convertView.findViewById(R.id.textViewDesc);
        TextView tvFormula = convertView.findViewById(R.id.textViewFormula);
        TextView tvTitle = convertView.findViewById(R.id.textViewTitle);


        FormulaItem currentItem = formulaList.get(position);
        String title = currentItem.getTitle();
        String formula = currentItem.getFormula();
        String description = currentItem.getDescription();

        tvFormula.setText(formula);
        tvTitle.setText(title);
        tvDescription.setText(description);


        return convertView;
    }
}
