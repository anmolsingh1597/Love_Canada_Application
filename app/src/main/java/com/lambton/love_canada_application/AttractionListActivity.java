package com.lambton.love_canada_application;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.lambton.love_canada_application.adapters.CanadaAttractionAdapter;
import com.lambton.love_canada_application.models.CanadaAttraction;

import java.util.ArrayList;

public class AttractionListActivity extends AppCompatActivity {

    private RecyclerView canadaAttractionListView;
    private ArrayList<CanadaAttraction> attractionList;
    private CanadaAttractionAdapter canadaAttractionAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attraction_list);
        intials();
    }
    public void intials(){
//        getSupportActionBar().hide();

        canadaAttractionListView = findViewById(R.id.rvAttractionList);
        populateAttractions();
        canadaAttractionAdapter = new CanadaAttractionAdapter(attractionList);
        RecyclerView.LayoutManager thisLayoutManager = new LinearLayoutManager(this,
                LinearLayoutManager.VERTICAL,
                false);
        canadaAttractionListView.setLayoutManager(thisLayoutManager);
        canadaAttractionListView.setAdapter(canadaAttractionAdapter);
    }

    public void populateAttractions(){
        attractionList = new ArrayList<>();
        attractionList.add(new CanadaAttraction( 1, "CN Tower", "290 Bremner Blvd", "Toronto", "Ontario", "On the shores of Lake Ontario in Canada's biggest city is the iconic CN Tower, one of Canada's most famous landmarks. The tower stands an impressive 553 meters high and dominates the skyline.", R.drawable.cn_tower));
        attractionList.add(new CanadaAttraction( 2, "Bay of Fundy", "New Brunswick", "Nova Scotia", "Maine", "The Bay of Fundy, located in Eastern Canada in between New Brunswick and Nova Scotia, is known for its amazing tides. The variation between high and low is the largest in the world, measuring up to a maximum of 19 meters (10 fathoms). While there are many ways to appreciate this natural wonder, some of the most popular locations and sights along the Bay of Fundy are the cliffs and rock formations at Hopewell Cape.", R.drawable.bay_of_fundy));
        attractionList.add(new CanadaAttraction( 3, "Stanley Park", " Vancouver, BC V6G 1Z4", "Vancouver", "British Columbia", "One of Vancouver's greatest treasures is the 405-hectare Stanley Park, conveniently located on the west side of the downtown area. Situated on a peninsula, the park is surrounded by the ocean and home to huge red cedar and Douglas fir trees. The seawall, which rings the park, has an extensive walking, jogging, and biking path with designated lanes for walkers and bikers.", R.drawable.stanley_park));
        attractionList.add(new CanadaAttraction( 4, "Calgary Stampede", "1410 Olympic Way SE", "Calgary", "Alberta", "This 10-day affair is one of the most widely anticipated events in Western Canada, with many locals and summertime travelers planning their holidays around the Calgary Stampede. For this week in July, the city of Calgary turns into a true western town, where people who might otherwise be wearing suits to work instead don jeans and cowboy boots.", R.drawable.calgary_stampede));
        attractionList.add(new CanadaAttraction( 5, "Niagara Falls", "6650 Niagara Parkway. (River Rd) Niagara Falls, ON L2G 0L0", "Toronto", "Ontario", "Niagara Falls is Canada's most famous natural attraction, bringing in millions of visitors each year. Located just over an hour's drive from Toronto, along the American border, these massive falls drop approximately 57 meters. You can see the falls at an astoundingly close distance from several key points.", R.drawable.niagara_falls));
        attractionList.add(new CanadaAttraction( 6, "Old Quebec", " St. Lawrence River", "Quebec City", "Province of Quebec", "Old Quebec is one of Canada's most popular historical areas and is well developed for tourism. In addition to the historical sites, other highlights include artists displaying their works on Rue du Trésor; interesting museums, like the Musée de la Civilisation; and unique shops and restaurants.", R.drawable.old_quebec));
        attractionList.add(new CanadaAttraction( 7, "Whistler", "North of Vancouver", "Vancouver", "British Columbia", "The village gained international attention in 2010 when it became one of the locations for the 2010 Winter Olympic Games. The area offers world class skiing, hotels, and dining, as well as a variety of outdoor recreational opportunities and beautiful mountain scenery.", R.drawable.whistler));
        attractionList.add(new CanadaAttraction( 8, "Ottawa's Parliament Hill", "banks of the Ottawa River in downtown", "Ottawa", "Ontario", "In the summer, the Changing of the Guard takes place on the front lawn of the Houses of Parliament, weather permitting. Below Parliament Hill, a lovely walk runs alongside the Ottawa River.", R.drawable.ottawa_parliament_hill));
        attractionList.add(new CanadaAttraction( 9, "Old Montreal", "Old Montreal's narrow cobblestone streets", "Montreal", "Quebec", "Old Montreal, lined with lovely historic buildings, is a place to go for great shopping and fine dining. While Montreal itself is a vibrant modern city, Old Montreal, down by the waterfront, is where most tourists come to soak up the atmosphere. Some of the must-see places in Old Montreal include Rue Bonsecours and the landmark Marché Bonsecours in the old town hall building, the interior of the beautiful Notre-Dame Basilica, the lively Place Jacques-Cartier, and the 1870s City Hall.", R.drawable.old_montreal));
        attractionList.add(new CanadaAttraction( 10, "Vancouver Island", "off Canada’s Pacific Coast", "Vancouver", "British Columbia", "Although it is less than a two-hour ferry ride from the mainland, Vancouver Island can seem a world away. Most people head to Victoria, BC's capital city, for sightseeing and culture, but if you head north into the wild and remote landscapes, the island holds some unexpected and unforgettable experiences. Nature lovers can hit the best hiking trails on Vancouver Island and set themselves up at some beautiful camping locations. Those looking for more comfort can always turn to one of the island's lodges or resorts.", R.drawable.vancouver_island));

    }
}
