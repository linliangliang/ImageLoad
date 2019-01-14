package com.zhengyuan.imageload;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;

/**
 * Created by 林亮 on 2019/1/14
 */

//裁剪实现圆形图片

public class cutRoundImage {


    public static Bitmap createCircleImage(Bitmap source) {
        int length = source.getWidth() < source.getHeight() ? source.getWidth() : source.getHeight();


        Paint paint = new Paint();//画笔
        paint.setAntiAlias(true);//抗锯齿方法
        Bitmap target = Bitmap.createBitmap(length, length, Bitmap.Config.ARGB_8888);//ARGB_8888 : 4bytes 每个像素占据4 个字节
        Canvas canvas = new Canvas(target);//画布

        canvas.drawCircle(length / 2, length / 2, length / 2, paint);//绘制圆
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(source, 0, 0, paint);
        return target;
    }

    /**
     * 根据原图添加圆角
     *
     * @param source
     * @return
     */
    public static Bitmap createRoundConerImage(Bitmap source) {
        int mWidth = source.getWidth();
        int mHeight = source.getHeight();
        int mRadius = 50;


        Paint paint = new Paint();
        paint.setAntiAlias(true);
        Bitmap target = Bitmap.createBitmap(mWidth, mHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(target);

        RectF rect = new RectF(0, 0, source.getWidth(), source.getHeight());
        canvas.drawRoundRect(rect, mRadius, mRadius, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(source, 0, 0, paint);
        return target;
    }


}
