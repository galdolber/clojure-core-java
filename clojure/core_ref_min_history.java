package clojure;

import clojure.lang.*;

public final class core_ref_min_history extends clojure.lang.AFunction {
 static {
 }
 public core_ref_min_history() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object ref1, java.lang.Object n2) {
  return ((clojure.lang.Ref)((clojure.lang.Ref)ref1).setMinHistory((int)RT.intCast(n2)));
 }
 public java.lang.Object invoke(java.lang.Object ref1) {
  return Integer.valueOf(((clojure.lang.Ref)ref1).getMinHistory());
 }
}
