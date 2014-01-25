package clojure;

import clojure.lang.*;

public final class core_get_validator extends clojure.lang.AFunction {
 static {
 }
 public core_get_validator() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object iref1) {
  return ((clojure.lang.IFn)((clojure.lang.IRef)iref1).getValidator());
 }
}
