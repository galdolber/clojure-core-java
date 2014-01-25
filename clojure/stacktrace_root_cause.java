package clojure;

import clojure.lang.*;

public final class stacktrace_root_cause extends clojure.lang.AFunction {
 static {
 }
 public stacktrace_root_cause() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object tr1) {
  while(true) {
   {
    Object temp__4115__auto__2 = ((java.lang.Throwable)((java.lang.Throwable)tr1).getCause());
    Object __r4635 = temp__4115__auto__2;
    if (__r4635 != null && !(__r4635 == Boolean.FALSE)) {
     {
      Object cause3 = temp__4115__auto__2;
      java.lang.Object tr1___aux = cause3;
      tr1 = tr1___aux;
      continue;
     }
    } else {
     return tr1;
    }
   }
  }
 }
}
