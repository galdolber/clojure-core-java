package clojure;

import clojure.lang.*;

public final class core_get_method extends clojure.lang.AFunction {
 static {
 }
 public core_get_method() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object multifn1, java.lang.Object dispatch_val2) {
  return ((clojure.lang.IFn)((clojure.lang.MultiFn)multifn1).getMethod(((java.lang.Object)dispatch_val2)));
 }
}
