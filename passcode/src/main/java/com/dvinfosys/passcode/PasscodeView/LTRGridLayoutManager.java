package com.dvinfosys.passcode.PasscodeView;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.util.AttributeSet;

public class LTRGridLayoutManager extends GridLayoutManager {

    public LTRGridLayoutManager(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    public LTRGridLayoutManager(Context context, int spanCount) {
        super(context, spanCount);
    }

    public LTRGridLayoutManager(Context context, int spanCount, int orientation, boolean reverseLayout) {
        super(context, spanCount, orientation, reverseLayout);
    }

    @Override
    protected boolean isLayoutRTL(){
        return false;
    }
}