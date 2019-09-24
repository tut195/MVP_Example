package com.babenkovladimir.mvp_example;

import android.app.Application;
import android.content.Context;


public class MyDatabaseApplication extends Application {

  private static Context context;

  @Override
  public void onCreate() {
    super.onCreate();
    context = getApplicationContext();

  }


  public static Context getAppContext() {
    return MyDatabaseApplication.context;
  }
}
