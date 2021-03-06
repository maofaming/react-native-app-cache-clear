package com.maofaming.appcacheclear;

import android.os.AsyncTask;

import com.facebook.react.bridge.Callback;

public class ClearCacheAsyncTask extends AsyncTask<Integer,Integer,String> {
    public AppCacheClearModule myclearCacheModule = null;
    public Callback callback;
    public ClearCacheAsyncTask(AppCacheClearModule clearCacheModule, Callback callback) {
        super();
        this.myclearCacheModule = clearCacheModule;
        this.callback = callback;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
    }

    @Override
    protected void onPostExecute(String s) {
        super.onPostExecute(s);
        callback.invoke();
    }

    @Override
    protected String doInBackground(Integer... params) {
        myclearCacheModule.clearCache();
        return null;
    }
}
