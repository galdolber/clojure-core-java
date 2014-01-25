package clojure;

import clojure.lang.*;

public final class core_compare extends clojure.lang.AFunction {
 static {
 }
 public core_compare() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object x1, java.lang.Object y2) {
  return Integer.valueOf(clojure.lang.Util.compare(((java.lang.Object)x1), ((java.lang.Object)y2)));
 }
}
