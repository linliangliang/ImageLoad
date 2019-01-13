package com.zhengyuan.imageload;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.interfaces.DraweeController;
import com.facebook.drawee.view.SimpleDraweeView;

import java.net.URL;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SimpleDraweeView draweeView = (SimpleDraweeView) findViewById(R.id.id_main_sdv);
        Uri uri = Uri.parse("http://p7.qhimg.com/dr/200_200_/t01b2e3a907f6ecc29d.jpg");
        //draweeView.setImageURI(uri);
        DraweeController controller = Fresco.newDraweeControllerBuilder()
                .setUri(uri)
                .setAutoPlayAnimations(true)
                .build();
        draweeView.setController(controller);

        SimpleDraweeView drawee_img = (SimpleDraweeView) findViewById(R.id.drawee_img);
        uri = Uri.parse("http://www.pptok.com/wp-content/uploads/2012/08/xunguang-9.jpg");
        //draweeView.setImageURI(uri);
        controller = Fresco.newDraweeControllerBuilder()
                .setUri(uri)
                .setAutoPlayAnimations(true)
                .build();
        drawee_img.setController(controller);


    }
}
