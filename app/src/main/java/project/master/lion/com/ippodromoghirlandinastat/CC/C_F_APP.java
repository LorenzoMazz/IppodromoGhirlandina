package project.master.lion.com.ippodromoghirlandinastat.CC;

import android.app.Activity;
import android.view.View;

import java.util.ArrayList;

import project.master.lion.com.ippodromoghirlandinastat.R;


/**
 * Created by Lorenzo on 13/02/2018.
 */

public class C_F_APP {

    public static void showAlertDialogForError(Activity activity, String message) {
        final CustomAlertDialog dialog = new CustomAlertDialog(activity);
        dialog.setActivity(activity);
        View.OnClickListener listenerLeft = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        };

        dialog.setData(activity.getString(R.string.warning), message,
                activity.getString(R.string.ok), null,
                listenerLeft, null);
        dialog.show();
    }

}
