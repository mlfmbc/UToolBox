package lic.swifter.box.data;

import android.support.annotation.DrawableRes;
import android.support.annotation.StringRes;

/**
 * Created by lic on 16-7-7.
 */
public class ToolData {

    @DrawableRes
    public int iconRes;

    @StringRes
    public int nameRes;

    public FragmentsFlag flag;

    ToolData(@DrawableRes int iconRes, @StringRes int nameRes, FragmentsFlag flag) {
        this.iconRes = iconRes;
        this.nameRes = nameRes;
        this.flag = flag;
    }

}
