package ma.ensa.tp4recycle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import ma.ensa.tp4recycle.adapter.StarAdapter;
import ma.ensa.tp4recycle.beans.Star;
import ma.ensa.tp4recycle.service.StarService;

public class ListActivity extends AppCompatActivity {
    private List<Star> stars;
    private RecyclerView recyclerView;
    private StarAdapter starAdapter = null;
    private StarService service;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        stars = new ArrayList<>();
        service = StarService.getInstance();
        init();
        recyclerView = findViewById(R.id.recycle_view);
        starAdapter = new StarAdapter(this, service.findAll());
        recyclerView.setAdapter(starAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
    public void init(){
        service.create(new Star("Ariana Grande", "https://rnkr.tmsimg.com/assets/568557_v9_bd.jpg", 3.5f));
        service.create(new Star("George Clooney", "https://www.gala.fr/imgre/fit/http.3A.2F.2Fprd2-bone-image.2Es3-website-eu-west-1.2Eamazonaws.2Ecom.2Fprismamedia_people.2F2017.2F06.2F30.2F2249dbc4-7761-4990-87af-258d04ba95ee.2Ejpeg/2419x1677/quality/80/george-clooney.jpeg", 3));
        service.create(new Star("Michelle Rodriguez",
                "https://upload.wikimedia.org/wikipedia/commons/b/ba/Michelle_Rodriguez_2010.jpg", 5));
        service.create(new Star("George Clooney", "https://www.gala.fr/imgre/fit/http.3A.2F.2Fprd2-bone-image.2Es3-website-eu-west-1.2Eamazonaws.2Ecom.2Fprismamedia_people.2F2017.2F06.2F30.2F2249dbc4-7761-4990-87af-258d04ba95ee.2Ejpeg/2419x1677/quality/80/george-clooney.jpeg", 1));
        service.create(new Star("Louise Bouroin", "https://fr.web.img4.acsta.net/pictures/15/10/06/10/23/291029.jpg", 5));
        service.create(new Star("Louise Bouroin", "https://fr.web.img4.acsta.net/pictures/15/10/06/10/23/291029.jpg", 1));
    }
}
