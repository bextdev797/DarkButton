package com.bextdev.DarkButton;

import com.google.appinventor.components.annotations.SimpleFunction;
import com.google.appinventor.components.annotations.SimpleProperty;
import com.google.appinventor.components.runtime.AndroidNonvisibleComponent;
import com.google.appinventor.components.runtime.ComponentContainer;
import com.google.appinventor.components.runtime.ButtonBase;
import com.google.appinventor.components.runtime.Component;

public class DarkButton extends AndroidNonvisibleComponent {
  private boolean forcedDarkMode;

  public DarkButton(ComponentContainer container) {
    super(container.$form());
  }
   
  @SimpleFunction
  public void DarkMode(ButtonBase button, boolean force){
    if(force){
     forcedDarkMode = true;
     button.BackgroundColor(Component.COLOR_BLACK);
     button.TextColor(Component.COLOR_WHITE);
    } else {
     forcedDarkMode = false;
     button.BackgroundColor(Component.COLOR_WHITE);
     button.TextColor(Component.COLOR_BLACK);
    }
  }
   
  @SimpleProperty
  public boolean Forced(){
   return forcedDarkMode;
  }
}
