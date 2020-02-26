package com.yz.ecptsp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.widget.Toast;

import com.yz.encryptsp.R;
import com.yz.encryptsp.hawk.Hawk;
import com.yz.encryptsp.utils.AESEncryption;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Hawk.init(this).setEncryption(new AESEncryption()).build();
        long start = System.currentTimeMillis();
        Log.e("time:","start:"+start);
        Hawk.put("first","rewoiapotiowpitoewitogks;kag;lrewoiapotiowpitoewitogks;kag;ldag;ljrituut[wiqtkmzgzgojrtopa05487815rewoiapotiowpitoewitogks;kag;ldag;ljrituut[wiqtkmzgzgojrtopa05487815rewoiapotiowpitoewitogks;kag;ldag;ljrituut[wiqtkmzgzgojrtopa05487815dag;ljrituut[wiqtkmzgzgojrtopa05487815rewoiapotiowpitoewitogks;kag;ldag;ljrituut[wiqtkmzgzgojrtopa05487815rewoiapotiowpitoewitogks;kag;ldag;ljrituut[wiqtkmzgzgojrtopa05487815");
        long end = System.currentTimeMillis();
        Log.e("time:","end:"+end);
        Log.e("time:","total:"+(end-start));
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Toast.makeText(MainActivity.this,Hawk.get("first","default"),Toast.LENGTH_SHORT).show();
            }
        },1000);
    }
}
