package clojure;

import clojure.lang.*;

public final class core_alter_meta_BANG_ extends clojure.lang.RestFn {
 static {
 }
 public core_alter_meta_BANG_() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object iref1, java.lang.Object f2, java.lang.Object args3) {
  return ((clojure.lang.IPersistentMap)((clojure.lang.IReference)iref1).alterMeta((clojure.lang.IFn)((clojure.lang.IFn)f2), (clojure.lang.ISeq)((clojure.lang.ISeq)args3)));
 }
 public int getRequiredArity() {
  return 2;
 }
}
