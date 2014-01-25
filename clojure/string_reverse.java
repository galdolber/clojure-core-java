package clojure;

import clojure.lang.*;

public final class string_reverse extends clojure.lang.AFunction {
 static {
 }
 public string_reverse() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object s1) {
  return ((java.lang.String)((java.lang.StringBuilder)((java.lang.StringBuilder)((java.lang.StringBuilder)new java.lang.StringBuilder((java.lang.CharSequence)((java.lang.CharSequence)s1))).reverse())).toString());
 }
}
