package com.github.wuxudong.rncharts.charts;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.listener.PieRadarChartTouchListener;

/**
 * Created by rmin on 28/02/2018.
 * Override to disable unhighlight function
 */
public class CustomPieChart extends PieChart {
    public CustomPieChart(Context context) {
        super(context);
    }

    public CustomPieChart(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomPieChart(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    protected void init() {
        super.init();

        mChartTouchListener = new PieRadarChartTouchListener(this){

            protected void performHighlight(Highlight h, MotionEvent e) {

                if (h != null && !h.equalTo(mLastHighlighted)) {
                    mChart.highlightValue(h, true);
                    mLastHighlighted = h;
                }
            }
        };
    }
}
