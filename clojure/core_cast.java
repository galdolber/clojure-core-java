package clojure;

import clojure.lang.*;

public final class core_cast extends clojure.lang.AFunction {
 static {
 }
 public core_cast() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object c1, java.lang.Object x2) {
  return ((java.lang.Object)((java.lang.Class)c1).cast(((java.lang.Object)x2)));
 }
}
