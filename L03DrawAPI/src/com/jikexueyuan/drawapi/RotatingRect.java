package com.jikexueyuan.drawapi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

public class RotatingRect extends View {

	public RotatingRect(Context context, AttributeSet attrs, int defStyleAttr) {
		super(context, attrs, defStyleAttr);
		
		initProperties();
	}

	public RotatingRect(Context context, AttributeSet attrs) {
		super(context, attrs);
		
		initProperties();
	}

	public RotatingRect(Context context) {
		super(context);
		
		initProperties();
	}
	
	
	private void initProperties(){
		p = new Paint();
		p.setColor(Color.RED);
	}
	
	
	@Override
	public void draw(Canvas canvas) {
		super.draw(canvas);
		
		canvas.save();
//		canvas.rotate(degrees);
		canvas.translate(200, 200);
		canvas.rotate(degrees, 50, 50);
		canvas.drawRect(0, 0, 100, 100, p);
		
		degrees ++;
		canvas.restore();
		
		invalidate();
	}
	
	private Paint p;
	private float degrees = 0;

}

