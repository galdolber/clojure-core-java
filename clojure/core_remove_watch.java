package clojure;

import clojure.lang.*;

public final class core_remove_watch extends clojure.lang.AFunction {
 static {
 }
 public core_remove_watch() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object reference1, java.lang.Object key2) {
  return ((clojure.lang.IRef)((clojure.lang.IRef)reference1).removeWatch(((java.lang.Object)key2)));
 }
}
