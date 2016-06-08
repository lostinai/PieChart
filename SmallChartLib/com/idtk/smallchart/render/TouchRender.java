package com.idtk.smallchart.render;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;

/**
 * Created by Administrator on 2016/6/9.
 */
public class TouchRender extends Render{

    private Paint mPaint = new Paint();
    public TouchRender() {
        super();
        mPaint.setAntiAlias(true);
        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setTextSize(30);
    }

    @Override
    public void drawGraph(Canvas canvas) {

    }

    public void drawPointAxis(Canvas canvas,float xAxis, float yAxis ,PointF mPointF){
        textCenter(new String[]{"("+xAxis+" , "+yAxis+")"},mPaint,canvas,mPointF, Paint.Align.CENTER);
    }
}
