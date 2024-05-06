package com.scwang.smart.refresh.layout;

import android.content.Context;
import android.util.AttributeSet;

public class SmartRefresh extends SmartRefreshLayout {
    public SmartRefresh(Context context) {
        super(context);
        init();
    }

    public SmartRefresh(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    private void init() {
        setEnableLoadMore(false);
        setEnableRefresh(false);
        setEnableOverScrollDrag(true);
        setRefreshHeader(new ClassicsHeader(getContext()));
        setRefreshFooter(new ClassicsFooter(getContext()));
        setReboundDuration(1000);
        setEnableOverScrollBounce(true);
    }
}
