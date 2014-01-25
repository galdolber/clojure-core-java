package clojure;

import clojure.lang.*;

public final class core_seque_log_error__4815 extends clojure.lang.AFunction {
 static {
 }
 public core_seque_log_error__4815() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object q1, java.lang.Object e2) {
  Object __r2941 = Reflector.invokeInstanceMethod(q1, "offer", new Object[]{q1});
  if (__r2941 != null && !(__r2941 == Boolean.FALSE)) {
   Util.trow((Throwable)e2);
   return null;
  } else {
   return e2;
  }
 }
}
