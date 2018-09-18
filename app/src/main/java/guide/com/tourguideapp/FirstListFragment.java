package guide.com.tourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class FirstListFragment extends Fragment {

    private ListView listView;
    private PlaceAdapter mAdapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        LayoutInflater layoutInflater = getLayoutInflater();
        View view = layoutInflater.inflate(R.layout.fragment_first_place, container, false);

        listView = (ListView) view.findViewById(R.id.movies_list);
        ArrayList<Place> moviesList = new ArrayList<>();
        moviesList.add(new Place(R.drawable.yellowstone, getString(R.string.Yellowstone), getString(R.string.yellowstone)));
        moviesList.add(new Place(R.drawable.maui, getString(R.string.Maui), getString(R.string.maui)));
        moviesList.add(new Place(R.drawable.grand_canyon, getString(R.string.GrandCanyon), getString(R.string.grandCanyon)));
        moviesList.add(new Place(R.drawable.yosemite, getString(R.string.Yosemite), getString(R.string.yosemite)));
        moviesList.add(new Place(R.drawable.newyork, getString(R.string.NewYorkCity), getString(R.string.newYorkCity)));
        moviesList.add(new Place(R.drawable.son, getString(R.string.SanFrancisco), getString(R.string.sanFrancisco)));
        moviesList.add(new Place(R.drawable.washington, getString(R.string.Washington_D_C_), getString(R.string.Washington)));
        moviesList.add(new Place(R.drawable.honolulu, getString(R.string.Honolulu_Oahu), getString(R.string.honolulu_Oahu)));
        moviesList.add(new Place(R.drawable.boston_harbor, getString(R.string.Boston), getString(R.string.boston)));

        mAdapter = new PlaceAdapter(getActivity(), moviesList);
        listView.setAdapter(mAdapter);
        return view;
    }
}
