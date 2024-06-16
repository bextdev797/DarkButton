# Add any ProGuard configurations specific to this
# extension here.

-keep public class com.bextdev.DarkButton.DarkButton {
    public *;
 }
-keeppackagenames gnu.kawa**, gnu.expr**

-optimizationpasses 4
-allowaccessmodification
-mergeinterfacesaggressively

-repackageclasses 'com/bextdev/DarkButton/repack'
-flattenpackagehierarchy
-dontpreverify
