package com.example.codercats.delegateadapters;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import com.example.codercats.delegateadapters.adapters.BaseAdapter;
import com.example.codercats.delegateadapters.adapters.CuteAnimalsAdapter;
import com.example.codercats.delegateadapters.models.Animal;
import com.example.codercats.delegateadapters.models.Cat;
import com.example.codercats.delegateadapters.models.Dog;
import com.example.codercats.delegateadapters.views.ViewType;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

import static com.example.codercats.delegateadapters.views.ViewTypes.CAT;

public class MainActivity extends AppCompatActivity implements BaseAdapter.OnItemSelectedListener {

    @BindView(R.id.mainactivity_recyclerview)
    RecyclerView mRecyclerView;

    private static final List<Animal> ANIMALS = new ArrayList<>();

    static {
        ANIMALS.add(new Cat());
        ANIMALS.add(new Cat());
        ANIMALS.add(new Dog());
        ANIMALS.add(new Cat());
        ANIMALS.add(new Cat());
        ANIMALS.add(new Dog());
        ANIMALS.add(new Cat());
        ANIMALS.add(new Cat());
        ANIMALS.add(new Cat());
        ANIMALS.add(new Dog());
        ANIMALS.add(new Cat());
        ANIMALS.add(new Cat());
    }

    private CuteAnimalsAdapter mCuteAnimalsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mCuteAnimalsAdapter = new CuteAnimalsAdapter(ANIMALS, this);

        ButterKnife.bind(this);

    }

    @Override
    public void onItemSelected(ViewType item) {
        switch (item.getViewType()) {
            case CAT:
                break;
            default:
        }
    }
}
