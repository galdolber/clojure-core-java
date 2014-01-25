package clojure;

import clojure.lang.*;

public final class core_prefer_method extends clojure.lang.AFunction {
 static {
 }
 public core_prefer_method() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object multifn1, java.lang.Object dispatch_val_x2, java.lang.Object dispatch_val_y3) {
  return ((clojure.lang.MultiFn)((clojure.lang.MultiFn)multifn1).preferMethod(((java.lang.Object)dispatch_val_x2), ((java.lang.Object)dispatch_val_y3)));
 }
}
