package clojure;

import clojure.lang.*;

public final class core_reset_BANG_ extends clojure.lang.AFunction {
 static {
 }
 public core_reset_BANG_() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object atom1, java.lang.Object newval2) {
  return ((java.lang.Object)((clojure.lang.Atom)atom1).reset(((java.lang.Object)newval2)));
 }
}
