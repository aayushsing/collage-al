// MainActivity.java
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView eventListView;
    private ArrayList<Event> eventList;
    private EventAdapter eventAdapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eventListView = findViewById(R.id.eventListView);
        eventList = new ArrayList<>();
        eventAdapter = new EventAdapter(this, eventList);
        eventListView.setAdapter(eventAdapter);

        // Populate eventList with data from API or local storage
        // For example:
        Event event1 = new Event("Event 1", "Description 1", "2024-05-10", "10:00 AM", "Academic");
        Event event2 = new Event("Event 2", "Description 2", "2024-05-12", "2:00 PM", "Cultural");
        Event event3 = new Event("Event 3", "Description 3", "2024-05-15", "3:00 PM", "Sports");
        Event event4 = new Event("Event 4", "Description 4", "2024-05-18", "11:00 AM", "Academic");
        Event event5 = new Event("Event 5", "Description 5", "2024-05-20", "1:00 PM", "Cultural");
        Event event6 = new Event("Event 6", "Description 6", "2024-05-22", "9:00 AM", "Sports");
        Event event7 = new Event("Event 7", "Description 7", "2024-05-25", "4:00 PM", "Academic");
        Event event8 = new Event("Event 8", "Description 8", "2024-05-28", "12:00 PM", "Cultural");
        Event event9 = new Event("Event 9", "Description 9", "2024-05-30", "2:00 PM", "Sports");
        Event event10 = new Event("Event 10", "Description 10", "2024-06-02", "10:00 AM", "Academic");
        Event event11 = new Event("Event 11", "Description 11", "2024-06-05", "3:00 PM", "Cultural");
        Event event12 = new Event("Event 12", "Description 12", "2024-06-08", "11:00 AM", "Sports");
        Event event13 = new Event("Event 13", "Description 13", "2024-06-10", "1:00 PM", "Academic");
        Event event14 = new Event("Event 14", "Description 14", "2024-06-12", "9:00 AM", "Cultural");
        Event event15 = new Event("Event 15", "Description 15", "2024-06-15", "4:00 PM", "Sports");

        eventList.add(event1);
        eventList.add(event2);
        eventList.add(event3);
        eventList.add(event4);
        eventList.add(event5);
        eventList.add(event6);
        eventList.add(event7);
        eventList.add(event8);
        eventList.add(event9);
        eventList.add(event10);
        eventList.add(event11);
        eventList.add(event12);
        eventList.add(event13);
        eventList.add(event14);
        eventList.add(event15);

        eventAdapter.notifyDataSetChanged();
    }
}

