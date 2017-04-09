package net.bezza.vinoteka;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.LightingColorFilter;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Petr on 26.12.2016.
 */

public class Act_Main extends Activity {

    SharedPreferences sharedPreferences;
    SharedPreferences.Editor spEditor;//There is one sharepreference(one key) for every wine slot
    String wine_type;//This value is saved to shared preferences and is in alertdialogs
    TextView tv_desc;

    Button btn_1, btn_2, btn_3,btn_4,btn_5,btn_6,btn_7,btn_8, btn_9, btn_10,
            btn_11,btn_12,btn_13,btn_14,btn_15,btn_16,btn_17,btn_18,btn_19,btn_20,
            btn_21,btn_22,btn_23,btn_24,btn_25,btn_26,btn_27,btn_28,btn_29,btn_30,
            btn_31,btn_32,btn_33,btn_34,btn_35,btn_36,btn_37,btn_38,btn_39,btn_40,
            btn_41,btn_42,btn_43,btn_44,btn_45,btn_46,btn_47,btn_48,btn_49,btn_50,
            btn_51,btn_52,btn_53,btn_54,btn_55,btn_56;//Wine slots

    AlertDialog.Builder aDialogBuilder;//Menu for setting wine type (or removing)
    AlertDialog alert;
    Context context;//Activity context

