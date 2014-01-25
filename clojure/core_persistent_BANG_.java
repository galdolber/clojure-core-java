package clojure;

import clojure.lang.*;

public final class core_persistent_BANG_ extends clojure.lang.AFunction {
 static {
 }
 public core_persistent_BANG_() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object coll1) {
  return ((clojure.lang.IPersistentCollection)((clojure.lang.ITransientCollection)coll1).persistent());
 }
}
