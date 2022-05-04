package com.example.usea_app.home.more;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.usea_app.MainActivity;
import com.example.usea_app.R;
import com.example.usea_app.adapter.MyListAdapter;
import com.example.usea_app.home.account.EditInfo;

public class ActivityFaq extends AppCompatActivity {
    String[] question = {"1. ដើម្បីដាក់ពាក្យចូលរៀន តើនិស្សិតត្រូវភ្ជាប់ជាមួយឯកសារអ្វីខ្លះ?  ", "2. តើវគ្គសិក្សាថ្មីនិងចាប់ផ្ដើមចូលរៀននៅថ្ងៃណា?", "3. តើថ្នាក់បរិញ្ញាបត្រត្រូវរៀនប៉ុន្មានឆ្នាំ?", "4. តើសាលាកំណត់ថ្លៃសិក្សាដូចម្ដេចចំពោះសិស្សបរិញ្ញាបត្រ?", "5. តើសាលាកំណត់ឯកសណ្ឋានសិស្សិនិស្សិតដូចម្ដេច?"
            , "6.  តើសាលាមានការបញ្ចុះតម្លៃយ៉ាងដូចម្ដេចខ្លះ?", "7. តើសាកលវិទ្យាល័យមានមុខវិជំនាញអ្វីខ្លះ?", "8. តើថ្នាក់បរិញ្ញាបត្រជាន់ខ្ពស់មានមុខជំនាញអ្វីខ្លះ?", "9. ចំពោះការសិក្សាថ្នាក់បរិញ្ញាបត្រ តើនិស្សិតត្រូវសិក្សាប៉ុន្មានឆ្នាំ?", "10. តើសាលាមានទីតាំងនៅឯណា?"};
    String[] answer = {
            "1. លក្ខខណ្ឌក្នុការចុះឈ្មោះចូលរៀនថ្នាក់បរិញ្ញាបត្រនៅ USEA\n" + "-  សញ្ញាបត្របញ្ជាក់ជាប់បាក់ឌុប ២សន្លឹក\n" + "-  រូបថត ៣ x ៤ ៤សន្លឹក\n" + "-  រូបថត ៤ x ៦ ៣សន្លឹក ",
            "2. សម្រាប់ម៉ោងសិក្សា: ចន្ទ-\u200Bសៅរ៍ \n" + "វេនព្រឹក:\n" + "- (ចូលរៀនម៉ោង ៧:០០ ព្រឹក ដល់ ម៉ោង ១០:២៥ ព្រឹក)\n" + "វេនល្ងាច:\n" + "- (ចូលរៀនម៉ោង ៦:០០ ល្ងាច ដល់ ម៉ោង ៩:១៥ យប់)\n" +
                    "\n" + "សម្រាប់ម៉ោងសិក្សា: សៅរ៍-អាទិត្យ\n" + "ព្រឹក:\n" + "- (ចូលរៀនម៉ោង ៧:០០ ព្រឹក ដល់ ម៉ោង ១០:២៥ ព្រឹក)\n" + "ល្ងាច:\n" + "- (ចូលរៀនម៉ោង ២:០០ ព្រឹក ដល់ ម៉ោង ៥:០០ ល្ងាច)",
            "3. ចំពោះថ្នាក់បរិញ្ញាបត្រ យើងធ្វើការសិក្សារយៈពេល ៤ឆ្នាំទាំងអស់ លើកលែង តែមុខជំនាញស្ថាបត្យកម្ម ដែលត្រូវសិក្សារយៈពេល ៥ឆ្នាំ ។",
            "4. មហាវិទ្យាល័យ សេដ្ឋកិច្ច ពាណិជ្ជកម្ម និងទេសចរណ៍\t\t\t\t\n" +
                    "- ជំនាញ គ្រប់គ្រង $640\t\t\t\t\t\t\t\t\n" +
                    "- ជំនាញ ម៉ាឃីតធីង $640\t\t\t\t\t\t\t\n" +
                    "- ជំនាញ គណនេយ្យ និងសវនកម្ម $640\t\t\t\t\t\n" +
                    "- ជំនាញ ពាណិជ្ជកម្មអន្ដរជាតិ $640\t\t\t\t\t\n" +
                    "- ជំនាញ ហិរញ្ញវត្ថុ និងធនាគារ $640\t\t\t\t\t\n" +
                    "- ជំនាញ សេដ្ឋកិច្ចអន្ដរជាតិ $640\n" +
                    "- ជំនាញ គ្រប់គ្រងទេសចរណ៍អន្ដរជាតិ $640\n" +
                    "\n" +
                    "មហាវិទ្យាល័យ សេដ្ឋកិច្ច ពាណិជ្ជកម្ម និងទេសចរណ៍\n" +
                    "- ជំនាញ នីតិសាស្ដ្រ $640\n" +
                    "- ជំនាញ នីតិឯកជន $640\n" +
                    "- ជំនាញ នីតិអន្ដរជាតិ $640\n" +
                    "- ជំនាញ រដ្ឋបាលសាធារណៈ $640\n" +
                    "- ជំនាញ វិទ្យាសាស្ដ្រនយោបាយ និងទំនាក់ទំនងអន្ដរជាតិ $640\n" +
                    "\n" +
                    "មហាវិទ្យាល័យ វិទ្យាសាស្ដ្រ និងបច្ចេកវិទ្យា\n" +
                    "- ជំនាញ ព័ត៌មានវិទ្យា $690\t\t\t\t\t\t\t\t\n" +
                    "- ជំនាញ ស្ថាបត្យកម្ម $750\t\t\t\t\t\t\t\n" +
                    "- ជំនាញ វិស្វកម្មសំណង់ ស៊ីវិល $750\t\t\t\t\t\n" +
                    "- ជំនាញ គណិត្យវិទ្យា $640\t\t\t\t\t\n" +
                    "- ជំនាញ រូបវិទ្យា $640\t\t\t\t\t\n" +
                    "- ជំនាញ គីមីវិទ្យា $640\n" +
                    "\n" +
                    "មហាវិទ្យាល័យ សិល្បៈ មនុស្សសាស្ដ្រ និងអប់រំ\n" +
                    "- ជំនាញ អក្សរសាស្ដ្រខ្មែរ $640\n" +
                    "- ជំនាញ ប្រវត្តិវិទ្យា $640\n" +
                    "- ជំនាញ ទស្សនវិទ្យា $640\n" +
                    "- ជំនាញ គ្រប់គ្រងអប់រំ $640\n" +
                    "\n" +
                    "វិទ្យាស្ថានភាសាបរទេស\n" +
                    "- ជំនាញ បង្រៀនភាសាអង់គ្លេស $640\n" +
                    "- ជំនាញ បកប្រែភាសាអង់គ្លេស $640\n" +
                    "- ជំនាញ បង្រៀនភាសាអង់គ្លេសសម្រាប់កុមារ $640\n" +
                    "- ជំនាញ ភាសាអង់គ្លេសសម្រាប់ធុរកិច្ចអន្ដរជាតិ $640 ។\n",
            "5. តើសាលាកំណត់ឯកសណ្ឋានសិស្សិនិស្សិតដូចម្ដេច?\n" +
                    "ចំពោះឯកសាររបស់សាកលវិទ្យាល័យតម្រូវ ៖\n" +
                    "វេនព្រឹក\n" +
                    "- សិស្សស្រី  : ត្រូវពាក់អាវដៃខ្លី ពណ៍ផ្ទៃមេឃ សំពត់បត់ ត្រឹមជង្គង់ និងស្បែកជើង Loafers\n" +
                    "- សិស្សប្រុស : ត្រូវពាក់អាវដៃវែង ពណ៍ផ្ទៃមេឃ ខោជើងវែង\u200B ពណ៍ខៀវក្រម៉ៅ និងស្បែកជើងប៊ូ\n" +
                    "\n" +
                    "វេនល្ងាច\n" +
                    "- Free Style (សមរម្យ)",
            "6. ចំពោះការបញ្ចុះតម្លៃខាងសាលាធ្វើការបញ្ខុះតម្លៃតាមនិទ្ទេសរបស់សិស្ស ៖\n" +
                    "- និទ្ទេស A បញ្ចុះតម្លៃ ១០០% រយៈពេល ៤ឆ្នាំ\n" +
                    "- និទ្ទេស B បញ្ចុះតម្លៃ ៥០% រយៈពេល ២ឆ្នាំ\n" +
                    "- និទ្ទេស C បញ្ចុះតម្លៃ ២៥% រយៈពេល ២ឆ្នាំ\n" +
                    "- និទ្ទេស D បញ្ចុះតម្លៃ ២០% រយៈពេល ១ឆ្នាំ\n" +
                    "- និទ្ទេស E បញ្ចុះតម្លៃ ២០% រយៈពេល ១ឆ្នាំ\n",
            "7. មហាវិទ្យាល័យ សេដ្ឋកិច្ច ពាណិជ្ជកម្ម និងទេសចរណ៍\n" +
                    "                    - ជំនាញ គ្រប់គ្រង\n" +
                    "                    - ជំនាញ ម៉ាឃីតធីង\n" +
                    "                    - ជំនាញ គណនេយ្យ និងសវនកម្ម\n" +
                    "                    - ជំនាញ ពាណិជ្ជកម្មអន្ដរជាតិ\n" +
                    "                    - ជំនាញ ហិរញ្ញវត្ថុ និងធនាគារ\n" +
                    "                    - ជំនាញ សេដ្ឋកិច្ចអន្ដរជាតិ\n" +
                    "                    - ជំនាញ គ្រប់គ្រងទេសចរណ៍អន្ដរជាតិ\n" +
                    "                    \n" +
                    "មហាវិទ្យាល័យ សេដ្ឋកិច្ច ពាណិជ្ជកម្ម និងទេសចរណ៍\n" +
                    "                    - ជំនាញ នីតិសាស្ដ្រ\n" +
                    "                    - ជំនាញ នីតិឯកជន\n" +
                    "                    - ជំនាញ នីតិអន្ដរជាតិ\n" +
                    "                    - ជំនាញ រដ្ឋបាលសាធារណៈ\n" +
                    "                    - ជំនាញ វិទ្យាសាស្ដ្រនយោបាយ និងទំនាក់ទំនងអន្ដរជាតិ\n" +
                    "                    \n" +
                    "មហាវិទ្យាល័យ វិទ្យាសាស្ដ្រ និងបច្ចេកវិទ្យា\n" +
                    "                    - ជំនាញ ព័ត៌មានវិទ្យា\n" +
                    "                    - ជំនាញ ស្ថាបត្យកម្ម\n" +
                    "                    - ជំនាញ វិស្វកម្មសំណង់ ស៊ីវិល\n" +
                    "                    - ជំនាញ គណិត្យវិទ្យា\n" +
                    "                    - ជំនាញ រូបវិទ្យា\n" +
                    "                    - ជំនាញ គីមីវិទ្យា\n" +
                    "         \n" +
                    "                    មហាវិទ្យាល័យ សិល្បៈ មនុស្សសាស្ដ្រ និងអប់រំ\n" +
                    "                    - ជំនាញ អក្សរសាស្ដ្រខ្មែរ\n" +
                    "                    - ជំនាញ ប្រវត្តិវិទ្យា\n" +
                    "                   - ជំនាញ ទស្សនវិទ្យា\n" +
                    "                    - ជំនាញ គ្រប់គ្រងអប់រំ\n" +
                    "                   \n" +
                    "វិទ្យាស្ថានភាសាបរទេស\n" +
                    "                    - ជំនាញ បង្រៀនភាសាអង់គ្លេស\n" +
                    "                    - ជំនាញ បកប្រែភាសាអង់គ្លេស\n" +
                    "                    - ជំនាញ បង្រៀនភាសាអង់គ្លេសសម្រាប់កុមារ\n" +
                    "                    - ជំនាញ ភាសាអង់គ្លេសសម្រាប់ធុរកិច្ចអន្ដរជាតិ",
            "8. សម្រាប់ថ្នាក់បរិញ្ញាបត្រជាន់ខ្ពស់មានជំនាញដូចជា ៖\n" +
                    "- ព័ត៌មានវិទ្យា\n" +
                    "- គ្រប់គ្រង\n" +
                    "- គណនេយ្យ\n" +
                    "- រដ្ខបាលសាធារណៈ\n" +
                    "- ហិរញ្ញវត្ថុ និងធនាគារ\n" +
                    "- សេដ្ឋកិច្ច\n" +
                    "- គ្រប់គ្រងទេសចរណ៍ និងបដិសណ្ឋារកិច្ច\n" +
                    "- បង្រៀនភាសាអង់គ្លេស",
            "9. ចំពោះការសិក្សាថ្នាក់បរិញ្ញាបត្រនិស្សិតត្រូវសិក្សាប្រើរយៈពេល ៤ឆ្នាំគ្រប់មុខជំនាញ លើលែងតែជំនាញ ស្ថាបត្យកម្ម ដែលសិក្សាររយៈពេល ៥ឆ្នាំ",
            "10. សាកលវិទ្យាល័យ សៅស៍អ៊ីសថ៍អេយសៀមានទីតាំងស្ថិតនៅ ទល់មុខវិទ្យាល័យអង្គរ ក្រុងសៀមរៀប ខេត្តសៀមរាប",
    };
    ListView list_faq;

//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
//        // Inflate the layout for this fragment
//        View view = inflater.inflate(R.layout.fragment_activity_faq, container, false);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_activity_faq);

        getSupportActionBar().setTitle("                     FAQ");
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        list_faq = findViewById(R.id.list_faq);

        MyListAdapter myListAdapter = new MyListAdapter(ActivityFaq.this, question, answer);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(ActivityFaq.this,
                R.layout.list_view_color, question);
        list_faq.setAdapter(myListAdapter);
        list_faq.setAdapter(adapter);

        list_faq.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String str = list_faq.getAdapter().getItem(i).toString();

                Intent intent =  new Intent(ActivityFaq.this, DetailActivity.class);
                intent.putExtra("question", question[i]);
                intent.putExtra("answer", answer[i]);
                startActivity(intent);

            }
        });

//        return view;
    }
}