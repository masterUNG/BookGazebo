package bangtanrut.songklod.bookgazebo;

import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;

/**
 * Created by Administrator on 2/4/2560.
 */

public class PostUser extends AsyncTask<String,Void,String>{

    private Context context;

    public PostUser(Context context) {
        this.context = context;
    }

    @Override
    protected String doInBackground(String... params) {

        try {

        } catch (Exception e) {
            Log.d("2AprilV1", "e doIn ==>" + e.toString());
        }

        return null;
    }
}//Main Class
