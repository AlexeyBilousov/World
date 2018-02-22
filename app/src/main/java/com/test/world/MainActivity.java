package com.test.world;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Human klaus = new Human("Klaus", 380664354234l, false, false, null);
        Human mary = new Human("Mary", 380954884234l, false, false, null);
        Hr hr = new Hr();
        hr.addNewWorker(klaus);
        if (!klaus.isMarried() && !mary.isMarried()) {
            wedding(klaus, mary);
            hr.notificationThatSpouseChangeTelephone(klaus);
        }
        if (changeTelephone(mary, 380674834634l)) {
            hr.notificationThatSpouseChangeTelephone(klaus);
        }
        divorced(klaus, mary);
        hr.notificationThatWorkerDivorced(klaus);
    }

    private void wedding(Human man, Human woman) {
        man.setSpouse(woman);
        woman.setSpouse(man);
        man.setMarried(true);
        woman.setMarried(true);
    }

    private boolean changeTelephone(Human human, long telephone) {
        boolean flag = false;
        human.setTelephone(telephone);
        if (human.isMarried() && human.getSpouse().isWork()) {
            flag = true;
        }
        return flag;
    }

    private void divorced(Human man, Human woman) {
        man.setSpouse(null);
        woman.setSpouse(null);
        man.setMarried(false);
        woman.setMarried(false);
    }
}
