package clojure;

import clojure.lang.*;

public final class core_deref_future extends clojure.lang.AFunction {
 static {
 }
 public core_deref_future() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object fut1, java.lang.Object timeout_ms2, java.lang.Object timeout_val3) {
  try {
   try {
    return ((java.lang.Object)((java.util.concurrent.Future)fut1).get((long)RT.longCast(timeout_ms2), (java.util.concurrent.TimeUnit)((java.util.concurrent.TimeUnit)((java.util.concurrent.TimeUnit)java.util.concurrent.TimeUnit.MILLISECONDS))));
   }
   catch (Throwable ex___) {
    if (ex___ instanceof java.util.concurrent.TimeoutException) {
     java.util.concurrent.TimeoutException e6 = (java.util.concurrent.TimeoutException) ex___;
     return timeout_val3;
    }
    else {
     throw Util.sneakyThrow(ex___);
    }
   }
  } catch (Exception ___e) {
   throw Util.sneakyThrow(___e);
  }
 }
 public java.lang.Object invoke(java.lang.Object fut1) {
  try {
   return ((java.lang.Object)((java.util.concurrent.Future)fut1).get());
  } catch (Exception ___e) {
   throw Util.sneakyThrow(___e);
  }
 }
}
