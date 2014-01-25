package clojure;

import clojure.lang.*;

public final class core_prefers extends clojure.lang.AFunction {
 static {
 }
 public core_prefers() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object multifn1) {
  return ((clojure.lang.IPersistentMap)((clojure.lang.MultiFn)multifn1).getPreferTable());
 }
}
