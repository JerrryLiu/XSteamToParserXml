package com.sky.xsteamtoparserxml;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.apkfuns.logutils.LogUtils;
import com.thoughtworks.xstream.XStream;

import java.io.IOException;
import java.io.InputStream;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String fileName = "packageupdate.xml";
        InputStream in = null;
        try {
            in = getResources().getAssets().open(fileName);
            XStream xStream = new XStream();
            xStream.alias("result", Result.class);
            Result result = (Result) xStream.fromXML(in);
            LogUtils.d("version = " + result.getVersion() + "\nupgradeMode = " + result.getUpgradeMode());
            LogUtils.d(result.getPackages());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
