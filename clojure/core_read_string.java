package clojure;

import clojure.lang.*;

public final class core_read_string extends clojure.lang.AFunction {
 static {
 }
 public core_read_string() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object s1) {
  return ((java.lang.Object)clojure.lang.RT.readString((java.lang.String)((java.lang.String)s1)));
 }
}
