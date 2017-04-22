package app.hueic.hueicprojectdoanthanhnien.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TabHost;

import java.util.ArrayList;

import app.hueic.hueicprojectdoanthanhnien.R;
import app.hueic.hueicprojectdoanthanhnien.adapter.ActionAdapter;
import app.hueic.hueicprojectdoanthanhnien.model.Action;
import app.hueic.hueicprojectdoanthanhnien.recycle.ClickListener;
import app.hueic.hueicprojectdoanthanhnien.recycle.RecyclerTouchListener;

public class ActionActivity extends AppCompatActivity {
    //Khai bao ListView
    private RecyclerView rec_unacted, rec_filled;
    //Khai bao TabHost
    private TabHost tabHost;
    //Danh sach Hoat dong
    private ArrayList<Action> listUnacted;
    private ArrayList<Action> listFilled;
    //HoatDongAdapter
    private ActionAdapter actionAdapter;
    private Action action = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_action);
        //FindViewById
        addControls();
        //handleEvents
        addEvents();
    }

    private void addEvents() {
        //xu ly su kien tabHost
        tabHost.setOnTabChangedListener(new TabHost.OnTabChangeListener() {
            @Override
            public void onTabChanged(String tabId) {
                if (tabId.equalsIgnoreCase("t1")) {
                    //xu ly su kien tab Chua dien ra

                }
                else if (tabId.equalsIgnoreCase("t2")) {
                    //xu ly su kien tab Da dien ra

                }
            }
        });
        rec_unacted.addOnItemTouchListener(new RecyclerTouchListener(this, rec_unacted, new ClickListener() {
            @Override
            public void onClick(View view, int position) {
                Intent intent = new Intent(ActionActivity.this, ScannerActivity.class);
                startActivity(intent);
            }

            @Override
            public void onLongClick(View view, int position) {

            }
        }));
        rec_filled.addOnItemTouchListener(new RecyclerTouchListener(this, rec_filled, new ClickListener() {
            @Override
            public void onClick(View view, int position) {
            Intent intent = new Intent(ActionActivity.this, InforActivity.class);
            startActivity(intent);
            }

            @Override
            public void onLongClick(View view, int position) {

            }
        }));
    }

    private void addControls() {
        //TabHost
        tabHost = (TabHost) this.findViewById(R.id.tabHost);
        //Lenh setup quan trong
        tabHost.setup();
        TabHost.TabSpec tabUnacted = tabHost.newTabSpec("t1");
        tabUnacted.setContent(R.id.tabChuaDienRa);
        //tab1.setIndicator("",getResources().getDrawable(R.drawable.i1));
        tabUnacted.setIndicator("Chưa diễn ra");
        tabHost.addTab(tabUnacted);
        TabHost.TabSpec tabFilled = tabHost.newTabSpec("t2");
        tabFilled.setContent(R.id.tabDaDienRa);
        tabFilled.setIndicator("Đang diễn ra");
        //tab2.setIndicator("",getResources().getDrawable(R.drawable.i2));
        tabHost.addTab(tabFilled);
        //RecycleView chua dien ra
        rec_unacted = (RecyclerView) this.findViewById(R.id.Rec_ChuaDienRa);
        rec_unacted.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        listUnacted = new ArrayList<>();
        actionAdapter = new ActionAdapter(listUnacted);
        action = new Action();
        for (int i = 0; i <= 20; i++) {
            action = new Action("Hoat dong thu " + i);
            listUnacted.add(action);
        }

        rec_unacted.setAdapter(actionAdapter);
        //RecycleView da dien ra
        rec_filled = (RecyclerView) this.findViewById(R.id.Rec_DaDienRa);
        rec_filled.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        listFilled = new ArrayList<>();
        actionAdapter = new ActionAdapter(listFilled);
        action = new Action();
        for (int i = 0; i <= 20; i++) {
            action = new Action("Hoat dong thu " + i);
            listFilled.add(action);
        }

        rec_filled.setAdapter(actionAdapter);
    }
}
