package git.zhong.com.opensourcelibrary;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by zhouzhong on 2017/12/19.
 */

public class ToastUtil {
    /**
     * 显示吐司
     *
     * @param context
     * @param str
     */
    public static void showToast(Context context, String str) {
        Toast.makeText(context, str, Toast.LENGTH_LONG).show();
    }
    
}
