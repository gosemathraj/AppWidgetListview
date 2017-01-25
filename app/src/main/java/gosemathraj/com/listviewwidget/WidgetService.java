package gosemathraj.com.listviewwidget;

import android.appwidget.AppWidgetManager;
import android.content.Intent;
import android.os.Binder;
import android.widget.ListView;
import android.widget.RemoteViews;
import android.widget.RemoteViewsService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by RajeshG on 25-01-2017.
 */
public class WidgetService extends RemoteViewsService {
    @Override
    public RemoteViewsFactory onGetViewFactory(Intent intent) {
        return(new WidgetViewFactory(this.getApplicationContext(),
                intent));
    }
}
