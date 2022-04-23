package com.example.mymaps

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mymaps.models.Place
import com.example.mymaps.models.UserMap

const val EXTRA_USER_MAP= "EXTRA_USER_MAP"
private const val TAG = "MainActivity"
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val userMap= generateSampleData()
        val rvMaps :RecyclerView = findViewById(R.id.rvMaps)
        rvMaps.layoutManager = LinearLayoutManager(this)
        rvMaps.adapter = MapsAdapter(this, userMap,object :MapsAdapter.OnClickListener{
            override fun onItemClick(position: Int) {
                Log.i(TAG, "onItemClick $position")
                val intent = Intent(this@MainActivity,DisplayMapActivity::class.java)
                intent.putExtra(EXTRA_USER_MAP,userMap[position])
                startActivity(intent)
            }

        })
    }

    private fun generateSampleData(): List<UserMap> {
        return listOf(
            UserMap(
                "University of Colombo",
                listOf(
                    Place("University of Colombo", "", 6.900696572361065, 79.85875088458904),
                    //Place("Branner Hall", "Best dorm at Stanford", 37.426, -122.163),
                            )
            ),
            UserMap("Eastern University",
                listOf(
                    Place("Eastern University", "හිරු නැගෙන සරසවිය", 7.795552707205865, 81.57971448633928),

                )),
            UserMap("University of Jaffna",
                listOf(
                    Place("University of Jaffna", "",9.685130560617525, 80.02204130168016),

                )
            ),
            UserMap("University of Kelaniya",
                listOf(
                    Place("University of Kelaniya", "Faculty of Science",6.9739307464765465, 79.91573351433388),

                )
            ),
            UserMap("University of Moratuwa",
                listOf(
                    Place("University of Moratuwa", "",6.795140207694576, 79.90086810378112),

                )
            )
            ,
            UserMap("Open University",
                listOf(
                    Place("Open University", "",6.884516892573571, 79.88390126048137),

                    )
            ),
            UserMap("University of Peradeniya",
                listOf(
                    Place("University of Peradeniya", "",7.255050212602207, 80.59759526191067),

                    )
            ),
            UserMap("Rajarata University",
                listOf(
                    Place("Rajarata University", "",8.362241507536156, 80.50484362815929),

                    )
            ),
            UserMap("University of Ruhuna",
                listOf(
                    Place("University of Ruhuna", "",5.938492938020437, 80.5761714981882),

                    )
            ),
            UserMap("Sabaragamuwa University",
                listOf(
                    Place("Sabaragamuwa University", "",6.715127582967136, 80.78714654070068),

                    )
            ),
            UserMap("South Eastern University",
                listOf(
                    Place("South Eastern University", "",7.2973969810594514, 81.85001171715454),

                    )
            ),
            UserMap("University of Sri Jayewardenepura",
                listOf(
                    Place("University of Sri Jayewardenepura", "",6.853661635099881, 79.90332711788639),

                    )
            ),
            UserMap("Uva Wellassa University",
                listOf(
                    Place("Uva Wellassa University", "",6.98287477938474, 81.07619718405212),

                    )
            ),
            UserMap("University of the Visual and Performing Arts",
                listOf(
                    Place("University of the Visual and Performing Arts", "",6.910163164960349, 79.86252180750179),

                    )
            ),
            UserMap("Wayamba University",
                listOf(
                    Place("Wayamba University", "",6.795140207694576, 79.90086810378112),

                    )
            ),
            UserMap("Gampaha Wickramarachchi University",
                listOf(
                    Place("Gampaha Wickramarachchi University", "",7.090430853543245, 80.03660315854698),

                    )
            ),
            UserMap("University of Vavuniya",
                listOf(
                    Place("University of Vavuniya", "",8.758903701128759, 80.41066557144559),

                    )
            )

        )
    }
}