package gosemathraj.com.listviewwidget;

import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.content.Intent;
import android.widget.RemoteViews;
import android.widget.RemoteViewsService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by RajeshG on 25-01-2017.
 */

public class WidgetViewFactory implements RemoteViewsService.RemoteViewsFactory {

    private Context context;
    private List<String> data = new ArrayList();
    private int mAppWidgetId;

    public WidgetViewFactory(Context context, Intent intent) {
        this.context = context;
        mAppWidgetId = intent.getIntExtra(AppWidgetManager.EXTRA_APPWIDGET_ID,
                AppWidgetManager.INVALID_APPWIDGET_ID);
    }

    @Override
    public void onCreate() {

        data.add("Android Jack");
        data.add("Maverick");
        data.add("Tex");
        data.add("Duke");
        data.add("Bear");
        data.add("Rooster");
        data.add("Kent");
        data.add("Kenny");
        data.add("Stanley");
        data.add("Jake");
    }

    @Override
    public void onDataSetChanged() {

    }

    @Override
    public void onDestroy() {

    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public RemoteViews getViewAt(int i) {

        RemoteViews rv = new RemoteViews(context.getPackageName(), R.layout.widget_item);
        rv.setTextViewText(R.id.userName, data.get(i));

        return rv;
    }

    @Override
    public RemoteViews getLoadingView() {
        return null;
    }

    @Override
    public int getViewTypeCount() {
        return 1;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }
}
