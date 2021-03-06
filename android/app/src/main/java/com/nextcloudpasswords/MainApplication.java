package com.nextcloudpasswords;

import android.app.Application;

import com.facebook.react.ReactApplication;
import com.hieuvp.fingerprint.ReactNativeFingerprintScannerPackage;
import com.reactnativecommunity.webview.RNCWebViewPackage;
import com.rnfs.RNFSPackage;
import dog.craftz.sqlite_2.RNSqlite2Package;
import br.com.classapp.RNSensitiveInfo.RNSensitiveInfoPackage;
import com.horcrux.svg.SvgPackage;
import com.facebook.react.ReactNativeHost;
import com.facebook.react.ReactPackage;
import com.facebook.react.shell.MainReactPackage;
import com.facebook.soloader.SoLoader;

import java.util.Arrays;
import java.util.List;

public class MainApplication extends Application implements ReactApplication {

  private final ReactNativeHost mReactNativeHost = new ReactNativeHost(this) {
    @Override
    public boolean getUseDeveloperSupport() {
      return BuildConfig.DEBUG;
    }

    @Override
    protected List<ReactPackage> getPackages() {
      return Arrays.<ReactPackage>asList(
          new MainReactPackage(),
            new ReactNativeFingerprintScannerPackage(),
            new RNCWebViewPackage(),
            new RNFSPackage(),
            new RNSqlite2Package(),
            new RNSensitiveInfoPackage(),
            new SvgPackage()
      );
    }

    @Override
    protected String getJSMainModuleName() {
      return "index";
    }
  };

  @Override
  public ReactNativeHost getReactNativeHost() {
    return mReactNativeHost;
  }

  @Override
  public void onCreate() {
    super.onCreate();
    SoLoader.init(this, /* native exopackage */ false);
  }
}