    //Constants - Types of wine and tags. Also some are used as key for sharedPreferences.
    final String ALERT_DIALOG_TITLE = "Přidat/Odebrat víno";
    final String WINE_PREFERENCES = "wine_preferences";
    final String WINE_TYPE_NONE = "Odebrat";
    final String TAG_WINE_TYPE_NONE = "";
    final String WINE_TYPE_0 = "Moravčík, Sauvignon";
    final String TAG_WINE_TYPE_0 = "S";
    final String WINE_TYPE_1 = "Moravčík, Tramín Červený";
    final String TAG_WINE_TYPE_1 = "TČ";
    final String WINE_TYPE_2 = "Moravčík, Pálava";
    final String TAG_WINE_TYPE_2 = "P";
    final String WINE_TYPE_3= "Moravčík, Ryzlink Rýnský";
    final String TAG_WINE_TYPE_3 = "RR";
    final String WINE_TYPE_4 = "Paulus, Chardonnay";
    final String TAG_WINE_TYPE_4 = "CH";
    final String WINE_TYPE_5= "Paulus, Sauvignon";
    final String TAG_WINE_TYPE_5 = "S";
    final String WINE_TYPE_6 = "Paulus, Pálava";
    final String TAG_WINE_TYPE_6 = "P";
    final String WINE_TYPE_7= "Popela Perná, Pálava";
    final String TAG_WINE_TYPE_7 = "P";
    final String WINE_TYPE_8 = "Topolánsky, Sauvignon";
    final String TAG_WINE_TYPE_8 = "S";
    final String WINE_TYPE_9= "Topolánský, Ryzlink Rýnský";
    final String TAG_WINE_TYPE_9 = "RR";
    final String WINE_TYPE_10 = "Vinařství Mikulský, Rulandské Šedé";
    final String TAG_WINE_TYPE_10 = "RŠ";
    final String WINE_TYPE_11 = "Vinařství Mikulský, Chardonnay";
    final String TAG_WINE_TYPE_11 = "CH";
    final String WINE_TYPE_12 = "Šilinek, Chardonnay";
    final String TAG_WINE_TYPE_12 = "CH";
    final String WINE_TYPE_13 = "Šilinek, André";
    final String TAG_WINE_TYPE_13 = "A";
    final String WINE_TYPE_14 = "Šilinek, Ryzlink Rýnský";
    final String TAG_WINE_TYPE_14 = "RR";
    final String WINE_TYPE_15 = "Šilinek, Sauvignon (PS)";
    final String TAG_WINE_TYPE_15 = "S(P)";
    final String WINE_TYPE_16 = "Šilinek, Sauvignon (JAK)";
    final String TAG_WINE_TYPE_16 = "S(J)";
    final String WINE_TYPE_17 = "Darované víno";
    final String TAG_WINE_TYPE_17 = "D";
    final String[] WINE_LIST = new String[]{WINE_TYPE_NONE, WINE_TYPE_12, WINE_TYPE_13,
            WINE_TYPE_14, WINE_TYPE_15, WINE_TYPE_16, WINE_TYPE_0, WINE_TYPE_1,
            WINE_TYPE_2, WINE_TYPE_3, WINE_TYPE_4, WINE_TYPE_5, WINE_TYPE_6,
            WINE_TYPE_7, WINE_TYPE_8, WINE_TYPE_9, WINE_TYPE_10, WINE_TYPE_11,
             WINE_TYPE_17};//Pár vín přeházeno, kvůli frekventovanosti šilinka ve vinotéce

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_main);

        context = this;

        sharedPreferences = getSharedPreferences(WINE_PREFERENCES,Context.MODE_PRIVATE);
        spEditor = sharedPreferences.edit();

        initView();
        initViewClickListener();
        initViewFocusChanged();
        initWine();//Set style to buttons according to saved wine for each button
    }

    private void initWine(){

        setBtnStyle(btn_1);
        setBtnStyle(btn_2);
        setBtnStyle(btn_3);
        setBtnStyle(btn_4);
        setBtnStyle(btn_5);
        setBtnStyle(btn_6);
        setBtnStyle(btn_7);
        setBtnStyle(btn_8);
        setBtnStyle(btn_9);
        setBtnStyle(btn_10);
        setBtnStyle(btn_11);
        setBtnStyle(btn_12);
        setBtnStyle(btn_13);
        setBtnStyle(btn_14);
        setBtnStyle(btn_15);
        setBtnStyle(btn_16);
        setBtnStyle(btn_17);
        setBtnStyle(btn_18);
        setBtnStyle(btn_19);
        setBtnStyle(btn_20);
        setBtnStyle(btn_21);
        setBtnStyle(btn_22);
        setBtnStyle(btn_23);
        setBtnStyle(btn_24);
        setBtnStyle(btn_25);
        setBtnStyle(btn_26);
        setBtnStyle(btn_27);
        setBtnStyle(btn_28);
        setBtnStyle(btn_29);
        setBtnStyle(btn_30);
        setBtnStyle(btn_31);
        setBtnStyle(btn_32);
        setBtnStyle(btn_33);
        setBtnStyle(btn_34);
        setBtnStyle(btn_35);
        setBtnStyle(btn_36);
        setBtnStyle(btn_37);
        setBtnStyle(btn_38);
        setBtnStyle(btn_39);
        setBtnStyle(btn_40);
        setBtnStyle(btn_41);
        setBtnStyle(btn_42);
        setBtnStyle(btn_43);
        setBtnStyle(btn_44);
        setBtnStyle(btn_45);
        setBtnStyle(btn_46);
        setBtnStyle(btn_47);
        setBtnStyle(btn_48);
        setBtnStyle(btn_49);
        setBtnStyle(btn_50);
        setBtnStyle(btn_51);
        setBtnStyle(btn_52);
        setBtnStyle(btn_53);
        setBtnStyle(btn_54);
        setBtnStyle(btn_55);
        setBtnStyle(btn_56);

    }

    //Initialization of views (btn, textview, etc)
    private void initView(){

        tv_desc = (TextView)findViewById(R.id.tv_desc);

        btn_1 = (Button)findViewById(R.id.btn_wine_1);
        btn_2  =(Button)findViewById(R.id.btn_wine_2);
        btn_3 = (Button)findViewById(R.id.btn_wine_3);
        btn_4  =(Button)findViewById(R.id.btn_wine_4);
        btn_5  =(Button)findViewById(R.id.btn_wine_5);
        btn_6 = (Button)findViewById(R.id.btn_wine_6);
        btn_7  =(Button)findViewById(R.id.btn_wine_7);
        btn_8 = (Button)findViewById(R.id.btn_wine_8);
        btn_9  =(Button)findViewById(R.id.btn_wine_9);
        btn_10 = (Button)findViewById(R.id.btn_wine_10);
        btn_11  =(Button)findViewById(R.id.btn_wine_11);
        btn_12  =(Button)findViewById(R.id.btn_wine_12);
        btn_13 = (Button)findViewById(R.id.btn_wine_13);
        btn_14  =(Button)findViewById(R.id.btn_wine_14);
        btn_15 = (Button)findViewById(R.id.btn_wine_15);
        btn_16  =(Button)findViewById(R.id.btn_wine_16);
        btn_17 = (Button)findViewById(R.id.btn_wine_17);
        btn_18  =(Button)findViewById(R.id.btn_wine_18);
        btn_19  =(Button)findViewById(R.id.btn_wine_19);
        btn_20 = (Button)findViewById(R.id.btn_wine_20);
        btn_21  =(Button)findViewById(R.id.btn_wine_21);
        btn_22 = (Button)findViewById(R.id.btn_wine_22);
        btn_23  =(Button)findViewById(R.id.btn_wine_23);
        btn_24 = (Button)findViewById(R.id.btn_wine_24);
        btn_25  =(Button)findViewById(R.id.btn_wine_25);
        btn_26  =(Button)findViewById(R.id.btn_wine_26);
        btn_27 = (Button)findViewById(R.id.btn_wine_27);
        btn_28  =(Button)findViewById(R.id.btn_wine_28);
        btn_29 = (Button)findViewById(R.id.btn_wine_29);
        btn_30  =(Button)findViewById(R.id.btn_wine_30);
        btn_31 = (Button)findViewById(R.id.btn_wine_31);
        btn_32  =(Button)findViewById(R.id.btn_wine_32);
        btn_33  =(Button)findViewById(R.id.btn_wine_33);
        btn_34 = (Button)findViewById(R.id.btn_wine_34);
        btn_35  =(Button)findViewById(R.id.btn_wine_35);
        btn_36 = (Button)findViewById(R.id.btn_wine_36);
        btn_37  =(Button)findViewById(R.id.btn_wine_37);
        btn_38 = (Button)findViewById(R.id.btn_wine_38);
        btn_39  =(Button)findViewById(R.id.btn_wine_39);
        btn_40  =(Button)findViewById(R.id.btn_wine_40);
        btn_41 = (Button)findViewById(R.id.btn_wine_41);
        btn_42  =(Button)findViewById(R.id.btn_wine_42);
        btn_43 = (Button)findViewById(R.id.btn_wine_43);
        btn_44  =(Button)findViewById(R.id.btn_wine_44);
        btn_45 = (Button)findViewById(R.id.btn_wine_45);
        btn_46  =(Button)findViewById(R.id.btn_wine_46);
        btn_47  =(Button)findViewById(R.id.btn_wine_47);
        btn_48 = (Button)findViewById(R.id.btn_wine_48);
        btn_49  =(Button)findViewById(R.id.btn_wine_49);
        btn_50 = (Button)findViewById(R.id.btn_wine_50);
        btn_51  =(Button)findViewById(R.id.btn_wine_51);
        btn_52 = (Button)findViewById(R.id.btn_wine_52);
        btn_53  =(Button)findViewById(R.id.btn_wine_53);
        btn_54  =(Button)findViewById(R.id.btn_wine_54);
        btn_55 = (Button)findViewById(R.id.btn_wine_55);
        btn_56  =(Button)findViewById(R.id.btn_wine_56);

    }

    //No need of comment here
    private void initViewFocusChanged(){

        btn_1.setOnFocusChangeListener(onFocusChangeListener);
        btn_2.setOnFocusChangeListener(onFocusChangeListener);
        btn_3.setOnFocusChangeListener(onFocusChangeListener);
        btn_4.setOnFocusChangeListener(onFocusChangeListener);
        btn_5.setOnFocusChangeListener(onFocusChangeListener);
        btn_6.setOnFocusChangeListener(onFocusChangeListener);
        btn_7.setOnFocusChangeListener(onFocusChangeListener);
        btn_8.setOnFocusChangeListener(onFocusChangeListener);
        btn_9.setOnFocusChangeListener(onFocusChangeListener);
        btn_10.setOnFocusChangeListener(onFocusChangeListener);
        btn_11.setOnFocusChangeListener(onFocusChangeListener);
        btn_12.setOnFocusChangeListener(onFocusChangeListener);
        btn_13.setOnFocusChangeListener(onFocusChangeListener);
        btn_14.setOnFocusChangeListener(onFocusChangeListener);
        btn_15.setOnFocusChangeListener(onFocusChangeListener);
        btn_16.setOnFocusChangeListener(onFocusChangeListener);
        btn_17.setOnFocusChangeListener(onFocusChangeListener);
        btn_18.setOnFocusChangeListener(onFocusChangeListener);
        btn_19.setOnFocusChangeListener(onFocusChangeListener);
        btn_20.setOnFocusChangeListener(onFocusChangeListener);
        btn_21.setOnFocusChangeListener(onFocusChangeListener);
        btn_22.setOnFocusChangeListener(onFocusChangeListener);
        btn_23.setOnFocusChangeListener(onFocusChangeListener);
        btn_24.setOnFocusChangeListener(onFocusChangeListener);
        btn_25.setOnFocusChangeListener(onFocusChangeListener);
        btn_26.setOnFocusChangeListener(onFocusChangeListener);
        btn_27.setOnFocusChangeListener(onFocusChangeListener);
        btn_28.setOnFocusChangeListener(onFocusChangeListener);
        btn_29.setOnFocusChangeListener(onFocusChangeListener);
        btn_30.setOnFocusChangeListener(onFocusChangeListener);
        btn_31.setOnFocusChangeListener(onFocusChangeListener);
        btn_32.setOnFocusChangeListener(onFocusChangeListener);
        btn_33.setOnFocusChangeListener(onFocusChangeListener);
        btn_34.setOnFocusChangeListener(onFocusChangeListener);
        btn_35.setOnFocusChangeListener(onFocusChangeListener);
        btn_36.setOnFocusChangeListener(onFocusChangeListener);
        btn_37.setOnFocusChangeListener(onFocusChangeListener);
        btn_38.setOnFocusChangeListener(onFocusChangeListener);
        btn_39.setOnFocusChangeListener(onFocusChangeListener);
        btn_40.setOnFocusChangeListener(onFocusChangeListener);
        btn_41.setOnFocusChangeListener(onFocusChangeListener);
        btn_42.setOnFocusChangeListener(onFocusChangeListener);
        btn_43.setOnFocusChangeListener(onFocusChangeListener);
        btn_44.setOnFocusChangeListener(onFocusChangeListener);
        btn_45.setOnFocusChangeListener(onFocusChangeListener);
        btn_46.setOnFocusChangeListener(onFocusChangeListener);
        btn_47.setOnFocusChangeListener(onFocusChangeListener);
        btn_48.setOnFocusChangeListener(onFocusChangeListener);
        btn_49.setOnFocusChangeListener(onFocusChangeListener);
        btn_50.setOnFocusChangeListener(onFocusChangeListener);
        btn_51.setOnFocusChangeListener(onFocusChangeListener);
        btn_52.setOnFocusChangeListener(onFocusChangeListener);
        btn_53.setOnFocusChangeListener(onFocusChangeListener);
        btn_54.setOnFocusChangeListener(onFocusChangeListener);
        btn_55.setOnFocusChangeListener(onFocusChangeListener);
        btn_56.setOnFocusChangeListener(onFocusChangeListener);

    }

    //It does exactly what is wrote in name of this method
    private void initViewClickListener(){

        btn_1.setOnClickListener(onClickListener);
        btn_2.setOnClickListener(onClickListener);
        btn_3.setOnClickListener(onClickListener);
        btn_4.setOnClickListener(onClickListener);
        btn_5.setOnClickListener(onClickListener);
        btn_6.setOnClickListener(onClickListener);
        btn_7.setOnClickListener(onClickListener);
        btn_8.setOnClickListener(onClickListener);
        btn_9.setOnClickListener(onClickListener);
        btn_10.setOnClickListener(onClickListener);
        btn_11.setOnClickListener(onClickListener);
        btn_12.setOnClickListener(onClickListener);
        btn_13.setOnClickListener(onClickListener);
        btn_14.setOnClickListener(onClickListener);
        btn_15.setOnClickListener(onClickListener);
        btn_16.setOnClickListener(onClickListener);
        btn_17.setOnClickListener(onClickListener);
        btn_18.setOnClickListener(onClickListener);
        btn_19.setOnClickListener(onClickListener);
        btn_20.setOnClickListener(onClickListener);
        btn_21.setOnClickListener(onClickListener);
        btn_22.setOnClickListener(onClickListener);
        btn_23.setOnClickListener(onClickListener);
        btn_24.setOnClickListener(onClickListener);
        btn_25.setOnClickListener(onClickListener);
        btn_26.setOnClickListener(onClickListener);
        btn_27.setOnClickListener(onClickListener);
        btn_28.setOnClickListener(onClickListener);
        btn_29.setOnClickListener(onClickListener);
        btn_30.setOnClickListener(onClickListener);
        btn_31.setOnClickListener(onClickListener);
        btn_32.setOnClickListener(onClickListener);
        btn_33.setOnClickListener(onClickListener);
        btn_34.setOnClickListener(onClickListener);
        btn_35.setOnClickListener(onClickListener);
        btn_36.setOnClickListener(onClickListener);
        btn_37.setOnClickListener(onClickListener);
        btn_38.setOnClickListener(onClickListener);
        btn_39.setOnClickListener(onClickListener);
        btn_40.setOnClickListener(onClickListener);
        btn_41.setOnClickListener(onClickListener);
        btn_42.setOnClickListener(onClickListener);
        btn_43.setOnClickListener(onClickListener);
        btn_44.setOnClickListener(onClickListener);
        btn_45.setOnClickListener(onClickListener);
        btn_46.setOnClickListener(onClickListener);
        btn_47.setOnClickListener(onClickListener);
        btn_48.setOnClickListener(onClickListener);
        btn_49.setOnClickListener(onClickListener);
        btn_50.setOnClickListener(onClickListener);
        btn_51.setOnClickListener(onClickListener);
        btn_52.setOnClickListener(onClickListener);
        btn_53.setOnClickListener(onClickListener);
        btn_54.setOnClickListener(onClickListener);
        btn_55.setOnClickListener(onClickListener);
        btn_56.setOnClickListener(onClickListener);

    }

    //Alert dialog showing which type of wine will be put on this place
    // or it can be removed.
    //Then wine type (or blank space) is saved to shared preferences
    // with key of selected/clicked button
    private void showChoiceDialog(final Button clickedBtn){

        aDialogBuilder = new AlertDialog.Builder(context);
        aDialogBuilder.setTitle(ALERT_DIALOG_TITLE);

        int selected = -1;

        DialogInterface.OnClickListener dialogOnClickListener = new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                String key = String.valueOf(clickedBtn.getId());
                String value = WINE_LIST[which];

                spEditor.putString(key,value);
                spEditor.apply();
                String text = sharedPreferences.getString(key, WINE_TYPE_NONE);

                setBtnStyle(clickedBtn);

                setWineDesc(text);

                alert.cancel();
            }
        };

        aDialogBuilder.setSingleChoiceItems(WINE_LIST,selected,dialogOnClickListener);

        alert = aDialogBuilder.create();
        alert.show();

    }


    //When wine X is focused, then description will show info about X
    private View.OnFocusChangeListener onFocusChangeListener = new View.OnFocusChangeListener() {
        @Override
        public void onFocusChange(View v, boolean hasFocus) {
            String key = String.valueOf(v.getId());

            wine_type = sharedPreferences.getString(key,WINE_TYPE_NONE);
            setWineDesc(wine_type);
        }
    };

    //Shows description depending on which wine type is on focused place
    //TODO Lepší popis
    private void setWineDesc(String type){

        switch(type){

            case WINE_TYPE_NONE:
                tv_desc.setText("");//Nastavení popisu vína bude více komplexní ( více textu, oken)
                break;
            case WINE_TYPE_0:
                tv_desc.setText("Moravčíkova vína - Sauvignon - Výběr z hroznů - Sladké");
                break;
            case WINE_TYPE_1:
                tv_desc.setText("Moravčíkova vína - Tramín Červený - Výběr z hroznů - Sladké");
                break;
            case WINE_TYPE_2:
                tv_desc.setText("Moravčíkova vína - Pálava - Výběr z hroznů - Sladké");
                break;
            case WINE_TYPE_3:
                tv_desc.setText("Moravčíkova vína - Ryzlink Rýnský - Výběr z hroznů - Sladké");
                break;
            case WINE_TYPE_4:
                tv_desc.setText("Paulus - Chardonnay - Výběr z hroznů - Polosladké");
                break;
            case WINE_TYPE_5:
                tv_desc.setText("Paulus - Sauvignon - Výběr z hroznů - Polosladké");
                break;
            case WINE_TYPE_6:
                tv_desc.setText("Paulus - Pálava - Výběr z bobulí - Polosladké");
                break;
            case WINE_TYPE_7:
                tv_desc.setText("Popela Perná - Pálava - Výběr z hroznů - Polosladké");
                break;
            case WINE_TYPE_8:
                tv_desc.setText("Topolánský - Sauvignon - Zemské - Polosladké");
                break;
            case WINE_TYPE_9:
                tv_desc.setText("Topolánský - Ryzlink Rýnský - Zemské - Polosladké");
                break;
            case WINE_TYPE_10:
                tv_desc.setText("Vinařství Mikulský - Rulandské Šedé - Výběr z hroznů - Polosladké");
                break;
            case WINE_TYPE_11:
                tv_desc.setText("Vinařství Mikulský - Chardonnay - Pozdní sběr - Polosladké");
                break;
            case WINE_TYPE_12:
                tv_desc.setText("Šilinek - Chardonnay - Výběr z hroznů - Polosladké");
                break;
            case WINE_TYPE_13:
                tv_desc.setText("Šilinek - André 2013 - Jakostní - Suché");
                break;
            case WINE_TYPE_14:
                tv_desc.setText("Šilinek - Ryzlink Rýnský - Výběr z hroznů - Polosladké");
                break;
            case WINE_TYPE_15:
                tv_desc.setText("Šilinek - Sauvignon - Pozdní sběr - Polosladké");
                break;
            case WINE_TYPE_16:
                tv_desc.setText("Šilinek - Sauvignon - Jakostní - Polosladké");
                break;
            case WINE_TYPE_17:
                tv_desc.setText("Dar. Jedinečné víno od jedinečných lidí.");
                break;
        }

    }

    //Sets style to button according to wine which is assigned to that btn
    private void setBtnStyle(Button btn){

        String key = String.valueOf(btn.getId());
        String wineType = sharedPreferences.getString(key,WINE_TYPE_NONE);

        switch(wineType){

            case WINE_TYPE_NONE:
                btn.setText(TAG_WINE_TYPE_NONE);
                btn.setAlpha(Float.valueOf("0.2"));
                btn.setBackgroundResource(R.drawable.btn_wine_none);
                break;
            case WINE_TYPE_0:
                btn.setText(TAG_WINE_TYPE_0);
                btn.setAlpha(1);
                btn.setBackgroundResource(R.drawable.btn_wine_moravcik);
                 break;
            case WINE_TYPE_1:
                btn.setText(TAG_WINE_TYPE_1);
                btn.setAlpha(1);
                btn.setBackgroundResource(R.drawable.btn_wine_moravcik);
                break;
            case WINE_TYPE_2:
                btn.setText(TAG_WINE_TYPE_2);
                btn.setAlpha(1);
                btn.setBackgroundResource(R.drawable.btn_wine_moravcik);
                break;
            case WINE_TYPE_3:
                btn.setText(TAG_WINE_TYPE_3);
                btn.setAlpha(1);
                btn.setBackgroundResource(R.drawable.btn_wine_moravcik);
                break;
            case WINE_TYPE_4:
                btn.setText(TAG_WINE_TYPE_4);
                btn.setAlpha(1);
                btn.setBackgroundResource(R.drawable.btn_wine_paulus);
                break;
            case WINE_TYPE_5:
                btn.setText(TAG_WINE_TYPE_5);
                btn.setAlpha(1);
                btn.setBackgroundResource(R.drawable.btn_wine_paulus);
                break;
            case WINE_TYPE_6:
                btn.setText(TAG_WINE_TYPE_6);
                btn.setAlpha(1);
                btn.setBackgroundResource(R.drawable.btn_wine_paulus);
                break;
            case WINE_TYPE_7:
                btn.setText(TAG_WINE_TYPE_7);
                btn.setAlpha(1);
                btn.setBackgroundResource(R.drawable.btn_wine_popela_perna);
                break;
            case WINE_TYPE_8:
                btn.setText(TAG_WINE_TYPE_8);
                btn.setAlpha(1);
                btn.setBackgroundResource(R.drawable.btn_wine_topolansky);
                break;
            case WINE_TYPE_9:
                btn.setText(TAG_WINE_TYPE_9);
                btn.setAlpha(1);
                btn.setBackgroundResource(R.drawable.btn_wine_topolansky);
                break;
            case WINE_TYPE_10:
                btn.setText(TAG_WINE_TYPE_10);
                btn.setAlpha(1);
                btn.setBackgroundResource(R.drawable.btn_wine_mikulsky);
                break;
            case WINE_TYPE_11:
                btn.setText(TAG_WINE_TYPE_11);
                btn.setAlpha(1);
                btn.setBackgroundResource(R.drawable.btn_wine_mikulsky);
                break;
            case WINE_TYPE_12:
                btn.setText(TAG_WINE_TYPE_12);
                btn.setAlpha(1);
                btn.setBackgroundResource(R.drawable.btn_wine_silinek);
                break;
            case WINE_TYPE_13:
                btn.setText(TAG_WINE_TYPE_13);
                btn.setAlpha(1);
                btn.setBackgroundResource(R.drawable.btn_wine_silinek);
                break;
            case WINE_TYPE_14:
                btn.setText(TAG_WINE_TYPE_14);
                btn.setAlpha(1);
                btn.setBackgroundResource(R.drawable.btn_wine_silinek);
                break;
            case WINE_TYPE_15:
                btn.setText(TAG_WINE_TYPE_15);
                btn.setAlpha(1);
                btn.setBackgroundResource(R.drawable.btn_wine_silinek);
                break;
            case WINE_TYPE_16:
                btn.setText(TAG_WINE_TYPE_16);
                btn.setAlpha(1);
                btn.setBackgroundResource(R.drawable.btn_wine_silinek);
                break;
            case WINE_TYPE_17:
                btn.setText(TAG_WINE_TYPE_17);
                btn.setAlpha(1);
                btn.setBackgroundResource(R.drawable.btn_wine_dar);
                break;
        }


    }

    //On click alert dialog appears.
    //User selects which wine will be set on this position
    // or if it should be removed.
    private View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            switch (v.getId()){
                case R.id.btn_wine_1:showChoiceDialog(btn_1);break;
                case R.id.btn_wine_2:showChoiceDialog(btn_2);break;
                case R.id.btn_wine_3:showChoiceDialog(btn_3);break;
                case R.id.btn_wine_4:showChoiceDialog(btn_4);break;
                case R.id.btn_wine_5:showChoiceDialog(btn_5);break;
                case R.id.btn_wine_6:showChoiceDialog(btn_6);break;
                case R.id.btn_wine_7:showChoiceDialog(btn_7);break;
                case R.id.btn_wine_8:showChoiceDialog(btn_8);break;
                case R.id.btn_wine_9:showChoiceDialog(btn_9);break;
                case R.id.btn_wine_10:showChoiceDialog(btn_10);break;
                case R.id.btn_wine_11:showChoiceDialog(btn_11);break;
                case R.id.btn_wine_12:showChoiceDialog(btn_12);break;
                case R.id.btn_wine_13:showChoiceDialog(btn_13);break;
                case R.id.btn_wine_14:showChoiceDialog(btn_14);break;
                case R.id.btn_wine_15:showChoiceDialog(btn_15);break;
                case R.id.btn_wine_16:showChoiceDialog(btn_16);break;
                case R.id.btn_wine_17:showChoiceDialog(btn_17);break;
                case R.id.btn_wine_18:showChoiceDialog(btn_18);break;
                case R.id.btn_wine_19:showChoiceDialog(btn_19);break;
                case R.id.btn_wine_20:showChoiceDialog(btn_20);break;
                case R.id.btn_wine_21:showChoiceDialog(btn_21);break;
                case R.id.btn_wine_22:showChoiceDialog(btn_22);break;
                case R.id.btn_wine_23:showChoiceDialog(btn_23);break;
                case R.id.btn_wine_24:showChoiceDialog(btn_24);break;
                case R.id.btn_wine_25:showChoiceDialog(btn_25);break;
                case R.id.btn_wine_26:showChoiceDialog(btn_26);break;
                case R.id.btn_wine_27:showChoiceDialog(btn_27);break;
                case R.id.btn_wine_28:showChoiceDialog(btn_28);break;
                case R.id.btn_wine_29:showChoiceDialog(btn_29);break;
                case R.id.btn_wine_30:showChoiceDialog(btn_30);break;
                case R.id.btn_wine_31:showChoiceDialog(btn_31);break;
                case R.id.btn_wine_32:showChoiceDialog(btn_32);break;
                case R.id.btn_wine_33:showChoiceDialog(btn_33);break;
                case R.id.btn_wine_34:showChoiceDialog(btn_34);break;
                case R.id.btn_wine_35:showChoiceDialog(btn_35);break;
                case R.id.btn_wine_36:showChoiceDialog(btn_36);break;
                case R.id.btn_wine_37:showChoiceDialog(btn_37);break;
                case R.id.btn_wine_38:showChoiceDialog(btn_38);break;
                case R.id.btn_wine_39:showChoiceDialog(btn_39);break;
                case R.id.btn_wine_40:showChoiceDialog(btn_40);break;
                case R.id.btn_wine_41:showChoiceDialog(btn_41);break;
                case R.id.btn_wine_42:showChoiceDialog(btn_42);break;
                case R.id.btn_wine_43:showChoiceDialog(btn_43);break;
                case R.id.btn_wine_44:showChoiceDialog(btn_44);break;
                case R.id.btn_wine_45:showChoiceDialog(btn_45);break;
                case R.id.btn_wine_46:showChoiceDialog(btn_46);break;
                case R.id.btn_wine_47:showChoiceDialog(btn_47);break;
                case R.id.btn_wine_48:showChoiceDialog(btn_48);break;
                case R.id.btn_wine_49:showChoiceDialog(btn_49);break;
                case R.id.btn_wine_50:showChoiceDialog(btn_50);break;
                case R.id.btn_wine_51:showChoiceDialog(btn_51);break;
                case R.id.btn_wine_52:showChoiceDialog(btn_52);break;
                case R.id.btn_wine_53:showChoiceDialog(btn_53);break;
                case R.id.btn_wine_54:showChoiceDialog(btn_54);break;
                case R.id.btn_wine_55:showChoiceDialog(btn_55);break;
                case R.id.btn_wine_56:showChoiceDialog(btn_56);break;
            }

        }
    };

}
