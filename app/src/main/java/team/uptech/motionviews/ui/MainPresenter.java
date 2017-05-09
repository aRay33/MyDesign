package team.uptech.motionviews.ui;

import android.content.Context;
import android.content.res.Resources;

import team.uptech.motionviews.utils.FontProvider;
import team.uptech.motionviews.widget.MotionView;

/**
 * Created by Dimas Maulana on 5/5/17.
 * Email : araymaulana66@gmail.com
 */

public class MainPresenter {

    public static final int RESULT_LOAD_IMAGE = 1;
    private Context context;
    private MotionView motionView;
    private FontProvider fontProvider = new FontProvider(Resources.getSystem());

    public MainPresenter(Context context, MotionView motionView) {
        this.context = context;
        this.motionView = motionView;
    }







}
