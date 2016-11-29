/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locale;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 *
 * @author COMar-PC
 */
public class LangBundle {

    ResourceBundle resources = null;

    public LangBundle(Locale locale) {
        ResourceBundle.clearCache();
        resources = ResourceBundle.getBundle("locale.Internalization", locale);
    }

    public String tr(String string) {
        return resources.getString(string);
    }
    
    public String toString() {
        return resources.getBaseBundleName();
    }
}
