package clojure;

import clojure.lang.*;

public final class pprint_use_method extends clojure.lang.AFunction {
 static {
 }
 public pprint_use_method() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object multifn1, java.lang.Object dispatch_val2, java.lang.Object func3) {
  return Reflector.invokeInstanceMethod(multifn1, "addMethod", new Object[]{dispatch_val2, func3});
 }
}
