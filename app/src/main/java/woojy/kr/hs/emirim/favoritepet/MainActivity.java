package woojy.kr.hs.emirim.favoritepet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {
    CheckBox checkSelect;
    TextView textQuest;
    RadioGroup rg;
    RadioButton radioAnt,radioCat,radioCobra,radioDochi,radioMicat;
    Button butOk;
    ImageView imgPet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        checkSelect=(CheckBox)findViewById(R.id.check_select);
        textQuest=(TextView)findViewById(R.id.text_quest);
        rg=(RadioGroup)findViewById(R.id.rg);
        radioAnt= (RadioButton) findViewById(R.id.radio_ant);
        radioCat=(RadioButton) findViewById(R.id.radio_cat);
        radioCobra=(RadioButton)findViewById(R.id.radio_cobra);
        radioDochi=(RadioButton)findViewById(R.id.radio_dochi);
        radioMicat=(RadioButton)findViewById(R.id.radio_micat);
        butOk=(Button)findViewById(R.id.but_ok);
        imgPet=(ImageView)findViewById(R.id.img_pet);
        checkSelect.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        if(checkSelect.isChecked()) {
            textQuest.setVisibility(View.VISIBLE);
            rg.setVisibility(View.VISIBLE);
            butOk.setVisibility(View.VISIBLE);
            imgPet.setVisibility(View.VISIBLE);
        }
        else{
            textQuest.setVisibility(View.INVISIBLE);
            rg.setVisibility(View.INVISIBLE);
            butOk.setVisibility(View.INVISIBLE);
            imgPet.setVisibility(View.INVISIBLE);
        }
    }
}
