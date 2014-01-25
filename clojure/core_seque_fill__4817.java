package clojure;

import clojure.lang.*;

public final class core_seque_fill__4817 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final java.lang.Object const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final java.lang.Object const__4;
 public static final clojure.lang.Var const__5;
 public static final java.lang.Object const__6;
 public static final clojure.lang.Var const__7;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "instance?");
  const__1 = (java.lang.Object)java.lang.Exception.class;
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__4 = (java.lang.Object)0L;
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "nthnext");
  const__6 = (java.lang.Object)1L;
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "nil?");
 }
 Object q3;
 Object NIL4;
 Object log_error6;
 public core_seque_fill__4817(final Object q3, final Object NIL4, final Object log_error6) {
  super();
  this.q3 = q3;
  this.NIL4 = NIL4;
  this.log_error6 = log_error6;
 }
 public java.lang.Object invoke(java.lang.Object s1) {
  Object __r2943 = s1;
  if (__r2943 != null && !(__r2943 == Boolean.FALSE)) {
   if ((s1 instanceof java.lang.Exception)) {
    return ((IFn)this.log_error6).invoke(this.q3, s1);
   } else {
    try {
     {
      Object G__48194 = ((IFn)const__2.getRawRoot()).invoke(s1);
      Object vec__48205 = G__48194;
      Object x6 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__48205), (int)RT.intCast(0L), ((java.lang.Object)null)));
      Object xs7 = ((IFn)const__5.getRawRoot()).invoke(vec__48205, const__6);
      Object s8 = vec__48205;
      {
       Object G__48199 = G__48194;
       while(true) {
        {
         Object vec__482110 = G__48199;
         Object x11 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__482110), (int)RT.intCast(0L), ((java.lang.Object)null)));
         Object xs12 = ((IFn)const__5.getRawRoot()).invoke(vec__482110, const__6);
         Object s13 = vec__482110;
         Object __r2946 = s13;
         if (__r2946 != null && !(__r2946 == Boolean.FALSE)) {
          Object __r2948;
          if (clojure.lang.Util.identical(((java.lang.Object)x11), ((java.lang.Object)null))) {
           __r2948 = this.NIL4;
          } else {
           __r2948 = x11;
          }
          if (((java.util.concurrent.BlockingQueue)this.q3).offer(((java.lang.Object)__r2948))) {
           java.lang.Object G__48199___aux = xs12;
           G__48199 = G__48199___aux;
           continue;
          } else {
           return s13;
          }
         } else {
          if (((java.util.concurrent.BlockingQueue)this.q3).offer(((java.lang.Object)this.q3))) {
           return null;
          } else {
           return clojure.lang.PersistentList.EMPTY;
          }
         }
        }
       }
      }
     }
    }
    catch (Throwable ex___) {
     if (ex___ instanceof java.lang.Exception) {
      java.lang.Exception e14 = (java.lang.Exception) ex___;
      return ((IFn)this.log_error6).invoke(this.q3, e14);
     }
     else {
      throw Util.sneakyThrow(ex___);
     }
    }
   }
  } else {
   return null;
  }
 }
}
