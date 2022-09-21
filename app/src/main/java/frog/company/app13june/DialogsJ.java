package frog.company.app13june;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

public class DialogsJ {

    void dialogResult(Activity activity, String text , IResultDialog listener ){
        AlertDialog.Builder deleteDialog = new AlertDialog.Builder((Context)activity);
        deleteDialog.setTitle((CharSequence)"The game is over\n").setMessage((CharSequence)text).setCancelable(false);
        final AlertDialog del = deleteDialog.create();
        deleteDialog.setNegativeButton((CharSequence)"No", (DialogInterface.OnClickListener)(new DialogInterface.OnClickListener() {
            public final void onClick(DialogInterface $noName_0, int $noName_1) {
                listener.onResultDialog(false);
                del.dismiss();
            }
        }));
        deleteDialog.setPositiveButton((CharSequence)"Yes", (DialogInterface.OnClickListener)(new DialogInterface.OnClickListener() {
            public final void onClick(DialogInterface $noName_0, int $noName_1) {
                listener.onResultDialog(true);
                del.dismiss();
            }
        }));
        deleteDialog.show();
    }
}
