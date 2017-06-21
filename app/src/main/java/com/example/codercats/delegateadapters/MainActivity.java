package com.example.codercats.delegateadapters;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.example.codercats.delegateadapters.adapters.BaseAdapter;
import com.example.codercats.delegateadapters.adapters.AnimalsAdapter;
import com.example.codercats.delegateadapters.models.Animal;
import com.example.codercats.delegateadapters.models.Cat;
import com.example.codercats.delegateadapters.models.Dog;
import com.example.codercats.delegateadapters.views.ViewType;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

import static com.example.codercats.delegateadapters.views.ViewTypes.CAT;
import static com.example.codercats.delegateadapters.views.ViewTypes.DOG;

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
        ANIMALS.add(new Dog());
        ANIMALS.add(new Cat());
        ANIMALS.add(new Cat());
        ANIMALS.add(new Dog());
    }

    private AnimalsAdapter mCuteAnimalsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        mCuteAnimalsAdapter = new AnimalsAdapter(getApplicationContext(), this);
        mCuteAnimalsAdapter.addItems(ANIMALS);
        mRecyclerView.setAdapter(mCuteAnimalsAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
    }

    @Override
    public void onItemSelected(ViewType item) {
        switch (item.getViewType()) {
            case CAT:
                Toast.makeText(this, "CAT", Toast.LENGTH_LONG).show();
                break;
            case DOG:
                Toast.makeText(this, "DOG", Toast.LENGTH_LONG).show();
                break;
            default:
        }
    }
}
