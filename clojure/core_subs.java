package clojure;

import clojure.lang.*;

public final class core_subs extends clojure.lang.AFunction {
 static {
 }
 public core_subs() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object s1, java.lang.Object start2, java.lang.Object end3) {
  return ((java.lang.String)((java.lang.String)s1).substring((int)RT.intCast(start2), (int)RT.intCast(end3)));
 }
 public java.lang.Object invoke(java.lang.Object s1, java.lang.Object start2) {
  return ((java.lang.String)((java.lang.String)s1).substring((int)RT.intCast(start2)));
 }
}
