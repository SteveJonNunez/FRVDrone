package com.stevejonnunez.fpvdrone.rxEvent;

/**
 * Created by kryonex on 4/10/2016.
 */
public class ListenerServiceEvent {
    public static final String CONNECT_TO_DRONE = "connectToDrone";

    public static final String ACCELEROMETER_X_WEAR_DATA = "accelerometerXWearData";
    public static final String ACCELEROMETER_Y_WEAR_DATA = "accelerometerYWearData";
    public static final String ACCELEROMETER_Z_WEAR_DATA = "accelerometerZWearData";

    public static final String LAND_DRONE = "landDrone";
    public static final String TAKEOFF_DRONE = "takeoffDrone";

    String path;
    String message;

    public ListenerServiceEvent(String path) {
        this.path = path;
    }

    public ListenerServiceEvent(String path, String message) {
        this.path = path;
        this.message = message;
    }

    public String getPath() {
        return path;
    }

    public String getMessage() {
        return message;
    }
}
