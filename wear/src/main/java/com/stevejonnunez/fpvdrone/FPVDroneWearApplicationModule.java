package com.stevejonnunez.fpvdrone;

import android.app.Application;

import com.stevejonnunez.fpvdrone.service.ListenerService;
import com.stevejonnunez.fpvdrone.rxEvent.ListenerServiceEvent;
import com.stevejonnunez.fpvdrone.ui.MainActivity;
import com.stevejonnunez.fpvdrone.util.rx.RxEventBus;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by kryonex on 4/10/2016.
 */
@Module(
        injects = {
                MainActivity.class,
                ListenerService.class
        }
)
public class FPVDroneWearApplicationModule {
    private Application application;

    public FPVDroneWearApplicationModule(Application application) {
        this.application = application;
    }

    @Provides
    @Singleton
    @Named("ListenerServiceEventBus")
    public RxEventBus<ListenerServiceEvent> provideRxListenerEventBus() {
        return new RxEventBus<ListenerServiceEvent>();
    }
}
