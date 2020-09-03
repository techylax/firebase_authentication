package sat.test.lax;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class CategoryFragment extends Fragment {


    public CategoryFragment() {
        // Required empty public constructor
    }
  private GridView catView;
  private List<CategoryModel> catList = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_category, container, false);
        catView = view.findViewById(R.id.cat_Grid);
        loadCategories();
  CategoryAdapter adapter = new CategoryAdapter(catList);
  catView.setAdapter(adapter);


        return view;
    }

    private  void loadCategories()
    {
        catList.clear();

        catList.add(new CategoryModel("1","Reading",20));
        catList.add(new CategoryModel("2","Writing",20));
        catList.add(new CategoryModel("3","Vocabulary",20));
        catList.add(new CategoryModel("4","Maths Calculator",20));
        catList.add(new CategoryModel("5","Maths No Calculator",20));
        catList.add(new CategoryModel("6","Additional Maths",20));


    }
}
