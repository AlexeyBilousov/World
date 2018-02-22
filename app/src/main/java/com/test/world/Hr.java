package com.test.world;

import android.util.Log;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Hr {
    private List<Human> worker;
    private Map<Integer, Long> telephones;

    public Hr() {
        worker = new ArrayList<>();
        telephones = new HashMap<>();
    }

    public void addNewWorker(Human human) {
        if (!human.isWork()) {
            human.setWork(true);
            worker.add(human);
            human.setIdWorker(worker.size() - 1);
            if (human.isMarried() && human.getSpouse().getTelephone() > 0) {
                changeTelephoneSpouse(human, human.getSpouse().getTelephone());
            } else {
                changeTelephoneSpouse(human, human.getTelephone());
            }
        }
    }

    public void notificationThatSpouseChangeTelephone(Human worker) {
        long newTelephone = worker.getSpouse().getTelephone();
        if (newTelephone != telephones.get(worker.getIdWorker())) {
            changeTelephoneSpouse(worker, newTelephone);
        }
    }

    public void notificationThatWorkerDivorced(Human worker) {
        if (worker.getTelephone() > 0 && worker.getTelephone() != telephones.get(worker.getIdWorker())) {
            telephones.put(worker.getIdWorker(), worker.getTelephone());
            messageChangeTelephoneSpouse(telephones.get(worker.getIdWorker()));
        }
    }

    public void changeTelephoneSpouse(Human human, long telephone) {
        telephones.put(human.getIdWorker(), telephone);
        messageChangeTelephoneSpouse(telephones.get(human.getIdWorker()));
    }

    private void messageChangeTelephoneSpouse(long telephone) {
        Log.d("LOG", "Работник: " + telephone);
    }
}
