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
import android.widget.Toast;


import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener,View.OnClickListener {
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
        butOk.setOnClickListener(this);
    }//end of onCreat

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

    @Override
    public void onClick(View v) {
        switch(rg.getCheckedRadioButtonId()){
            case R.id.radio_ant:
                imgPet.setImageResource(R.drawable.ant);break;
            case R.id.radio_cat:
                imgPet.setImageResource(R.drawable.cat);break;
            case R.id.radio_cobra:
                imgPet.setImageResource(R.drawable.cobra);break;
            case R.id.radio_dochi:
                imgPet.setImageResource(R.drawable.dochi);break;
            case R.id.radio_micat:
                imgPet.setImageResource(R.drawable.micat);break;
            default:
                Toast.makeText(this,"라디오버튼이 선택이 안됬군", Toast.LENGTH_SHORT).show();
        }
    }
}
